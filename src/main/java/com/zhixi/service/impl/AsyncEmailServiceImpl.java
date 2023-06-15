package com.zhixi.service.impl;

import com.zhixi.service.AsyncEmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
 
import java.util.concurrent.TimeUnit;
 
/**
 * @ClassName AsyncServiceImpl
 * @Author zhangzhixi
 * @Description
 * @Date 2022-3-29 20:08
 * @Version 1.0
 */
@Service
public class AsyncEmailServiceImpl implements AsyncEmailService {
 
    private static final Logger logger = LoggerFactory.getLogger(AsyncEmailServiceImpl.class);

    /**
     * 指定异步操作的目标执行器，不指定则使用默认的执行器
     */
    @Override
    @Async("taskExecutor")
    public void executeAsync() {
        logger.info("发送短信事件开始执行~");
        logger.info("发送短信中……");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("发送短信事件执行完毕");
    }
}