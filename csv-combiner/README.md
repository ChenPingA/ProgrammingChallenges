# CSV Combiner
# PMG Challenge
# Ping Chen

CSV Combiner makes it possible to merge N-number of csv file(s) into one output file

## Languages used 
* Standard Java 16.0.1
* No external dependencies

## First time using
Compile with javac version 16.0.1+ 
```
$ cd csv-combiner
$ javac App.java
```

## Running the program
``` 
$ java App [Input Filepath One] [Input Filepath Two] [Input FilePath n...] [Output Filename]
```
* Input Filepath: "./foldername/filename.csv"
* Output FileName: "outputname.csv"


## Example
```
$ java App ./fixtures/accessories.csv ./fixtures/clothing.csv output.csv
```
 
 ## Result

 email_hash  | category | filename
------------- | ------------- | -------------
b9f6f22276c919da793da65c76345ebb0b072257d12402107d09c89bc369a6b6  | Satchels | accessories.csv
c2b5fa9e09ef2464a2b9ed7e351a5e1499823083c057913c6995fdf4335c73e7  | Purses   | accessories.csv
587604aa941d462c7d6bc0da4181939374e8df5c3fca2dc1b3ea496268c81263  | Pants    | clothing.csv
c77325c0f8254e2baba043f1bf216b8aad4f940dc7ca6a41e711dc26d4b7832c  | Capris   | clothing.csv


