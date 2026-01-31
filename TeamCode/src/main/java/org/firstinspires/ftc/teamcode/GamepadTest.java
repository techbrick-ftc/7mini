package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class GamepadTest extends OpMode {
    @Override
    public void init() {
    }
    @Override
    public void loop() {
        telemetry.addData("Left Stick X-axis", gamepad1.left_stick_x);
        telemetry.addData("Left Stick Y-axis", gamepad1.left_stick_y);
        telemetry.addData("A", gamepad1.a);
    }
}
