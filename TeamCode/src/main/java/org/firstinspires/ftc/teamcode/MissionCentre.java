package org.firstinspires.ftc.teamcode;

/**
 * Created by student on 1/20/2017.
 */
@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "MissionCentre", group = "Autonomous")
public class MissionCentre extends Autonomous {
    @Override
    protected void runPath() {
        sleep(10000);
        move(20,0.5);
    }
}
