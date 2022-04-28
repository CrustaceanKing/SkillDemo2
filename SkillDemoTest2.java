import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class SkillDemoTest2{

    private SkillDemo2 bruh;

	@Before
	public void setUp(){
		bruh = new SkillDemo2();
	}


    @Test
    public void add() {
	    assertEquals(5, 2+3);
    }

    @Test
	public void addition() {
		bruh.addI(5);
		assertEquals(5, bruh.getI());
	}
 

}
