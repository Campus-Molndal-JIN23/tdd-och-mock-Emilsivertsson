package org.campusmolndal.Utmaning;

import org.json.JSONObject;
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
    @DisplayName("Test 1, Tests getName")
    void getName() {
        // Arrange
        String expectedName = "Gothenburg";
        Mockito.when(cityMock.getName()).thenReturn("Gothenburg");
        // Act
        String actualName = cityMock.getName();

        // Assert
        assertEquals(expectedName, actualName);

    }

    /**
     * This method tests the getName method in the City class.
     * It uses the this test dont use mock, i used another metod to test the getName method.
     */
    @Test
    @DisplayName("Test 2, Tests if getName returns null")
    void getNameIsNull() {
        // Arrange
        Mockito.when(cityMock.getName()).thenThrow(NullPointerException.class);

        //act & Assert
        assertThrows(NullPointerException.class, () -> cityMock.getName());

    }


    /**
     * This method tests the getName method in the City class.
     * It uses a mock to test the getName method, to see if it returns nothing.
     */
    @Test
    @DisplayName("Test 3, Tests if getName returns nothing")
    void getNameIsNone() {
        // Arrange
        Mockito.when(cityMock.getName()).thenThrow(IllegalArgumentException.class);


        //act & Assert
        assertThrows(IllegalArgumentException.class, () -> cityMock.getName());

    }


    /**
     * This method tests the getTemp method in the City class.
     * It uses Mockito to mock the getTemp method.
     */
    @Test
    @DisplayName("Test 4, Tests getTemp")
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
    @DisplayName("test 5, Tests getWeatherDescription should be overcast clouds")
    void getWeatherDescription() {
        // Arrange
        String expectedWeatherDescription = "overcast clouds";
        Mockito.when(cityMock.getWeatherDescription()).thenReturn("overcast clouds");

        // Act
        String actualWeatherDescription = cityMock.getWeatherDescription();

        // Assert
        assertEquals(expectedWeatherDescription, actualWeatherDescription);
    }

    /**
     * This method tests the getWeatherDescription method in the City class.
     * It uses the mocked getWeatherDescription method to mock a null response.
     */
    @Test
    @DisplayName("test 6, Tests getWeatherDescription is null")
    void getWeatherDescriptionIsNull() {
        // Arrange
        Mockito.when(cityMock.getWeatherDescription()).thenThrow(NullPointerException.class);

        //act & Assert
        assertThrows(NullPointerException.class, () -> cityMock.getWeatherDescription());
    }

    /**
     * This method tests the getWeatherDescription method in the City class.
     * It uses the mocked getWeatherDescription method to mock a null response.
     */
    @Test
    @DisplayName("Test 7, Tests getWeatherDescription is returns nothing")
    void getWeatherDescriptionIsNone() {
        // Arrange
        Mockito.when(cityMock.getWeatherDescription()).thenThrow(IllegalArgumentException.class);

        //act & Assert
        assertThrows(IllegalArgumentException.class, () -> cityMock.getWeatherDescription());
    }


}