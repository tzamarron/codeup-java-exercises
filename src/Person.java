public class Person {
    private String name; // Person has name property
    public static long numberOfPeople; // Tracks number of people created

    // Constructor accepts name
    public Person(String personName) {
        name = personName; // Places given name to created person's name property
        numberOfPeople++; // Increase people created
    }

    // Returns the person's name
    public String getName() {
        return this.name;
    }

    // Changes the name property to the passed value
    public void setName(String newName) {
        name = newName;
    }

    // Prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("Hello my name is %s\n", name);
    }

    // Getter used to get the number of people created
    public static long getNumberOfPeople() {
        return numberOfPeople;
    }

    public static void main(String[] args) {
        System.out.println(getNumberOfPeople()); // Shows number of people before is 0
        Person person1 = new Person("Ted"); // Creates person1 with name property of Ted
        System.out.println(getNumberOfPeople()); // Shows number of people has increased
        System.out.println(person1.getName()); // returns person1 name property value
        person1.sayHello(); // Has person1 say hello
        person1.setName("Theo"); // Changes name property for person1
        person1.sayHello(); // Has person1 say hello after name property has been changed

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));// True strings match
//        System.out.println(person1 == person2); // False pointing to two different points in memory

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);// True reference same memory location

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());// John original
//        System.out.println(person2.getName());// John reference mem location
//        person2.setName("Jane");
//        System.out.println(person1.getName());// Jane
//        System.out.println(person2.getName());// Jane both get changed due to same mem location


    }
}

