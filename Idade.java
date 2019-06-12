package idade;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
	
		Scanner i = new Scanner(System.in);
		int im;
		int fn;
		int fm;
		
		im = i.nextInt();
		fn = i.nextInt();
		fm = i.nextInt();
		
		int ff = fn+fm;
		int fv = im-ff;
		
		System.out.println(fv);
		

	}

}
