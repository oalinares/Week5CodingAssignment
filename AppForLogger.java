package week5LoggerProject;



public class AppForLogger {

	static Logger logger;
	
	public static void main(String[] args) {
		
		Logger logger = new SpacedLogger();
		
		
		logger.log("Hello");
		System.out.println("");
		logger.error("Hello");
	}

}
