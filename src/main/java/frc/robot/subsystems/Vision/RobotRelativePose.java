package frc.robot.subsystems.Vision;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;

public class RobotRelativePose extends Pose2d {
    
    public RobotRelativePose(double x, double y, Rotation2d thetaRadians){
        super(x, y, thetaRadians);
    }
}
