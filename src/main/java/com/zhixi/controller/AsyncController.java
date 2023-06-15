package com.zhixi.controller;

import com.zhixi.service.AsyncCommodityService;
import com.zhixi.service.AsyncEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
/**
 * @ClassName MyController
 * @Author zhangzhixi
 * @Description
 * @Date 2022-3-29 20:27
 * @Version 1.0
 */
@RestController
public class AsyncController {
 
    @Autowired
    private AsyncEmailService emailService;
 
    @Autowired
    private AsyncCommodityService commodityService;
 
    @RequestMapping(value = "/async")
    public void async() {
        /*寄快递业务方法*/
        commodityService.expressDelivery();
        /*发送短信业务方法*/
        emailService.executeAsync();
    }
}