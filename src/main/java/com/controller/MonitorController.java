package com.controller;

import com.monitor.monitor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by caosh on 2017/4/13.
 */

@Controller
@RequestMapping
public class MonitorController {

    private monitor monitor;

    @RequestMapping("/systemStatus")
    public boolean getSystemStatus(){
        monitor = new monitor();
        return monitor.monitor();
    }
}
