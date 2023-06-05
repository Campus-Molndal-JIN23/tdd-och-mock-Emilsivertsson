package org.campusmolndal.Utmaning;

import org.json.JSONObject;

public class City {
    private String name;
    private double temp;

    private String WeatherDescription;

    public City(String name, double temp, String WeatherDescription) {
        this.name = name;
        this.temp = temp;
        this.WeatherDescription = WeatherDescription;
    }

    public String getName() {
        return name;
    }

    public double getTemp() {
        return temp;
    }

    public String getWeatherDescription() {
        return WeatherDescription;
    }

    //from json
    static City fromJson(String string){
        JSONObject jsonObject = new JSONObject(string);

        String name = jsonObject.getString("name");
        double temp = jsonObject.getJSONObject("main").getDouble("temp");
        String WeatherDescription = jsonObject.getJSONArray("weather").getJSONObject(0).getString("description");

        return new City(name, temp, WeatherDescription);
    }

}
