package com.bijiawang.service.LogModel;

import java.io.IOException;
import java.util.logging.*;

/**
 * Created by disinuo on 17/3/26.
 */
public class ErrorLogger {
    private final static String actionLogSrc="/Users/disinuo/Downloads/errorLog.txt";

    public static void log(String actionId,Exception exception){
        Logger log = Logger.getLogger("lavasoft");
        log.setLevel(Level.ALL);

        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler(actionLogSrc ,10000,11,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileHandler.setLevel(Level.ALL);
        fileHandler.setFormatter(new MyLogHander());
        log.addHandler(fileHandler);
        log.info(ErrorCode.ERROR_CODE_100.toCode()+" "+actionId+": "+exception.getLocalizedMessage());
    }


}
