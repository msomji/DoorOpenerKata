package test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import main.DoorOpener;

public class DoorOpenerTest {
	
	DoorOpener underTest;
	
	@Before
	public void setup(){
		underTest = new DoorOpener();
	}

	@Test
	public void shouldSetTotalNumberOfDoors() {
		underTest.doors(12);
		
		assertThat(underTest.getDoors(), is(12));
	}
	
	@Test
	public void shouldSetTotalNumberOfDoorsToInitialInput(){
		underTest.doors(14);
		
		assertThat(underTest.getDoors(), is(14));
	}
	
	@Test
	public void shouldSetInitialNumberOfClosedDoorsTo12(){
		underTest.doors(12);
		
		assertThat(underTest.getClosedDoors(), is(12));
	}
	
	@Test
	public void shouldSetInitialNumberOfOpenDoorsTo0(){
		underTest.doors(12);
		
		assertThat(underTest.getOpenDoors(), is(0));
	}
	
	@Test
	public void shouldListTheDoorsThatAreOpen(){
		underTest.doors(3);
		ArrayList<Integer> openDoorArray = new ArrayList<Integer>();
		openDoorArray.add(1);
		
		assertThat(underTest.listDoors(), is(openDoorArray));
	}
	
}
