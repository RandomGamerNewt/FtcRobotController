package org.firstinspires.ftc.teamcode.Tele;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class MovingTest extends OpMode {
    public DcMotor left_drive;
    public DcMotor right_drive;


    @Override
    public void init() {

        left_drive = hardwareMap.get(DcMotor.class, "left_drive");
        right_drive = hardwareMap.get(DcMotor.class, "right_drive");
        left_drive.setDirection(DcMotorSimple.Direction.REVERSE);


    }

    @Override
    public void loop() {
        boolean aButton = gamepad1.a;
      telemetry.addData("A Button State", aButton);
        left_drive.setPower(-gamepad1.left_stick_y);
        right_drive.setPower(-gamepad1.right_stick_y);

        while (aButton) {
            left_drive.setPower(-0.5);
            right_drive.setPower(0.5);
        }
    }


}
