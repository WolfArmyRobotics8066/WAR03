// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.cscore.*;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.*;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.ElevatorConstants;
import frc.robot.commands.*;
import frc.robot.subsystems.*;

@SuppressWarnings("unused")
public class RobotContainer {
  
  SendableChooser<Command> aChooser;
  JoystickSubsystem joystickSubsystem = new JoystickSubsystem();
  ElevatorSubsystem elevatorSubsystem = new ElevatorSubsystem();
  public TracaoSubsystem tracaoSubsystem = new TracaoSubsystem();
  ArmSubsystem armSubsystem = new ArmSubsystem();
  ClawSubsystem clawSubsystem = new ClawSubsystem();

  public RobotContainer() {
    aChooser = new SendableChooser<Command>();
    aChooser.setDefaultOption("null", null);
    aChooser.addOption("AutoOne", new AutoOne());
    SmartDashboard.putData("Autonomous", aChooser);
    CameraServer.startAutomaticCapture();
    CvSink cvSink = CameraServer.getVideo();

    tracaoSubsystem.setDefaultCommand(new DriveCommand(tracaoSubsystem, //
    () -> joystickSubsystem.controller.getRawAxis(0) * 0.6, () -> joystickSubsystem.controller.getRawAxis(1) * -0.6));
    configureBindings();
    elevatorSubsystem.setDefaultCommand(new ElevateCommand(elevatorSubsystem, 0.26667));
    armSubsystem.setDefaultCommand(new ArmCommand(armSubsystem, 0));
    clawSubsystem.setDefaultCommand(new ClawCommand(clawSubsystem, () -> joystickSubsystem.controller.getRawAxis(3)));
  }

  private void configureBindings() {
   new JoystickButton(joystickSubsystem.controller, 1).whileTrue(new ElevateCommand(elevatorSubsystem, ElevatorConstants.elevatorSpeed));
   new JoystickButton(joystickSubsystem.controller, 3).whileTrue(new ElevateCommand(elevatorSubsystem, -ElevatorConstants.slowElevatorSpeed));
    new JoystickButton(joystickSubsystem.controller, 5).whileTrue(new DriveCommand(tracaoSubsystem, //
    () -> joystickSubsystem.controller.getRawAxis(0), () -> -joystickSubsystem.controller.getRawAxis(1)));
  }

  public Command getAutonomousCommand() {
    return (aChooser.getSelected());
  }
}