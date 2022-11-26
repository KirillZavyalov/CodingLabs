package ru.itmo.prog.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.itmo.prog.moves.*;

public class Gallade extends  Kirlia{
    public Gallade(String name, int level) {
        super(name, level);

        if (level < 1) {
            setLevel(1);
        }

        setType(Type.FAIRY, Type.PSYCHIC);

        double hp = 68,
                attack = 125,
                defense = 65,
                specialAttack = 65,
                specialDefense = 115,
                speed = 80;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        setMove(new ShadowBall(),
                new Swagger(),
                new DisarmingVoice(),
                new RockTomb());
    }
}
