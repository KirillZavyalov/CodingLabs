package ru.itmo.prog.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.itmo.prog.moves.*;
public class Skarmory extends Pokemon{
    public Skarmory(String name, int level){
        super(name, level);

        if (level < 36){
            setLevel(36);
        }

        setType(Type.STEEL, Type.FLYING);

        double hp = 65,
                attack = 80,
                defense = 140,
                specialAttack = 40,
                specialDefense = 70,
                speed = 70;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        setMove(new DrillPeck(),
        new FlashCannon(),
        new MetalClaw(),
        new RockTomb() );
    }
}
