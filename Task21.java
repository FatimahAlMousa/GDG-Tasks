import java.util.*;

public class Task21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.println("Hello " + name + ", nice to meet you!");
        
        System.out.print("What is your name? ");
        System.out.println("Hello " + new Scanner(System.in).nextLine());
        
        List<String> greetings = Arrays.asList(
            "Hello there!",
            "Hey! How’s it going?",
            "Good day to you!",
            "Hi! Hope you’re doing well!",
            "Greetings!",
            "Hey! Have a fantastic day!",
            "Welcome! Nice to see you!"
        );
        
        Random random = new Random();
        System.out.println(greetings.get(random.nextInt(greetings.size())));
        
        input.close();
    }
}
