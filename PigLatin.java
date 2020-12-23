import java.util.*;
public class PigLatin{

	public static boolean isVowel(char fl){
		return fl == 'a' || fl == 'e' || fl == 'i' || fl == 'o' || fl == 'u' || fl == 'A' || fl == 'E' || fl == 'I' || fl == 'O' || fl == 'U';
	}

	public static boolean isDigraph(String ftwo){
		ftwo = ftwo.toLowerCase();
		if (ftwo.equals("bl") || ftwo.equals("br") || ftwo.equals("ch") || ftwo.equals("ck") || ftwo.equals("cl") || ftwo.equals("cr") || ftwo.equals("dr"))
			return true;
		if (ftwo.equals("fl") || ftwo.equals("fr") || ftwo.equals("gh") || ftwo.equals("gl") || ftwo.equals("gr") || ftwo.equals("ng") || ftwo.equals("ph"))
			return true;
		if (ftwo.equals("pl") || ftwo.equals("pr") || ftwo.equals("qu") || ftwo.equals("sc") || ftwo.equals("sh") || ftwo.equals("sk") || ftwo.equals("sl"))
			return true;
		if (ftwo.equals("sm") || ftwo.equals("sn") || ftwo.equals("sp") || ftwo.equals("st") || ftwo.equals("sw") || ftwo.equals("th") || ftwo.equals("tr"))
			return true;
		return ftwo.equals("tw") || ftwo.equals("wh") || ftwo.equals("wr");
	}

	public static boolean isLetter(String fl){
		fl = fl.toLowerCase();
		if (fl.equals("a") || fl.equals("b") || fl.equals("c") || fl.equals("d") || fl.equals("e") || fl.equals("f") || fl.equals("g"))
			return true;
		if (fl.equals("h") || fl.equals("i") || fl.equals("j") || fl.equals("k") || fl.equals("l") || fl.equals("m") || fl.equals("n"))
			return true;
		if (fl.equals("o") || fl.equals("p") || fl.equals("q") || fl.equals("r") || fl.equals("s") || fl.equals("t") || fl.equals("u"))
			return true;
		return fl.equals("v") || fl.equals("w") || fl.equals("x") || fl.equals("y") || fl.equals("z");
	}
		
	public static String pigLatinSimple(String str){
		char fl = str.charAt(0);
		String piggy = "";
		if(isVowel(fl))
			piggy = str + "hay";
		else
			piggy = str.substring(1, str.length()) + str.valueOf(fl) + "ay";
		return piggy.toLowerCase();
	}
		
	public static String pigLatin(String str){
		char fl = str.charAt(0);
		String ftwo = "aaa";
		if(str.length() > 1)
			ftwo = str.substring(0, 2);
		String piggy = "";
		if (isVowel(fl))
			piggy = str + "hay";
		else if (isDigraph(ftwo))
			piggy = str.substring(2, str.length()) + ftwo + "ay";
		else
			piggy = str.substring(1, str.length()) + str.valueOf(fl) + "ay";
		return piggy.toLowerCase();
	}


	public static String pigLatinBest(String str){
		char fl = str.charAt(0);
		String piggy = str;
		boolean punct = false;
		String ftwo = "aaa";
		String ll = str.substring(str.length() - 1, str.length());
		if(str.length() > 1)
			ftwo = str.substring(0, 2);
		if(!isLetter(str.valueOf(fl)))
			return piggy;
		if(!isLetter(ll))
			punct = true;
		if(isVowel(fl)){
			if(punct)
				piggy = str.substring(0, str.length() - 1) + "hay" + ll;
			else
				piggy = str + "hay";
		}else if(isDigraph(ftwo)){
			if(punct)
				piggy = str.substring(2, str.length() - 1) + ftwo + "ay" + ll;
			else
				piggy = str.substring(2, str.length()) + ftwo + "ay";
		}else{
			if(punct)
				piggy = str.substring(1, str.length() - 1) + str.valueOf(fl) + "ay" + ll;
			else
				piggy = str.substring(1, str.length()) + str.valueOf(fl) + "ay";
		}
		return piggy.toLowerCase();
	}

	public static void main(String[] args){
		Scanner Sca = new Scanner(System.in);
		while(Sca.hasNextLine()){
			String pig = Sca.nextLine();
			Scanner Scar = new Scanner(pig);
			while(Scar.hasNext()){
				String latin = Scar.next();
				System.out.print(pigLatinBest(latin));
				System.out.print(" ");
			}
			if(Sca.hasNextLine())
				System.out.println();
		}
	}


}