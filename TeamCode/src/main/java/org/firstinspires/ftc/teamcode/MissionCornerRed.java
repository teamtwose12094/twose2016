package org.firstinspires.ftc.teamcode;

/**
 * Created by student on 2/3/2017.
 */

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "MissionCornerRed", group = "Autonomous")
public class MissionCornerRed extends Autonomous {
    @Override
    public void runPath() {
        move(15, 0.5);
        pivot(-90, 0.5);
        move(8, 0.5);
        pivot(-45, 0.5);
        move(24, 0.5);
        move(10, 0.5);
        spin(3000, 0.5);
    }
}
