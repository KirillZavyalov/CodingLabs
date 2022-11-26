package ru.itmo.prog;
import ru.ifmo.se.pokemon.*;
import ru.itmo.prog.pokemons.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon p1 = new Skarmory("Анатолий", 1);
        Pokemon p2 = new Joltik("Максим",1);
        Pokemon p3 = new Galvantula("Олег",1);

        Pokemon p4 = new Ralts("Григорий",1);
        Pokemon p5 = new Kirlia("Умар",1);
        Pokemon p6 = new Gallade("Сергей",1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}