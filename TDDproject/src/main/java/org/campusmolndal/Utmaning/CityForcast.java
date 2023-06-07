package org.campusmolndal.Utmaning;

import org.json.JSONObject;

/**
 * This class represents a city.
 * It contains the name of the city, the temperature and the weather description.
 */
public class CityForcast {
    private String name;
    private double temp;

    private String WeatherDescription;

    public CityForcast(String name, double temp, String WeatherDescription) {
        this.name = name;
        this.temp = temp;
        this.WeatherDescription = WeatherDescription;
    }

    /**
     * This method returns the name of the city.
     * @return the name of the city
     */
    public String getName() {
        if (name == null)
            throw new NullPointerException("City name is null");
        if(name.isEmpty())
            throw new IllegalArgumentException("City name is empty");
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
     * @return a City object containing the city name, temperature and weather description from the JSON string
     */
    static CityForcast fromJson(String json){
        JSONObject object = new JSONObject(json);
        return new CityForcast(object.getString("name"),
                object.getJSONObject("main").getDouble("temp"),
                object.getJSONArray("weather").getJSONObject(0).getString("description"));
    }

}
