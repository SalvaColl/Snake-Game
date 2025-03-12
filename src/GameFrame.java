import javax.swing.JFrame;

public class GameFrame extends JFrame {

    GameFrame() {

        // We don't need a named reference variable to the object if we won't use it for
        // anything else
        this.add(new GamePanel());
        this.setTitle("Snake");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.pack();
        this.setVisible(true);

        // Center the window
        this.setLocationRelativeTo(null);
    }
}
