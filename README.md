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

## Commands:
```
Command name: delete
Command description: Put data to database.
Command usage: delete [database_name] [password] [key]

Command name: destroy
Command description: Destroy the database.
Command usage: destroy [database_name] [password]

Command name: exit
Command description: exit, terminate shell
Command usage: exit

Command name: get
Command description: Get key value from database.
Command usage: get [database_name] [password] [key]

Command name: getall
Command description: Get all key value from database.
Command usage: getall [database_name] [password]

Command name: help
Command description: commands descriptions
Command usage: help //help for all commands,	 help [command_name] //help for one command

Command name: init
Command description: Initializes the database.
Command usage: init [database_name] [password]

Command name: list
Command description: Lists initialized databases.
Command usage: list

Command name: put
Command description: Put data to database.
Command usage: put [database_name] [password] [key] [value]

Command name: use
Command description: use specific database.
Command usage: use [database_name]
```
