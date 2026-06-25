import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class seing {

    public static void main(String[] args) {
        JCheckBox checkBox = new JCheckBox();
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        JOptionPane jp = new JOptionPane();
        Button button = new Button("CLICK ME");
        button.setBackground(Color.RED);
        button.setSize(40,10);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                //logic likho yaha
                // jp.showMessageDialog(null, "Button clicked!", "deb", JOptionPane.PLAIN_MESSAGE);
                System.out.println(textField.getText());
            }
            
        });
        // JPanel panel = new JPanel();
        // panel.setSize(100,100);
        // panel.setBackground(Color.BLUE);
        JFrame frame = new JFrame("My App");
        // JLabel label = new JLabel("HELLO");
        frame.setSize(800, 400);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.add(panel);

        // panel.add(label);
        frame.add(button);
        frame.add(textField);
        frame.add(checkBox);

        frame.setVisible(true);

    }

}
