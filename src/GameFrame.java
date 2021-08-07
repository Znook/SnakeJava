import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){
        // Instead of this
        //GamePanel panel = new GamePanel();

        // DO this
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
