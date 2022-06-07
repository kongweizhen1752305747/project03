package com.situ.project03.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author kwz
 * @since 2022-06-06
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @RequestMapping("/index")
    public String page1(){
        return "menu";
    }
}
