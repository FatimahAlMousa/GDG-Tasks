import java.util.*;

      public class Task3_1 {    
        public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the quote? ");
        String quote = input.nextLine();
        
        System.out.print("Who said it? ");
        String name = input.nextLine();
        
        System.out.println(name + " says, \"" + quote + "\"");
        
     
        System.out.println(".............................................");
        Map<String, String>[] quotes = new HashMap[3];
        
        quotes[0] = new HashMap<>();
        quotes[0].put("quote", "The only impossible journey is the one you never begin.");
        quotes[0].put("author", "Tony Robbins");
        
        quotes[1] = new HashMap<>();
        quotes[1].put("quote", "Believe you can and you’re halfway there.");
        quotes[1].put("author", "Theodore Roosevelt");
        
        quotes[2] = new HashMap<>();
        quotes[2].put("quote", "Never regret anything that made you smile.");
        quotes[2].put("author", "Mark Twain");
        
        
        
        for (Map<String, String> q : quotes) {
            System.out.println(q.get("author")+" says, \"" + q.get("quote") + "\"");
}}}
