package com.bijiawang.service.LogModel;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.logging.*;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
/**
 * Created by disinuo on 17/3/25.
 */
public class ActionLogger {
    public static void main(String[] args){
        ActionLogger.logAfter("try~~~");
    }
    private final static String actionLogSrc="actionLog.txt";
    private static boolean testMode=true;
    static {
        try {
            File f = new File("mode.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(f);
            String mode= doc.getElementsByTagName("test").item(0).getFirstChild().getNodeValue();
            testMode=mode.equals("true")?true:false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void logAfter(String actionId){
        if(!testMode) return;
        logBefore(actionId,null);
    }
    /**
     *
     * @param actionId
     * @param args
     */
    public static void logBefore(String actionId, Map args){
        if(!testMode) return;
        System.out.print("Logging Action!");
        /**
         *
         * public FileHandler(String pattern,
         *                  int limit,
         *                  int count,
         *                  boolean append)
         *           throws IOException,
         *  SecurityException初始化要写入文件集的 FileHandler（使用可选的 append）。
         *  已向某个文件写入给定限制的数据量（近似）后，则打开另一个文件。输出将在计数文件集中进行循环。
         *  根据 LogManager 属性（或其默认值）来配置 FileHandler（给定的模式参数用作文件名模式的情况除外），
         *  将文件限制设置为限制参数，将文件计数设置为给定的计数参数，将 append 模式设置为给定的 append 参数。
         *
         *  计数必须至少为 1。
         *  参数：
         * pattern - 为输出文件命名的模式。
         * limit - 写入到任何一个文件的最大字节数。
         * count - 要使用的文件数。
         * append - 指定 append 模式。
         *
         */
        Logger log = Logger.getLogger("lavasoft");
        log.setLevel(Level.ALL);
        Logger log2 = Logger.getLogger("lavasoft.blog");
//            log2.setLevel(Level.WARNING);

        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler(actionLogSrc ,10000,11,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileHandler.setLevel(Level.ALL);
        fileHandler.setFormatter(new MyLogHander());
        log.addHandler(fileHandler);
        log.info(actionId);
        if(args!=null&&!args.isEmpty()){
            log.info(args.toString());
        }
    }

}
class MyLogHander extends Formatter {
    @Override
    public String format(LogRecord record) {
        Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String d = sd.format(date);
        return "[" + d + "]"  + "[" +record.getLevel() + "]" + record.getClass() + " :" + record.getMessage()+"\n";
    }
}