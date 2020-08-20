package techProblems;

public class foo_bar {

    //problem 0 
// -----------------------------------
// produce a system that can vary its output based upon a specific count.  This output should vary depending on if the count is current at 2, 3 or 6 any number divisible thereby.  If the count is not at a number divisible by 2, 3 or 6 it should print the counter, otherwise print foo when the count is divisible by 2, print bar when its divisible by 3 or print baz when its divisible by 6.  This cannot be hard coded, please generate a function that does this.  The system in theory counts forever printing values, but you don’t have to worry about memory management or anything like that.

// expected output:
// 1
// foo
// bar
// foo
// 5
// baz
// 7
// foo
// bar
// foo
// 11
// .
// .
// .
// //method to implment
// public void printFooBarBaz() {
// }

    public static void printFooBarBaz(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 6 == 0)
                System.out.println("Baz");

            else if (i % 3 == 0)
                System.out.println("Bar");

            else if (i % 2 == 0)
                System.out.println("Foo");

            else
                System.out.println(i);
        }
    }

    public static void main(String args[]) {
        printFooBarBaz(11);
    }
}