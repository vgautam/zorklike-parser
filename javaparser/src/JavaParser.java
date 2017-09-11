
import java.io.*;

public class JavaParser {

	public static void main(String[] args) {
		System.out.println("Welcome to this attempt at a Java lexer-parser.");
		Tokenizer tokenizer = new Tokenizer();
		Parser parser = new Parser();
		boolean quit = false;
		while(!quit) {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			try {
				String line = input.readLine();
				Token override = parser.parse(tokenizer.tokenize(line));
				if (override.getValue() == "quit")
				{
					quit = true;
				}
			}
			catch (IOException e) {
				System.err.println("Caught IOException: " + e.getMessage());
			}
		}
	}
}