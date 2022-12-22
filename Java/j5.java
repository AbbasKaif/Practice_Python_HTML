import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class j5
{
	public j5()
	{
		JFrame f=new JFrame("Swing Frame");
		f.getContentPane().setLayout(null);
		JLabel user1=new JLabel("Enter the user name");
		JTextField jt=new JTextField(15);
		JLabel pass1=new JLabel("Enter the password");
		JPasswordField jpf=new JPasswordField(15);
		jpf.setEchoChar('*');
		user1.setBounds(50,20,120,70);
		pass1.setBounds(50,90,120,27);
		jt.setBounds(220,40,120,27);
		jpf.setBounds(220,110,120,27);
		f.getContentPane().add(jpf);
		f.getContentPane().add(user1);
		f.getContentPane().add(jt);
		f.getContentPane().add(pass1);
		jt.requestFocus();
		f.setSize(300,200);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we){
		System.exit(0);}
});
}
public static void main(String sp_rk[])
{
new j5();
}
}