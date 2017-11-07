package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        //float value = (this.getValue()-(float)(32))*(5/9);
        float value = (float) ((this.getValue() - 32.0)*(5.0/9.0));
        return new Celsius(value);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue()+" F";
    }
}
