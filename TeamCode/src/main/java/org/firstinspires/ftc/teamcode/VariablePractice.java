package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {
    public void init() {
        int teamNumber = 22127;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String name = "newt";

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("motor speed", motorSpeed);
        telemetry.addData("claw state", clawClosed);
        telemetry.addData("my name is", name);
    }

    @Override
    public void loop() {
    }
}
