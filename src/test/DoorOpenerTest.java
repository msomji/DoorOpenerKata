package test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import main.DoorOpener;

public class DoorOpenerTest {
	
	DoorOpener underTest;
	List<String> stringArray;
	
	@Before
	public void setup(){
		underTest = new DoorOpener();
		stringArray = new ArrayList<String>();
	}
	
	@Test
	public void shouldUpdateCloseToOpen(){
		assertThat(underTest.update("close"), is("open"));
	}
	
	@Test
	public void shouldUpdateOpenToClose(){
		assertThat(underTest.update("open"), is("close"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void shouldAcceptAnArrayOfStringsAndReturnOneAsWell() {
		
		assertThat(underTest.convert(stringArray), is(List.class));
	}
	
	@Test
	public void shouldsetLengthOfArrayTo1(){
		setDoors(1);
		underTest.convert(stringArray);
		
		assertThat(underTest.numberOfDoors, is(1));
	}

	@Test
	public void shouldOpenAllDoorsIfTotalIs1(){
		setDoors(1);
		List<String> result = new ArrayList<String>();
		result.add("open");
		
		assertThat(underTest.convert(stringArray), is(result));
	}
	
	@Test
	public void shouldHaveOneOpenAndOneCloseddoorIfTotalLengthIS2(){
		setDoors(2);
		
		List<String> result = new ArrayList<String>();
		result.add("open");
		result.add("close");
		
		assertThat(underTest.convert(stringArray), is(result));
	}
	
	@Test
	public void should2ClosedDoorsAnd2OpenDoorsWithTotalOf4(){
		setDoors(4);
		
		
		List<String> result = new ArrayList<String>();
		result.add("open");
		result.add("close");
		result.add("close");
		result.add("open");
		
		assertThat(underTest.convert(stringArray), is(result));
	}
	
	@Test
	public void shouldReturnCorrectcombinationOfOpenClosedDoorsFor5Doors(){
		setDoors(5);
		
		List<String> result = new ArrayList<String>();
		result.add("open");
		result.add("close");
		result.add("close");
		result.add("open");
		result.add("close");
		
		assertThat(underTest.convert(stringArray), is(result));
	};

	@Test
	public void shouldReturnPositionsOfOpenDoorsWith5Total(){
		setDoors(5);
		underTest.convert(stringArray);
		ArrayList<Integer> result = new ArrayList<Integer>();

		result.add(1);
		result.add(4);
		assertThat(underTest.openDoorPositions(), is(result));
	}
	
	@Test
	public void shouldReturnPositionsOfOpenDoorsWith100Total(){
		setDoors(100);
		underTest.convert(stringArray);
		ArrayList<Integer> result = new ArrayList<Integer>();

		result.add(1);
		result.add(4);
		result.add(9);
		result.add(16);
		result.add(25);
		result.add(36);
		result.add(49);
		result.add(64);
		result.add(81);
		result.add(100);
		
		assertThat(underTest.openDoorPositions(), is(result));
	}
	
	public void setDoors(int number){
		while(number > 0){
			stringArray.add("close");
			number--;
		};
	};
}







