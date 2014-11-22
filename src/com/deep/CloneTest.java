package com.deep;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CloneTest {

	@Test
	public void testShallowClone() throws Exception {

		Employee employee = new Employee(1, "tamajit", new Address(55,
				"abc road", "700027"));
		// references are not reused(deep copy)
		Employee employee2 = employee.createClone();

		employee.getAddress().setPin("700094");

		assertEquals(employee.getEid(), employee2.getEid());

		assertEquals("700027", employee2.getAddress().getPin());
	}

}
