import javax.swing.*;

public class Utils {

    public static JButton newButton (String text, int x, int y)
    {
        JButton button = new JButton(text);
        button.setBounds(x,y,Constants.BUTTON_WIDTH,Constants.BUTTON_HEIGHT);
        button.setFocusable(false);
        button.setFont(Constants.myFont);
        return button;
    }

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public static JLabel newLabel (String text, int x, int y, int kind )
    {
        JLabel label = new JLabel(text);
        if (kind ==Constants.BIG_LABEL)
        {
            label.setBounds(x,y,Constants.LABEL_WIDTH,Constants.LABEL_HEIGHT);
        } else if (kind == Constants.REGULAR_LABEL) {
            label.setBounds(x,y,Constants.SMALL_LABEL_WIDTH,Constants.LABEL_HEIGHT);
        }

        label.setFont(Constants.myFont);
        return label;
    }

}
