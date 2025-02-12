import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TestLexerParser {
    /*public static void main(String[] args) {
        // Lista di input da testare
        List<String> testInputs = List.of(
                "D"
        );

        // Itera sui test case
        for (String input : testInputs) {
            System.out.println("Testing input: " + input);
            visualizeParseTree(input);
        }
    }

    private static void visualizeParseTree(String input) {
        try {
            // Crea lo stream di input
            ANTLRInputStream inputStream = new ANTLRInputStream(input);

            // Istanzia il Lexer
            OutputGrammarLexer lexer = new OutputGrammarLexer(inputStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Istanzia il Parser
            OutputGrammarParser parser = new OutputGrammarParser(tokens);
            ParseTree tree = parser.factor(); // Usa la regola iniziale della grammatica

            // Crea una finestra grafica per visualizzare l'albero
            JFrame frame = new JFrame("Parse Tree for: " + input);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
            viewer.setScale(1.5); // Scala l'albero per migliorare la leggibilità

            JPanel panel = new JPanel();
            panel.add(viewer);
            frame.add(panel);

            frame.setSize(600, 400);
            frame.setVisible(true);
        } catch (Exception e) {
            System.out.println("Errore durante il parsing: " + e.getMessage());
        }
    }*/
}