package tddmicroexercises.tirepressuremonitoringsystem;

import org.assertj.core.util.VisibleForTesting;

public class Alarm
{
    private final double LowPressureTreshold = 17;
    private final double HighPressureTreshold = 21;

    Sensor sensor = new Sensor();

    boolean alarmOn = false;

    public void check()
    {
        double psiPressureValue = readPressure();

        if (psiPressureValue < LowPressureTreshold || HighPressureTreshold < psiPressureValue)
        {
            alarmOn = true;
        }
    }

    @VisibleForTesting
	protected double readPressure() {
		return sensor.popNextPressurePsiValue();
	}

    public boolean isAlarmOn()
    {
        return alarmOn; 
    }
}
