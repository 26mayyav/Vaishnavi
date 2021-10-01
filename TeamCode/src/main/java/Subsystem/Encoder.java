package Subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Encoder{

    //Object declaration
    DcMotor encoderMotor;

    //variableDeclaration
    // datatype variable_name = initial_value
    static  final int MOTOR_TICK_COUNT = 1120;
    double diameter=28;


    //constructor
    public void Encoder(HardwareMap hardwareMap){

        encoderMotor = hardwareMap.dcMotor.get("encoder_motor");

    }//end of constructor

    //functions of this class
    //identifier return_type function_name(input variable1,inputVariable 2){}

    public void (){

        encoderMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

    }//end of function resetMotor

    public int calculateTargetPosition(double targetDistance){

        double circumference=Math.PI*diameter;//distance traveled in one rotation
        double rotationsMoved=0;
        int TICK_COUNT;


        rotationsMoved = targetDistance/circumference;//Calculated rotations needed for moving target distance
        TICK_COUNT = (int)(rotationsMoved*MOTOR_TICK_COUNT);

        return TICK_COUNT;


    }//end of function calculateTargetPosition

    //function to move motor to targetPosition

    //Object declaration
    DcMotor leftMotor;
    DcMotor rightMotor;

    static  final int setPower = 0.5

    // datatype variable_name = initial_value
    public void resetMotor(){

        encoderMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


    leftMotor.setTargetPosition(encoderDrivingTarget);

    leftMotor.setPower(0.5);

    leftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    leftMotor.isBusy();

            while(leftMotor.isBusy();
            rightMotor.isBusy();

        final int telemetry = 0;
        telemetry.addData('Path','Still driving');
        telemetry.update();


    leftMotor.setPower(0);
    rightMotor.setPower(0);




}//end of class
}
