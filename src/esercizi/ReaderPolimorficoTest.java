package esercizi;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ReaderPolimorficoTest {
	
	static ReaderPolimorfico rp;
	final String stringInput = "Stringa di test";
	final char[] charsArrayInput = {'T', 'e', 's', 't'};
	File fileInput = new File("src/text_files/input_file.txt");

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		rp = new ReaderPolimorfico();
	}

	@Test
	void testStampaStringa() throws IOException {
		Reader rdString = new StringReader(this.stringInput);
		
		String str = rp.stampa(rdString);
		assertTrue(str.equals(this.stringInput));
	}
	
	@Test
	void testStampaCharArray() throws IOException {
		Reader rdCharArray = new CharArrayReader(this.charsArrayInput);
		
		String str = rp.stampa(rdCharArray);
		assertTrue(str.equals("Test"));
	}
	
	@Test
	void testStampaFile() throws IOException {
		Reader rdFile = new FileReader(this.fileInput);
		
		String str = rp.stampa(rdFile);
		assertTrue(str.equals("Strisssseeds"));
	}

}
