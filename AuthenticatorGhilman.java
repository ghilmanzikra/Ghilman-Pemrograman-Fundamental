import javax.swing.JOptionPane;
public class AuthenticatorGhilman {
 public static void main(String args[]) {
 String username =
 JOptionPane.showInputDialog("Username:");
 String password = 
 JOptionPane.showInputDialog("Password:");
 if (
 username != null && password != null && 
 ( 
 (username.equals("ghilman") &&
 password.equals("sword")) ||
 (username.equals("andre") &&
 password.equals("freak"))
 )
 )
 {
 JOptionPane.showMessageDialog
 (null, "You're in.");
 } else {
 JOptionPane.showMessageDialog
 (null, "You're suspicious.");
 }
 }
}