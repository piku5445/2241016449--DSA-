package comparator;
import java.util.*;
public class laptops implements comparator<laptops>{

	private String brand;
	private int ram;
	private int price;
	
	
	
	public laptops(String brand, int ram, int price) {
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "laptops [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	public static int compareto(laptops laps2) {
		
	}
	
}
