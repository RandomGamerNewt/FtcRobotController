package org.firstinspires.ftc.teamcode.Tele;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;


@Autonomous
public class AprilTagWebcamExample extends OpMode {
    AprilTagWebCamera aprilTagWebcam = new AprilTagWebCamera();

    @Override
    public void init() {
        aprilTagWebcam.init(hardwareMap, telemetry);
    }

    @Override
    public void loop() {
        // update the vision portal
        aprilTagWebcam.update();
        AprilTagDetection id20 = aprilTagWebcam.getTagBySpecificId(20);
        aprilTagWebcam.displayDetectionTelemetry(id20);

    }
}
