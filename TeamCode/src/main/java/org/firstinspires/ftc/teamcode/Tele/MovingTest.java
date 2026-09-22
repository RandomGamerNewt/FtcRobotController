package org.firstinspires.ftc.teamcode.Tele;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class MovingTest extends OpMode {
    public DcMotor left_drive;
    public DcMotor right_drive;
    public DcMotor intake;


    @Override
    public void init() {

        left_drive = hardwareMap.get(DcMotor.class, "left_drive");
        right_drive = hardwareMap.get(DcMotor.class, "right_drive");
        intake = hardwareMap.get(DcMotor.class, "intake");
        left_drive.setDirection(DcMotorSimple.Direction.REVERSE);


    }

    @Override
    public void loop() {
        boolean aButton = gamepad1.a;
      telemetry.addData("A Button State", aButton);
        left_drive.setPower(-gamepad1.left_stick_y);
        right_drive.setPower(-gamepad1.right_stick_y);

        if (gamepad1.left_trigger_pressed) {
            left_drive.setPower(-1);
            right_drive.setPower(1);
        }
        else {
            left_drive.setPower(0);
            right_drive.setPower(0);
        }

        if (gamepad1.right_trigger_pressed) {
            left_drive.setPower(1);
            right_drive.setPower(-1);
        }
        else {
            left_drive.setPower(0);
            right_drive.setPower(0);
        }

        if (gamepad1.b) {
            intake.setPower(1);
        }
        else {
            intake.setPower(0);
        }
    }


}
