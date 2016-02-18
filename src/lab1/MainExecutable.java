package lab1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class MainExecutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = new String("Dr.Nick: \"Hello everybody!\"");
		
		StringBuilder stringBuilderObject = new StringBuilder();
		
		stringBuilderObject.append("firstWord: " + SentenceTransformer.firstWord(s));
		stringBuilderObject.append("\nlastWords: " + SentenceTransformer.lastWords(s));
		stringBuilderObject.append("\ncountCharacter: " +SentenceTransformer.countCharacter(s, 'e')+" - e characters");
		stringBuilderObject.append("\ndepunctuate: " + SentenceTransformer.depunctuate(s));

		s = "philanthropist"; 
		String encrypted = WordTransformer.ezEncrypt(s);
		stringBuilderObject.append("\nezEncrpt: "+encrypted);
		stringBuilderObject.append("\nlowerCaser: " + WordTransformer.lowerCaser(s));
		stringBuilderObject.append("\nlowerCase: " + WordTransformer.lowerCase(s));
		stringBuilderObject.append("\nupperCaser: " + WordTransformer.upperCaser(s));
		stringBuilderObject.append("\nmakeCapital: " + WordTransformer.makeCapital(s));

		
		// Filename variable to store the output filename.
		String filename = "output.txt";

		try {
			// creating new file using "new File(filename)" passing it to "new FileWriter()" to create a file writer object
			// passing Filewriter object ot BufferedWriter to write the buffer content to the file. 
			BufferedWriter buffer = new BufferedWriter(new FileWriter(new File(filename)));
			
			//write contents of StringBuffer to a file
			buffer.write(stringBuilderObject.toString());
      
			//flush the stream
			buffer.flush();
      
			//close the stream
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: Problem in writing file. Please troubleshoot...");
			e.printStackTrace();
		}
       
        System.out.println("Content of StringBuffer written to File.");
		
	}

}
