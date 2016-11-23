package recursionSentence;

public class Sentence {
	
	String test;
	public Sentence(String string)//constructor
	{
		test = string;
	}
	
	boolean find(String t)//find method
	{
		if(test.startsWith(t))//if the sentence starts with the string we want to find, return true
			return true;
		else//if not remove the first character and keep looking
		{
			Sentence shorter = new Sentence(test.substring(1));
			return shorter.find(t);
		}
	}

}
