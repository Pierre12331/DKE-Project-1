import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Run {

    final static public int WINDOW_WIDTH = 1500;
    final static public int WINDOW_HEIGHT = 1000;

    public static void main(String[] args) {

        // initialize main window
        JFrame window = new JFrame();

        System.out.println(WINDOW_WIDTH + window.getInsets().right + window.getInsets().left);
        System.out.println(WINDOW_HEIGHT + window.getInsets().top + window.getInsets().bottom);

        window.getContentPane().setPreferredSize(new Dimension(
            WINDOW_WIDTH + window.getInsets().right + window.getInsets().left,
            WINDOW_HEIGHT + window.getInsets().top + window.getInsets().bottom
        ));

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Graph graph = (new Random()).generate(3, 3);
        Graph graph = (new FileLoader()).load("../graphs/custom/graph.txt");

        GraphPanel graphPanel = new GraphPanel(graph);

        window.add(graphPanel);

        window.pack();

        // make display visible
        window.setVisible(true);

    }

}
