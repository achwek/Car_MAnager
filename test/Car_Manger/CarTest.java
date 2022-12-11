package Car_Manger;

import static org.junit.Assert.fail;
import static org.junit.Assert.*;
import org.junit.Test;

import Car_Manager.Car;

public class CarTest {

	@Test
	public void testCar() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIdCar() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetIdCar() {
		Car c = new Car();
		c.setIdCar(123);
		if(c.getIdCar()==123) {
			assertTrue("true",true);
		}else {
			fail("false");

		}
		}

	@Test
	public void testGetTypeCar() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTypeCar() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetModelCar() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetModelCar() {
		fail("Not yet implemented");
	}


}
