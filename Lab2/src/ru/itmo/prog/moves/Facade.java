package ru.itmo.prog.moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected String describe(){
        return "Использует Facade";
    }

    @Override
    protected void applyOppDamage(Pokemon self, double damage){
        Status stat = self.getCondition();
        if (stat.equals(Status.BURN) || stat.equals(Status.POISON) || stat.equals(Status.PARALYZE)){
            super.applyOppDamage(self, damage*2);
        }
        else{
            super.applyOppDamage(self, damage);
        }
    }
}
