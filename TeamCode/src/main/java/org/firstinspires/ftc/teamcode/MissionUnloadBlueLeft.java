package org.firstinspires.ftc.teamcode;

/**
 * Created by student on 10/26/2017.
 */

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "MissionUnloadBlueLeft", group = "Autonomous")
public class MissionUnloadBlueLeft extends Autonomous {
    @Override
    public void runPath() {
        pivot(-90, 0.7);
        move(19, 0.7);
        pivot(-90, 0.7);
        move(5, 0.7);
    }

}


