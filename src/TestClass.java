import java.io.FileNotFoundException;
import java.util.Map;

public class TestClass {
    public static void main(String[] args) {
        String fileName = "countries.csv";
        try {
            Map<String, Country> countries = CountriesImplements.mapReturn(fileName);
            CountriesImplements.countryInfo(countries);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
