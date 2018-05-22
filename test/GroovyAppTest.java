import groovy.util.GroovyTestCase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroovyAppTest extends GroovyTestCase {

  private GroovyApp app;

  @BeforeTest
  public void setup() {
    app = new GroovyApp();
  }

  @Test
  public void testHello() {
    app.hello();
  }
}