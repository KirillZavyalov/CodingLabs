package ru.itmo.prog.moves;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    public RockTomb() {
        super(Type.ROCK, 60, 95);
    }

    @Override
    protected String describe(){
        return "Использует Rock Tomb";
    }

    @Override
    protected void applyOppEffects(Pokemon enemy) {
        if (Math.random() <= 0.1) {
            enemy.setMod(Stat.SPEED, -1);
        }
    }
}
