package com.situ.project03.controller;


import com.situ.project03.service.IUserService;
import com.situ.project03.vo.LayuiListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/index")
    public String page1(){
        System.out.println("成功*****************");
        return "user";
    }
    @ResponseBody
    @GetMapping("/list")
    public LayuiListVO list(Integer page, Integer limit){
        LayuiListVO vo = userService.select(page, limit);
        return vo;
    }
}
