package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import static com.qualcomm.ftccommon.R.layout.servo;
/**
 * Created by Travis on 1/7/2017.
 */

public class NewDrive extends OpMode {
    DcMotor FrontWheel;
    DcMotor BackLeftWheel;
    DcMotor BackRightWheel;

    @Override
    public void init() {
        FrontWheel = hardwareMap.dcMotor.get("Front_Wheel");
        BackLeftWheel = hardwareMap.dcMotor.get("Back_Left_Wheel");
        BackRightWheel = hardwareMap.dcMotor.get("Back_Right_Wheel");
    }
    @Override
    public void loop(){


    }

}

