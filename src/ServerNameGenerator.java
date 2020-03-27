public class ServerNameGenerator {

    // Two new arrays
    public static String[] adjectives = {"immense", "mysterious", "bewildered", "microscopic", "victorious", "ambitious", "glamorous", "magnificent", "muscular", "zealous"};
    public static String[] nouns = {"designer", "musician", "guitar", "soldier", "student", "expert", "penguin", "giraffe", "sword", "computer"};

    // Method that will return a random element
    // from a given String array
    public static String randomElement(String[] array) {
        int ranNum = (int) Math.floor(Math.random() * array.length);
        return array[ranNum];
    }

    public static void main(String[] args) {
        // Generates random noun and adjective
        String randoNoun = randomElement(nouns);
        String randoAdj = randomElement(adjectives);
        // Prints both randoms separated by a hyphen
        System.out.println("Here is your server name:");
        System.out.printf("\t%s - %s",randoAdj,randoNoun);
    }
}
