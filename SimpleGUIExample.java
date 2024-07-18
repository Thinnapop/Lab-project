import javax.swing.*;

public class SimpleGUIExample {
    public static void main(String[] args) {
        // Create a JFrame container
        JFrame frame = new JFrame("Simple GUI Example");

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label
        JLabel label = new JLabel("Hello, GUI World!");
        label.setHorizontalAlignment(JLabel.CENTER);

        // Create a button
        JButton button = new JButton("Click Me!");
        button.addActionListener(e -> label.setText("Button Clicked!"));
    }
}
        // 
