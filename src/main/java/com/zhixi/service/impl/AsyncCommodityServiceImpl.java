package com.zhixi.service.impl;

import com.zhixi.service.AsyncCommodityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
 
import java.util.concurrent.TimeUnit;
 
/**
 * @ClassName AsyncCommodityServiceImpl
 * @Author zhangzhixi
 * @Description
 * @Date 2022-3-29 20:46
 * @Version 1.0
 */
@Service
public class AsyncCommodityServiceImpl implements AsyncCommodityService {
 
    private static final Logger logger = LoggerFactory.getLogger(AsyncCommodityServiceImpl.class);

    /**
     * 指定异步操作的目标执行器，不指定则使用默认的执行器
     */
    @Async("taskExecutor")
    @Override
    public void expressDelivery() {
        logger.info("发送快递事件开始执行~");
        logger.info("发送快递中……");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("发送快递事件执行完毕");
    }
}