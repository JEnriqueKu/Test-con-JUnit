package conversionTemperatura;

public class TemperatureConverter {
    public double conversorFahrenheit(double cantidad){

        double f = (cantidad * 9/5 + 32);
        return f;
    }

    public double conversorKelvin(double cantidad){
        double k = (cantidad + 273.15);
        return k;
    }

    public double conversorFahrenheitCelsius(double cantidad){
        double c = ((cantidad - 32) * 5/9);
        return c;
    }
}

