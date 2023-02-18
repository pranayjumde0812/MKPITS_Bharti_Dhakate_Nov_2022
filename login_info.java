import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class login_info {
    private JPanel jpanal2;
    private JLabel user;
    private JLabel pass;
    private JLabel login;
    private JTextField textField1;
    private JTextField textField2;
    private JButton loginButton;
    private JPanel JPanal1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("login_info");
        frame.setContentPane(new login_info().JPanal1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    Connection con;

    void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded succesfully");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_info_db", "root", "Aboli@311");
            System.out.println("database connected successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    int flag=0;
    public login_info() {
        connect();
    loginButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String ename=textField1.getText();
            String epass=textField2.getText();
            try {
                Statement st = con.createStatement();
                ResultSet rs=st.executeQuery("select * from login_info");
                while (rs.next()) {
                    if ((ename.equals(rs.getString("Uname"))) && (epass.equals(rs.getString("Upass")))) {
                        flag = 1;
                    }
                }
                if(flag==1) {
                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Login Successful");
                }
                else {
                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Login  Un-Successful");
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    });
}
}
