package observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

interface Subject 
{
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();
}

class DeliveryData implements Subject
{
    private List<Observer> observers;
    private String location;
  
    public DeliveryData() 
    {
        this.observers = new ArrayList<>();
    }
  
    @Override
    public void register(Observer obj) 
    {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) 
    {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers()
    {
      for(Observer obj : observers) 
      {
          obj.update(location);
      }
    }

    public void locationChanged()
    {
        this.location = getLocation();
        notifyObservers();
    }
  
    public String getLocation() 
    {
      return "YPlace";
    }
}


interface Observer
{
    public void update(String location);
}


class Seller implements Observer 
{
    private String location;
  
    @Override
    public void update(String location)
    {
        this.location = location;
        showLocation();
    }

    public void showLocation()
    {
        System.out.println("Notification at Seller - Current Location: " + location);
    }
}

class User implements Observer 
{
    private String location;
  
    @Override
    public void update(String location) 
    {
        this.location = location;
        showLocation();
    }

    public void showLocation() 
    {
        System.out.println("Notification at User - Current Location: " + location);
    }
}

class DeliveryWarehouseCenter implements Observer
{
    private String location;
  
    @Override
    public void update(String location)
    {
        this.location = location;
        showLocation();
    }

    public void showLocation()
    {
        System.out.println("Notification at Warehouse - Current Location: " + location);
    }
}

public class ObserverPattern
{
    public static void main(String[] args)
    {
        DeliveryData topic = new DeliveryData();
    
        Observer obj1 = new Seller();
        Observer obj2 = new User();
        Observer obj3 = new DeliveryWarehouseCenter();
    
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);
        
        topic.locationChanged();
        topic.unregister(obj3);
    
        System.out.println();
        topic.locationChanged();
    }
}