import javax.swing.*;
import java.awt.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300,150));

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        usernameField.setPreferredSize(new Dimension(200, 25));

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(200,25));

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("Name") && password.equals("Pass")) {
                JOptionPane.showMessageDialog(frame, "Nice!");
            } else {
                JOptionPane.showMessageDialog(frame, "Wrong username or password.");
            }
        });

        JPanel panel = new JPanel();
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
