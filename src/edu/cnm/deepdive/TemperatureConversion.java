package edu.cnm.deepdive;

public class TemperatureConversion {




  public static void main(String[] args) {
  //TODO Invoke conversion methods with test values.
    if (args.length == 0) {
      double c = 100;
      double f = 32;
      System.out.println("celsius " + c +"=" + converC2F(c) + "fahreheit");
      System.out.println("celsius " + f +"=" + convertC2F(f) + "celsius");
    } else {
      for (String arg : args) {
        double tempCelsius = Double.parseDouble(arg);
        System.out.println("celsius " + tempCelsius + "=" + converC2F(tempCelsius) + "fahreheit");
      }

    }


  }
public static double converC2F(double celsius){
  double fahrenheit = celsius * 9 / 5 + 32;
return celsius * 9 / 5 + 32;



  }
  public static double convertC2F(double fahrenheit){
    //TODO Complete implementation to convert fahrenheit to celsius and return result
    return (fahrenheit - 32) * 5 / 9;


  }

}

