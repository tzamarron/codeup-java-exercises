package techProblems;

public class reverse {
    // problem 1
    // -----------------------------------
    // given a sentence, please reverse the characters within the sentence while
    // leaving the words in the sentence. You can assume all characters are standard
    // UTF-8 and you can ignore punctuation. You can also assume for simplicity that
    // you can fit the entire sentence in memory. Lastly for simplicity, you can
    // assume that there will only ever be one space between each word (so you don't
    // have to worry about mismatched amounts of white space).

    // example
    // input: "the cat is fat"
    // output: "eht tac si taf"

    // input: "band camp is great!"
    // output: "dnab pmac si !taerg"

    // //method to implment
    // public String reverseCharacters(String input) {
    // }

    public static String reverseCharacters(String input) {
        StringBuilder reverseInput = new StringBuilder();

        String[] inputWords = input.split(" "); // step 1

        for (String word : inputWords) {
            String reverseWord = new StringBuilder(word).reverse().toString(); // step 2
            reverseInput.append(reverseWord + " "); // step 3
        }

        return reverseInput.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println("this is the result");
        System.out.println(reverseCharacters("the cat is fat"));
        System.out.println(reverseCharacters("band camp is great!"));
    }

}