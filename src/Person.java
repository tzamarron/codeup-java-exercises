public class Person {
    private String name;
    public static long numberOfPeople;

    public Person(String personName) {
        name = personName;
        numberOfPeople++;
    }

    // returns the person's name
    public String getName(){
        return this.name;
    };

    // changes the name property to the passed value
    public void setName(String newName){
        name = newName;
    };

    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.printf("Hello my name is %s\n",name);
    };

    public static long getNumberOfPeople() {
        return numberOfPeople;
    }

    public static void main (String [] args){
//        System.out.println(getNumberOfPeople());
//        Person ted = new Person("Ted");
//        System.out.println(getNumberOfPeople());
//        System.out.println(ted.getName());
//        ted.sayHello();
//        ted.setName("Theo");
//        ted.sayHello();

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

