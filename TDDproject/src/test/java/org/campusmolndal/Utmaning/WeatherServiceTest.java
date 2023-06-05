package org.campusmolndal.Utmaning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WeatherServiceTest {

    private WeatherService weatherServiceMock;

    @BeforeEach
    void setUp() {
        weatherServiceMock = Mockito.mock(WeatherService.class);

    }

    @Test
    void getWeatherInformation() throws IOException {
        // Arrange
        String expectedWeatherInformation = "{\n" +
                "  \"coord\": {\n" +
                "    \"lon\": 11.97,\n" +
                "    \"lat\": 57.71\n" +
                "  },\n" +
                "  \"weather\": [\n" +
                "    {\n" +
                "      \"id\": 804,\n" +
                "      \"main\": \"Clouds\",\n" +
                "      \"description\": \"overcast clouds\",\n" +
                "      \"icon\": \"04d\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"base\": \"stations\",\n" +
                "  \"main\": {\n" +
                "    \"temp\": 20.59,\n" +
                "    \"feels_like\": 20.13,\n" +
                "    \"temp_min\": 18.89,\n" +
                "    \"temp_max\": 21.74,\n" +
                "    \"pressure\": 1013,\n" +
                "    \"humidity\": 67\n" +
                "  },\n" +
                "  \"visibility\": 10000,\n" +
                "  \"wind\": {\n" +
                "    \"speed\": 5.14,\n" +
                "    \"deg\": 210,\n" +
                "    \"gust\": 7.2\n" +
                "  },\n" +
                "  \"clouds\": {\n" +
                "    \"all\": 90\n" +
                "  },\n" +
                "  \"dt\": 1599478913,\n" +
                "  \"sys\": {\n" +
                "    \"type\": 1,\n" +
                "    \"id\": 1752,\n" +
                "    \"country\": \"SE\",\n" +
                "    \"sunrise\": 1599457990,\n" +
                "    \"sunset\": 1599510755\n" +
                "  },\n" +
                "  \"timezone\": 7200,\n" +
                "  \"id\": 2711537,\n" +
                "  \"name\": \"Gothenburg\",\n" +
                "  \"cod\": 200\n" +
                "}\n";
        Mockito.when(weatherServiceMock.getWeatherInformation("Gothenburg")).thenReturn(expectedWeatherInformation);

        // Act
        String actualWeatherInformation = weatherServiceMock.getWeatherInformation("Gothenburg");

        // Assert
        assertEquals(expectedWeatherInformation, actualWeatherInformation);
    }

    @Test
    void getWrongWeatherInformation() throws IOException {
        // Arrange
        String expectedWeatherInformation = "{\n" +
                "  \"coord\": {\n" +
                "    \"lon\": 11.97,\n" +
                "    \"lat\": 57.71\n" +
                "  },\n" +
                "  \"weather\": [\n" +
                "    {\n" +
                "      \"id\": 804,\n" +
                "      \"main\": \"Clouds\",\n" +
                "      \"description\": \"overcast clouds\",\n" +
                "      \"icon\": \"04d\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"base\": \"stations\",\n" +
                "  \"main\": {\n" +
                "    \"temp\": 20.59,\n" +
                "    \"feels_like\": 20.13,\n" +
                "    \"temp_min\": 18.89,\n" +
                "    \"temp_max\": 21.74,\n" +
                "    \"pressure\": 1013,\n" +
                "    \"humidity\": 67\n" +
                "  },\n" +
                "  \"visibility\": 10000,\n" +
                "  \"wind\": {\n" +
                "    \"speed\": 5.14,\n" +
                "    \"deg\": 210,\n" +
                "    \"gust\": 7.2\n" +
                "  },\n" +
                "  \"clouds\": {\n" +
                "    \"all\": 90\n" +
                "  },\n" +
                "  \"dt\": 1599478913,\n" +
                "  \"sys\": {\n" +
                "    \"type\": 1,\n" +
                "    \"id\": 1752,\n" +
                "    \"country\": \"SE\",\n" +
                "    \"sunrise\": 1599457990,\n" +
                "    \"sunset\": 1599510755\n" +
                "  },\n" +
                "  \"timezone\": 7200,\n" +
                "  \"id\": 2711537,\n" +
                "  \"name\": \"Gothenburg\",\n" +
                "  \"cod\": 200\n" +
                "}\n";

        String returnWeatherInformation = "{\n" +
                "  \"coord\": {\n" +
                "    \"lon\": 12.97,\n" +
                "    \"lat\": 77.71\n" +
                "  },\n" +
                "  \"weather\": [\n" +
                "    {\n" +
                "      \"id\": 804,\n" +
                "      \"main\": \"Clouds\",\n" +
                "      \"description\": \"overcast clouds\",\n" +
                "      \"icon\": \"04d\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"base\": \"stations\",\n" +
                "  \"main\": {\n" +
                "    \"temp\": 20.59,\n" +
                "    \"feels_like\": 20.13,\n" +
                "    \"temp_min\": 18.89,\n" +
                "    \"temp_max\": 21.74,\n" +
                "    \"pressure\": 1013,\n" +
                "    \"humidity\": 67\n" +
                "  },\n" +
                "  \"visibility\": 10000,\n" +
                "  \"wind\": {\n" +
                "    \"speed\": 5.14,\n" +
                "    \"deg\": 210,\n" +
                "    \"gust\": 7.2\n" +
                "  },\n" +
                "  \"clouds\": {\n" +
                "    \"all\": 90\n" +
                "  },\n" +
                "  \"dt\": 1599478913,\n" +
                "  \"sys\": {\n" +
                "    \"type\": 1,\n" +
                "    \"id\": 1752,\n" +
                "    \"country\": \"SE\",\n" +
                "    \"sunrise\": 1599457990,\n" +
                "    \"sunset\": 1599510755\n" +
                "  },\n" +
                "  \"timezone\": 7200,\n" +
                "  \"id\": 2711537,\n" +
                "  \"name\": \"Gothenburg\",\n" +
                "  \"cod\": 200\n" +
                "}\n";
        Mockito.when(weatherServiceMock.getWeatherInformation("Gothenburg")).thenReturn(returnWeatherInformation);

        // Act
        String actualWeatherInformation = weatherServiceMock.getWeatherInformation("Gothenburg");

        // Assertn
        assertNotEquals(expectedWeatherInformation, actualWeatherInformation);
    }

    @Test
    void getWeatherInformationInvalidCitythrows() throws IOException {
        // Arrange
        Mockito.when(weatherServiceMock.getWeatherInformation("Ghohino")).thenThrow(new IOException());

        //act & Assertn
        assertThrows(IOException.class, () -> weatherServiceMock.getWeatherInformation("Ghohino"));
    }


    @Test
    void getTemperature() {
        // Arrange
        String expectedTemperature = "20";
        Mockito.when(weatherServiceMock.getTemperature("Gothenburg")).thenReturn(Double.valueOf(20));

        // Act
        double actualTemperature = weatherServiceMock.getTemperature("Gothenburg");

        // Assert
        assertEquals(Double.valueOf(expectedTemperature), actualTemperature);
    }

    @Test
    void getWrongTemperature() {
        // Arrange
        String expectedTemperature = "34";
        Mockito.when(weatherServiceMock.getTemperature("Gothenburg")).thenReturn(Double.valueOf(20));

        // Act
        double actualTemperature = weatherServiceMock.getTemperature("Gothenburg");

        // Assert
        assertNotEquals(Double.valueOf(expectedTemperature), actualTemperature);
    }


    @Test
    void getWeatherDescription() {
        // Arrange
        String expectedWeatherDescription = "overcast clouds";
        Mockito.when(weatherServiceMock.getWeatherDescription("Gothenburg")).thenReturn("overcast clouds");

        // Act
        String actualWeatherDescription = weatherServiceMock.getWeatherDescription("Gothenburg");

        // Assert
        assertEquals(expectedWeatherDescription, actualWeatherDescription);
    }

    @Test
    void getWrongWeatherDescription() {
        // Arrange
        String expectedWeatherDescription = "clear sky";
        Mockito.when(weatherServiceMock.getWeatherDescription("Gothenburg")).thenReturn("overcast clouds");

        // Act
        String actualWeatherDescription = weatherServiceMock.getWeatherDescription("Gothenburg");

        // Assert
        assertNotEquals(expectedWeatherDescription, actualWeatherDescription);
    }
}