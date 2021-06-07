package model;

public class MathRandomizer implements Randomizer {

    @Override
    public double getRandom() {
        return Math.random();
    }
    
}
