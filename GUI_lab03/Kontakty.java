import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*;

public class Kontakty extends JFrame{
    private JTextField txtImie;
    private JTextField txtMail;
    private JTextField txtData;
    private JComboBox comboBox1;
    private JButton zapiszNowyButton;
    private JPanel panel1;
    private JTextField txtAdres;
    private JTextField txtTel;
    private JButton zapiszIstniejącyButton;
    private JList<Osoba> list1;
    private JLabel wiek;
    DefaultListModel<Osoba> k=new DefaultListModel<>();

    public static void main(String[] args){

        Kontakty gui=new Kontakty();
        gui.setVisible(true);
    }
    public Kontakty(){
        super();
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        //this.setSize(400,400);
        zapiszIstniejącyButton.setEnabled(false);
        list1.setModel(k);
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        k.addElement(new Osoba("Jan Kowalski","jank@mail.pl","123 456 789","ul.wqe 12","12.11.2000"));
        k.addElement(new Osoba("Anna Nowak","annan@mail.pl","987 654 321","ul.qwere 73","19.03.1994"));
        zapiszNowyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String im,em,nr,ad,da;
                im= txtImie.getText();
                em= txtMail.getText();
                nr= txtTel.getText();
                ad= txtAdres.getText();
                da= txtData.getText();
                k.addElement(new Osoba(im,em,nr,ad,da));
            }
        });
        list1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                txtImie.setText(list1.getSelectedValue().imie);
                txtMail.setText(list1.getSelectedValue().email);
                txtTel.setText(list1.getSelectedValue().nrTel);
                txtAdres.setText(list1.getSelectedValue().adres);
                txtData.setText(list1.getSelectedValue().dataUrodzenia);
                int rok= Integer.parseInt(txtData.getText().substring(6,10));
                int w=2022-rok;
                wiek.setText(String.valueOf(w));
                zapiszIstniejącyButton.setEnabled(true);
            }
        });


        zapiszIstniejącyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String im,em,nr,ad,da;
                im= txtImie.getText();
                em= txtMail.getText();
                nr= txtTel.getText();
                ad= txtAdres.getText();
                da= txtData.getText();
                k.setElementAt(new Osoba(im,em,nr,ad,da),list1.getSelectedIndex());
                int rok= Integer.parseInt(txtData.getText().substring(6,10));
                int w=2022-rok;
                wiek.setText(String.valueOf(w));
            }
        });
    }

    class Osoba{
        String imie, email,nrTel,adres,dataUrodzenia;

        public Osoba(String imie, String email, String nrTel, String adres, String dataUrodzenia) {
            this.imie = imie;
            this.email = email;
            this.nrTel = nrTel;
            this.adres = adres;
            this.dataUrodzenia = dataUrodzenia;
        }

        public String getImie() {
            return imie;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getNrTel() {
            return nrTel;
        }

        public void setNrTel(String nrTel) {
            this.nrTel = nrTel;
        }

        public String getAdres() {
            return adres;
        }

        public void setAdres(String adres) {
            this.adres = adres;
        }

        public String getDataUrodzenia() {
            return dataUrodzenia;
        }

        public void setDataUrodzenia(String dataUrodzenia) {
            this.dataUrodzenia = dataUrodzenia;
        }

        @Override
        public String toString() {
            return imie;
        }
    }
}
