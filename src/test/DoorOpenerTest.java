package test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
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
		stringArray.add("closed");
		underTest.convert(stringArray);
		
		assertThat(underTest.numberOfDoors, is(1));
	}

	@Test
	public void shouldOpenAllDoorsIfTotalIs1(){
		stringArray.add("close");
		List<String> result = new ArrayList<String>();
		result.add("open");
		assertThat(underTest.convert(stringArray), is(result));
		
	}
}







