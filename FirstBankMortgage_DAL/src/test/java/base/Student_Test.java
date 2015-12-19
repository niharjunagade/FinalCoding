package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.RateDomainModel;

public class Student_Test {

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
	public void test() {
		RateDAL rate1 = new RateDAL();
		RateDomainModel ratedm1 = new RateDomainModel();
		
		ratedm1.setInterestRate(.0375);
		
		assertTrue(rate1.getRate(750) == ratedm1.getInterestRate());
	}
		@Test
		public void test1() {
			RateDAL rate1 = new RateDAL();
			RateDomainModel ratedm1 = new RateDomainModel();
			
			ratedm1.setInterestRate(.04);
			
			assertTrue(rate1.getRate(700) == ratedm1.getInterestRate());
	}
		@Test
		public void test2() {
			RateDAL rate1 = new RateDAL();
			RateDomainModel ratedm1 = new RateDomainModel();
			
			ratedm1.setInterestRate(.045);
			
			assertTrue(rate1.getRate(650) == ratedm1.getInterestRate());
	}
		@Test
		public void test3() {
			RateDAL rate1 = new RateDAL();
			RateDomainModel ratedm1 = new RateDomainModel();
			
			ratedm1.setInterestRate(.05);
			
			assertTrue(rate1.getRate(600) == ratedm1.getInterestRate());
		}
}
