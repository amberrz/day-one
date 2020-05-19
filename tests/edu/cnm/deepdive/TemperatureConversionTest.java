package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureConversionTest {

  static final double[] celsiusTemperature = {0, -40, 100, -273.15};
  static final double[] fahrenheitTemperature = {32, -40, 212, -459.67};
  static final double TOLERANCE = 0.000001;

  @Test
  void convertC2FScalar() {
    for (int i = 0; i < celsiusTemperature.length; i++) {
      assertEquals(fahrenheitTemperature[i],
          TemperatureConversion.convertC2F(celsiusTemperature[i]), TOLERANCE);
    }
  }


  @Test
  void convertF2CScalar() {
    for (int i = 0; i < fahrenheitTemperature.length; i++) {
      assertEquals(celsiusTemperature[i],
          TemperatureConversion.convertF2C(fahrenheitTemperature[i]),TOLERANCE);
    }
  }

  @Test
  void ConvertC2FArray() {
    assertArrayEquals(fahrenheitTemperature,
        TemperatureConversion.convertC2F(celsiusTemperature),TOLERANCE);
  }

  @Test
  void convertF2CArray() {
    assertArrayEquals(celsiusTemperature,
        TemperatureConversion.convertF2C(fahrenheitTemperature),TOLERANCE);
  }
}