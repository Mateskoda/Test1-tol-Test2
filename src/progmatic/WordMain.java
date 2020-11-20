package progmatic;

import java.io.FileNotFoundException;

public class WordMain {
    public static void main(String[] args) throws FileNotFoundException {

        WorldStatistics worldStatistics= new WorldStatistics();
        worldStatistics.readFile("orszagok.txt", "varosok.txt");
        for (Country country : worldStatistics.countries) {
//            System.out.println(country.getPopulation());
//            System.out.println(country.getPopulationDensity());
//            System.out.println(country.getRuralPopulation());
//            System.out.println();
        }
//        System.out.println(worldStatistics.countries.get(0).getPopulation());
//        System.out.println(worldStatistics.countries.get(0).getPopulationDensity());
//        System.out.println(worldStatistics.countries.get(0).getRuralPopulation());
//        System.out.println();
//        System.out.println(worldStatistics.findCountryByISoCode("GIB").getName());
//        System.out.println(worldStatistics.getCountriesOfContinent("South America"));
//        System.out.println(worldStatistics.getAhmedCount());
//        System.out.println(worldStatistics.getPopularFirstLetter());
        System.out.println(worldStatistics.lastIndependentCountry());
//        for (int i = 0; i <worldStatistics.cities.size() ; i++) {
//            System.out.println(worldStatistics.cities.get(i).getPopulationPercentage());
//        }
}
    }

