package de.hdm.mi.sd1.Task10_PotionEnum;

/**
 * Created by TG on 22.11.19.
 */
public class EnumApp {

    public static void main(String[] args) {

        // initialize a new player that can use potions
        Player me = new Player("Tim", 100, 5, 5);
        printPlayerStats(me);


        // when creating a new Potion we can use the PotionType enum we've declared in order to provide valid values
        Potion healthPotion = new Potion(PotionType.HEALTH, 25);
        printPotionStats(healthPotion);


        // in order to use the Potion, we pass it to the Player's use Potion method
        me.usePotion(healthPotion);
        printPlayerStats(me);


        // when creating a new Potion we can use the PotionType enum we've declared in order to provide valid values
        Potion attackPotion = new Potion(PotionType.ATTACK, 2);
        printPotionStats(attackPotion);


        // we can simply pass the potion to the user to use it
        me.usePotion(attackPotion);
        printPlayerStats(me);


        // when creating a new Potion with a different value than the supported ones we get an error
        // Potion invalidPotion = new Potion(PotionType.TEST, 2);
    }


    static void printPlayerStats (Player player) {
        System.out.println("Player: " + player.getName() + " has " + player.getHealth() + " Health, " + player.getAttack() + " Attack, and " + player.getDefense() + " Defense.");
        System.out.println();
    }


    static void printPotionStats (Potion potion) {
        System.out.println("Player picked up a " + potion.getPotionColor() + " " + potion.getPotionType()
                +  " potion that increases " + potion.getPotionType()  + " by " + potion.getValue());
        System.out.println();
    }

}
