import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountriesInfo {
    public static void countryInfo(Map<String, Country> countries) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje: ");
        String code = scanner.nextLine();
        System.out.println(countries.get(code).toString());
    }

    public static Map<String, Country> mapReturn(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        Map<String, Country> countries = new TreeMap<>();
        while (scanner.hasNextLine()) {
            String countryInfo = scanner.nextLine();
            String[] div = countryInfo.split(";");
            Country country = new Country(div[0], div[1], Integer.parseInt(div[2]));
            countries.put(div[0], country);
        }
        return countries;

    }
}


