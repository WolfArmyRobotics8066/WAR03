package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.TracaoSubsystem;

public class DriveCommand extends CommandBase {
    TracaoSubsystem tracaoSubsystem;
    Supplier<Double> xAxis, yAxis;

    public double startTime;

    public DriveCommand(TracaoSubsystem tracaoSubsystem, Supplier<Double> xAxis, Supplier<Double> yAxis){
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.tracaoSubsystem = tracaoSubsystem;
        addRequirements(tracaoSubsystem);
    }   
    @Override
    public void initialize(
    ) {
        startTime = System.currentTimeMillis();
    }

    @Override
    public void execute() {
        double foward = xAxis.get();
        double rotation = yAxis.get();
        tracaoSubsystem.controllerGroup.arcadeDrive(foward, rotation);
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
