package task02.app;

public class ElectricScooter extends Scooter{
	
	private int batteryCapacity;
	private int maxSpeed;
	
	public ElectricScooter(String brand, int yearManufactured, String color, String model, int batteryCapacity,
			int maxSpeed) {
		super(brand, yearManufactured, color, model);
		this.batteryCapacity = batteryCapacity;
		this.maxSpeed = maxSpeed;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public boolean canUseInTraffic() {
        return maxSpeed <= 25;
    }

	@Override
	public String toString() {
		return "Gyártó: " + getBrand() + ", Gyártási év: " +getYearManufactured() + ", Modell: " + getModel() + ", Akkumulátor-kapacitás: " + batteryCapacity + ", Maximális sebesség: " + maxSpeed;
	}
	
	

}
