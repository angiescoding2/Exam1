## README-frågor

### 1. Datasäkerhet / Inkapsling

Jag har skyddat kontots namn och saldo genom att sätta variablerna `name` och `balance` till `private` i `Account`. 
Det gör att andra klasser inte kan ändra värdena direkt, utan saldot ändras genom metoder som `deposit()` och `withdraw()`. 
Även listan med alla konton är `private` i `AccountRegister`, så den hanteras genom registrets egna metoder. 
Utan inkapslingen hade andra delar av programmet kunnat ändra informationen direkt utan de regler och kontroller som finns i klasserna.

### 2. Skapande-mönster (Factory)

Jag skapar kontot genom `createAccount()` i `AccountRegister` istället för direkt i `Main`. `
Main` ansvarar för menyn och användarens inmatning, medan `AccountRegister` ansvarar för att skapa kontot och lägga till det i listan. 
På så sätt får klasserna olika ansvarsområden och koden blir lättare att hålla ordning på.

### 3. Flöde

När användaren väljer att ta ut pengar skriver användaren först in namnet på kontot. `
Main` skickar namnet till `findAccount()` i `AccountRegister`, som söker efter kontot i listan. 
Om kontot finns skriver användaren in beloppet och `withdraw()` i `Account` kontrollerar att saldot räcker innan uttaget genomförs. 
Därefter skrivs det nya saldot ut, eller ett felmeddelande om pengarna inte räcker.

### 4. Reflektion

När jag har kört fast har jag använt kursmaterialet och AI som stöd för att förstå problemet och hitta en lösning. 
Ett exempel var när jag arbetade med SavingsAccount och skulle använda @Override, men först placerade metoden fel bland klammerparenteserna och fick felmarkeringar i IntelliJ. 
Jag använde AI för att förstå hur metoderna skulle placeras, ändrade sedan koden och testade programmet igen. 
På så sätt kunde jag kontrollera att både vanliga konton och sparkonton fungerade tillsammans.

## Muntlig redovisning
I min muntliga redovisning kommer jag att förklara tre metoder:
withdraw() i Account.java, createAccount() i AccountRegister.java och applyInterest() i SavingsAccount.java. 
Jag kommer även att visa hur jag har använt arv genom super(), @Override och printInfo().

Länk till videoredovisning: https://funet-my.sharepoint.com/:v:/g/personal/3kdyhapp26_peraan_folkuniversitetet_nu/IQB2Jf9YscFHQr7AmRvFDZF9AVF9-nokDB-jfx9W9N3eNkc?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0NvcHkifX0&e=WbeYmb