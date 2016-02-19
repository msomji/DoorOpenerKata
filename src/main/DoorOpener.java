package main;

import java.util.ArrayList;
import java.util.List;

public class DoorOpener {

	public int numberOfDoors;
	public List<String> updatedArray;

	public List<String> convert(List<String> stringArray) {
		numberOfDoors = stringArray.size();
		updatedArray = stringArray;
		
		itterateThroughArray();
		return updatedArray;
	}

	private int itterateThroughArray() {
		int round = 1;
		while (round <= numberOfDoors){
			updateDoorPosition(round);
			round++;
		}
		return round;
	}

	private void updateDoorPosition(int round) {
		int position = 0 ;
		for (String door : updatedArray) {
			if ((position + 1) % round == 0){
				updatedArray.set(position, update(door));
			};
			position++;
		}
	};

	public String update(String status) {
		return status == "open" ? "close" : "open";
	}

	public List<Integer> openDoorPositions() {
		List<Integer> resultArray = new ArrayList<Integer>();
		
		int position = 1;
		for (String status : updatedArray){
			if (status == "open"){
				resultArray.add(position);
			}
		position++;
		}
		return resultArray;
	};

}










