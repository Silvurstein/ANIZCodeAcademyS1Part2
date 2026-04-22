package Lesson34.AquariumSystem.app;

import Lesson34.AquariumSystem.interfaces.Fish;
import Lesson34.AquariumSystem.simpleaquarium.*;
import Lesson34.AquariumSystem.controller.AquariumController;
import Lesson34.AquariumSystem.view.ConsoleUI;
import Lesson34.AquariumSystem.interfaces.Aquarium;
import Lesson34.AquariumSystem.view.SwingUI;


public class Main {
    public static void main(String[] args) {

        SimpleAquariumFactory factory = new SimpleAquariumFactory();

        Aquarium aquarium = factory.createAquarium();

        Fish f1 = factory.createFish("Wogglie");
        Fish f2 = factory.createFish("Swimmie");

        AquariumController controller = new AquariumController(aquarium);
        controller.addFish(f1);
        controller.addFish(f2);

        ConsoleUI ui= new ConsoleUI(controller);
        ui.start();
        //new SwingUI(controller);
    }
}

