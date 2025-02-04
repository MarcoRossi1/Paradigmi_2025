import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) {
        // Definizione della stringa da analizzare
        String regexInput = "([a-z]*[a-z])";

        System.out.println("Analizzando l'espressione regolare: " + regexInput);

        // Creazione dello stream di input dalla stringa
        CharStream input = CharStreams.fromString(regexInput);

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

        // Parsing dell'input partendo dalla regola principale (atom)
        System.out.println("\n== Albero Sintattico ==");
        ParseTree tree = parser.start();
        System.out.println(tree.toStringTree(parser));
    }
}

