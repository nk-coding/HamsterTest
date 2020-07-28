package com.nkcoding.hamster;

import java.io.IOException;

import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;

public class TestHamsterGame extends SimpleHamsterGame  {

    public TestHamsterGame() {
        try {
            //game.initialize("/territories/empty.ter");
            game.initialize("/territories/walled.ter");
            game.startGame(false);
            game.connectToHamsterServer();
            //game.initialize("/territories/empty.ter");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    void run() {
        super.run();

        Hamster testHamster = new Hamster(game.getTerritory(), new Location(3,3), Direction.NORTH, 0);
        for (int i = 0; i < 5; i++) {
            testHamster.turnLeft();
            //testHamster.move();
        }
        while (true) {
            //test
        }
        //int test = testHamster.readNumber("output number");
        //System.out.println(test);
    
        
    }
}
