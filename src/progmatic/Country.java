package progmatic;

import java.util.ArrayList;
import java.util.HashMap;

public class Country {
    ArrayList<City> citiesInCountry = new ArrayList<>();
    private String codeOfCountry;
    private String name;
    private String continent;
    private String region;
    private double area;
    private String yearOfIndep;
    private int population;
    private String headOfState;

    public Country(String codeOfCountry, String name, String continent, String region, double area, String yearOfIndep, int population, String headOfState) {
        this.codeOfCountry = codeOfCountry;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.area = area;
        this.yearOfIndep = yearOfIndep;
        this.population = population;
        this.headOfState = headOfState;
    }

    public ArrayList<City> getCitiesInCountry() {
        return citiesInCountry;
    }

    public String getCodeOfCountry() {
        return codeOfCountry;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getRegion() {
        return region;
    }

    public double getArea() {
        return area;
    }

    public String getYearOfIndep() {
        return yearOfIndep;
    }

    public int getPopulation() {
        return population;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    //    metódus, ami visszaadja az adott ország népsűrűségét fő/km2-ben! Ha az ország területe vagy népessége nincs megadva, akkor metódusod -1-gyel térjen vissza!
    public double getPopulationDensity() {
        if (population == 0 || area == 0) {
            return -1;
        }
        return population / area;
    }

    //    metódus, ami visszaadja, hogy az adott országban hány fő él a felsorolt városokon kívül!
    public double getRuralPopulation() {
        int sum = 0;
        for (City city : citiesInCountry) {
            sum += city.getCityPopulation();
        }
        return population - sum;
    }


}
