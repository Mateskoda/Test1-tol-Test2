package progmatic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WorldStatistics {
    ArrayList<Country> countries = new ArrayList<>();
    ArrayList<City> cities = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
//        readFile("orszagok.txt", "varosok.txt");
//        for (Country country : countries) {
//            System.out.println(country.getPopulation());
//            System.out.println(country.getPopulationDensity());
//            System.out.println(country.getRuralPopulation());
//            System.out.println();
//        }
//        System.out.println(countries.get(0).getPopulation());
//        System.out.println(countries.get(0).getPopulationDensity());
//        System.out.println(countries.get(0).getRuralPopulation());
//        System.out.println();
//        System.out.println(findCountryByISoCode("SVK").getName());
//        System.out.println(getCountriesOfContinent("Europe"));
//        System.out.println(getAhmedCount());
//        System.out.println(getPopularFirstLetter());
//        System.out.println(lastIndependentCountry());
//        for (int i = 0; i <cities.size() ; i++) {
//        System.out.println(cities.get(i).getPopulationPercentage());
//    }}
    }

    public void readFile(String countriesFile, String citiesFile) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(countriesFile));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            String codeOfCountry = parts[0];
            String name = parts[1];
            String continent = parts[2];
            String region = parts[3];
            double area = Double.parseDouble(parts[4]);
            String yearOfIndep = parts[5];
            int population = Integer.parseInt(parts[6]);
            String headOfState = "nincs";
            if (parts.length > 7) {
                headOfState = parts[7];
            }
            Country country = new Country(codeOfCountry, name, continent, region, area, yearOfIndep, population, headOfState);
            countries.add(country);
        }
        Scanner sc2 = new Scanner(new File(citiesFile));
        for (int i = 0; sc2.hasNext(); i++) {
            String line = sc2.nextLine();
            String[] parts = line.split(",");
            String name = parts[0];
            String codeOfCountry = parts[1];
            int cityPopulation = Integer.parseInt(parts[2]);
            City city = new City(name, codeOfCountry, cityPopulation);
            cities.add(city);

            for (Country country : countries) {
                if (country.getCodeOfCountry().equals(codeOfCountry)) {
                    city.countryDetail = country;
                    country.getCitiesInCountry().add(city);
                    break;
                }
            }
        }
    }

    //    Írj egy olyan metódust, ami országkód alapján visszaadja egy ország összes adatát! A metódus szignatúrája az alábbi legyen:
    public Country findCountryByISoCode(String isoCode) {
        HashMap<String, Country> codeToCountryHashMap = new HashMap<>();
        for (Country country : countries) {
            codeToCountryHashMap.put(country.getCodeOfCountry(), country);
        }
        return codeToCountryHashMap.get(isoCode);
    }

    //    Írj egy olyan metódust, amely visszaadja egy paraméterül kapott kontinens országainak az országkódjait! A metódus szignatúrája az alábbi legyen:
    public ArrayList<String> getCountriesOfContinent(String continentName) {
        return createHashMapCountriesOfContinent().get(continentName);
    }

    public HashMap<String, ArrayList<String>> createHashMapCountriesOfContinent() {
        HashMap<String, ArrayList<String>> continentToCountryCode = new HashMap<>();
        for (int i = 0; i < countries.size(); i++) {
            continentToCountryCode.putIfAbsent(countries.get(i).getContinent(), new ArrayList<String>());
            String cont = countries.get(i).getContinent();
            continentToCountryCode.get(countries.get(i).getContinent()).add(countries.get(i).getCodeOfCountry());
        }
        return continentToCountryCode;
    }

    //    Írj egy olyan metódust, amely visszaadja egy paraméterül kapott ország városainak a neveit (az országot országkóddal adjuk meg)! A metódus szignatúrája az alábbi legyen:
    public HashSet<String> getCitiesOfCountry(String countryCode) {
        return createHasMapCitiesOfCountry().get(countryCode);
    }

    public HashMap<String, HashSet<String>> createHasMapCitiesOfCountry() {
        HashMap<String, HashSet<String>> citiesOfCountry = new HashMap<>();
        for (int i = 0; i < countries.size(); i++) {
            citiesOfCountry.putIfAbsent(countries.get(i).getCodeOfCountry(), new HashSet<>());
            for (int j = 0; j < countries.get(i).citiesInCountry.size(); j++) {
                citiesOfCountry.get(countries.get(i).getCodeOfCountry()).add(countries.get(i).citiesInCountry.get(j).getName());
            }
        }
        return citiesOfCountry;
    }

    //    Hány országnak az államfőjének nevében szerepel “Hamad” vagy “Ahmad” vagy “Ahmed”? A metódus szignatúrája az alábbi legyen:
    public int getAhmedCount() {
        int cntAhmed = 0;
        for (Country country : countries) {
            if (country.getHeadOfState().indexOf("Hamad") >= 0) {
                cntAhmed++;
            } else if (country.getHeadOfState().indexOf("Ahmad") >= 0) {
                cntAhmed++;
            } else if (country.getHeadOfState().indexOf("Ahmed") >= 0) {
                cntAhmed++;
            }
        }
        return cntAhmed;
    }

    //    Melyik betűvel kezdődik a legtöbb országkód? A visszatérési érték egy egybetűs String, a metódus szignatúrája pedig az alábbi legyen:
    public String getPopularFirstLetter() {
        String popularFirstLetter = null;
        HashMap<String, ArrayList<String>> firstLetterhashMap = new HashMap<>();
        for (Country country : countries) {
            firstLetterhashMap.putIfAbsent(country.getCodeOfCountry().substring(0, 1), new ArrayList<>());
            firstLetterhashMap.get(country.getCodeOfCountry().substring(0, 1)).add(country.getName());
        }
        TreeMap<Integer, String> popularFirstLetterTreeMap = new TreeMap<>();
        for (String s : firstLetterhashMap.keySet()) {
            popularFirstLetterTreeMap.put(firstLetterhashMap.get(s).size(), s);
        }
        for (Integer i : popularFirstLetterTreeMap.keySet()) {
            popularFirstLetter = popularFirstLetterTreeMap.get(i);
        }
        return popularFirstLetter;

    }

    //    Melyik ország nyerte el legkésőbb (a nyilvántartás szerint) a függetlenségét? Add vissza a megfelelő országkódot, a metódus szignatúrája az alábbi legyen:
    public String lastIndependentCountry() {
        int yearMax = 0;
        String lastIndCountry = null;
        for (Country country : countries) {
            if (country.getYearOfIndep().equals("NULL")) {
            } else if (Integer.parseInt(country.getYearOfIndep()) > yearMax) {
                yearMax = Integer.parseInt(country.getYearOfIndep());
                lastIndCountry = country.getName();
            }
        }
        return lastIndCountry;
    }
}