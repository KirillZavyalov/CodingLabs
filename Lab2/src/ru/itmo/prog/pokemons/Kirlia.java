package ru.itmo.prog.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.itmo.prog.moves.*;

public class Kirlia extends Ralts{
    public Kirlia(String name, int level) {
        super(name, level);

        if (level < 1) {
            setLevel(1);
        }

        setType(Type.FAIRY, Type.PSYCHIC);

        double hp = 38,
                attack = 35,
                defense = 35,
                specialAttack = 65,
                specialDefense = 55,
                speed = 50;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        setMove(new ShadowBall(),
                new Swagger(),
                new DisarmingVoice());
    }

}
