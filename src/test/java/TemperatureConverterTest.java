import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    void TestCelsiusToFahrenheit () {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0));
    }

    @Test
    void TestfahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(100.0, converter.fahrenheitToCelsius(212.0));
    }

    @Test
    void TestCelsiusToKelvin() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(273.15, converter.celsiusToKelvin(0.0));
    }
}
