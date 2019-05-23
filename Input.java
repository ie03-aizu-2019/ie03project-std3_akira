package ex1;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {

	Scanner scan = new Scanner(System.in);
	//Pattern p = Pattern.compile("^[0-9]*$");

	public boolean isNum(int[] value){
		//scan.useDelimiter(" ");
		String[] input = new String[value.length];
		if(input.length == value.length) {
			for(int i = 0;i < value.length;i++) {
				input[i] = scan.next();
				//Matcher m = p.matcher(input[i]);
				if(Pattern.matches("^[0-9]*$", input[i])) {
					value[i] = Integer.parseInt(input[i]);
				}else if(Pattern.matches("^c?[0-9]*$", input[i])){
					
				}else {
				//	System.out.println("f1");
					return false;
				}
			}
		}else {
		//	System.out.println("f2");
		return false;
		}
		return true;
	}

	public boolean isP(int P,Point[] set,Point[] points,List<Point> list) {
		String[] input = new String[P];
		if(input.length == P) {
			Point[] p = new Point[P];
			for(int i = 0;i < P;i++) {
				p[i] = new Point();
			}
			for(int i = 0;i < P;i++) {
				input[i] = scan.next();
				//Matcher m = p.matcher(input[i]);
				if(Pattern.matches("^[0-9]*$", input[i])) {
				p[i] = points[Integer.parseInt(input[i])];
				}else if(Pattern.matches("^c?[0-9]*$", input[i])){
				p[i] = list.get(Integer.parseInt(input[i].substring(1)));
				}else {
				//	System.out.println("f1");
					return false;
				}
			}
		}else {
		//	System.out.println("f2");
		return false;
		}
		return true;
	}

	public boolean limitCheck(int n,int max,int min) {
		if(n < min && n > max) {
			return false;
		}else {
			return true;
		}
	}
}

