import java.util.Arrays;

public class ArraysExercises {

    // Static method that accepts a Person array and a Person object
    // A copy of the provided array is made
    // Places Person object into the array at the end
    // Returns the new array
    public static Person[] addPerson(Person[] array, Person person) {
        // Person[] newArray = new Person[array.length + 1]; // Way to copy arrays # 1
        // System.arraycopy(array, 0, newArray, 0, array.length);
        Person[] newArray = Arrays.copyOf(array, array.length + 1); // Way to copy arrays # 2
        newArray[newArray.length - 1] = person;
        return newArray;
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers); // Prints the array location

        // Creates new instance of Person and an array 3 long
        Person[] persons = new Person[3];

        // Creates new person and place into array
        persons[0] = new Person("Member 1");
        persons[1] = new Person("Member 2");
        persons[2] = new Person("Member 3");


        // Using a for enhanced for loop to print out
        // names of persons within array
        for (Person person : persons) {
            System.out.println(person.getName());
        }

        System.out.println();

        // Create a new Person
        Person student4 = new Person("Member 4");
        // Using a enhanced for loop to print out names
        // of persons within new array created using
        // the new method
        for (Person person : addPerson(persons, student4)) {
            System.out.println(person.getName());
        }
    }
}
