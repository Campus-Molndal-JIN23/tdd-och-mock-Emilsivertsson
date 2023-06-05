package org.campusmolndal.Utmaning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * This class represents a weather service. its is completely bogous of course.
 * its made up for the sake of the exercise by old exercises and GPT inputs.
 * It contains one method to get the weather information for a city.
 */
public class WeatherService {

    private final String apiKey;

    public WeatherService(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * This method returns the weather information for a city.
     * @param city the city to get the weather information for
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
            return String.valueOf(City.fromJson(response.toString()));

        } else {
            throw new IOException("Invalid city");
        }
    }

}




