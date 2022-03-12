package A4_LogTest;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

	public static Logger log= LoggerFactory.getLogger(LogTest.class);
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("C:\\vcentryBatch205\\B1_FileHandling\\src\\logTest\\log4j.properties");
		log.info("info1"); // syso
		log.error("error1");
		log.info("info2");
		log.error("error2");
		
	}

}
