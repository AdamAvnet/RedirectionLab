import java.util.*;
public class MakeStars{
	public static void main(String[] args){
		Scanner Sca = new Scanner(System.in);
		while(Sca.hasNextLine()){
			String star = Sca.nextLine();
			Scanner Scar = new Scanner(star);
			while(Scar.hasNext()){
				String str = Scar.next();
				for(int i = 0; i < str.length(); i++){
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}