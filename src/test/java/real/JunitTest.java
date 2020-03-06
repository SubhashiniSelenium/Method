package real;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitTest {
	
	@Test
	public void before() {
		System.out.println("B");
	}
	
	@Before
	public void beforem() {
		System.out.println("BM");
	}
	
	@After
	public void afterm() {
		System.out.println("AM");
	}
	
	@Test
	public void after() {
		System.out.println("A");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("AC");
	}
	@BeforeClass
	public static void beforeclass() {
		System.out.println("BC");
	}


}
