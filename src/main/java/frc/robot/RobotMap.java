/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Spark;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
 
//Define 'LEFT' Motors

// For Sparks
public static Spark driveTrainLeftMotorA;
public static Spark driveTrainLeftMotorB;

// For Talon SRXs
//public static WPI_TalonSRX driveTrainLeftMotorA;
//public static WPI_TalonSRX driveTrainLeftMotorB;
// If you are using 6 motors you will need a third motor
//public static WPI_TalonSRX driveTrainLeftMotorC;

//Define Speed Controller Group for 'LEFT Motors
public static SpeedControllerGroup driveTrainLeftMotors;

//Define 'RIGHT' Motors
// For Sparks
public static Spark driveTrainRightMotorA;
public static Spark driveTrainRightMotorB;

// For Talon SRXs 
//public static WPI_TalonSRX driveTrainRightMotorA;
//public static WPI_TalonSRX driveTrainRightMotorB;
// If you are using 6 motors you will need a third motor
//public static WPI_TalonSRX driveTrainRightMotorC;

//Define Speed Controller Group for 'RIGHT' Motors
public static SpeedControllerGroup driveTrainRightMotors;

//Define Differential Drive
public static DifferentialDrive driveTrainDifferentialDrive;


public static void init(){

// Define the ports the 'LEFT' Motor Controllers are Connected to the RoboRIO (CAN or PWM)  If CAN additional steps are required to set address port on Motor Controller
// For Sparks
  driveTrainLeftMotorA = new Spark(0);
  driveTrainLeftMotorB = new Spark(1);

  
// For Talon SRXs
  //driveTrainLeftMotorA = new WPI_TalonSRX(0);
  //driveTrainLeftMotorB = new WPI_TalonSRX(1);
  // If you are using 6 motors you will need a third motor
  //driveTrainLeftMotorC = new WPI_TalonSRX(2);

//Define what motors are part of the 'LEFT' Speed Controller Group  
  driveTrainLeftMotors = new SpeedControllerGroup(driveTrainLeftMotorA, driveTrainLeftMotorB/*, driveTrainLeftMotorC*/);
  
// For Sparks
  driveTrainRightMotorA = new Spark(2);
  driveTrainRightMotorB = new Spark(3);

  // Define the ports the 'RIGHT' Motor Controllers are Connected to the RoboRIO (CAN or PWM)  If CAN additional steps are required to set address port on Motor Controller
// For Talon SRXs
  //driveTrainRightMotorA = new WPI_TalonSRX(3);
  //driveTrainRightMotorB = new WPI_TalonSRX(4);
  // If you are using 6 motors you will need a third motor
  //driveTrainRightMotorC = new WPI_TalonSRX(5);

//Define what motors are part of the 'RIGHT' Speed Controller Group  
  driveTrainRightMotors = new SpeedControllerGroup(driveTrainRightMotorA, driveTrainRightMotorB/*, driveTrainRightMotorC*/);

//Define what Speed Controller Groups are part of the Differential Drive
  driveTrainDifferentialDrive = new DifferentialDrive(driveTrainLeftMotors, driveTrainRightMotors);

//Define Options for Differential Drive
  driveTrainDifferentialDrive.setSafetyEnabled(false);
  driveTrainDifferentialDrive.setExpiration(0.1);
  driveTrainDifferentialDrive.setMaxOutput(1.0);   //You can set the power output by changing (1.0 is most power and .1 is much less power)
  }
}
