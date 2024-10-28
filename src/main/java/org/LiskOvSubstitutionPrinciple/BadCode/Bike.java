package org.LiskOvSubstitutionPrinciple.BadCode;

/**
 * If Class B is subtype of class A, then we should be able to replace object of
 * A with B without breaking the behaviour
 * of the program
 */

public interface Bike {
    void turnOnEngine();
    void accelerate();
}

class MotorCycle implements Bike {
    boolean isEngineOn;
    int speed;

    public void turnOnEngine(){
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed = speed + 10;
    }
}

class Bicycle implements Bike {
    boolean isEngineOn;
    int speed;

    public void turnOnEngine(){
        throw new AssertionError("There is no engine");
    }

    @Override
    public void accelerate() {
        speed = speed + 10;
    }
}
