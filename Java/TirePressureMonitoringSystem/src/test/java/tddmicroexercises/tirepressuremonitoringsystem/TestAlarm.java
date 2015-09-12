package tddmicroexercises.tirepressuremonitoringsystem;


import org.junit.*;
import static org.assertj.core.api.Assertions.*;

public class TestAlarm {

    @Test
    public void alarm_should_be_off_with_18() {
    	//GIVEN
        Alarm alarm = systemUnderTest();
        boolean expected = false;
        
        //WHEN
        alarm.check();
        
		//THEN
        assertThat(alarm.isAlarmOn()).isEqualTo(expected);
    }

	private Alarm systemUnderTest() {
		return new Alarm() {
			@Override
			protected double readPressure() {
				return 18;
			}
		};
	}
}
