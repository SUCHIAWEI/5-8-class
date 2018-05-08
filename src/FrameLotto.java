import javax.swing.*;
import java.awt.*;

public class FrameLotto extends JFrame {
    private JButton b1 = new JButton ("Generate");
    private JButton exit = new JButton ("Exit");
    private JButton bs[] = new JButton[6];
    private JPanel jp1 = new JPanel(new GridLayout(1,6,3,3));
    private JPanel jp2 = new JPanel(new GridLayout(1,2,3,3));
    private Container cp ;

    public FrameLotto () {
        frame();
    }

    private void frame(){
        this.setBounds(100,100,525,525);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        


    }

}
