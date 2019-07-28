package Personnages;

public class Guerrier extends Personnage {

    public Guerrier(int level, int life, int strength, int agility, int intelligency) {
        super(level, life, strength, agility, intelligency);
    }

    @Override
    public void basicAttack(int attack, int pv) {
        System.out.println("");
    }
}
