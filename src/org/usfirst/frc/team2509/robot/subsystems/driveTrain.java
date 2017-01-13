package org.usfirst.frc.team2509.robot.subsystems;

import org.usfirst.frc.team2509.robot.RobotMap;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.*;

/**
 *
 */
public class driveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private final RobotDrive robotDrive = RobotMap.driveTrain;
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void MechDrive(Joystick stick){
    	robotDrive.mecanumDrive_Cartesian(stick.getX(), stick.getY(), stick.getZ(), 0);
    }
}

