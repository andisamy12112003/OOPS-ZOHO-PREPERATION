package SOLID_Principle;

/*

====================== key concepts ======================
DIP - Dependency Inversion Principle

====================== next topic ========================
go next DesignPattern package

Dependency Inversion Principle (DIP)
====================================
 the Dependency Inversion Principle (DIP) in Java with both a violating example and
 a corrected example. DIP says high-level modules should not depend on low-level modules;
 both should depend on abstractions.

1) Code that violates DIP
=========================

class MySQLDatabase {
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}

class DatabaseService {
    private MySQLDatabase database;

    public DatabaseService() {
        this.database = new MySQLDatabase();
    }

    public void fetchData() {
        database.connect();
        System.out.println("Fetching data from MySQL...");
    }
}

public class DIPViolation {
    public static void main(String[] args) {
        DatabaseService service = new DatabaseService();
        service.fetchData();
    }
}


Why this violates DIP
=====================
DatabaseService depends directly on MySQLDatabase, so it is tightly coupled to one concrete class.
If you want to use PostgreSQL or Oracle, you must change the service class.

2) Code that follows DIP
========================

Why this follows DIP
====================
DatabaseService now depends on the Database interface, not on a concrete database class. This makes the code flexible, reusable, and easier to test.

3) Easy understanding
=====================
Violation: high-level class creates or depends on a specific low-level class.

Correct: high-level class depends on an interface, and concrete classes implement that interface.

 */

interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}

class PostgreSQLDatabase implements Database {
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
    }
}

class DatabaseService {
    private Database database;

    public DatabaseService(Database database) {
        this.database = database;
    }

    public void fetchData() {
        database.connect();
        System.out.println("Fetching data...");
    }
}

public class DIP {
    public static void main(String[] args) {
        DatabaseService mysqlService = new DatabaseService(new MySQLDatabase());
        mysqlService.fetchData();

        DatabaseService postgresService = new DatabaseService(new PostgreSQLDatabase());
        postgresService.fetchData();
    }
}
