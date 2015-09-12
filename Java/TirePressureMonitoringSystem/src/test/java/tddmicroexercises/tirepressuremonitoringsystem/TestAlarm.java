package tddmicroexercises.tirepressuremonitoringsystem;


import org.junit.*;
import static org.assertj.core.api.Assertions.*;

public class TestAlarm {

    private final class ISensorDouble implements ISensor {
		private final int valueToReturn;

		private ISensorDouble(int valueToReturn) {
			this.valueToReturn = valueToReturn;
		}

		public double popNextPressurePsiValue() {
			return valueToReturn;
		}
	}

	private static final int LOW_VALUE = 15;
    private static final int HIGH_VALUE = 22;
	private static final int NORMAL_VALUE = 18;
	
	@Test
    public void alarm_should_be_off_with_18() {
    	//GIVEN
        Alarm alarm = systemUnderTestWithValue(NORMAL_VALUE);
        boolean expected = false;
        
        //WHEN
        alarm.check();
        
		//THEN
        assertThat(alarm.isAlarmOn()).isEqualTo(expected);
    }

    @Test
    public void alarm_should_be_on_with_15() {
    	//GIVEN
    	Alarm alarm = systemUnderTestWithValue(LOW_VALUE);
    	boolean expected = true;
    	
    	//WHEN
    	alarm.check();
    	
    	//THEN
    	assertThat(alarm.isAlarmOn()).isEqualTo(expected);
    }
    
    @Test
    public void alarm_should_be_on_with_21() {
    	//GIVEN
    	Alarm alarm = systemUnderTestWithValue(HIGH_VALUE);
    	boolean expected = true;
    	
    	//WHEN
    	alarm.check();
    	
    	//THEN
    	assertThat(alarm.isAlarmOn()).isEqualTo(expected);
    }

	private Alarm systemUnderTestWithValue(final int valueToReturn) {
		return new Alarm(new ISensorDouble(valueToReturn));
	}
}
