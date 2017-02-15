package edu.ucsd.cs110.temperature;

/**
 * Created by Ueai on 2/15/17.
 */
public class Celsius extends Temperature {
    public Celsius(float t) {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float c = this.getValue();
        float f = (c*1.8f)+32;
        return new Fahrenheit(f);
    }

    public String toString() {
        return "" + this.getValue() + " C";
    }


}
