import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Legge il file da src/main/resources/
            InputStream is = Main.class.getClassLoader().getResourceAsStream("input.txt");
            if (is == null) {
                throw new RuntimeException("File input.txt non trovato in resources!");
            }

            // Converte lo stream in CharStream per ANTLR
            CharStream input = CharStreams.fromStream(is, StandardCharsets.UTF_8);

            // Creazione del lexer
            GrammarLexer lexer = new GrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Stampa i token generati
            System.out.println("\n== Token Generati ==");
            tokens.fill();
            for (Token token : tokens.getTokens()) {
                System.out.println("Token: " + token.getText() + " -> Tipo: " + GrammarLexer.VOCABULARY.getSymbolicName(token.getType()));
            }

            // Creazione del parser
            GrammarParser parser = new GrammarParser(tokens);

            // Attivare messaggi di debug
            parser.setBuildParseTree(true);
            parser.removeErrorListeners(); // Rimuove gli errori predefiniti di ANTLR
            parser.addErrorListener(new DiagnosticErrorListener()); // Mostra errori dettagliati

            // Parsing dell'input partendo dalla regola principale (start)
            System.out.println("\n== Albero Sintattico ==");
            ParseTree tree = parser.start();
            System.out.println(tree.toStringTree(parser));

            // Visualizzazione grafica dell'albero di parsing
            showParseTree(parser, tree);

        } catch (IOException e) {
            System.err.println("Errore nella lettura del file: " + e.getMessage());
        }
    }

    public static void showParseTree(Parser parser, ParseTree tree) {
        JFrame frame = new JFrame("Albero di derivazione");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setScale(1.2); // Scala leggermente più grande per leggibilità

        // Aggiungere uno JScrollPane per permettere lo scroll
        JPanel panel = new JPanel();
        panel.add(viewer);
        JScrollPane scrollPane = new JScrollPane(panel);
        frame.add(scrollPane);

        frame.setSize(1000, 800); // Aumentare la dimensione della finestra
        frame.setVisible(true);
    }
}
