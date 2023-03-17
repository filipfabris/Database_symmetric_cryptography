# Database_symmetric_cryptography
* Demonstartion of usage symmetric cryptography and derivate key for storing key,values to multiple databases

## Usage:
```
init abc123 filipdb
init lozinka baza       //Izrada dvije baze
use filipdb             //Odabir baze podataka
put abc123 ff filip     //Mogu i ovako koristiti "put filipfdb abc123 ff filip"
                        //No budući da koristimo use program zna koju bazu koristimo
put abc123 ll leo
put abc123 key vrijednost
get abc123 ll           //Vraca leo
get abc123 gg           //Ne postoji
getall abc123           //Vraca sve vrijednosti
delete abc123 ll         //Brise ll vrijednost
get abc123 ll           //Ne postoji
destroy abc123          //Brisanje bazu podataka
destroy baza lozinka    //Brisanje druge stvorene baze podataka u primjeru
```
