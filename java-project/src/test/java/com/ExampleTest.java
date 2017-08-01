import static org.junit.Assert.assertEquals;
public class ExampleTest {
	private Example example;
	@Before
	public void init() {
		example = new Example();
	}

	@Test
	public void testSum(){
		int a = 23487;
		int b = 240587;
		assertEquals(example.sum(a, b), a + b);
	}
}
