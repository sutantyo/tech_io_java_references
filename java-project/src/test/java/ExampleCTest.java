import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExampleCTest {
	private ExampleC example;
	@Before
	public void init() {
		example = new ExampleC();
	}

  @Test
  public void testMain(){
    example.main(null);
  }
}
