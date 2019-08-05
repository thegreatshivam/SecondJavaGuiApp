import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Gui extends JFrame {
    private JButton regular;
    private JButton custom;

    Gui(){
        super("World's best Program");
        setLayout(new FlowLayout());
        regular = new JButton("Regular Button");
        add(regular);
        Icon firstIcon = new ImageIcon(getClass().getResource("a.png"));
        Icon secondIcon = new ImageIcon(getClass().getResource("b.png"));
        custom = new JButton("Custom Button", firstIcon);
        custom.setRolloverIcon(secondIcon);
        add(custom);

        HandlerClass handler = new HandlerClass();
        regular.addActionListener(handler);
        custom.addActionListener(handler);

    }

    private class HandlerClass implements ActionListener{
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
        }
    }
}
