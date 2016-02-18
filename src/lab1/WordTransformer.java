package lab1;
/**
 * @author 
 */
abstract public class WordTransformer {

	
	static String makeCapital (String theWord){
		/* return 'theWord' with the first letter capitalized */
		return Character.toUpperCase(theWord.charAt(0)) + theWord.substring(1);

	
	}

	static String lowerCase (String theWord){
		/* return 'theWord' with the first letter in lowercase */
		return Character.toLowerCase(theWord.charAt(0)) + theWord.substring(1);
	}

	static String upperCaser (String theWord) {
		/* return 'theWord' in all uppercase */
		return theWord.toUpperCase();
	}

	static String lowerCaser (String thePhrase) {
		/* return 'theWord' in all lowerCase */
		return thePhrase.toLowerCase();
	}

	static String ezEncrypt (String theWord) {
		/* this method will take the every even/odd pair of letters and swaps them.
		 * In the case of an odd length word, the last letter will not move.
		 * Example theWord = "Super"
		 * returns "uSper"
		 */
		char tempCharHolder;
		char arr[] = theWord.toCharArray();
		for(int i =0; i<theWord.length()-1;i = i+2){
			tempCharHolder = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = tempCharHolder;
		}
		return new String( arr);
	}
}
