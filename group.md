# Projektrapport: Testrapporter

### Namn:
Emil sivertsson

### Beskrivning av projektet
vi skulle skriva tester för ett fejkat APi, testerna ska testa City-modell klassens getters, för att testa att de fungerar som de ska.
Vi skulle också skriva en testrapport för testerna.

### Vad ni har gjort
Jag har skrivit en påhittad API klass som tar emot ett namn på en stad och returnerar ett Json object
med information om staden. Jag har skrivit en City klass som tar emot Json object och skapar ett City objekt utifrån informationen i objektet.
Jag har skrivit Mockade tester för City klassens getters med Mockito och Junit 5.
Jag har medvetet valt att inte ta med alla tusen parametrar som finns i Json objektet, utan bara några som jag tyckte kunde vara intressanta och eftersom 
testerna bara blir upprepningar.
sist började jag på testrapporten.

## Arbetet och dess genomförande

### Vad som varit svårt
Det var lite oklart vad som förväntades av projektet, men när marcus förtydligat, så gick det som en dans.
Jag började med att skriva tester mot APIet, vilket inte var det som vi skulle göra.
så sen skrev jag om testerna för att testa City klassen, vilket blev lite kort, det finns inte så mycket att testa förutom att metoden funkar.
Med vi ska ju inte testa APIet, utan så jag kan ju inte testa vad för svar den ger.



## Slutsatser

### Vad har du lärt dig
att skriva testrapport, att utnyttja Mockito och Junit 5 för att skriva tester.

### Vilka möjligheter ser du med de kunskaper du fått under kursen.
Jag förstår möjligheten att kunna testa APIer och databaser utan att i själva verket 
använda dessa, men även möjligheten att kunna skriva tester och testa sin del av koden i ett grupparbete.
så att man inte måste vänta på att någon annan blir klar innan man märker om ens klass funkar.