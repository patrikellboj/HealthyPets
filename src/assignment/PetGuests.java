package assignment;

import java.util.ArrayList;
import java.util.List;

public class PetGuests {
    protected List<Animal> animalList = new ArrayList<>();

    public PetGuests() {
        Animal dog1 = new Dog("Sixten", 5000);
        Animal dog2 = new Dog("Dogge", 10000);
        Animal cat1 = new Cat("Venus", 5000);
        Animal cat2 = new Cat("Ove", 3000);
        Animal snake1 = new Snake("Hypno", 1000);

        animalList.add(dog1);
        animalList.add(dog2);
        animalList.add(cat1);
        animalList.add(cat2);
        animalList.add(snake1);
    }

    public Animal getGuest(String petNameInput) {
        Animal currentGuest = null;
        // Loopa igenom alla djur i animalList
        for (Animal instanceOfAnimal : animalList) {
            // Kolla om något av djuren har samma namn som petNameInput
            if (petNameInput.equalsIgnoreCase(instanceOfAnimal.getName())) {
                // Returnera djurets namn om det matchar
                return currentGuest = instanceOfAnimal;
            }
        }
        return currentGuest;
    }
}
