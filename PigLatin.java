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
		
	public static String pigLatinSimple(String str){
		char fl = str.charAt(0);
		String piggy = "";
		if(isVowel(fl))
			piggy = str + "hay";
		else
			piggy = str.substring(1, str.length()) + str.valueOf(fl) + "ay";
		return piggy.toLowerCase();
	}
		
		

	public static void main(String[] args){
		Scanner Sca = new Scanner(System.in);
		while(Sca.hasNextLine()){
			String pig = Sca.nextLine();
			Scanner Scar = new Scanner(pig);
			while(Scar.hasNext()){
				String latin = Scar.next();
				System.out.print(pigLatinSimple(latin));
				System.out.print(" ");
			}
			if(Sca.hasNextLine())
				System.out.println();
		}
	}


}