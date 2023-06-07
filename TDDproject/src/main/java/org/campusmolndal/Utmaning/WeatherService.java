package org.campusmolndal.Utmaning;

import java.io.IOException;

/**
 * This class represents a weather service. its is completely bogous of course.
 * its made up for the sake of the exercise by old exercises and GPT inputs.
 * It contains one method to get the weather information for a city.
 */
public class WeatherService {

    WeatherAPI api;

    static CityForcast cityForcast;

    public WeatherService(WeatherAPI api, String city) throws IOException {
        this.api = api;
        getCityForcast(city);
    }

    public void getCityForcast(String city) throws IOException {
        cityForcast = CityForcast.fromJson(api.getWeatherInformation(city));
    }

    public static String getCityName(){
        return cityForcast.getName();
    }

    public static double getCityTemp(){
        return cityForcast.getTemp();
    }

    public static String getCityWeatherDescription(){
        return cityForcast.getWeatherDescription();
    }

}




