public class WordSort {
	
	public static void main(String[] args) {
		
        String text = "To be or not to be, that is the question;" 
        		+ "Whether 'tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?"; 
        
        //Using extractWords method to get the words in an array for sorting
        String[] extractedWords = extractWords(text);
        
        //Using bubble sort method to sort the words in alphabetical (Ascending) order.
        bubbleSort(extractedWords);
        
        //Iterate through the extractedWords array and print out the words
        System.out.println("Sorted Word list");
        for (int k = 0; k < extractedWords.length; k++) {
        	System.out.println(extractedWords[k]);
        }
    }
	
	/**Method to extract words.
	 * The words are extracted without punctuation characters (,;?')
	 * Also, text is converted into lower case to avoid comparison issues in sorting  
	*/
	
	public static String[] extractWords(String text) {

		text = text.replaceAll("[,;?']", " ").toLowerCase();
		
		//Split the text using the white spaces
		String[] words = text.split("\\s+");
        return words;	
	}
	
	//Sorting method to sort the text using bubble sort 
	public static void bubbleSort(String[] strArr) {
		
		String temp = "";
		for (int i = 0; i < strArr.length - 1; i++) {
			for (int j = 0; j < strArr.length - i - 1; j++) {
				
				/** Compare elements and if the first element is greater than the second interchange two elements
				 * Using the ascending order
				 */
				if(strArr[j].compareTo(strArr[j+1]) > 0) {
					temp = strArr[j];
					strArr[j] = strArr[j+1];
					strArr[j+1] = temp;				
				}
			}
		}
	}
}