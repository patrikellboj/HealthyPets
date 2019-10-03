package assignment;

public interface ICalculatePortion {
    // Alla djurobjekt har egna versioner av dessa metoder. Beroende på vilket objekt som kallar på metoderna
    // så utförs olika saker.
    String getFoodType();
    String calculatePortion();
}
