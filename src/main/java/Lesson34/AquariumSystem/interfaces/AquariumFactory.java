package Lesson34.AquariumSystem.interfaces;

public interface AquariumFactory {
    Aquarium createAquarium();
    Fish createFish(String name);
}
