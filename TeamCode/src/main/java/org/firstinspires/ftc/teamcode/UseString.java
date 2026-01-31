package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class UseString extends OpMode {
    @Override
    public void init() {
        String myName = "Parker Duty";
        int myGrade = 97;

        telemetry.addData("Hello", myName);
        telemetry.addData(myName, "'s Grade", myGrade);

    }
    @Override
    public void loop() {

    }
}
