package com.monitor;

import java.io.IOException;
import java.net.InetAddress;

/**
 * Created by caosh on 2017/4/12.
 */
public class monitor {

    SolveException systemException = new SystemException();
    SolveException dataException = new DataException();

    final long interval = 600000; //10min
    final int timeOut = 10000;
    final String ipAddress = "127.0.0.0";

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
                        }

                        dataException.solve();

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
