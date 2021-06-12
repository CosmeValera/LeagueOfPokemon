package tests;

import model.Randomizer;

public class FakeRandomizer implements Randomizer {

    public double getRandom() {
        return 0.8;
    }
    
}
