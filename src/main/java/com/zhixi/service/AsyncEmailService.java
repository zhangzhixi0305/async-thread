package com.zhixi.service;

/**
 * @ClassName AsyncService
 * @Author zhangzhixi
 * @Description 发送短信业务
 * @Date 2022-3-29 20:08
 * @Version 1.0
 */
public interface AsyncEmailService {
    /**
     * 发送短信
     */
    void executeAsync();
}