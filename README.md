[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/-Un0hjO8)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-7f7980b617ed060a017424585567c406b6ee15c891e84e1186181d67ecf80aa0.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=11285010)
# TDD och MOCKING

## Description
School challenge to write test with Mockito and Junit 5.
Aims to test the city class getters. 

- What was your motivation?
- Why did you build this project? (Note: the answer is not "Because it was a homework assignment.")
- What problem does it solve?
- What did you learn?

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
the tests covers the getters in the city class, because we were not supposed to test the API.
- testgetName()
- testgetNameNull()
- getTemp()
- getWeatherDescription()
- getWeatherDescriptionNull()