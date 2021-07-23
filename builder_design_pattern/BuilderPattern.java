package builder_design_pattern;

class Vehicle 
{
  private String engine;
  private int wheel;
  private int airbags;
  
  public String getEngine() 
  {
    return this.engine;
  }
  
  public int getWheel() 
  {
    return this.wheel;
  }
  
  public int getAirbags()
  {
    return this.airbags;
  }
  
  private Vehicle(VehicleBuilder builder)
  {
    this.engine = builder.engine;
    this.wheel = builder.wheel;
    this.airbags = builder.airbags;
  }
  
  public static class VehicleBuilder
  {
    private String engine;
    private int wheel;
    private int airbags;
    
    public VehicleBuilder(String engine, int wheel)
    {
      this.engine = engine;
      this.wheel = wheel;
    }
    
    public VehicleBuilder setAirbags(int airbags) 
    {
      this.airbags = airbags;
      return this;
    }
    
    public Vehicle build() 
    {
      return new Vehicle(this);
    }
  }
}

public class BuilderPattern
{
  public static void main(String[] args) 
  {
    Vehicle car = new Vehicle.VehicleBuilder("1500cc", 4).setAirbags(4).build();
    Vehicle bike = new Vehicle.VehicleBuilder("250cc", 2).build();
    
    System.out.println(car.getEngine());
    System.out.println(car.getWheel());
    System.out.println(car.getAirbags());
    
    System.out.println(bike.getEngine());
    System.out.println(bike.getWheel());
    System.out.println(bike.getAirbags());
  }
}