package ru.itmo.prog.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.itmo.prog.moves.ShadowBall;
import ru.itmo.prog.moves.Swagger;

public class Ralts extends Pokemon {
    public Ralts(String name, int level) {
        super(name, level);

        if (level < 1) {
            setLevel(1);
        }

        setType(Type.FAIRY, Type.PSYCHIC);

        double hp = 28,
                attack = 25,
                defense = 25,
                specialAttack = 45,
                specialDefense = 35,
                speed = 40;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        setMove(new ShadowBall(),
                new Swagger());
    }

}
