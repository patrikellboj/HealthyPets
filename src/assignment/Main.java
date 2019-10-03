package assignment;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        PetGuests petGuests = new PetGuests();

        while (true) {
            String petNameInput = JOptionPane.showInputDialog(
                    null,
                    "Vad är namnet på djuret som ska få mat?",
                    "HealthyPets dietcoach",
                    JOptionPane.QUESTION_MESSAGE);
            if (petNameInput == null) {
                break;
            } else {
                petNameInput = petNameInput.trim().toLowerCase();
                Animal currentGuest = petGuests.getGuest(petNameInput);
                if (currentGuest != null) {

                    JOptionPane.showMessageDialog (
                            null,
                            currentGuest.getName() + " behöver " +
                                      currentGuest.calculatePortion() + "g " + currentGuest.getFoodType());
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Tyvärr finns det inget djur med namnet \"" + petNameInput + "\"\n" +
                                    "Kontrollera stavningen och försök igen");
                }
            }
        }
    }
}