import java.awt.*;
import java.awt.event.*;

public class card_layout extends CardLayout {
    Button b1, b2, b3;
    Font f;
    Panel panel;
    CardLayout cardLayout;

    public card_layout() {
        Frame frame = new Frame();
        f = new Font("Arial", Font.BOLD, 32);
        frame.setLayout(new CardLayout());
        cardLayout = new CardLayout();
        panel = new Panel();
        b1 = new Button("OK");
        b2 = new Button("Cancel");
        b3 = new Button("Close");
        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        panel.add(b1, "OK");
        panel.add(b2, "Cancel");
        panel.add(b3, "Close");
        panel.setLayout(cardLayout);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panel, "Cancel");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panel, "Close");
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(300, 200);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new card_layout();
    }
}
