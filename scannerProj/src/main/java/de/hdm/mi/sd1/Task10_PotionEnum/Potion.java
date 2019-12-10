package de.hdm.mi.sd1.Task10_PotionEnum;

/**
 * Created by TG on 22.11.19.
 */

public class Potion {
    private PotionType potionType;
    private String potionColor;
    private int value;

    public Potion (final PotionType potionType, final int value) {
        this.potionType = potionType;
        this.value = value;

        setPotionColor(potionType);
    }

    public PotionType getPotionType() {
        return potionType;
    }

    public int getValue() {
        return value;
    }

    public String getPotionColor() {
        return potionColor;
    }

    // this way, the potion color is always fixed to the potion type
    // we don't want it to be changable from "outside"
    private void setPotionColor(PotionType potionType) {
        switch (potionType) {
            case HEALTH:
                this.potionColor = "red";
                break;
            case ATTACK:
                this.potionColor = "yellow";
                break;
            case DEFENSE:
                this.potionColor = "blue";
                break;
            default:
                this.potionColor = "white";
        }
    }
}
