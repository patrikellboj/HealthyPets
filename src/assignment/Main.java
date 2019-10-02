package assignment;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Sixten", 5000);
        Dog dog2 = new Dog("Dogge", 10000);
        Cat cat1 = new Cat("Venus", 5000);
        Cat cat2 = new Cat("Ove", 3000);
        Snake snake1 = new Snake("Hypno", 1000);

        while (true) {
            String petNameInput = JOptionPane.showInputDialog(
                    null,
                    "Vad är namnet på djuret som ska få mat?",
                    "HealthyPets dietcoach",
                    3);

            if (petNameInput != null) {
                petNameInput = petNameInput.trim().toLowerCase();
                if (petNameInput.equalsIgnoreCase(dog1.getName())) {
                    JOptionPane.showMessageDialog (null, dog1.getName() + " behöver " + dog1.calculatePortion() + "g " + dog1.getFoodType());
                } else if (petNameInput.equalsIgnoreCase(dog2.getName())) {
                    JOptionPane.showMessageDialog(null, dog2.getName() + " behöver " +
                            dog2.calculatePortion() + "g " + dog2.getFoodType());
                } else if (petNameInput.equalsIgnoreCase(cat1.getName())) {
                    JOptionPane.showMessageDialog(null, cat1.getName() + " behöver " +
                            cat1.calculatePortion() + "g " + cat1.getFoodType());
                } else if (petNameInput.equalsIgnoreCase(cat2.getName())) {
                    JOptionPane.showMessageDialog(null, cat2.getName() + " behöver " +
                            cat2.calculatePortion() + "g " + cat2.getFoodType());
                } else if (petNameInput.equalsIgnoreCase(snake1.getName())) {
                    JOptionPane.showMessageDialog(null, snake1.getName() + " behöver " +
                            snake1.calculatePortion() + "g " + snake1.getFoodType());
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Tyvärr finns det inget djur med namnet \"" + petNameInput + "\"\n" +
                                    "Kontrollera stavningen och försök igen");
                }
            } else {
                break;
            }
        }
    }
}
