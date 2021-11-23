package by.epam.training.appliances.entity;

import java.util.Objects;

public class Appliances {
	private String model;
	private int price;
	private int powerConsumption;
	private String energySavingType;
	
	public Appliances() {}
	
	public Appliances(String model, int price, int powerConsumption, String energySavingType) {
		super();
		this.model = model;
		this.price = price;
		this.powerConsumption = powerConsumption;
		this.energySavingType = energySavingType;	
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getEnergySavingType() {
		return energySavingType;
	}

	public void setEnergySavingType(String energySavingType) {
		this.energySavingType = energySavingType;
	}
	
	public String info() {
		return "price=" + price + ", powerConsumption=" + powerConsumption + ", energySavingType - " + energySavingType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(energySavingType, model, powerConsumption, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliances other = (Appliances) obj;
		return Objects.equals(energySavingType, other.energySavingType) && Objects.equals(model, other.model)
				&& powerConsumption == other.powerConsumption && price == other.price;
	}	

	
}
