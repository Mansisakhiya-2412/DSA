import java.io.*;
import java.util.*;

public class String_With_Difference_Of_Every_Two_Consecutive_Characters {

	public static String solution(String str){
		// write your code here
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));

		for(int i = 1 ; i < str.length() ; i++){
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i - 1);
			int diff = ch1 - ch2;

			sb.append(diff);
			sb.append(ch1);
		}

		

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}