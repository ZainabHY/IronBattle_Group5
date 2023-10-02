public class Main {
    public static void main(String[] args) {
        // Create warriors and wizards
        Warrior warrior1 = createWarrior("Warrior 1");
        Warrior warrior2 = createWarrior("Warrior 2");
        Wizard wizard1 = createWizard("Wizard 1");
        Wizard wizard2 = createWizard("Wizard 2");

        // Simulate battles
        simulateBattle(warrior1, warrior2);
        simulateBattle(wizard1, wizard2);
        simulateBattle(warrior1, wizard1);
    }

    // Create a new Warrior character with random attribute values
    public static Warrior createWarrior(String name) {
        int hp = generateRandomNumber(100, 200);
        int stamina = generateRandomNumber(10, 50);
        int strength = generateRandomNumber(1, 10);

        return new Warrior(name, hp, stamina, strength);
    }

    // Create a new Wizard character with random attribute values
    public static Wizard createWizard(String name) {
        int hp = generateRandomNumber(50, 100);
        int mana = generateRandomNumber(10, 50);
        int intelligence = generateRandomNumber(1, 50);

        return new Wizard(name, hp, mana, intelligence);
    }

    // Simulate a battle between two characters
    public static void simulateBattle(Character character1, Character character2) {
        System.out.println("Battle between " + character1.getName() + " and " + character2.getName() + " starts!");

        // Continue the battle until one character is defeated
        while (character1.isAlive() && character2.isAlive()) {
            character1.attack(character2); // Character 1 attacks Character 2
            character2.attack(character1); // Character 2 attacks Character 1

            System.out.println(character1.getName() + " HP: " + character1.getHp());
            System.out.println(character2.getName() + " HP: " + character2.getHp());
        }

        // Determine the winner based on the outcome of the battle
        if (character1.isAlive()) {
            System.out.println(character1.getName() + " wins!");
        } else if (character2.isAlive()) {
            System.out.println(character2.getName() + " wins!");
        } else {
            System.out.println("It's a tie! Restarting the battle...");
            simulateBattle(character1, character2); // Restarting the battle if it's a tie
        }

        System.out.println();
    }

}
