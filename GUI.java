import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        String ageStr = JOptionPane.showInputDialog("How old are you?");
        int age = Integer.parseInt(ageStr);
        JOptionPane.showMessageDialog(null, "You're " + age + " years old.");
    }
}
