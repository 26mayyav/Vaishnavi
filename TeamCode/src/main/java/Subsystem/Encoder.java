package Subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Encoder{

    //Object declaration
    DcMotor encoderMotor;

    //variabledeclaration
    // datatype variable_name = initial_value
    static  final int MOTOR_TICK_COUNT = 1120;
    double diameter=28;


    //constructor
    public void Encoder(HardwareMap hardwareMap){

        encoderMotor =hardwareMap.dcMotor.get("encoder_motor");

    }//end of constructor

    //functions of this class
    //identifier return_type function_name(input variabl1,inputvariable 2){}

    public void resetMotor(){

        encoderMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

    }//end of function resetMotor

    public void calculateTargetPosition(double targetDistance){

        double circumference=Math.PI*diameter;//distance traveled in one rotation
        double rotationsMoved=0;
        int TICK_COUNT;


        rotationsMoved = targetDistance/circumference;//Calculated rotations needed for moving target distance
        TICK_COUNT = (int)(rotationsMoved*MOTOR_TICK_COUNT);




    }//end of function calculateTargetPosition



}//end of class
