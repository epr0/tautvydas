package com.tautvydas.ignas;

import java.util.ArrayList;
import java.util.Random;

public class CrystalBall {
    ArrayList<String> divinations = new ArrayList<>();

    CrystalBall() {
        divinations.add("Siandien bus gera diena");
        divinations.add("Geriau apsidairyk eiant per gatve");
        divinations.add("Nera to blogo, kas neiseitu i gera");
    }

    public String divine() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        return divinations.get(randomNumber);

    }

    public String divineSwitchCase() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        String divination;
        switch (randomNumber) {
            case 0: {
                divination = "Pasiimk skėtį";
                break;
            }
            case 1: {
                divination = "Gerk daug vandens";
                break;
            }
            case 2: {
                divination = "Sulėtink žingsnį";
                break;
            }
            default: {
                divination = "Nepirk loterijos bilieto";
                break;
            }
        }
        return divination;
    }
}
