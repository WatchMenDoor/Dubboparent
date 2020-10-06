package com.bjsxt.service.impl;



import com.bjsxt.dubbo.service.DemoDubboService;
import com.bjsxt.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
/*消费者，@Service用的是Spring包下，@Reference是dubbo的注解
* */
@Service
public class DemoServiceImpl implements DemoService {

    @Reference
    private DemoDubboService demoDubboService;

    @Override
    public String showInfo(String str) {
        return this.demoDubboService.showMsg(str);
    }
}