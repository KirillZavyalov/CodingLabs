package ru.itmo.prog.moves;

import ru.ifmo.se.pokemon.*;

public class MetalClaw extends PhysicalMove {
    public MetalClaw(){
        super(Type.STEEL, 50, 95);
    }
    @Override
    protected String describe(){
        return "Использует Metal Claw";
    }

    @Override
    protected void applySelfEffects(Pokemon self){
        if (Math.random() <= 0.1) {
            self.setMod(Stat.ATTACK, +1);
        }
    }
}
