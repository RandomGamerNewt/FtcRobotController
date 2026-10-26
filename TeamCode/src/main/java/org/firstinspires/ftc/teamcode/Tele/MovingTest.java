package org.firstinspires.ftc.teamcode.Tele;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class MovingTest extends OpMode {
    public DcMotor left_back;
    public DcMotor right_back;
    public DcMotor left_front;
    public DcMotor right_front;
    public DcMotor intake;


    @Override
    public void init() {

        left_back = hardwareMap.get(DcMotor.class, "left_back");
        right_back = hardwareMap.get(DcMotor.class, "right_back");
        left_front = hardwareMap.get(DcMotor.class, "left_front");
        right_front = hardwareMap.get(DcMotor.class, "right_front");
        intake = hardwareMap.get(DcMotor.class, "intake");


    }

    @Override
    public void loop() {
        boolean aButton = gamepad1.a;
      telemetry.addData("A Button State", aButton);
        left_front.setPower(-gamepad1.left_stick_y);
        right_front.setPower(-gamepad1.right_stick_y);
        left_back.setPower(gamepad1.left_stick_y);
        right_back.setPower(gamepad1.right_stick_y);


        if (gamepad1.left_trigger_pressed) {
            left_front.setPower(-1);
            right_front.setPower(1);
            left_back.setPower(-1);
            right_back.setPower(1);
        }
        else {
            left_front.setPower(0);
            right_front.setPower(0);
            left_back.setPower(0);
            right_back.setPower(0);
        }



        if (gamepad1.right_trigger_pressed) {
            left_front.setPower(1);
            right_front.setPower(-1);
            left_back.setPower(1);
            right_back.setPower(-1);
        }
        else {
            left_front.setPower(0);
            right_front.setPower(0);
            left_back.setPower(0);
            right_back.setPower(0);
        }
        

    }
}