package org.usfirst.frc.team2509.robot;

import com.ctre.*;
import edu.wpi.first.wpilibj.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static Joystick stick;
	public static CANTalon drive1;//Left Front Drive Motor
	public static CANTalon drive2;//Right Front Drive Motor
	public static CANTalon drive3;//Left Rear Drive Motor
	public static CANTalon drive4;//Right Rear Drive Motor
	public static RobotDrive driveTrain;
	public static void init() {
		stick = new Joystick(0);
		drive1 = new CANTalon(0);//CAN ID = 0
		drive2 = new CANTalon(1);//CAN ID = 1
		drive3 = new CANTalon(2);//CAN ID = 2
		drive4 = new CANTalon(3);//CAN ID = 3
		//MecanumDrive = LeftFront, LeftRear, RightFront, RightRear
		driveTrain = new RobotDrive(drive1, drive3,drive2, drive4);
	}
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
