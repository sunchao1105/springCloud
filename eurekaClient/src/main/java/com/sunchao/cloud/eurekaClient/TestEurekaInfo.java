package com.sunchao.cloud.eurekaClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEurekaInfo {
    @Autowired
    private Registration registration;

    @RequestMapping("findInstances")
    public void test () {
        System.out.println("serviceId:" + registration.getServiceId() + "  host:" + registration.getHost() + "  port:" + registration.getPort());
    }

}
