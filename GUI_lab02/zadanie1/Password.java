import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Password extends JFrame{
    private JPanel panel1;
    private JButton OKButton;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    char[] correct= "codejava".toCharArray();

    public static void main(String[] args){
        Password gui=new Password();
        gui.setVisible(true);
    }
    public Password() {
        super();
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(300,150);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(Arrays.equals(passwordField1.getPassword(), passwordField2.getPassword())) {
                    if (Arrays.equals(passwordField1.getPassword(), correct))
                        JOptionPane.showMessageDialog(Password.this,"Congratulations! You entered correct password");
                    else
                        JOptionPane.showMessageDialog(Password.this,"Wrong password");
                }
                else JOptionPane.showMessageDialog(Password.this,"Passwords do not match");
            }
        });
    }
}
