package frc.robot.subsystems.Vision;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;

public class FieldRelativePose extends Pose2d {
    
    public FieldRelativePose(double x, double y, Rotation2d thetaRadians){
        super(x, y, thetaRadians);
    }

}
