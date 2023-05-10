import javax.swing.*;
import java.awt.*;

public class Message extends JPanel {

    private JLabel message;

    public Message(int x,int y){
        this.setBounds(x,y,Constants.MES_WINDOW_WIDTH,Constants.MES_WINDOW_HEIGHT);
        this.setLayout(null);

        this.message = Utils.newLabel("GAME OVER",Constants.MES_WINDOW_WIDTH/2 - Constants.SMALL_LABEL_WIDTH/2,
                Constants.MES_WINDOW_HEIGHT/3 , Constants.REGULAR_LABEL);
        this.add(this.message);
        this.setBackground(Color.red);
        this.setVisible(true);
    }
}
