package com.situ.project03.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 角色名称 前端控制器
 * </p>
 *
 * @author kwz
 * @since 2022-06-06
 */
@Controller
@RequestMapping("/role")
public class RoleController {
    @GetMapping("/index")
    public String page1(){
        return "role";
    }
}
