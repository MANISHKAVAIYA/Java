import java.awt.*;

public class Flow1 extends Frame {
    Label b1, b2, b3;

    public Flow1() {
        setLayout(new FlowLayout());
        b1 = new Label("OK");
        b2 = new Label("Open");
        b3 = new Label("Close");
        add(b1);
        add(b2);
        add(b3);
    }

    public static void main(String[] args) {
        Flow1 applet = new Flow1();
        applet.setSize(300, 200);
        applet.setTitle("FlowLayout Applet");
        applet.setVisible(true);
    }
}
