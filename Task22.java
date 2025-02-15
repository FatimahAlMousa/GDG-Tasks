import javax.swing.JOptionPane;

public class Task22 {
    public static void main(String[] args) {
        
        String Name = JOptionPane.showInputDialog("Enter your name");

        if (Name != null && !Name.trim().isEmpty()) {  
            int count = Name.length(); 

            JOptionPane.showMessageDialog(null, Name + " has " + count + " characters.", "Character Count", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No name entered.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
