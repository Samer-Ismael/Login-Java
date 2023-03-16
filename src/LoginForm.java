import javax.swing.*;
import java.awt.*;

public class LoginForm {
    public static void main(String[] args) {
        // Create the main window
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300,150));

        // Create the username label and entry
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        usernameField.setPreferredSize(new Dimension(200, 25));

        // Create the password label and entry
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(200,25));

        // Create the login button
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("Name") && password.equals("Pass")) {
                JOptionPane.showMessageDialog(frame, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid username or password.");
            }
        });

        // Create the panel and add the components
        JPanel panel = new JPanel();
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        // Add the panel to the frame and display the window
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
