package com.dit.javaoops;

class Enemy {
    static int counter;
    private String name;
    private int attack;
    private boolean weapon;

    Enemy(String name, int attack, boolean weapon) {
        this.name = name;
        this.attack = attack;
        this.weapon = weapon;
        counter++;
        System.out.println("Enemy created " + counter + " " + name + " " + attack + " " + weapon);
    }
}

public class StaticKeywordExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Enemy obj = new Enemy("Goblin" + i, i, true);
        }
    }
}
