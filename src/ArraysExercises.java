
public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers); // Prints the array location

        Person[] persons = new Person[3];
        Person student1 = new Person("Member 1");
        Person student2 = new Person("Member 2");
        Person student3 = new Person("Member 3");
        persons[0] = student1;
        persons[1] = student2;
        persons[2] = student3;
        for(Person person : persons){
            System.out.println(person.getName());
        }
    }
}
