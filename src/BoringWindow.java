import javax.swing.*;

public class BoringWindow extends JFrame
{
    public static void main(String[] arg)
    {
        JFrame f= new BoringWindow();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(3000, 2000);
        f.setVisible(true);
    }
}
