import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrameOX extends JFrame{
    private JButton b1 = new JButton ("Run");
    private JButton b2 = new JButton ("Reset");
    private JButton exit = new JButton ("Exit");
    private JButton bs[][] = new JButton[3][3];
    private Container cp ;
    private JPanel jp1 = new JPanel(new GridLayout(3,3,3,3));
    private JPanel jp2 = new JPanel(new GridLayout(3,1,3,3));
    private boolean flag =true;



    public FrameOX () {
        frame();
    }

    private void frame(){
        this.setBounds(100,100,525,525);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        cp.add(jp1,BorderLayout.CENTER);
        cp.add(jp2 , BorderLayout.EAST);
        jp2.add(b1);
        jp2.add(b2);
        jp2.add(exit);

        for (int i = 0 ; i<3 ; i++){
            for (int j = 0 ; j<3 ; j++){
                bs[i][j] = new JButton();
                jp1.add(bs[i][j]);
                bs[i][j].setEnabled(false);
                bs[i][j].setBackground(new Color(255, 188, 161));
                bs[i][j].setFont(new Font(null,Font.BOLD,150));
                bs[i][j].addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton tmp = (JButton)e.getSource();
                        tmp.setBackground(new Color(65, 255, 113));
                        if (tmp.getText().equals("")){
                            if (flag){
                                tmp.setText("o");
                            }
                            else {
                                tmp.setText("x");
                            }
                            flag=!flag;
                        }
                        list();
                    }
                });



            }
        }
        b1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0 ; i<3 ; i++){
                    for (int j = 0 ; j<3 ; j++) {
                        bs[i][j].setEnabled(true);
                    }
                }

            }
        });

        b2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0 ; i<3 ; i++){
                    for (int j = 0 ; j<3 ; j++) {
                        bs[i][j].setText("");
                        bs[i][j].setEnabled(false);
                        bs[i][j].setBackground(new Color(255, 188, 161));
                    }
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
    public void list (){
        if (bs[0][0].getText().equals(bs[0][1].getText()) && bs[0][0].getText().equals(bs[0][2].getText()) && !bs[0][0].getText().equals("")){
            JOptionPane.showMessageDialog(FrameOX.this,bs[0][0].getText()+"WIN");
        }
        if (bs[1][0].getText().equals(bs[1][1].getText()) && bs[1][0].getText().equals(bs[1][2].getText()) && !bs[1][0].getText().equals("")){
            JOptionPane.showMessageDialog(FrameOX.this,bs[1][0].getText()+"WIN");
        }
        if (bs[2][0].getText().equals(bs[2][1].getText()) && bs[2][0].getText().equals(bs[2][2].getText()) && !bs[2][0].getText().equals("")){
            JOptionPane.showMessageDialog(FrameOX.this,bs[2][0].getText()+"WIN");
        }
        if (bs[0][1].getText().equals(bs[1][1].getText()) && bs[0][1].getText().equals(bs[2][1].getText()) && !bs[0][1].getText().equals("")){
            JOptionPane.showMessageDialog(FrameOX.this,bs[0][1].getText()+"WIN");
        }
        if (bs[0][2].getText().equals(bs[1][2].getText()) && bs[0][2].getText().equals(bs[2][2].getText()) && !bs[0][2].getText().equals("")){
            JOptionPane.showMessageDialog(FrameOX.this,bs[0][2].getText()+"WIN");
        }
        if (bs[0][0].getText().equals(bs[1][0].getText()) && bs[0][0].getText().equals(bs[2][0].getText()) && !bs[0][0].getText().equals("")){
            JOptionPane.showMessageDialog(FrameOX.this,bs[0][0].getText()+"WIN");
        }
        if (bs[0][0].getText().equals(bs[1][1].getText()) && bs[0][0].getText().equals(bs[2][2].getText()) && !bs[0][0].getText().equals("")){
            JOptionPane.showMessageDialog(FrameOX.this,bs[0][0].getText()+"WIN");
        }
        if (bs[0][2].getText().equals(bs[1][1].getText()) && bs[0][2].getText().equals(bs[2][0].getText()) && !bs[0][2].getText().equals("")){
            JOptionPane.showMessageDialog(FrameOX.this,bs[0][2].getText()+" WIN");
        }
    }




}

