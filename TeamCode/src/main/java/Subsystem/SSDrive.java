package Subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class SSDrive {

    DcMotor front_left_wheel;
    DcMotor front_right_wheel;
    DcMotor back_left_wheel;
    DcMotor back_right_wheel;

    double powerFactor = 0.3;
    int directionFactor =-1;

    public void SSDrive(HardwareMap hardwareMap)
    {
        front_left_wheel= (DcMotor) hardwareMap.get("front_left_wheel");
        front_right_wheel= (DcMotor) hardwareMap.get("front_right_wheel");
        back_left_wheel= (DcMotor) hardwareMap.get("back_left_wheel");
        back_right_wheel= (DcMotor) hardwareMap.get("back_right_wheel");
    }


    }

}
