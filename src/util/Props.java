package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;

public class Props {

	
	public static void Log4jConfigurator() {
		Properties props = new Properties();
	
			try {
				props.load(new FileInputStream("src/util/log4j.properties"));
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		PropertyConfigurator.configure(props);
	}
	
	public static Properties getProps(){
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("C:/NovelVox/nad-server/webapps/ROOT/WEB-INF/conf/atws.properties"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return props;
	}
	
}
