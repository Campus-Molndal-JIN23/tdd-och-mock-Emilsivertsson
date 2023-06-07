package org.campusmolndal.Utmaning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class WeatherAPI {

    private final String apiKey;

    public WeatherAPI(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * This method returns the weather information for a city.
     * @return the weather information for the city to the City class.
     * @throws IOException if the city is invalid
     */
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
            return String.valueOf(CityForcast.fromJson(response.toString()));

        } else {
            throw new IOException("Invalid city");
        }
    }
}
