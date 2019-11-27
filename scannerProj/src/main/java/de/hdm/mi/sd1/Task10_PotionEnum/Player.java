package de.hdm.mi.sd1.Task10_PotionEnum;

/**
 * Created by TG on 22.11.19.
 */
public class Player {
    private String name;
    private int health;
    private int attack;
    private int defense;

    public Player(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    // since we know the possible values for the potions we can use them to check
    // what we have to do when the player uses the potion
    public void usePotion (Potion potion) {
        switch (potion.getPotionType()) {
            case HEALTH:
                health += potion.getValue();
                break;
            case ATTACK:
                attack += potion.getValue();
                break;
            case DEFENSE:
                defense += potion.getValue();
                break;
            default:
                System.out.println("Player can't handle this kind of potion");
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
}
