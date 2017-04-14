package monitor;

import java.io.IOException;
import java.net.InetAddress;

/**
 * Created by caosh on 2017/4/12.
 */
public class monitor {

    SolveException systemException = new SystemException();

    private final long interval = 600000; //10min
    private final int timeOut = 10000;
    private final String ipAddress = "127.0.0.0";

    public void monitor(){

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("running-----------");
                    //检测服务器故障
                    try {
                        if(!InetAddress.getByName(ipAddress).isReachable(timeOut)){
                            systemException.solve();
                            System.out.println("error!!!!!!!!!");
                        }
                        System.out.println("success.............");
                        try {
                            Thread.sleep(interval);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
