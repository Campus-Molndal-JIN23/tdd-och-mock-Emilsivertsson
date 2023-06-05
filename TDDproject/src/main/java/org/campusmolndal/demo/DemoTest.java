package org.campusmolndal.demo;

// Class declaration for DemoTest.
public class DemoTest {

    public DemoTest() {}

    // Private instance variable for the StarProvider.
    // This is a dependency that will be injected via the constructor.
    private StarProvider starProvider;

    // Constructor for DemoTest.
    // Takes a StarProvider as a parameter and assigns it to the instance variable.
    public DemoTest(StarProvider starProvider) {
        this.starProvider = starProvider;
    }

    // Method to get a string of stars based on the input amount.
    // The actual star is provided by the StarProvider.
    public String getStars(int amount) {

        // Initialize a StringBuilder object to build the final string of stars.
        StringBuilder retVal = new StringBuilder(0);

        // Loop as many times as the input amount.
        for (int i = 0; i < amount; i++) {

            // Each iteration, append a star from the StarProvider to the StringBuilder.
            retVal.append(starProvider.getStar());
        }

        // After the loop, return the final string of stars.
        return retVal.toString();
    }

    @Override
    public String toString() {
        return "DemoTest{" +
                "starProvider=" + starProvider +
                '}';
    }
}
