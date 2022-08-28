import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Binarypin {
   private JFrame frame = new JFrame("Binary Pin");
   private JLabel output = new JLabel();

   Binarypin() {
      this.output.setBounds(20, 250, 360, 20);
      JLabel var1 = new JLabel("Your data:");
      var1.setBounds(20, 235, 100, 20);
      this.frame.add(var1);
      this.frame.add(this.output);
      this.frame.add(new PinButton(this, "0", 43, 10, 150, 150));
      this.frame.add(new PinButton(this, "1", 198, 10, 150, 150));
      this.frame.add(new ResetButton(this, 43, 165, 305, 50));
      this.frame.setSize(400, 350);
      this.frame.setLayout((LayoutManager)null);
      this.frame.setVisible(true);
      this.frame.setDefaultCloseOperation(3);
   }

   public static void main(String[] var0) {
      new Binarypin();
   }

   public void clearOutput() {
      this.output.setText("");
   }

   public void updateOutput() {
      this.output.setText(Secret.getInstance().getData());
   }
}
