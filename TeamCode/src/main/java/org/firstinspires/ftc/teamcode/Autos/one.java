package org.firstinspires.ftc.teamcode.Autos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class one extends LinearOpMode {
    public DcMotor left_back;
    public DcMotor right_back;
    public DcMotor left_front;
    public DcMotor right_front;
//    public DcMotor intake;


    public void runOpMode(){
        left_back = hardwareMap.get(DcMotor.class, "left_back");
        right_back = hardwareMap.get(DcMotor.class, "right_back");
        left_front = hardwareMap.get(DcMotor.class, "left_front");
        right_front = hardwareMap.get(DcMotor.class, "right_front");
//        intake = hardwareMap.get(DcMotor.class, "intake");

        waitForStart();

        left_front.setPower(1);
        right_front.setPower(1);
        left_back.setPower(-1);
        right_back.setPower(-1);
        sleep(50);
        left_front.setPower(-1);
        right_front.setPower(1);
        left_back.setPower(-1);
        right_back.setPower(1);
        sleep(670);


    }
}
