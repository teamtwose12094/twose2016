package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by student on 1/20/2017.
 */

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "MissionCornerBlue", group = "Autonomous")
public class MissionCornerBlue extends Autonomous {
    @Override
    public void runPath() {
        move(48, 0.5);
        pivot(90, 0.5);
        move(24, 0.5);
        pivot(45, 0.5);
        move(48, 0.5);
        move(10, 0.5);
        spin(3000, 0.5);
    }

}


