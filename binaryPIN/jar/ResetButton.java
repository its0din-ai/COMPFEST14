import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

class ResetButton extends JButton implements ActionListener {
   private Binarypin app;

   ResetButton(Binarypin var1, int var2, int var3, int var4, int var5) {
      super("Reset");
      this.app = var1;
      this.addActionListener(this);
      this.setBounds(var2, var3, var4, var5);
   }

   public void actionPerformed(ActionEvent var1) {
      Secret.getInstance().resetInstance();
      this.app.clearOutput();
   }
}
