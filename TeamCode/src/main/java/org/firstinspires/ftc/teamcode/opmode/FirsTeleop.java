package org.firstinspires.ftc.teamcode.opmode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp(name = "FirstTeleop", group = "00-Teleop")
public class FirsTeleop  extends LinearOpMode {

    DcMotor front_left_wheel;
    DcMotor front_right_wheel;
    DcMotor back_left_wheel;
    DcMotor back_right_wheel;

    double powerFactor = 0.3;
    int directionFactor =-1;

    @Override
    public void runOpMode() throws InterruptedException {

        front_left_wheel= (DcMotor) hardwareMap.get("front_left_wheel");
        front_right_wheel= (DcMotor) hardwareMap.get("front_right_wheel");
        back_left_wheel= (DcMotor) hardwareMap.get("back_left_wheel");
        back_right_wheel= (DcMotor) hardwareMap.get("back_right_wheel");

        waitForStart();

        while (opModeIsActive()){
            front_left_wheel.setPower(gamepad1.left_stick_y*powerFactor);
            front_right_wheel.setPower(gamepad1.left_stick_y*directionFactor*powerFactor);
            back_left_wheel.setPower(gamepad1.left_stick_y*powerFactor);
            back_right_wheel.setPower(gamepad1.left_stick_y*directionFactor*powerFactor);
        }

    }
}
