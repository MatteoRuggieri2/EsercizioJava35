package esercizi;

import java.io.IOException;
import java.io.Reader;

public class ReaderPolimorfico {
	static final char CR = '\r'; // x'0D' Carriage Return
	static final char LF = '\n'; // x'0A' Line Feed
	static final int EOF = -1; // End Of File
	
	
	/* Con questo metodo posso leggere caratteri derivanti da String, char[], File.
	Ritorna una stringa con tutti i caratteri contenenti nel reader, eliminando 
	carriage return, line feed. */
	public String read(Reader rd) throws IOException {
		
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
