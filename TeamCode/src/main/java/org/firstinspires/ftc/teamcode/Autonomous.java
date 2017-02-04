package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import java.util.HashMap;

/**
 * Created by student on 11/24/2016.
 */

public abstract class Autonomous extends LinearOpMode {

    protected HardwareK9bot robot = new HardwareK9bot();

    private int delay;
    private static int TICKS_PER_REVOLUTION = 1440;
    private static double GEAR_RATIO = 3.0;
    private static double WHEEL_BASE = 8.0;
    private static double TICKS_PER_INCH = TICKS_PER_REVOLUTION * GEAR_RATIO / (Math.PI * 4);

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);

        waitForStart();

        runPath();
    }

    abstract protected void runPath();

    protected void move(int distance, double power) {
        robot.leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        //gives power to motors
        robot.leftMotor.setPower(power);
        robot.rightMotor.setPower(power);

        idle();

        robot.leftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        robot.rightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        //keep going until distance is met
        while( (robot.leftMotor.getCurrentPosition() < distance * TICKS_PER_INCH) && opModeIsActive() ){

            telemetry.addData("thing", robot.leftMotor.getCurrentPosition());
            telemetry.update();
            idle();
        }
        //turn the motors off
        robot.leftMotor.setPower(0);
        robot.rightMotor.setPower(0);
    }

    protected void pivot(int angle, double power) {

        double d = Math.toRadians(angle) * WHEEL_BASE;

        robot.leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        //gives power to motors
        robot.leftMotor.setPower(Math.signum(angle) * power);
        robot.rightMotor.setPower(-Math.signum(angle) * power);

        idle();

        robot.leftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        robot.rightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        //keep going until distance is met
        while( (Math.abs(robot.leftMotor.getCurrentPosition()) < d * TICKS_PER_INCH) && opModeIsActive() ){

            telemetry.addData("thing", robot.leftMotor.getCurrentPosition());
            telemetry.update();
            idle();
        }
        //turn the motors off
        robot.leftMotor.setPower(0);
        robot.rightMotor.setPower(0);
    }

    void spin (int duration, int power){
        robot.fingerMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        //gives power to motors
        robot.fingerMotor.setPower(power);

        sleep(duration);

        //turn the motors off
        robot.fingerMotor.setPower(0);
    }
}
