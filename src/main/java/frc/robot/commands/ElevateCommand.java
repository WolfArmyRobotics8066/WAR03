package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ElevatorSubsystem;

public class ElevateCommand extends CommandBase {
    ElevatorSubsystem elevatorSubsystem;
    double speed;

    public ElevateCommand(ElevatorSubsystem elevatorSubsystem, double speed){
        this.elevatorSubsystem = elevatorSubsystem;
        this.speed = speed;
        addRequirements(elevatorSubsystem);
    }
    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        elevatorSubsystem.moveElevator(speed);
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
