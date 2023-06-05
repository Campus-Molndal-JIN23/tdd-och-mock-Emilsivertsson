package org.campusmolndal.Utmaning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    private City cityMock;

    /**
     * This method is run before each test.
     * It creates a mock of the City class.
     */
    @BeforeEach
    void setUp() {
        cityMock = Mockito.mock(City.class);
    }

    /**
     * This method tests the getName method in the City class.
     * It uses Mockito to mock the getName method.
     */
    @Test
    @DisplayName("Tests getName")
    void getName() {
        // Arrange
        String expectedName = "Göteborg";
        Mockito.when(cityMock.getName()).thenReturn("Göteborg");
        // Act
        String actualName = cityMock.getName();

        // Assert
        assertEquals(expectedName, actualName);

    }

    /**
     * This method tests the getTemp method in the City class.
     * It uses Mockito to mock the getTemp method.
     */
    @Test
    @DisplayName("Tests getTemp")
    void getTemp() {
        // Arrange
        double expectedTemp = 20.59;
        Mockito.when(cityMock.getTemp()).thenReturn(20.59);

        // Act
        double actualTemp = cityMock.getTemp();

        // Assert
        assertEquals(expectedTemp, actualTemp);
    }

    /**
     * This method tests the getWeatherDescription method in the City class.
     * It uses Mockito to mock the getWeatherDescription method.
     */
    @Test
    @DisplayName("Tests getWeatherDescription")
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