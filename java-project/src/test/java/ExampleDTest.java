import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExampleDTest {
	private ExampleD example;
	@Before
	public void init() {
		example = new ExampleD();
	}

  @Test
  public void testMain(){
    example.main(null);
  }
}
