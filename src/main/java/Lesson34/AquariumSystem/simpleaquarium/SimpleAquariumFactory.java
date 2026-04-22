package Lesson34.AquariumSystem.simpleaquarium;

import Lesson34.AquariumSystem.interfaces.*;

public class SimpleAquariumFactory implements AquariumFactory {

    @Override
    public Aquarium createAquarium() {
        return new SimpleAquarium();
    }

    @Override
    public Fish createFish(String name) {
        return new SimpleFish(name);
    }
}