package tddmicroexercises.realLife;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class IndexValueComputerTest {

	@Test
	public void test() {
		//GIVEN
		double expected = 2.;
		double value1 = 1;
		double value2 = 1;
		IndexValueComputer computer = new IndexValueComputer();
		
		//WHEN
		double result = computer.compute(value1, value2);
		
		//THEN
		assertThat(result).isEqualByComparingTo(expected);
	}

}
