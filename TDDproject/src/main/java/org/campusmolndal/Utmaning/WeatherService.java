package org.campusmolndal.Utmaning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
public class WeatherService {

    private final String apiKey;

    public WeatherService(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getWeatherInformation(String city) throws IOException {
        // Replace with the actual API URL
        String baseUrl = "https://api.example.com/weather";
        String url = baseUrl + "?q=" + city + "&appid=" + apiKey;
        URL apiUrl = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) apiUrl.openConnection();
        conn.setRequestMethod("GET");

        int responseCode = conn.getResponseCode();
        if (responseCode == 200) {
            Scanner scanner = new Scanner(conn.getInputStream());
            StringBuilder response = new StringBuilder();
            while (scanner.hasNextLine()) {
                response.append(scanner.nextLine());
            }
            scanner.close();
            return String.valueOf(City.fromJson(response.toString()));

        } else {
            throw new IOException("Invalid city");
        }
    }

    public double getTemperature(String city) {
        // Parse the JSON response to extract the temperature
        double temperature = Double.parseDouble(city.substring(city.indexOf("\"temp\":") + 7, city.indexOf(",\"feels_like\"")));
        return temperature;
    }

    public String getWeatherDescription(String city) {
        // Parse the JSON response to extract the weather description
        String description = city.substring(city.indexOf("\"description\":\"") + 15, city.indexOf("\",\"icon\""));
        return description;
    }

}




