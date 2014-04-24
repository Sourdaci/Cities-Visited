import java.util.ArrayList;

/**
 * This class allows to record the name of cities that you have visited.
 * 
 * @author Miguel Bayon Alonso
 * @version 1.0
 */
public class VisitedCities
{
    // instance variables - replace the example below with your own
    private ArrayList<String> cities;

    /**
     * Constructor for objects of class VisitedCities
     */
    public VisitedCities()
    {
        cities = new ArrayList<>();
    }

    /**
     * Allow to record a city 
     * 
     * @param  name   the name of city to record
     */
    public void addCity(String name)
    {
        cities.add(name);
    }
    
    /**
     * Print the names of recorded cities
     */
    public void printCities()
    {
        System.out.println("The cities that you have visited are:");
        for(String city : cities) {            
            System.out.println(city);
        }
    }
}

