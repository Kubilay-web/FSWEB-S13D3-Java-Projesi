public class Person {

    private String firstName;
    private String lastName;
    private int age;


    private String address;
    private String email;
    private boolean isStudent;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public Person(String firstName, String lastName, int age, String address, String email, boolean isStudent) {
        this(firstName, lastName, age);
        this.address = address;
        this.email = email;
        this.isStudent = isStudent;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", "Alexander", 20);
        Person person2 = new Person("Kubilay", "Özdemir", 17, "Gayrettepe/Besiktas", "kubilayozdemir@gmail.com", true);


        System.out.println("Person 1:");
        System.out.println("First Name: " + person1.getFirstName());
        System.out.println("Last Name: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teenager: " + person1.isTeen());

        System.out.println("\nPerson 2:");
        System.out.println("First Name: " + person2.getFirstName());
        System.out.println("Last Name: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Is Teenager: " + person2.isTeen());


        System.out.println("\nPerson 2 Ekstra Özellikler:");
        System.out.println("Address: " + person2.address);
        System.out.println("Email: " + person2.email);
        System.out.println("Is Student: " + person2.isStudent);
    }
}

