package tests;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumserverAutoStart {

	public static String NodeExePath = "C:\\Program Files\\nodejs\\node.exe";
	public static String Appiumjspath = "C:\\Users\\faraz\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
    protected static AppiumServiceBuilder appbuilder;
    protected static AppiumDriverLocalService service;
    public static String ServerAddress = "127.0.0.1";
    
    
    public static void startAppiumServer() {

    	appbuilder =  new AppiumServiceBuilder();
    	appbuilder.usingDriverExecutable(new File(NodeExePath));
    	appbuilder.withAppiumJS(new File(Appiumjspath));
    	appbuilder.withIPAddress(ServerAddress);
    	appbuilder.usingPort(4723);
    	appbuilder.withArgument(GeneralServerFlag.LOG_LEVEL, "info");
    	appbuilder.withLogFile(new File(System.getProperty("user.dir")+"\\AppiumLogs\\applogs.txt"));
    	service = AppiumDriverLocalService.buildService(appbuilder);
    	service.start();

    
	
}
}
