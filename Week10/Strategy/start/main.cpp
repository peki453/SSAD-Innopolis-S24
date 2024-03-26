#include <iostream>

class Enemy {
    // code for enemy class
};


class Character {
public:
    void attack(Enemy enemy) {
        // code for attacking enemy
    }
};


class MageAttack {
public:
    int damageOnAttack = 10;
};


class RogueAttack {
public:
    int damageOnAttack = 15;
};


class WarriorAttack {
public:
    int damageOnAttack = 25;
};


int main() {
    Character warrior;
    Character mage;
    Character rogue;

    Enemy blackKiller;
    Enemy brownBiter;

    warrior.attack(blackKiller);
    mage.attack(brownBiter);
    rogue.attack(blackKiller);

    return 0;
}


//EXAMPLE OUTPUT:
//Warrior attack!
//BLACK KILLER STRENGTH LEVEL IS: 75
//Mage attack!
//BROWN BITER STRENGTH LEVEL IS: 15
//Rogue attack!
//BLACK KILLER STRENGTH LEVEL IS: 60