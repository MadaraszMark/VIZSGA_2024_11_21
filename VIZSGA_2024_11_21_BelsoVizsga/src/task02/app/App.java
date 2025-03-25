package task02.app;

public class App {

	public static void main(String[] args) {
		
		ElectricScooter scooter = new ElectricScooter("BestElecticRoller4U", 2022, "fekete", "M-531", 10000, 25);
		
        System.out.println("A roller adatai: ");
        System.out.println(scooter.toString());
        if (scooter.canUseInTraffic()) {
            System.out.println("A roller használható a közlekedésben.");
        } else {
            System.out.println("A roller nem használható a közlekedésben.");
        }
        
		
	}
}
