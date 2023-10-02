import java.util.Random;


public class Wizard extends Character{
//    private int hp; // (50-100) health points
    private int mana; // (10-50) resource the wizard consumes to cast spells
    private int intelligence; // (1-50) measuring how strong the wizard spells

    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    // Getters & Setters

// Not needed
//    public void setHp(int hp) {
////        this.hp = hp;
//        int min = 50;
//        int max = 100;
//        Random random = new Random();
//        random.nextInt(max - min + 1) + min;
//
//    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }


    // Overload attack() method for Wizards
    // reduce that character’s health based on the intelligence of the spell
    @Override
    public void attack(Character character) {
        int spellDamage = intelligence; // Damage based on the wizard's intelligence
        character.setHp(character.getHp() - spellDamage); // Reduce target's health
        System.out.println(getName() + " casts a spell on " + character.getName() + " causing " + spellDamage + " damage.");
    }
}
