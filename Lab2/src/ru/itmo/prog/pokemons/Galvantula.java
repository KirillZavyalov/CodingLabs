package ru.itmo.prog.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.itmo.prog.moves.*;

public class Galvantula extends Joltik{
    public Galvantula(String name, int level){
        super(name, level);

        if (level < 40){
            setLevel(40);
        }

        setType(Type.BUG, Type.ELECTRIC);

        double hp = 70,
                attack = 77,
                defense = 60,
                specialAttack = 97,
                specialDefense = 60,
                speed = 108;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        setMove(new Thunder());
    }
}
