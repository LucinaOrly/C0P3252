// 14.5
// (Random Sequences) Write an application that uses random-number generation
// to create sentences. Use four arrays of strings called article, noun, verb,
// and preposition. Create a sentence by selectig a word at random from each
// array in the following order: article, non, verb, preposition, article and
// noun. As each word is picked, concatenate it to the previous words in the
// sentence. The words should be separated by spaces. When the final sentence
// is output, it should start with a capital letter and end with a period. The
// application should generate and display 20 sentences.
//
// The article array should contain the article "the", "a", "one", "some", and
// "any"; the noun array should contain the nouns "boy", "girl", "dog", "town"
// and "car"; the verb array should contain the verbs "drove", "jumped", "ran",
// "walked" and "skipped"; the preposition array should contain the preposition
// "to", "from", "over", "under" and "on".

import java.lang.StringBuilder;
import java.security.SecureRandom;
import java.lang.Integer;

public class RandomSentences {
	static final int NUM_OF_SENTENCES = 20; // according to 14.6
	static final SecureRandom RAN = new SecureRandom();
	static final String[] 
		ARTICLES = {"the", "a", "one", "some", "any"},
		NOUNS = {"boy", "girl", "dog", "town", "car"},
		VERBS = {"drove","jumped", "ran", "walked", "skipped"},
		PREPS = {"to", "from", "over", "under", "on"};

	// main
	public static void main(String[] args) {
		StringBuilder sb;
		int numOfSentences = 0;
		try {
			numOfSentences = (!(args.length > 0)) ?
							NUM_OF_SENTENCES :
							Integer.parseInt(args[0]);
		}
		catch (Exception e) {
			System.err.println("usage: java RandomSentences [# of sentences]");
			return;
		}
	
		for (int i = 0; i < numOfSentences; i++)
			System.out.printf("%s%n", newSentence());
	}

	// generate new sentence
	public static String newSentence() {
		StringBuilder sb = new StringBuilder();

		sb.append(pickArti() + " ");
		sb.append(pickNoun() + " ");
		sb.append(pickVerb() + " ");
		sb.append(pickPrep() + " ");
		sb.append(pickArti() + " ");
		sb.append(pickNoun() + ".");
		sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

		return sb.toString();
	}

	// pick a random Article
	public static String pickArti() {
		return ARTICLES[RAN.nextInt(ARTICLES.length)];
	}	
	// pick a random Noun
	public static String pickNoun() {
		return NOUNS[RAN.nextInt(NOUNS.length)];
	}	
	// pick a random Verb
	public static String pickVerb() {
		return VERBS[RAN.nextInt(VERBS.length)];
	}	
	// pick a random Prep
	public static String pickPrep() {
		return PREPS[RAN.nextInt(PREPS.length)];
	}

}
