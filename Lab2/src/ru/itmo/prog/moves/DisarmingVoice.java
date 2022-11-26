package ru.itmo.prog.moves;

import ru.ifmo.se.pokemon.*;

public class DisarmingVoice extends SpecialMove {
    public DisarmingVoice(){
        super(Type.FAIRY, 40, 1);
    }

    @Override
    protected String describe(){
        return "Использует Disarming Voice";
    }
}
