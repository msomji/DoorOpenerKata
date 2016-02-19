package main;

import java.util.List;

public class DoorOpener {

	public int numberOfDoors;
	List<String> updatedArray;

	public List<String> convert(List<String> stringArray) {
		numberOfDoors = stringArray.size();
		updatedArray = stringArray;
		for (String door : updatedArray) {
			updatedArray.set(updatedArray.indexOf(door), update(door));
		}
		return updatedArray;
	}

	public String update(String status) {
		return status == "open" ? "close" : "open";
	}

}










