# Projektrapport: Testrapporter

### Namn:
Emil Sivertsson

### Beskrivning av projektet
Vi skulle skriva tester för ett fejkat APi, testerna ska testa WeatherService-modellens metoder, för att testa att de returnerar rätt värden vid mockning.
Vi skulle också skriva en testrapport för testerna.

### Vad ni har gjort
Jag har skrivit en API klass som tar emot ett namn på en stad och returnerar ett Json object med information om stadens väder.
Jag har skrivit en WeatherService klass som tar emot ett namn på en stad och initierar ett CityForcast objekt med information om stadens väder.
Jag har skrivit Mockade tester för WeatherService modellens metoder med Mockito och Junit 5.
Jag har medvetet valt att inte ta med alla tusen parametrar som finns i Json objektet, utan bara några som jag tyckte kunde vara intressanta och eftersom 
testerna bara blir upprepningar.
Sist gjorde jag på testrapporten.

## Arbetet och dess genomförande

### Vad som varit svårt
Det var lite oklart vad som förväntades av projektet, men när marcus förtydligat, så gick det som en dans trodde jag.
Jag började med att skriva tester mot API:et, vilket inte var det som vi skulle göra.
Så sen skrev jag om testerna för att testa City klassen getters. Dessa metoder har inga inparametrar, så det var lite svårt att komma på vad jag skulle testa.
Med vi ska ju inte testa API:et, utan så jag kan ju inte testa vad för svar den ger.
Jag frågade marcus igenom och kollade på mina klasskamraters arbete och förstod så tillsist vad som förväntades.
Jag skrev om testerna igen och testade WeatherService klassen istället.
Jag "injected" ett Mockat svar i testklassen och testade att metoden returnerade rätt värden utifrån det svaret. 
Jag har använt ChatGPT för att hjälpa mig med några tester.
Till sist skrev  jag en testrapport för testerna.

## Slutsatser

### Vad har du lärt dig
Att skriva testrapport, att utnyttja Mockito och Junit 5 för att skriva tester.

### Vilka möjligheter ser du med de kunskaper du fått under kursen.
Jag förstår möjligheten att kunna testa API:er och databaser utan att i själva verket 
använda dessa, men även möjligheten att kunna skriva tester och testa sin del av koden i ett grupparbete.
Så att man inte måste vänta på att någon annan blir klar innan man märker om ens klass funkar.
