package me.michael.montyhall.main;

public enum DoorContent {
	GOAT,
	CAR;
	
	public boolean isWin() {
		if(equals(GOAT)) {
			return false;
		}else {
			return true;
		}
	}
}
