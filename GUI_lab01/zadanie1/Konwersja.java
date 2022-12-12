import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Konwersja extends JFrame{
    private JPanel panel1;
    private JButton wyczyscButton;
    private JButton konwertujButton;
    private JTextField textFieldC;
    private JLabel JLabel;

    double c,f;

    public static void main(String[] args){
        Konwersja gui=new Konwersja();
        gui.setVisible(true);
    }
    public Konwersja(){
        super();
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        int width=280,height=200;
        this.setSize(width,height);
        wyczyscButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldC.setText(null);
                JLabel.setText(null);
            }
        });

        konwertujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c=Double.parseDouble(textFieldC.getText());
                f=(c*9/5)+32;
                JLabel.setText(String.valueOf(f));
            }
        });
    }
}
