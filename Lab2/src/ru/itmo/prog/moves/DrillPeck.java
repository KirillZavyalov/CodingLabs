package ru.itmo.prog.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class DrillPeck extends PhysicalMove {
    public DrillPeck(){
        super(Type.FLYING, 160,100);
    }
    @Override
    protected String describe(){
        return "Использует Drill Peck";
    }

}
