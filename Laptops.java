package CollectionPrac;

import java.util.*;


public class Laptops implements Comparable<Laptops>  {   //implements Comparable<Laptops>

	private String brand;
	private int ram;
	private double price;
	
	Laptops()
	{
		
	}
	public Laptops(String brand, int ram, double price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptops [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Laptops l1) {
		
	    return l1.getBrand().compareTo(this.getBrand());
	}
	
	
	
}
