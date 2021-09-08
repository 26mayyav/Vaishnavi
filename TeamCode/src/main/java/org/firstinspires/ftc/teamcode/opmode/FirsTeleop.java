package org.firstinspires.ftc.teamcode.opmode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class FirsTeleop  extends LinearOpMode {

    DcMotor front_left_wheel;
    DcMotor front_right_wheel;
    DcMotor back_left_wheel;
    DcMotor back_right_wheel;

    @Override
    public void runOpMode() throws InterruptedException {

        front_left_wheel= (DcMotor) hardwareMap.get("front_left_wheel");
        front_right_wheel= (DcMotor) hardwareMap.get("front_right_wheel");
        back_left_wheel= (DcMotor) hardwareMap.get("back_left_wheel");
        back_right_wheel= (DcMotor) hardwareMap.get("back_right_wheel");

    }
}
