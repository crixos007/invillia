package com.invillia.challenge.java;

public class Car {
	String name;
	double price;
	Integer horsePower;
	
	
	public Car(String name, int price, int horsePower) {
		super();
		this.name = name;
		this.price = price;
		this.horsePower = horsePower;
	}
		
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @return the horsePower
	 */
	public Integer getHorsePower() {
		return horsePower;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @param horsePower the horsePower to set
	 */
	public void setHorsePower(Integer horsePower) {
		this.horsePower = horsePower;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((horsePower == null) ? 0 : horsePower.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (horsePower == null) {
			if (other.horsePower != null)
				return false;
		} else if (!horsePower.equals(other.horsePower))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", horsePower=" + horsePower + "]";
	}	
}