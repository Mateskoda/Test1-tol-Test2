package progmatic;

import java.util.ArrayList;

public class City {
    Country countryDetail;
    private String name;
    private String codeOfCountry;
    private int cityPopulation;

    public City(String name, String codeOfCountry, int cityPopulation) {
        this.name = name;
        this.codeOfCountry = codeOfCountry;
        this.cityPopulation = cityPopulation;
    }
    public String getName() {
        return name;
    }
    public String getCodeOfCountry() {
        return codeOfCountry;
    }
    public int getCityPopulation() {
        return cityPopulation;
    }

    //    Bónusz A City osztályba írj egy
//    metódust, ami visszaadja, hogy az adott város populációja hány százaléka az anyaország populációjának! Ha akár a város, akár az
//    anyaország populációja nincs megadva, a metódusod -1-gyel térjen vissza!
    public double getPopulationPercentage() {
        double populationPercentage = 0;
        if (countryDetail.getPopulation() == 0 || cityPopulation == 0) {
            return -1;
        }
        return cityPopulation * 100d / countryDetail.getPopulation();
    }

}
