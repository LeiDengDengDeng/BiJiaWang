package com.bijiawang.service.LogModel;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

/**
 * Created by disinuo on 17/3/26.
 */
public class ErrorLogger {
    private final static String actionLogSrc="errorLog.txt";

    public static void log(String actionId,Exception exception){
        Logger log = Logger.getLogger("lavasoftError");
        log.setLevel(Level.ALL);

        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler(actionLogSrc ,10000,11,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileHandler.setLevel(Level.ALL);
        fileHandler.setFormatter(new ErrorCodeHandler());
        log.addHandler(fileHandler);
        log.info(ErrorCode.ERROR_CODE_100.toCode()+"");
        fileHandler.setFormatter(new ErrorLogHandler());
        log.info(actionId+"&&&"+exception.getClass()+"&&&"+exception.getLocalizedMessage());
    }

}
class ErrorCodeHandler extends Formatter{
    @Override
    public String format(LogRecord record) {
        Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String d = sd.format(date);
        return "\n["+d+"]"+"[code]"+ record.getMessage();
    }
}
class ErrorLogHandler extends Formatter {
    @Override
    public String format(LogRecord record) {
        String msg=record.getMessage();
        String[] msgs=msg.split("&&&");
        return " [id]" + msgs[0]+" [type]"+msgs[1]+" [content]"+msgs[2];
    }
}
