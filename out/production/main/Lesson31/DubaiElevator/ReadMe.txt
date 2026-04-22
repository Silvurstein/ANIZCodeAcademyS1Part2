https://www.baeldung.com/java-factory-pattern

Hvad er Abstract Factory Pattern?
Abstract Factory er et creational design pattern (et mønster til oprettelse af objekter).
•	Formålet er at skabe familier af relaterede objekter, uden at klientkoden behøver at kende de konkrete klasser.
•	Man arbejder mod interfaces eller abstrakte klasser, ikke konkrete implementeringer.
Patternet bruges ofte, når:
o	Systemet skal kunne udvides med nye varianter.
o	Man vil undgå mange if/else eller switch-konstruktioner.
o	Man vil sikre, at objekter passer sammen (fx samme “tema” eller “platform”).
rundidéen (kort sagt)
•	I stedet for at sige:
“Lav mig et WindowsButton-objekt”
•	siger man:
“Giv mig en Button fra denne Factory”
•	Factoryen bestemmer hvilken konkret klasse, der bliver oprettet.

De vigtigste dele i Abstract Factory
1.	Abstract Factory (interface / abstrakt klasse)
    o	Definerer metoder til at oprette produkter.
    Fx:
    	createButton()
    	createCheckbox()
    o	Indeholder ingen konkret logik.
2.	Concrete Factories
    o	Implementerer Abstract Factory.
    o	Hver factory repræsenterer én familie af produkter.
    o	Fx:
    	WindowsFactory
       MacFactory
3.	Abstract Products
    o	Interfaces for de produkter, der oprettes.
    o	Fx:
    	Button
    	Checkbox
4.	Concrete Products
    o	De konkrete implementeringer af produkterne.
    o	Fx:
    	WindowsButton, MacButton
    	WindowsCheckbox, MacCheckbox
5.	Client
    o	Bruger kun interfaces, aldrig konkrete klasser.
    o	Kender ikke forskel på Windows, Mac osv.
    o	Arbejder kun med Abstract Factory og Abstract Products.

!!!!Find Abstract Factory, Concrete Factories, Abstract Products, Concrete Products og Client i DubaiElevator Systemet.

Fordele ved Abstract Factory
•	Løs kobling
    o	Klientkoden er ikke afhængig af konkrete klasser.
•	Let at udskifte produktfamilier
    o	Skift factory → hele systemets udseende/opførsel ændres.
•	Konsistens
    o	Sikrer at produkter passer sammen.
•	Open/Closed Principle
    o	Nye produktfamilier kan tilføjes uden at ændre eksisterende kode.
Ulemper ved Abstract Factory
•	Mere kompleks kode
    o	Mange interfaces og klasser.
•	Svært at udvide med nye produkter
    o	Hvis du vil tilføje fx Slider, skal alle factories ændres.
•	Kan være overkill i små projekter.
Hvornår skal I bruge Abstract Factory?
    •	Når der er:
        o	Flere varianter af samme type system.
        o	Behov for udskiftelighed.
        o	Fokus på arkitektur og skalerbarhed.
    •	Typisk i:
        o	GUI-systemer
        o	Spil (temaer, verdener)
        o	Platform-afhængige systemer
        o	Enterprise-software
Sammenligning (kort)
    •  	Factory Method
        o	Opretter ét produkt ad gangen.
    •	Abstract Factory
        o	Opretter hele familier af relaterede produkter.


