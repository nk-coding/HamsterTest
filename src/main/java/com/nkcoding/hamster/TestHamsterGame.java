package com.nkcoding.hamster;

import java.io.IOException;

import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;

public class TestHamsterGame extends SimpleHamsterGame  {

    public TestHamsterGame() {
        try {
            game.initialize("/territories/walled.ter");
            game.startGame(false);
            game.connectToHamsterServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    void run() {
        super.run();

        Hamster testHamster = new Hamster(game.getTerritory(), new Location(3,3), Direction.NORTH, 0);
        for (int i = 0; i < 4; i++) {
            testHamster.turnLeft();
            testHamster.move();
        }
        System.out.println(testHamster.readNumber("hello message"));
        for (int i = 0; i < 2; i++) {
            testHamster.move();
        }
    }
}