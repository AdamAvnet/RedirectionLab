import java.util.*;
public class PigLatin{

	public static String pigLatinSimple(String str){
		char fl = str.charAt(0);
		String piggy = "";
		if(fl == 'a' || fl == 'e' || fl == 'i' || fl == 'o' || fl == 'u' || fl == 'A' || fl == 'E' || fl == 'I' || fl == 'O' || fl == 'U')
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
			System.out.println();
		}
	}


}