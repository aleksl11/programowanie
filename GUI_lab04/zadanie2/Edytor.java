import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Edytor extends JFrame{
    private JPanel panel1;
    private JComboBox comboBox1;
    private JButton iButton;
    private JButton pButton;
    JButton bButton;
    private JButton zButton;
    private JTextPane textPane1;


    public static void main(String[] args){
        Edytor gui=new Edytor();
        gui.setVisible(true);
    }

    public Edytor(){
        super();
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(500,400);
        textPane1.setBackground(Color.lightGray);
        SimpleAttributeSet attributeSet=new SimpleAttributeSet();

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color;
                color= (String) comboBox1.getSelectedItem();
                switch (color){
                    case "Czarny": textPane1.setForeground(Color.black);
                        break;
                    case "Czerwony": textPane1.setForeground(Color.red);
                        break;
                    case "Zielony": textPane1.setForeground(Color.green);
                        break;
                    case "Niebieski": textPane1.setForeground(Color.blue);
                        break;
                    case "Żółty": textPane1.setForeground(Color.yellow);
                        break;
                    case "Szary": textPane1.setForeground(Color.gray);
                        break;
                    case "Fioletowy": Color myColor = new Color(128,0,128);
                        textPane1.setForeground(myColor);
                        break;
                }

            }
        });
        bButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(StyleConstants.isBold(attributeSet))
                    StyleConstants.setBold(attributeSet, false);
                else
                    StyleConstants.setBold(attributeSet, true);
                textPane1.setCharacterAttributes(attributeSet, true);
            }
        });
        iButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(StyleConstants.isItalic(attributeSet))
                    StyleConstants.setItalic(attributeSet, false);
                else
                    StyleConstants.setItalic(attributeSet, true);
                textPane1.setCharacterAttributes(attributeSet, true);
            }
        });
        zButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int size=StyleConstants.getFontSize(attributeSet);
                size--;
                StyleConstants.setFontSize(attributeSet,size);
                textPane1.setCharacterAttributes(attributeSet,true);
            }
        });
        pButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int size=StyleConstants.getFontSize(attributeSet);
                size++;
                StyleConstants.setFontSize(attributeSet,size);
                textPane1.setCharacterAttributes(attributeSet,true);
            }
        });
    }
}
