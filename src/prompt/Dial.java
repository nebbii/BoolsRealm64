package prompt;

import java.util.Scanner;

public class Dial {
	String name;
	public static Scanner input = new Scanner(System.in);
	public static String[] mmoption = {"null",
			"Play Game",
			"Load Game (NOT FUNCTIONAL)",
			"Create character",
			"Existing character",
			"Exit game"};
	public static String[] battleoption = {"null",
			"no"};
	public static String[] itemlist = {"null",
    		"Wooden Sword", 
    		"Iron Sword",
    		"Greatsword"};
	
	public Dial(String newname) {
		name = newname;
	}
	
	public static int showMenu(String mname, String[] mop) {
		System.out.println(mname);
		for (int i=1; i<mop.length; i++) {
			System.out.println(i+": "+mop[i]);
		} System.out.print("==>");
		return input.nextInt();
	}
	
	public static void battleScene() {
		
	}
}
