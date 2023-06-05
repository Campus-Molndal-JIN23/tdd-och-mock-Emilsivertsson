package org.campusmolndal.Utmaning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    private City cityMock;
    @BeforeEach
    void setUp() {
        cityMock = Mockito.mock(City.class);
    }

    @Test
    void getName() {
        // Arrange
        String expectedName = "Göteborg";
        Mockito.when(cityMock.getName()).thenReturn("Göteborg");
        // Act
        String actualName = cityMock.getName();

        // Assert
        assertEquals(expectedName, actualName);

    }

    @Test
    void getTemp() {
        // Arrange
        double expectedTemp = 20.59;
        Mockito.when(cityMock.getTemp()).thenReturn(20.59);

        // Act
        double actualTemp = cityMock.getTemp();

        // Assert
        assertEquals(expectedTemp, actualTemp);
    }

    @Test
    void getWeatherDescription() {
        // Arrange
        String expectedWeatherDescription = "overcast clouds";
        Mockito.when(cityMock.getWeatherDescription()).thenReturn("overcast clouds");

        // Act
        String actualWeatherDescription = cityMock.getWeatherDescription();

        // Assert
        assertEquals(expectedWeatherDescription, actualWeatherDescription);
    }
}