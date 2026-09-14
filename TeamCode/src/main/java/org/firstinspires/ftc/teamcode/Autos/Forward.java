package org.firstinspires.ftc.teamcode.Autos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous
public class Forward extends LinearOpMode {

    public DcMotor left_drive;
    public DcMotor right_drive;


    public void runOpMode(){
        left_drive = hardwareMap.get(DcMotor.class, "left_drive");
        right_drive = hardwareMap.get(DcMotor.class, "right_drive");
        left_drive.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        left_drive.setPower(0.75);
        right_drive.setPower(0.75);
        sleep(1000);
        left_drive.setPower(0);
        right_drive.setPower(0);


    }
}
