package factory_design_pattern;

abstract class Vehicle 
{
	 public abstract int getWheel();
	 public String toString() 
	 {
	    return "Wheel: " + this.getWheel();
	 }
}

class Car extends Vehicle 
{
     int wheel;
	 Car(int wheel)
	 {
	    this.wheel = wheel;
	 }

	 @Override
	 public int getWheel() 
	 {
	    return this.wheel;
	 }
}

class Bike extends Vehicle 
{
	 int wheel;
	 Bike(int wheel) 
	 {
	    this.wheel = wheel;
	 }
	  
	 @Override
	 public int getWheel()
	 {
	    return this.wheel;
	 }
}

class VehicleFactory
{
	 public static Vehicle getInstance(String type, int wheel)
	 {
	    if(type == "car") 
	    {
	       return new Car(wheel);
	    } 
	    else if(type == "bike") 
	    {
	       return new Bike(wheel);
	    }
	    return null;
	 }
}

public class FactoryPattern
{
     public static void main(String[] args) 
	 {
	    Vehicle car = VehicleFactory.getInstance("car", 4);
	    System.out.println(car);
	    
	    Vehicle bike = VehicleFactory.getInstance("bike", 2);
	    System.out.println(bike);
	 }
}