[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/-Un0hjO8)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-7f7980b617ed060a017424585567c406b6ee15c891e84e1186181d67ecf80aa0.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=11285010)
# TDD och MOCKING

## Description
- School challenge to write test with Mockito and Junit 5.
- Aims to test the information from a API call via a city class using a mock, because we don't have a actual API.
- This lets us test our code without having to rely on a API och database, or if in a bigger project lets us try our code without having access to others code.
- I have learned to use Mockito and Junit 5 to test my code, and how to use a mock to test my code. 

## TDD
Test Driven Development is used to write the test before you actually write the code,
this is to make sure that you write the code to do what you want it to do, and not just write code that works.
This is a good way to make sure that you don't write code that you don't need, and that you don't write code that does not work.
You start by writing the tests, that covers the cases of the method.
then you write the code that makes the tests pass.
then you refactor the code to make it better, and fit the application needs.
then you repeat the process until you are satisfied with the code.

## Mocking
Mocking is used to test your code by simulating a dependency, could be a API or a database.
You can then test your code without having to rely on the API or database to be up and running.
You might also not want to use the API while testing.

## Installation
clone the repo and open it in your favorite IDE.  Run the test from the 
test folder.  The test will run the program and output the results to the console.

## License
MIT License

## Packages
- org.json v20210307
is used to parse the JSON file from the API.

- org.junit.jupiter.api v5.7.1
is used to run the tests.

- org.mockito.Mockito v3.9.0
is used to mock the API.

all packages are included in the pom.xml file.

## Tests
the tests cover the getters in the city class, because we were not supposed to test the API.
- Test 1 testGetName() 
- Test 2 testGetNameNull() 
- Test 3 testGetNameIsNone() 
- Test 4 getTemp() 
- Test 5 getWeatherDescription() 
- Test 6 getWeatherDescriptionNull() 
- Test 7 getWeatherDescriptionIsNone() 

## Test Rapport

| Test ID | Test Description                                     | Expected result            | Actual result                    | Status |
|---------|------------------------------------------------------|----------------------------|----------------------------------|--------|
| 1       | if getName returns a correct city name               | Return correct name        | Correct name was returned        | Passed |
| 2       | If getName returns a Null statement                  | Throw an Exception         | Returned a Exception             | Passed |
| 3       | if getName returns a empty string                    | Throw an Exception         | Returned a Exception             | Passed |
| 4       | if getTemp returns a correct temperature             | Return correct temperature | Correct temperature was returned | Passed |
| 5       | if getWeatherDescription returns correct description | Return correct description | Correct temperature was returned | Passed |
| 6       | if getWeatherDescription returns a Null statement    | Throw an Exception         | Returned a Exception             | Passed |
| 7       | if getWeatherDescription returns a empty string      | Throw an Exception         | Returned a Exception             | Passed |
