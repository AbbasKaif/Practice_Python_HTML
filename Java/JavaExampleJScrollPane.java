import javax.swing.*;
import java.awt.*;
public class JavaExampleJScrollPane extends JFrame
   {
      private JPanel Pnl = new JPanel();
      private JScrollPane Scrl = new JScrollPane(Pnl,
      ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
      ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
      private JLabel Lbl = new JLabel("JScrollPane in Java Swing Example");
      private Font font = new Font("Arial", Font.PLAIN, 20);
      private Container cntnr;
      public JavaExampleJScrollPane()
          {
              super("JScrollPane in Java Swing Example");
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              cntnr = getContentPane();
              Lbl.setFont(font);
              cntnr.add(Scrl);
              Pnl.add(Lbl);
          }
              public static void main(String[] args)
                 {
                     final int WIDTH = 180;
                     final int HEIGHT = 100;
                     JavaExampleJScrollPane Scroll = new JavaExampleJScrollPane();
                     Scroll.setSize(250,300);
                     Scroll.setVisible(true);
                 }
    }