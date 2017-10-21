package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by student on 1/20/2017.
 */
// test 2: test harder
//TEST PLEASE
@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "MissionCornerBlue", group = "Autonomous")
public class MissionCornerBlue extends Autonomous {
    @Override
    public void runPath() {
        move(19, 0.7);
        pivot(115, 0.7);
        move(15, 0.7);
        move(10, 0.7);
        spin(3000, -0.7);
        move(4, 0.7);
        move(4, 0.7); //test
    }

}


