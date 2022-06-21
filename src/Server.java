
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Server extends JFrame implements ActionListener {
    JTextField TxtField;
    JPanel a1;
    Box vertical = Box.createVerticalBox();

    // when we make object of the class
    // constructor is executed first
    // so when we call a class the main method is executed first
    // and making a object in the main method will execute constructor


    Server(){
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.darkGray);
        p1.setBounds(0,0,455,70);
        p1.setLayout(null);
        add(p1);

        // This is for Donkey Gif
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("340.png"));
        Image ii1 = i1.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(ii1);
        JLabel back = new JLabel(i2);
        back.setBounds(2,10,50,50);
        p1.add(back);

        back.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.exit(0);
            }
        });


        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("1_8mpWApzQD5gZZlnYYUkbcA - Copy.png"));
        Image ii4 = i4.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
        ImageIcon i5 = new ImageIcon(ii4);
        JLabel Profile_pic = new JLabel(i5);
        Profile_pic.setBounds(10,70,400,500);
        add(Profile_pic);


        JLabel Name =  new JLabel("Chat Bot");
        Name.setBounds(50,0,455,70);
        Name.setForeground(Color.WHITE);
        Name.setFont(new Font("SAN_SARIF", Font.BOLD, 22));
        Name.setLayout(null);
        p1.add(Name);

        JLabel Status =  new JLabel("Active Now");
        Status.setBounds(50,23,455,70);
        Status.setForeground(Color.green);
        Status.setFont(new Font("SAN_SARIF", Font.BOLD, 12));
        Status.setLayout(null);
        p1.add(Status);

        a1 = new JPanel();
        a1.setBounds(5, 75, 350, 550);
        add(a1);

        TxtField = new JTextField();
        TxtField.setBounds(5,630,350,25);
        add(TxtField);

        JButton Send = new JButton("Send");
        Send.setBackground(Color.darkGray);
        Send.setForeground(Color.WHITE);
        Send.setBounds(360, 630, 70,25);
        add(Send);




        setSize(450,700);
        setLocation(200,20);
//        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String out = TxtField.getText();
        JLabel output = new JLabel(out);
        JPanel p2 = new JPanel();
        p2.add(output);

        a1.setLayout(new BorderLayout());
        JPanel right = new JPanel(new BorderLayout());
        right.add(p2, BorderLayout.LINE_END);
        vertical.add(right);
        vertical.add(Box.createVerticalStrut(15));
        a1.add(vertical, BorderLayout.PAGE_START);

        repaint();
        invalidate();
        validate();



    }

    public static void main(String args[]){
        new Server();
    }
}
