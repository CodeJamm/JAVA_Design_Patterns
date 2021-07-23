package bridge_design_pattern;

abstract class TV 
{
    Remote remote;
    TV(Remote r) 
    {
        this.remote = r;
    }
    abstract void on();
    abstract void off();
}

class Sony extends TV
{
    Remote remoteType;
    Sony(Remote r) 
    {
        super(r);
        this.remoteType = r;
    }
  
    public void on()
    {
        System.out.print("Sony TV ON: ");
        remoteType.on();
    }
    
    public void off()
    {
        System.out.print("Sony TV OFF: ");
        remoteType.off();
    }
}
    
class Philips extends TV 
{
    Remote remoteType;
    Philips(Remote r) 
    {
        super(r);
        this.remoteType = r;
    }
  
    public void on()
    {
        System.out.print("Philips TV ON: ");
        remoteType.on();
    }
    
    public void off()
    {
        System.out.print("Philips TV OFF: ");
        remoteType.off();
    }
}

interface Remote
{
    public void on();
    public void off();
}

class OldRemote implements Remote 
{
    @Override
    public void on()  
    {
        System.out.println("ON with Old Remote");
    }

    @Override
    public void off() 
    {
        System.out.println("OFF with old Remote");
    }
  
}

class NewRemote implements Remote 
{
    @Override
    public void on() 
    {
        System.out.println("ON with New Remote");
    }

    @Override
    public void off() 
    {
        System.out.println("OFF with New Remote");
    }
}

public class BridgePattern 
{
    public static void main(String[] args) 
    {
        TV sonyOldRemote = new Sony(new OldRemote());
        sonyOldRemote.on();
        sonyOldRemote.off();
        System.out.println();
    
        TV sonyNewRemote = new Sony(new NewRemote());
        sonyNewRemote.on();
        sonyNewRemote.off();
        System.out.println();
    
        TV philipsOldRemote = new Philips(new OldRemote());
        philipsOldRemote.on();
        philipsOldRemote.off();
        System.out.println();
    
        TV philipsNewRemote = new Philips(new NewRemote());
        philipsNewRemote.on();
        philipsNewRemote.off();  
    }
}