package edu.cnm.deepdive;

public class TemperatureConversion {

private static final double CELSIUS_TO_FAHRENHEIT_SCALE = 9.0 / 5;
private static final double FAHRENHEIT_TO_CELSIUS_SCALE = 1/ CELSIUS_TO_FAHRENHEIT_SCALE;
private static final double SCALE_OFFSET = 32;

  public static void main(String[] args) {

    if (args.length == 0) {
      double c = 100;
      double f = 32;
      System.out.println("celsius " + c + "=" + convertC2F(c) + "Fahreheit");
      System.out.println("celsius " + f + "=" + convertC2F(f) + "celsius");
    } else {
      for (int i = 0; i < args.length; i++) {
        double tempCelsius = Double.parseDouble(args[i]);
        System.out.println("celsius " + tempCelsius + "=" + convertC2F(tempCelsius) + "Fahreheit");
      }

    }


  }

  public static double converTC2F(double celsius) {
    double fahrenheit = celsius * 9 / 5 + 32;
    return celsius * CELSIUS_TO_FAHRENHEIT_SCALE + SCALE_OFFSET;


  }

  public static double convertC2F(double fahrenheit) {
    return (fahrenheit - SCALE_OFFSET) * FAHRENHEIT_TO_CELSIUS_SCALE;


  }
public static double[] convertC2F(double[] celsiusTemperatures) {
double[] fahrenheitTemperatures = new double[celsiusTemperatures.length];
for (int i = 0; i< celsiusTemperatures.length; i++) {
  double celsius = celsiusTemperatures[i];
  double fahrenheit = convertC2F(celsius);
  fahrenheitTemperatures[i] = fahrenheit;
}
return fahrenheitTemperatures;
}
}