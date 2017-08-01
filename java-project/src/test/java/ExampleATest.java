import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExampleATest {
	private ExampleA example;
	@Before
	public void init() {
		example = new ExampleA();
	}

  @Test
  public void testMain(){
    example.main(null);
  }
}
