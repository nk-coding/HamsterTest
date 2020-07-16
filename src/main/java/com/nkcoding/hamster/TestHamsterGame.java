package com.nkcoding.hamster;

import java.io.IOException;

public class TestHamsterGame extends SimpleHamsterGame  {

    public TestHamsterGame() {
        try {
            game.initialize("/territories/empty.ter");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    void run() {
        super.run();
        for (int i = 0; i < 5; i++) {
            paule.move();
        }
    }
}
