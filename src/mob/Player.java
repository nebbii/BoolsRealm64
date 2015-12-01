package mob;

import java.util.Scanner;

public class Player {
	Scanner input = new Scanner(System.in);
	public int id;
	public String name;
	public int age;
	public int weapon;
	
	public static String[][] itemlist = {{"null"},
			{"Wooden Sword",""}, 
			{"Iron Sword",""},
			{"Greatsword",""}
			};
	
	public Player(String newname, int newage, int newweapon) {
		// prompt for user input if variables are not given
		if(newname == "") {
			System.out.println("Please enter your name:");
			name = input.nextLine();
		} else { name = newname; }
		
		if(newage == 0) {
			System.out.println("Now enter your age:");
			age = input.nextInt();
		} else { age = newage; }
		
		if(newweapon == 0) {
			System.out.println("CHOOSE YOUR WEAPONMAN");
			for(int i=1; i<itemlist.length; i++) {
				System.out.println(i+": "+itemlist[i][0]);
			}
			weapon = input.nextInt();
		} else { weapon = newweapon;}
		System.out.println("New user was made:\n"
			+ "Name: "+this.name+"\n "
			+ "Age: "+this.age+"\n "
			+ "Weapon: "+Player.itemlist[this.weapon][0]+"\n ");
	}
}
