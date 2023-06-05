package org.campusmolndal.Utmaning;

import org.json.JSONObject;
/**
 * This class represents a city.
 * It contains the name of the city, the temperature and the weather description.
 */
public class City {
    private String name;
    private double temp;

    private String WeatherDescription;

    public City(String name, double temp, String WeatherDescription) {
        this.name = name;
        this.temp = temp;
        this.WeatherDescription = WeatherDescription;
    }

    /**
     * This method returns the name of the city.
     * @return the name of the city
     */
    public String getName() {
        return name;
    }

    /**
     * This method returns the temperature of the city.
     * @return the temperature of the city
     */
    public double getTemp() {
        return temp;
    }

    /**
     * This method returns the weather description of the city.
     * @return the weather description of the city
     */
    public String getWeatherDescription() {
        return WeatherDescription;
    }

    /**
     * This method returns a string representation of the city.
     * @return a string representation of the city
     */
    //from json
    static City fromJson(String string){
        JSONObject jsonObject = new JSONObject(string);

        String name = jsonObject.getString("name");
        double temp = jsonObject.getJSONObject("main").getDouble("temp");
        String WeatherDescription = jsonObject.getJSONArray("weather").getJSONObject(0).getString("description");

        return new City(name, temp, WeatherDescription);
    }

}
