package de.hdm.mi.sd1;

import de.hdm.mi.sd1.Task10_PotionEnum.Player;
import de.hdm.mi.sd1.Task10_PotionEnum.Potion;
import de.hdm.mi.sd1.Task10_PotionEnum.PotionType;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test of {@link App}.
 */
public class Task13_PotionTest {
    /**
     * Test for correct sum of two arguments.
     */

    @Test
    public void testPlayerConstruction() {
        final Player player = new Player("Tim", 100, 5, 5);

        Assert.assertEquals("Tim", player.getName());
        Assert.assertEquals(100, player.getHealth());
        Assert.assertEquals(5, player.getAttack());
        Assert.assertEquals(5, player.getDefense());
    }

    @Test
    public void testPotionConstructionValidType() {
        final Potion healthPotion = new Potion(PotionType.HEALTH, 20);

        Assert.assertEquals(20, healthPotion.getValue());
        Assert.assertEquals("red", healthPotion.getPotionColor());
    }

    @Test
    public void testPotionConstructionRandomType() {
        final Potion healthPotion = new Potion(PotionType.RANDOM, 20);

        Assert.assertEquals(20, healthPotion.getValue());
        Assert.assertEquals("white", healthPotion.getPotionColor());
    }

    @Test
    public void testPlayerPotionAdd() {
        final Player player = new Player("Tim", 100, 5, 5);
        final Potion healthPotion = new Potion(PotionType.HEALTH, 20);
        player.usePotion(healthPotion);

        Assert.assertEquals(120, player.getHealth());
        Assert.assertEquals(5, player.getAttack());
        Assert.assertEquals(5, player.getDefense());
    }
}