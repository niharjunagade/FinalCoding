package UnitTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import base.RateDAL;
import ch.makery.address.model.Rate;
import domain.RateDomainModel;

public class MortgageTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testApproved() {
		Rate rate1 = new Rate();
		
		rate1.setInterestRate(.05);
		
		double PMT = rate1.getPayment(360);
		
		assertTrue(rate1.Approved(PMT, 10000, 5000) == true);
	}
	
	@Test
	public void testDenied() {
		Rate rate1 = new Rate();
		
		rate1.setInterestRate(.05);
		
		double PMT = rate1.getPayment(360);
		
		assertTrue(rate1.Approved(PMT, 500, 0) == false);
	}
	
	@Test
	public void testDenied2() {
		Rate rate1 = new Rate();
		
		rate1.setInterestRate(.04);
		
		double PMT = rate1.getPayment(360);
		
		assertTrue(rate1.Approved(PMT, 10000, 50000) == false);
	}
	
	@Test
	public void testApproved2() {
		Rate rate1 = new Rate();
		
		rate1.setInterestRate(.0375);
		
		double PMT = rate1.getPayment(360);
		
		assertTrue(rate1.Approved(PMT, 20000, 5000) == true);
	}

}
