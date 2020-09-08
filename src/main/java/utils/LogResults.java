package utils;

import org.apache.log4j.Logger;

public class LogResults {

    /* Get the class name to be printed on */
    static Logger log = Logger.getLogger(LogResults.class.getName());

    public  void info(String message) {
        //log.debug("Hello this is a debug message");
        log.info(message);
    }
}
