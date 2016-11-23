package recursionSentence;

public class Tester {
	public static void main(String args[])
	{
		Sentence s = new Sentence("Mississippi");//new sentence object with string mississippi
		boolean b = s.find("sip");//boolean that returns true if sip is found
		System.out.println(b);//prints out the boolean value
	}

}
