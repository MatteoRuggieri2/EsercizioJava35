package esercizi;

import java.io.IOException;
import java.io.Reader;

public class ReaderPolimorfico {
	static final char CR = '\r'; // x'0D' Carriage Return
	static final char LF = '\n'; // x'0A' Line Feed
	static final int EOF = -1;
	
	
	// Con questo metodo posso stampare caratteri derivanti da String, char[], File
	public String stampa(Reader rd) throws IOException {
		
		int c = 0;
		StringBuffer sb = new StringBuffer();
		
		while ((c = rd.read()) != -1) {
			if (c == CR || c == LF) {
				continue;
			}
			sb.append((char) c);
			
			
		}
		
		
		
		return sb.toString();
		
		
	}
}
