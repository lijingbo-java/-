package com.example.demo.web;


import com.example.demo.entity.Info;
import com.example.demo.service.IInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 学生信息表 前端控制器
 * </p>
 *
 * @author Mht
 * @since 2019-11-16
 */
@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private IInfoService iInfoService;

    @RequestMapping("/test")
    public Info se(Integer id){
        return iInfoService.selectById(id);
    }


}
