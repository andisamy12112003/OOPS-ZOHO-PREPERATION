package SolidPrinciple;

// use this video for SOLID principle- https://youtu.be/8x7-IlibqeQ?si=2kd0b5jB86DJ8kBx
/*

flowchart TB

    S [S - Single Responsibility Principle<br/>One class = one job]
    O [O - Open/Closed Principle<br/>Open for extension, closed for modification]
    L [L - Liskov Substitution Principle<br/>Child class should replace parent class]
    I [I - Interface Segregation Principle<br/>Small, focused interfaces]
    D [D - Dependency Inversion Principle<br/>Depend on abstractions, not concretes]

    S --> O --> L --> I --> D


* Single Responsibility Principle: a class should have only one reason to change.

* Open/Closed Principle          : software entities should be open for extension but closed for modification.

* Liskov Substitution Principle  : derived classes should be replaceable with their base classes
                                    without breaking behavior.

* Interface Segregation Principle: avoid forcing classes to depend on methods they do not use.

* Dependency Inversion Principle : depend on abstractions, not concrete implementations.


1) Code that violates SRP
class UserService {
    public void registerUser(String name, String email) {
        // 1. Validating user input
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        // 2. Saving user to database
        System.out.println("Saving user to database: " + name + ", " + email);

        // 3. Sending welcome email
        System.out.println("Sending welcome email to: " + email);
    }
}

Why this violates SRP
This class is doing three jobs:

validating input,

saving user data,

sending email.

So if email logic changes, database logic changes, or validation rules change, you must modify the same class.


2) Code that follows SRP

 */

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class UserValidator {
    public void validate(String name, String email) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
    }
}

class UserRepository {
    public void save(User user) {
        System.out.println("Saving user to database: " + user.getName() + ", " + user.getEmail());
    }
}

class EmailService {
    public void sendWelcomeEmail(User user) {
        System.out.println("Sending welcome email to: " + user.getEmail());
    }
}

class UserRegistrationService {
    private UserValidator validator = new UserValidator();
    private UserRepository repository = new UserRepository();
    private EmailService emailService = new EmailService();

    public void registerUser(String name, String email) {
        validator.validate(name, email);

        User user = new User(name, email);
        repository.save(user);
        emailService.sendWelcomeEmail(user);
    }
}

class SRP{
    public static void main(String arg[]){
        UserRegistrationService urs = new UserRegistrationService();
        urs.registerUser("andisamy a","andisamy@gmail.com");
        urs.registerUser("neha s","neha123@gmail.com");
    }
}
