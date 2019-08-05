import javax.swing.JFrame;

public class Main extends JFrame {
    public static void main(String[] args) {
        Gui windows = new Gui();
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setVisible(true);
        windows.setSize(500,300);


    }
}
