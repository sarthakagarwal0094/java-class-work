import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFrame{
    JFrame f;
    JComboBox cb;
    JLabel l1,l2;
    JButton btn;
    public MyFrame()
    {
        f=new JFrame("My new swing frame");
        f.setSize(800,600);
        
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] data={"Cricket","Hockey","BaseBall","Football"};
        l1=new JLabel("Select your Favourite Sport");
        btn=new JButton("Click to Show");
        cb=new JComboBox(data);
        l2=new JLabel();
        f.add(l1);
        f.add(cb);
        
        f.add(btn);
        f.add(l2);
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                l2.setText("You Selected:"+cb.getSelectedItem());
            }
        });
        f.setVisible(true);

    }

    public static void main(String[] args)
    {
        new MyFrame();
    }
}