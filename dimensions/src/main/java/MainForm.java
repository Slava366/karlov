import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MainForm extends JFrame {

    private static NorthMenuBar northMenuBar;

    private File[] images;

    private MainForm(String title) {
        super(title);
        // Настройки основной формы
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(800, 600));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width - 128, screenSize.height - 128);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());

        // Добавляем меню
        northMenuBar = new NorthMenuBar(this);
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new MainForm("Размеры").setVisible(true);
    }

    public File[] getImages() {
        return images;
    }

    public void setImages(File[] images) {
        this.images = images;
    }
}
