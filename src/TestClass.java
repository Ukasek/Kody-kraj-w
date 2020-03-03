import java.io.FileNotFoundException;
import java.util.Map;

public class TestClass {
    public static void main(String[] args) {
        String fileName = "countries.csv";
        try {
            Map<String, Country> countries = CountriesInfo.mapReturn(fileName);
            CountriesInfo.countryInfo(countries);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
