import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class example extends JFrame{
    private JPanel jPanel1;
    private JButton wyjscieButton;
    private JLabel jLabelInfo;
    private JTextField aTextField;
    private JTextField bTextField;
    private JButton sumaButton;
    private JButton roznicaButton;
    private JRadioButton javaRadioButton;
    private JRadioButton cRadioButton;
    private JCheckBox poniedzialekCheckBox;
    private JCheckBox wtorekCheckBox;
    private JButton wyczyscPolaButton;
    private JLabel wynikLabel;
    private JButton wyswietlWyborButton;

    double a,b,wynik;

    //main
    public static void main(String[] args){
        example GUI = new example();
        GUI.setVisible(true);
    }
    //konstruktor
    public example(){
        super("moje gui");
        this.setContentPane(this.jPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        int width=380,height=300;
        this.setSize(width,height);

        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(aTextField.getText());
                b= Double.parseDouble(bTextField.getText());
                wynik=a+b;
                wynikLabel.setText("Suma: "+a+" + "+b+" = "+wynik);
            }
        });
        roznicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(aTextField.getText());
                b= Double.parseDouble(bTextField.getText());
                wynik=a-b;
                wynikLabel.setText("Roznica: "+a+" - "+b+" = "+wynik);
            }
        });
        wyswietlWyborButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text="";

                if(javaRadioButton.isSelected()&&poniedzialekCheckBox.isSelected()) text="Java - poniedzialek";
                else if (javaRadioButton.isSelected()&&wtorekCheckBox.isSelected()) text="Java - wtorek";
                else if (javaRadioButton.isSelected()) text="Java";
                if(cRadioButton.isSelected()&&poniedzialekCheckBox.isSelected()) text="C# - poniedzialek";
                else if (cRadioButton.isSelected()&&wtorekCheckBox.isSelected()) text="C# - wtorek";
                else if (cRadioButton.isSelected()) text="C#";

                JOptionPane.showMessageDialog(example.this,"Wybrano jezyk "+text);
            }
        });
        wyczyscPolaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aTextField.setText(null);
                bTextField.setText(null);
                poniedzialekCheckBox.isSelected();
            }
        });
    }
}
