package ru.itmo.prog.moves;

import ru.ifmo.se.pokemon.*;

public class FlashCannon extends SpecialMove {
    public FlashCannon(){
        super(Type.STEEL, 80, 100);
    }
    @Override
    protected String describe(){
        return "Использует Flash Cannon";
    }

    @Override
    protected void applyOppEffects(Pokemon enemy){
          if (Math.random() <= 0.1){
              enemy.setMod(Stat.ATTACK, -1);
        }
    }
}

