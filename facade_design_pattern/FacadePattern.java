package facade_design_pattern;

import java.sql.Driver;

class Firefox
{
  public static Driver getFirefoxDriver() 
  {
      return null;
  }
  
  public static void generateHTMLReport(String test, Driver driver) 
  {
      System.out.println("Generating HTML Report for Firefox Driver");
  }
  
  public static void generateJUnitReport(String test, Driver driver) 
  {
      System.out.println("Generating JUNIT Report for Firefox Driver");
  }
}

class Chrome 
{
  public static Driver getChromeDriver() 
  {
    return null;
  }
  
  public static void generateHTMLReport(String test, Driver driver) 
  {
      System.out.println("Generating HTML Report for Chrome Driver");
  }
  
  public static void generateJUnitReport(String test, Driver driver)
  {
      System.out.println("Generating JUNIT Report for Chrome Driver");
  }
}

class WebExplorerHelperFacade 
{
  public static void generateReports(String explorer, String report, String test)
  {
      Driver driver = null;
      switch(explorer)
      {
          case "firefox":
          driver = Firefox.getFirefoxDriver();
          switch(report) 
          {
              case "html":
              Firefox.generateHTMLReport(test, driver);
              break;
              case "junit":
              Firefox.generateJUnitReport(test, driver);
              break;
          }
          break;
          case "chrome":
          driver = Chrome.getChromeDriver();
          switch(report) 
          {
              case "html":
              Chrome.generateHTMLReport(test, driver);
              break;
              case "junit":
              Chrome.generateJUnitReport(test, driver);
              break;
          }
      }
  }
}

public class FacadePattern
{
  public static void main(String[] args)
  {
    String test = "CheckElementPresent";
    
    WebExplorerHelperFacade.generateReports("firefox", "html", test);
    WebExplorerHelperFacade.generateReports("firefox", "junit", test);
    WebExplorerHelperFacade.generateReports("chrome", "html", test);
    WebExplorerHelperFacade.generateReports("chrome", "junit", test);
  }

}