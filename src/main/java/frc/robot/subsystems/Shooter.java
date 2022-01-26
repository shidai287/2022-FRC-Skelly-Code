
package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class Shooter extends SubsystemBase{

    CANSparkMax TopConveyer = new CANSparkMax(Constants.ShooterConstants.CAN_ADDRESS_TOP_CONVERYER_MOTOR, MotorType.kBrushless);
    CANSparkMax BootomConveyer = new CANSparkMax(Constants.ShooterConstants.CAN_ADDRESS_BOTTOM_CONVERYER_MOTOR, MotorType.kBrushless);
    CANSparkMax TopShooter = new CANSparkMax(Constants.ShooterConstants.CAN_ADDRESS_TOP_SHOOTER_WHEEL, MotorType.kBrushless);
    CANSparkMax BottomShooter = new CANSparkMax(Constants.ShooterConstants.CAN_ADDRESS_BOTTOM_SHOOTER_WHEEL, MotorType.kBrushless);
    //Kicker still required!
    
    
    public Shooter(){
        super();
        secondShooterMotor.follow(firstShooterMotor);
        thirdShooterMotor.follow(firstShooterMotor);
    }

    public void launch(int speed){
        firstShooterMotor.set(speed);
    }
}

