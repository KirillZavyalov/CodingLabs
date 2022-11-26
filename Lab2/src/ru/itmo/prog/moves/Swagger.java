package ru.itmo.prog.moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected String describe(){
        return "Использует Swagger";
    }

    @Override
    protected void applyOppEffects(Pokemon enemy){
        enemy.setMod(Stat.ATTACK, 2);
        Effect.confuse(enemy);
    }
}
