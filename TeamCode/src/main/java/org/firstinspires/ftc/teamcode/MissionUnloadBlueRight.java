package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.ColorSensor;

/**
 * Created by student on 10/26/2017.
 */

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "MissionUnloadBlueRight", group = "Autonomous")
public class  MissionUnloadBlueRight extends Autonomous {
    @Override
    public void runPath(){
        moveColourSensor(90);
        moveColourSensor(-90);
        pivot(90, 0.7);
        move(19, 0.7);
        pivot(90, 0.7);
        move(5, 0.7);
        release();
    }

}


