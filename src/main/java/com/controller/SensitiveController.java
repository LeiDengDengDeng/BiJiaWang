package com.controller;

import com.repository.SensitiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by luoxuechun on 2017/4/13.
 */
@Controller
@RequestMapping
public class SensitiveController {

    @Autowired
    SensitiveRepository sensitiveRepository;

}
