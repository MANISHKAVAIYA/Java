import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class Border_layout extends BorderLayout {
    Button b1, b2, b3, b4, b5;

    public Border_layout() {
        Frame frame= new Frame();
        frame.setLayout(new BorderLayout());
        b1 = new Button("North");
        b2 = new Button("South");
        b3 = new Button("Center");
        b4 = new Button("East");
        b5 = new Button("West");
        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.SOUTH);
        frame.add(b3, BorderLayout.CENTER);
        frame.add(b4, BorderLayout.EAST);
        frame.add(b5, BorderLayout.WEST);

        frame.setSize(200,300);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
       new Border_layout();
    }
}
