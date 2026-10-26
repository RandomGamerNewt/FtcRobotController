package org.firstinspires.ftc.teamcode.Tele;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import org.firstinspires.ftc.teamcode.ServoClasses;

@TeleOp(name = "Adrian's Bum Ahh Settings")
public class InverseArcade extends OpMode {

    public DcMotor left_back;
    public DcMotor right_back;
    public DcMotor left_front;
    public DcMotor right_front;
//    public DcMotor intake;
//    public DcMotor flywheel;


    @Override
    public void init() {

        left_back = hardwareMap.get(DcMotor.class, "left_back");
        right_back = hardwareMap.get(DcMotor.class, "right_back");
        left_front = hardwareMap.get(DcMotor.class, "left_front");
        right_front = hardwareMap.get(DcMotor.class, "right_front");
//        intake = hardwareMap.get(DcMotor.class, "intake");
//        flywheel = hardwareMap.get(DcMotor.class, "flywheel");


    }

    @Override
    public void loop() {
        double driveY = gamepad1.right_stick_y;
        double strafeX = gamepad1.right_stick_x;
        double turnX = gamepad1.left_stick_x;



        left_front.setPower(-driveY + turnX + strafeX);
        right_front.setPower(-driveY - turnX - strafeX);
        left_back.setPower(+ driveY - turnX + strafeX);
        right_back.setPower(+ driveY + turnX - strafeX);



//         if (gamepad1.a) {
//            intake.setPower(1);
//        }
//        else {
//            intake.setPower(0);
//        }
//        if (gamepad1.b) {
//            flywheel.setPower(1);
//        }
//        else {
//            flywheel.setPower(0);
//        }


    }
}