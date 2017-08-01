import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExampleBTest {
	private ExampleB example;
	@Before
	public void init() {
		example = new ExampleB();
	}

  @Test
  public void testMain(){
    example.main(null);
  }
}
