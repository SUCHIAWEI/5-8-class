import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FrameLotto extends JFrame {
    private JButton b1 = new JButton ("Generate");
    private JButton exit = new JButton ("Exit");
    private JPanel jp1 = new JPanel(new GridLayout(1,6,1,1));
    private JPanel jp2 = new JPanel(new GridLayout(1,2,5,5));
    private Container cp ;
    private Random ran = new Random();
    private JLabel lb[] = new JLabel[6];
    private boolean flag =true;



    public FrameLotto () {
        frame();
    }

    private void frame(){

        this.setBounds(100,100,500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setTitle("樂透開獎");
        cp=this.getContentPane();
        cp.add(jp1 , BorderLayout.CENTER);
        cp.add(jp2 , BorderLayout.SOUTH);
        jp2.add(b1);
        jp2.add(exit);
        b1.setFont(new Font(null,Font.BOLD,20));
        exit.setFont(new Font(null,Font.BOLD,20));

        int x= ran.nextInt(49) +1;
        int number[] = new int[6];
        for (int i=0;i<6 ;i++){
            lb[i]= new JLabel();
            jp1.add(lb[i]);
        }
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int a = 0;
                for (int i=0; i<6 ;i++){
                    a=ran.nextInt(49) +1;
                    int j= 0;
                    while (j<i){
                        if (number[j]==a){
                            a=ran.nextInt(49) +1;
                            j=0;
                        }
                        else {
                            j++; }
                    }
                        number[i]=a;
                    lb[i].setOpaque(true);
                    lb[i].setText(Integer.toString(number[i]));
                    lb[i].setBackground(new Color(7068920));
                    lb[i].setFont(new Font(null, Font.ITALIC, 56));
                    }
            }
        });
        exit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
