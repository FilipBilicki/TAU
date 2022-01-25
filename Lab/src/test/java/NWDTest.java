import static org.junit.Assert.*;

import org.junit.*;

public class NWDTest {
	private NWD nwd;
	
	@Before
	public void setUp(){
		nwd = new NWD();
		System.out.println("Before");
	}
	
	@After
	public void tearDown(){
		nwd = null;
		System.out.println("After");
	}
	
	@Test
	public void testNwd() {
		int result = nwd.NWD(4,2);
		assertEquals(2,result);
		System.out.println("Test1");
	}
	
	
	@Test
	public void testNwd2() {
		int result = nwd.NWD(40,20);
		assertEquals(20,result);
		System.out.println("Test2");
	}
    @Test
	public void testNwd3() {
		int result = nwd.NWD(40,20);
		assertNotEquals(4,result);
		System.out.println("Test3");
	}
	@Test
	public void testNwd4() {
		int result = nwd.NWD(40,20);
		assertNotNull(result);
		System.out.println("Test4");
	}
	@Test
	public void testNwd5() {
		int result = nwd.NWD(40,20);
		assertNotSame(4,result);
		System.out.println("Test5");
	}
	@Test
	public void testNwd6() {
		int result = nwd.NWD(40,20);
		assertSame(20,result);
		System.out.println("Test6");
	}
	@Test
	public void testNwd7() {
		int result = nwd.NWD(40,20);
		assertTrue(result==20);
		System.out.println("Test7");
	}
	@Test
	public void testNwd8() {
		int result = nwd.NWD(40,20);
		assertFalse(result!=20);
		System.out.println("Test8");
	}

	@Test
	public void testNwd9() {
		Object result = null;
		assertNull(result);
		System.out.println("Test9");
	}

	@Test
	public void testNwd10() {
		assertFalse(11==20);
		System.out.println("Test10");
	}

	@Test
	public void testNwd11() {
		assertFalse(2*80<20);
		System.out.println("Test11");
	}

	@Test
	public void testNwd12() {
		assertTrue(14!=20);
		System.out.println("Test12");
	}

}
