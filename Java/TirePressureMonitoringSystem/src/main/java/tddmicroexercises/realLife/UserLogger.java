package tddmicroexercises.realLife;

public class UserLogger {

	static {
		System.err.println("JMSService:::Connecting to 192.168.5.47...");
		System.err.println("JMSService:::Initializing the world");
		System.err.println("JMSService:::...");
	}

	public static void info(String string) {
		System.out.println("INFO-" + string);
	}

}
