import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listy extends JFrame{
    private JList<String> list1;
    DefaultListModel<String> dl1=new DefaultListModel<>();
    DefaultListModel<String> dl2=new DefaultListModel<>();
    private JPanel panel1;
    private JList<String> list2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public static void main(String[] args){
        Listy gui=new Listy();
        gui.setVisible(true);
    }
    public Listy(){
        super();
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(420,350);
        dl1.addElement("a");
        dl1.addElement("b");
        dl1.addElement("c");
        dl1.addElement("d");
        dl1.addElement("e");
        dl1.addElement("f");
        dl1.addElement("g");
        dl1.addElement("h");
        list1.setModel(dl1);
        dl2.addElement("1");
        dl2.addElement("2");
        dl2.addElement("3");
        dl2.addElement("4");
        dl2.addElement("5");
        dl2.addElement("6");
        dl2.addElement("7");
        dl2.addElement("8");
        list2.setModel(dl2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(list1.isSelectionEmpty()==false){
                    dl2.addElement(list1.getSelectedValue());
                    dl1.remove(list1.getSelectedIndex());
                }

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i=0;i<dl1.size(); i+=1/2) {
                    dl2.addElement(dl1.elementAt(i));
                    dl1.remove(i);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(list2.isSelectionEmpty()==false){
                    dl1.addElement(list2.getSelectedValue());
                    dl2.remove(list2.getSelectedIndex());
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i=0;i<dl2.size(); i+=1/2) {
                    dl1.addElement(dl2.elementAt(i));
                    dl2.remove(i);
                }
            }
        });
    }
}
