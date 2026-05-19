package Swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonExample implements ActionListener {

    JFrame frame;
    JButton clockBtn, hourGlassBtn;
    JLabel messageLabel;

    ImageButtonExample() {
        // Frame
        frame = new JFrame("Swing Image Button Demo");
        frame.setLayout(new BorderLayout());

        // Top Message Label
        messageLabel = new JLabel("Click any image below", JLabel.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 22));
        messageLabel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        // Panel for buttons (center)
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 30));
        panel.setBackground(new Color(230, 230, 230));

        // Load images (place in project folder)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

        // Resize images (optional but recommended)
        Image clockImg = clockIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image hourImg = hourGlassIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        clockBtn = new JButton(new ImageIcon(clockImg));
        hourGlassBtn = new JButton(new ImageIcon(hourImg));

        // Remove button borders for clean look
        clockBtn.setBorder(BorderFactory.createEmptyBorder());
        clockBtn.setContentAreaFilled(false);

        hourGlassBtn.setBorder(BorderFactory.createEmptyBorder());
        hourGlassBtn.setContentAreaFilled(false);

        // Add listeners
        clockBtn.addActionListener(this);
        hourGlassBtn.addActionListener(this);

        // Add buttons to panel
        panel.add(clockBtn);
        panel.add(hourGlassBtn);

        // Add components to frame
        frame.add(messageLabel, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        // Frame settings
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Event Handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clockBtn) {
            messageLabel.setText("You have pressed digital clock!");
        } else if (e.getSource() == hourGlassBtn) {
            messageLabel.setText("You have pressed hour glass!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ImageButtonExample());
    }
}