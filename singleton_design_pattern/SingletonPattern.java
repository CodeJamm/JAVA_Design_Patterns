package singleton_design_pattern;

class SingletonEagar 
{
  private static SingletonEagar instance = new SingletonEagar(); 
  private SingletonEagar()
  {
	  
  }
  public static SingletonEagar getInstance()
  {
    return instance;
  }
}

class Singleton 
{
  private static Singleton instance; 
  private Singleton()
  {
	  
  }
  public static Singleton getInstance() 
  {
    if(instance == null) 
    {
      instance = new Singleton();
    }
    return instance;
  }
}

class SingletonSynchronizedMethod
{
  private static SingletonSynchronizedMethod instance; 
  private SingletonSynchronizedMethod()
  {
	  
  }
  public static synchronized SingletonSynchronizedMethod getInstance() 
  {
    if(instance == null) 
    {
      instance = new SingletonSynchronizedMethod();
    }
    return instance;
  }
}

class SingletonSynchronized 
{
  private static SingletonSynchronized instance; 
  private SingletonSynchronized()
  {
	  
  }
  public static SingletonSynchronized getInstance() 
  {
    if(instance == null) 
    {
      synchronized (SingletonSynchronized.class) 
      {
        if(instance == null) 
        {
          instance = new SingletonSynchronized();
        }
      }
    }
    return instance;
  }
}

public class SingletonPattern 
{
  public static void main(String[] args) 
  {
    SingletonSynchronized instance = SingletonSynchronized.getInstance();
    System.out.println(instance);
    SingletonSynchronized instance1 = SingletonSynchronized.getInstance(); 
    System.out.println(instance1);
  }
}