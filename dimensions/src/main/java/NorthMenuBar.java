import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NorthMenuBar extends JMenuBar {

    NorthMenuBar(MainForm mainForm) {
        // Создаем пункты меню
        JMenu jMenuFile = new JMenu("Файл");

        // Создаем подпункты меню
        JMenuItem jMenuFileOpen = new JMenuItem("Открыть...");
        JMenuItem jMenuFileExit = new JMenuItem("Выйти");

        // Добавляем все подпункты в пункты
        jMenuFile.add(jMenuFileOpen);
        jMenuFile.addSeparator();
        jMenuFile.add(jMenuFileExit);

        // Добавляем меню
        add(jMenuFile);

        // Выводим в контекст
        mainForm.add(this, BorderLayout.NORTH);

        // Добавляем слушателей
        jMenuFileOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Выберите изображения для редактирования...");
                fileChooser.setMultiSelectionEnabled(true);
                if(JFileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(mainForm)) {
                    mainForm.setImages(fileChooser.getSelectedFiles());
                }
            }
        });

        jMenuFileExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainForm.dispose();
            }
        });
    }
}
