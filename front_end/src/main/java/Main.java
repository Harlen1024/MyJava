import com.swing.GUI.login.LibraryLogin;

public class Main {

    public static void main (String[] args) {

        LibraryLogin libraryLogin = new LibraryLogin();
        libraryLogin.setVisible(true);
        libraryLogin.setResizable(false);
        /*try {
            UIManager.setLookAndFeel (new MaterialLookAndFeel ());
        }
        catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace ();
        }

        JFrame frame = new JFrame ("Material Design UI for Swing by atharva washimkar");
        frame.setMinimumSize (new Dimension (600, 400));

        JButton button = new JButton ("PRESS ME");
        button.setMaximumSize (new Dimension (200, 200));

        JPanel content = new JPanel ();
        content.add (button);
        frame.add (content, BorderLayout.CENTER);

        // on hover, button will change to a light gray
        MaterialUIMovement.add (button, MaterialColors.GRAY_100);

        frame.pack ();
        frame.setVisible (true);
    }*/

    }
}