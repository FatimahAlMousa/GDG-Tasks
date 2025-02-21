import java.util.*;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter a noun: ");
        String noun = input.nextLine();

        System.out.print(" Enter a verb: ");
        String verb = input.nextLine();
        
        System.out.print(" Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print(" Enter an adverb: ");
        String adverb = input.nextLine();

        String sentence = " Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? " + "That's hilarious";
        
        System.out.print(sentence);
        
        input.close();
    }
}
