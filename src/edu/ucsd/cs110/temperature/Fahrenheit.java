package edu.ucsd.cs110.temperature;

/**
 * Created by Ueai on 2/15/17.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t) {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float f = this.getValue();
        float c = (f-32)/1.8f;
        return new Celsius(c);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString() {
        return "" + this.getValue() + " F";
    }
}
