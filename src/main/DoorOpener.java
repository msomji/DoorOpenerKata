package main;

import java.util.ArrayList;

public class DoorOpener {
	
	private int doorCount;
	private int closedDoors;
	private Object openedDoors;
	private ArrayList<Integer> openDoorArray;

	public void doors(int totalDoors) {
		this.doorCount = totalDoors;
		this.closedDoors = this.doorCount;
		this.openedDoors = 0;
		openDoorArray = new ArrayList<Integer>();
	}

	public int getDoors() {
		return doorCount;
	}

	public int getClosedDoors() {
		return closedDoors;	
	}

	public Object getOpenDoors() {
		return openedDoors;
	}

	public ArrayList<Integer> listDoors() {
		return openDoorArray;
	}
	

}
