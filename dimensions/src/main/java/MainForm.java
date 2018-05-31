import javax.swing.*;
import java.awt.*;

public class MainForm extends JFrame {

    private static final String TITLE = "Размеры";
    private final Dimension MINIMUM_SIZE = new Dimension(800, 600);
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public MainForm(String title) throws HeadlessException {
        super(title);
        // Настройки основной формы
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(MINIMUM_SIZE);
        setSize(screenSize.width - 128, screenSize.height - 128);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new MainForm(TITLE).setVisible(true);
    }
}
