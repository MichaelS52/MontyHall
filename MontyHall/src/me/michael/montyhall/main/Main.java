package me.michael.montyhall.main;

public class Main {

	static double switchWins = 0, originalWins=0, plays=0;
	
	public static void main(String args[]) {
		//Runs 
		for(int i = 1; i<=1000000; i++) {
			simulate();
		}
		
		System.out.println("Switch: " + switchWins/plays +
				" Original: " + originalWins/plays);
	}
	
	public static void simulate() {
		Doors d = new Doors();
		DoorContent original = d.pickRandomDoor();
		d.removeGoat();
		DoorContent switchedDoor = d.getRemainingDoor();
		if(original.isWin()) originalWins++;
		if(switchedDoor.isWin()) switchWins++;
		plays++;
	}
	
}
