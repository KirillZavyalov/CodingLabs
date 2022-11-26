package ru.itmo.prog.moves;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected String describe(){
        return "Использует Thunder";
    }

    @Override
    protected void applyOppEffects(Pokemon enemy){
        if (enemy.hasType(Type.ELECTRIC)) {
            if (Math.random() <= 0.3){Effect.paralyze(enemy);}
        }
    }
}
