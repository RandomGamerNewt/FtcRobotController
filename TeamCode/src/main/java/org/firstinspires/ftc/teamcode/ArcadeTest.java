package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ArcadeTest {
    private DcMotor left_front, left_back, right_front, right_back;

    public void init(HardwareMap hwMap) {
        left_back = hwMap.get(DcMotor.class, "left_back");
        right_back = hwMap.get(DcMotor.class, "right_back");
        left_front = hwMap.get(DcMotor.class, "left_front");
        right_front = hwMap.get(DcMotor.class, "right_front");

        left_front.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        left_back.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        right_front.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        right_back.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        left_front.setDirection(DcMotorSimple.Direction.REVERSE);
        left_back.setDirection(DcMotorSimple.Direction.REVERSE);
    }


    public void drive(double throttle, double spin) {
        double leftPower = throttle + spin;
                double rightPower = throttle + spin;
                double largest = Math.max(Math.abs(leftPower), Math.abs(rightPower));
                if (largest > 1.0) {
                    leftPower /= largest;
                    rightPower /= largest;
                }

                left_front.setPower(leftPower);
                right_front.setPower(rightPower);
                left_back.setPower(leftPower);
                right_back.setPower(rightPower);
    }



}
