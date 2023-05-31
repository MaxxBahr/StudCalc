import static org.junit.jupiter.api.Assertions.*;
import operations.StandardCalc;
import org.junit.jupiter.api.Test;

class testStandop {

	@Test
	void test() {
		StandardCalc stat = new StandardCalc();
		stat.bruchtodec("3/4");
	}

}
