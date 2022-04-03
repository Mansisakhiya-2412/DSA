import java.io.*;
import java.util.*;

public class Togglecase {

	public static String toggleCase(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < str.length() ; i++){
			char ch = str.charAt(i);

			if(ch >= 'a' && ch <= 'z'){
				//char is lowercase convert into uppercase
				char uc = (char)((ch - 'a')+ 'A');
				sb.append(uc);
			}else if(ch >= 'A' && ch <= 'Z'){
				//char is uppercase convert into lowercase
				char lc = (char)((ch - 'A')+ 'a');
				sb.append(lc);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}