package com.amol.automation.testcase;

import org.testng.annotations.Test;

import com.amol.automation.base.TestBase;
import com.amol.automation.pageobject.FlightBookingPage;

public class FlighBooking extends TestBase{

	@Test(description="By the way tv fslfjklklsjflsjf")
	public void flightBook() {
		FlightBookingPage obj = new FlightBookingPage(driver);
		obj.flightBooking();
	}
}
