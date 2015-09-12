package tddmicroexercises.tirepressuremonitoringsystem;

public class Alarm
{
    private final double LowPressureTreshold = 17;
    private final double HighPressureTreshold = 21;

    final ISensor sensor;
    boolean alarmOn = false;

    public Alarm(ISensor sensor) {
		this.sensor = sensor;
	}

	public Alarm() {
		this(new Sensor());
	}

    public void check()
    {
        double psiPressureValue = readPressure();

        if (psiPressureValue < LowPressureTreshold || HighPressureTreshold < psiPressureValue)
        {
            alarmOn = true;
        }
    }

	private double readPressure() {
		return sensor.popNextPressurePsiValue();
	}

    public boolean isAlarmOn()
    {
        return alarmOn; 
    }
}
