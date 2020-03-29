package main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Bunnyspa
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        App app = new App();
    }

    private App() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
        }
        MainDialog dialog = new MainDialog();
        dialog.setVisible(true);
        dialog.start();
    }
}
