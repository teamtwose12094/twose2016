package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by student on 11/24/2016.
 */

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="Autonomous")
public class Autonomous extends LinearOpMode {

    HardwareK9bot robot = new HardwareK9bot();
    ElapsedTime timer = new ElapsedTime();

    @Override
    public void runOpMode() throws InterruptedException {
        //Set up the robot hardware
        robot.init(hardwareMap);

        waitForStart();

        //Move forward
        robot.leftMotor.setPower(0.5);
        robot.rightMotor.setPower(0.5);

        timer.reset();

        //Wait one second
        while(timer.seconds() < 1 && opModeIsActive()) {
            sleep(20);
        }

        //Stop
        stopMotors();
    }

    public void stopMotors() {
        robot.leftMotor.setPower(0);
        robot.rightMotor.setPower(0);
    }
}
