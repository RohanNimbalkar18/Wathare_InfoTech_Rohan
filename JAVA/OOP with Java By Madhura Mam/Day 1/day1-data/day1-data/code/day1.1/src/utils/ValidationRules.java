package utils;

import custom_exception.SpeedOutOfRangeException;

public class ValidationRules {
	// add speed limits : static constants
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		MIN_SPEED = 40;
		MAX_SPEED = 80;
	}
//add a static method for checking speed

	public static void validateSpeed(int speed) throws SpeedOutOfRangeException {
		if (speed <= MIN_SPEED)
			throw new SpeedOutOfRangeException("You are driving too slow !!!!!");
		if (speed >= MAX_SPEED)
			throw new SpeedOutOfRangeException("Yor are driving too fast , FATAL!!!!");
		//=> within range
		System.out.println("Speed within range, continue.....");
	}
}
