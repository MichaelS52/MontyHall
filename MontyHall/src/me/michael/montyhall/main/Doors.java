package me.michael.montyhall.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Doors {

	private ArrayList<DoorContent> doors = new ArrayList<DoorContent>();
	Random r;
	
	public Doors() {
		doors.add(DoorContent.GOAT);
		doors.add(DoorContent.GOAT);
		doors.add(DoorContent.CAR);
		
		r = new Random();
		this.randomizeContents();
	}
	
	public void randomizeContents() {
		Collections.shuffle(doors);
	}
	
	public DoorContent pickRandomDoor() {
		int rand = r.nextInt(doors.size());
		DoorContent dc = doors.get(rand);
		doors.remove(rand);
		return dc;
	}
	
	public void removeGoat() {
		Iterator<DoorContent> itr = doors.iterator();
		while(itr.hasNext()) {
			DoorContent content = itr.next();
			if(content==DoorContent.GOAT) {
				itr.remove();
				break;
			}
		}
	}
	
	public DoorContent getRemainingDoor() {
		return doors.get(0);
	}
	
}
