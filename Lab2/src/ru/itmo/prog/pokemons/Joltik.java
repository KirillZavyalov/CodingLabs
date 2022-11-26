package ru.itmo.prog.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.itmo.prog.moves.*;

public class Joltik extends Pokemon {
    public Joltik(String name, int level) {
        super(name, level);

        if (level < 40){
            setLevel(40);
        }

        setType(Type.BUG, Type.ELECTRIC);

        double hp = 50,
                attack = 47,
                defense = 50,
                specialAttack = 57,
                specialDefense = 50,
                speed = 65;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        setMove(new ChargeBeam(),
                new Screech(),
                new Facade());
    }
}
