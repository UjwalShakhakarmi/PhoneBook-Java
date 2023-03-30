import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form implements ActionListener {

    JFrame frame = new JFrame();
//    frame.setBorder(BorderFactory.createTitledBorder("My Form"));
    JLabel name = new JLabel("Name");
    JTextField Username = new JTextField();
    JLabel city = new JLabel("City");
    JTextField Usercity = new JTextField();
    JLabel phone = new JLabel("Phone");
    JTextField Userphone = new JTextField();
    JButton insert = new JButton("Insert");
    JButton reset = new JButton("reset");

    //form2
    JTextField h1 = new JTextField("Name");
    JTextField h2 = new JTextField("City");
    JTextField h3 = new JTextField("Phone");
    JTextField h1name = new JTextField();
    JTextField h2city = new JTextField();
    JTextField h3phone = new JTextField();

    JTable table;
    DefaultTableModel model;




    void renderform(){
        name.setBounds(10,10,50,30);
        Username.setBounds(50,10,350,30);
        city.setBounds(10 , 50, 50,30);
        Usercity.setBounds(50,50,350,30);
        phone.setBounds(10 , 100, 50,30);
        Userphone.setBounds(50,100,350,30);
        insert.setBounds(50,160,150,30);
        reset.setBounds(220,160,150,30);

        frame.add(name);
        frame.add(city);
        frame.add(phone);
        frame.add(Username);
        frame.add(Usercity);
        frame.add(Userphone);
        frame.add(insert);
        frame.add(reset);
        reset.addActionListener(this);
        insert.addActionListener(this);


    }
    void rendertable(){
       model = new DefaultTableModel();
       model.addColumn("Name");
       model.addColumn("City");
       model.addColumn("Phone");

       table = new JTable(model);
       JScrollPane sp = new JScrollPane(table);
       sp.setBounds(10, 250 , 450, 170);
       frame.add(sp);

    }

    void Renderframe(){
        renderform();
        rendertable();
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setTitle("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == insert){
            String name1 = Username.getText();
            String city1 = Usercity.getText();
            String phone1 = Userphone.getText();
            Object[] data = {name1,city1,phone1};
            model.addRow(data);


        }
        if(e.getSource() == reset){
            h1name.setText("");
            h2city.setText("");
            h3phone.setText("");
        }
    }

}
