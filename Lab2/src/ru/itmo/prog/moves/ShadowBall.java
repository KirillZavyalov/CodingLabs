package ru.itmo.prog.moves;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall(){
        super(Type.GHOST, 80, 100);
    }

    @Override
    protected String describe(){
        return "Использует Shadow Ball";
    }

    @Override
    protected void applyOppEffects(Pokemon enemy){
        if (Math.random() <= 0.2){
            enemy.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
}
