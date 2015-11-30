//import prompt.Dialog;
import mob.Player;
import prompt.Dial;

class main {
	
	
	public static void main(String args[]) {
		// playerList holds all player objects
		Player[] playerList = new Player[20];
		
		// String c is used as a pointer for which scene the game is in
		String c = "mmenu";
		while(c=="mmenu"){
			int minput = Dial.showMenu("Welcome to Bool's Realm 64!", Dial.mmoption);
			switch(minput){
			case 1: // play game
				System.out.println("You say \"ravioli ravioli give me the game\".\n");
				c="battle";
				break;
			case 2: // load game
				// be able to load games/battles
				System.out.println("wow i told you this isnt functional you dense mf\n"
						+ "we done");
				break;
			case 3: // create character
				playerList[1] = new Player("", 0, 0);
				break;
			case 4: // existing character; shows list of existing characters
				if(playerList[1]==null) {
					System.out.println("No existing characters were found!");
					continue;
				} else {
					System.out.println("List of Existing Characters:");
					for(int i=0;i<playerList.length;i++) {
						if(playerList[i]!=null){
							System.out.println(playerList[i].name+": Is "+playerList[i].age+" years old, favorite weapon is "+mob.Player.itemlist[playerList[i].weapon]);
						}
					}
				}
				Dial.input.nextLine();
				break;
			case 5: // exit game
				System.out.println("byebyee!");
				c="end";
				break;
			}
			
			while(c=="battle") {
				System.out.println("who sent these babies to fight ?\n");
				c="mmenu";
			}
		}
		
		System.out.println("The game has ended.");
		System.exit(0);
		//Player playerOne = new Player("", 0, 0);
		
	}

}
