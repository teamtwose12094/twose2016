package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import java.util.HashMap;

/**
 * Created by student on 11/24/2016.
 */

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="Autonomous")
public class Autonomous extends LinearOpMode {

    private HardwareK9bot robot;

    private int delay;

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);

        robot.leftMotor.setPower(0.5);
        robot.rightMotor.setPower(0.5);

        sleep(1000);

        robot.leftMotor.setPower(0);
        robot.rightMotor.setPower(0);
    }
}
