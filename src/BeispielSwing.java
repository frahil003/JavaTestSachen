import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BeispielSwing {
	public static void main(String[] args) {
        // Erstellen des Hauptfensters
        JFrame frame = new JFrame("Swing-Anwendung");

        // Erstellen eines Haupt-Panels mit GridLayout
        JPanel mainPanel = new JPanel(new GridLayout(2, 1)); // 2 Reihen, 1 Spalte

        // Erstellen des normalen Panels
        JPanel normalPanel = new JPanel();
        normalPanel.setBackground(Color.lightGray);
        normalPanel.setPreferredSize(new Dimension(200, 150)); // Größe festlegen

        // Erstellen des scrollbaren Panels
        JPanel scrollPanel = new JPanel();
        scrollPanel.setLayout(new BoxLayout(scrollPanel, BoxLayout.Y_AXIS)); // Vertikales BoxLayout

        // Erstellen eines JScrollPane und Hinzufügen des scrollPanel
        JScrollPane scrollPane = new JScrollPane(scrollPanel);

        // Erstellen von mehreren JLabels für das scrollPanel
        for (int i = 1; i <= 20; i++) {
            JLabel label = new JLabel("Label " + i);
            label.setFont(new Font("Arial", Font.PLAIN, 12));
            scrollPanel.add(label);
        }

        // Hauptpanel mit normalPanel und scrollPane hinzufügen
        mainPanel.add(normalPanel);
        mainPanel.add(scrollPane);

        // Hauptpanel zum Fenster hinzufügen
        frame.getContentPane().add(mainPanel);

        // Fenstergröße festlegen und sichtbar machen
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}