package org.campusmolndal.Utmaning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WeatherServiceTest {


    /**
     * This method is run before each test.
     * It creates a mock of the WeatherService and WeatherAPI classes.
     */
    @Mock
    WeatherService mockWeatherService;
    WeatherAPI mockWeatherAPI;

    /**
     * this part sets up conditions before each test.
     * @throws IOException if the file is not found in WeatherAPI class
     */
    @BeforeEach
    void setUp() throws IOException {
        mockWeatherService = Mockito.mock(WeatherService.class);
        mockWeatherAPI = Mockito.mock(WeatherAPI.class);

        String mockResponse = """
                {
                  "coord": {
                    "lon": 11.97,
                    "lat": 57.71
                  },
                  "weather": [
                    {
                      "id": 804,
                      "main": "Clouds",
                      "description": "overcast clouds",
                      "icon": "04d"
                    }
                  ],
                  "base": "stations",
                  "main": {
                    "temp": 20.59,
                    "feels_like": 20.13,
                    "temp_min": 18.89,
                    "temp_max": 21.74,
                    "pressure": 1013,
                    "humidity": 67
                  },
                  "visibility": 10000,
                  "wind": {
                    "speed": 5.14,
                    "deg": 210,
                    "gust": 7.2
                  },
                  "clouds": {
                    "all": 90
                  },
                  "dt": 1599478913,
                  "sys": {
                    "type": 1,
                    "id": 1752,
                    "country": "SE",
                    "sunrise": 1599457990,
                    "sunset": 1599510755
                  },
                  "timezone": 7200,
                  "id": 2711537,
                  "name": "Gothenburg",
                  "cod": 200
                }\s""";

        Mockito.when(mockWeatherAPI.getWeatherInformation("Gothenburg")).thenReturn(mockResponse);
        mockWeatherService = new WeatherService(mockWeatherAPI, "Gothenburg");
    }

    /**
     * this test checks that the city name is correct from the mocked response.
     */
    @Test
    @DisplayName("Test 1, Test if the city name is correct")
    void getCityName() {
        // Arrange
        String expectedName = "Gothenburg";

        // Act
        String actualName = WeatherService.getCityName();

        // Assert
        assertEquals(expectedName, actualName);
    }

    /**
     * this test checks that the city name cant be null.
     * this dont use a mocked response, but a new CityForcast object.
     */
    @Test
    @DisplayName("Test 2, Test if the city name is null")
    void getCityNameNotNull() {
        assertThrows(NullPointerException.class, () -> new CityForcast(null, 0, null).getName());
    }

    /**
     * this test checks that the city name cant be null.
     * this dont use a mocked response, but a new CityForcast object.
     */
    @Test
    @DisplayName("Test 3, Test if the city name is none")
    void getCityNameNotNone() {
        assertThrows(IllegalArgumentException.class, () -> new CityForcast("", 0, null).getName());
    }

    /**
     * this test checks that the temperature is correct from the mocked response.
     */
    @Test
    @DisplayName("Test 4, Test if the city temperature is correct")
    void getCityTemp() {
        // Arrange
        double expectedTemp = 20.59;

        // Act
        double actualTemp = WeatherService.getCityTemp();

        // Assert
        assertEquals(expectedTemp, actualTemp);
    }

    /**
     * this test checks that the weather description is correct from the mocked response.
     */
    @Test
    @DisplayName("Test 5, Test if the city weather description is correct")
    void getCityWeatherDescription() {
        // Arrange
        String expectedDescription = "overcast clouds";

        // Act
        String actualDescription = WeatherService.getCityWeatherDescription();

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }

}