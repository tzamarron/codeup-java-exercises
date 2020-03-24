
import java.util.Scanner;

public class ConsoleIoLec {

        public static void main(String[] args) {
        /* ***************************************
                    print() and println()
         ****************************************/

// >> this:
//        System.out.println("here");
//        System.out.println("there");

// >> is equivalent to this:
//        System.out.print("here\n");
//        System.out.print("there\n");


// >> without the newline characters, print outputs this:
//        System.out.print("here");
//        System.out.print("there");


// >> to concatenate, just like JS:
//        System.out.println("Hello" + " " + "World");


        /* ***************************************
                    printf()/.format
        ****************************************/

            //TODO TOGETHER: Print a formatted string using the following... printf(formatString, data)
//                String name = "Fortuna";
//            System.out.printf("Hello %s", name);


            //TODO TOGETHER:
            // (1) Create a string variable
            // (2) print using printf() with placeholder %s




            // TODO: print using printf() with placeholder %S



            // >>>> Multiple Variables


            //TODO TOGETHER:
            // (1) Create 2 variables - int and string
            // (2) Print using printf() and placeholders
            // note: d : decimal integer [byte, short, int, long]



            //TODO:
            // (1) Create 2 variables - int and string
            // (2) Print using printf() and placeholders



            // >>>> Currency


            // %f => float/double formatting
            //We can control the precision of the decimal using .___

            //TODO TOGETHER:
            // (1) Create int variable currencyPennies
            // (2) Print variable using currency formatting

//            int currencyPennies = 1000;
//            System.out.printf("I will see you swamp land for $%.2f an acre.",currencyPennies/100.00);


            //note: in this example %.2f ==> f = floating point number, .2 represents how many decimals



        /* ***************************************
                        USER INPUT
        ****************************************/
            // The Scanner class allows us to get data input that the user enters into the console.
            // Scanner Docs ==> http://www.cs.utexas.edu/users/ndale/Scanner.html

            //TODO: Add scanner input
            Scanner input = new Scanner(System.in);


            // >>>> .next() method
            // .next() captures each input usually signified by whitespace. The input is returned as a string

//            System.out.println("Please enter your first and last name.");
//            String firstName = input.next();
//            String lastName = input.next();
//            System.out.println(firstName);
//            System.out.println(lastName);

            // >>>> .nextInt() method
            // .nextInt() captures the first valid int value
//            System.out.println("Please enter your age.");
//
//            int age = input.nextInt();
//
//            System.out.println(age);



            // >>>> .nextLine() method
            // .nextLine() Returns the rest of the current line
//            System.out.println("Please enter your favorite quote");
//
//            String quote = input.nextLine();
//
//            System.out.println(quote);



            /* ****************** NOTE ********************
             *Quirk of using next() then nextLine()...
             *https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
             *
             *That's because the Scanner.nextInt method does not read the newline character in your input created by hitting "Enter,"
             *the call to Scanner.nextLine returns after reading that newline.
             *You will encounter the similar behaviour when you use Scanner.nextLine() after Scanner.next()
             *or any Scanner.nextFoo method (except nextLine itself).
             */

//             Scanner sc = new Scanner(System.in);
//             System.out.print("Please enter your favorite number: ");
//             int num = sc.nextInt();
//             System.out.println(num);
//             System.out.print("Please enter your favorite words: ");
//             String words = sc.nextLine();
//             System.out.println(words);
//


        }

    }


