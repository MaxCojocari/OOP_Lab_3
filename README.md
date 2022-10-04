# Blockchain simulation. Part 2: Inheritance

![image](https://user-images.githubusercontent.com/92053176/192138851-6466d959-734a-4a0c-ab41-3c604095add6.png)

This project implements a simple analogue of a blockchain system that can deal with transactions, accounts and their balances.

In order to run this project, complete the following steps:

- `git clone git@github.com:MaxCojocari/OOP_Lab_3.git`
- `cd OOP_Lab_3/BlockchainProject`
- `javac -cp src -d out src/dir/*.java`, where `dir = actors, core, crypto, merkletree`
- `javac -cp src -d out src/*.java`
- `java -cp out Simulation`

## Inheritance implementation

The core elements of blockchain model *block*, *asset*, *account* and *transaction* are children of an abstract class *EthereumObject* which contains the main information about the system in general. Each children of the parent classes mentioned above either implements, or overrides methods from inherited (abstract) classes from higher levels down to descendents. 

Furthermore, the `Object` class is the parent class of all the classes in Java by default. In other words, it is the topmost class of Java. Therefore, the concept *everything is an object* so every class provided by standard library is a descendent of a common-to-all class, typically called `Object` can be clearly seen here.

For more detailes about inheritance in this project, see the UML class diagrams below.

![image](https://user-images.githubusercontent.com/92053176/193910160-5335a698-611e-456b-9aa0-58b96dd7c8ab.png)
![oop_lab3_crypto](https://user-images.githubusercontent.com/92053176/193672997-2e9ec8eb-53db-4025-8254-41de17f0f1db.png)
![oop_lab3_global](https://user-images.githubusercontent.com/92053176/193918237-11006365-a36c-4ed8-baa9-bd40878aee07.png)

