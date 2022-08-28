import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

class PinButton extends JButton implements ActionListener {
   Binarypin app;

   PinButton(Binarypin var1, String var2, int var3, int var4, int var5, int var6) {
      super(var2);
      this.app = var1;
      this.addActionListener(this);
      this.setBounds(var3, var4, var5, var6);
   }

   public void actionPerformed(ActionEvent var1) {
      Secret.getInstance().process(this.getText().charAt(0));
      this.app.updateOutput();
   }
}
