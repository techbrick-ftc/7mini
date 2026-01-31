//Imports
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

//Code
@TeleOp
public class HelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello", "Parker");

    }
    @Override
    public void loop() {

    }
}

