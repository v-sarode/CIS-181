package lab1;
/**
 * @author
 *
 */
  abstract public class  SentenceTransformer {
	
	static String firstWord (String thePhrase) {
		/* take 'thePhrase' and return only the first word*/

		return thePhrase.substring(0, thePhrase.indexOf(" "));

	}

	static String lastWords (String thePhrase) {
		/* take 'thePhrase' and return the entire phrase except the last word */
		return thePhrase.substring(thePhrase.lastIndexOf(" ")+1);
	}

	static int countCharacter(String thePhrase,char letter){
		/* take 'thePhrase' and return the number of times 'letter' occurs in it 
		 * example:    SentenceTransformer.countCharacter("This is one boring lab", 'o') 
		 * would return 2
		 */
		 int count = 0;
		 for( int i=0; i<thePhrase.length(); i++ ) {
		     if( thePhrase.charAt(i) == letter ) {
		         count++;
		     } 
		 }
		return count;
	}
	
	static String depunctuate (String thePhrase){
		/* take 'thePhrase' and remove '.' '!' and '?' characters
		 * from it and replace them with ' ' (spaces)
		 */
//		return thePhrase.replaceAll("[.]"," ");
		String s1 = thePhrase.replaceAll("[.]"," ");
		String s2 =  s1.replaceAll("[!]"," ");
		String s3 =  s2.replaceAll("[?]", " ");
		return s3;
		
	}
}
