package com.bjsxt.dubbo.service.impl;



import com.bjsxt.dubbo.service.DemoDubboService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class DemoDubboServiceImpl implements DemoDubboService {
        @Override
        public String showMsg(String str) {
            return "Hello Dubbo "+str;
        }
}