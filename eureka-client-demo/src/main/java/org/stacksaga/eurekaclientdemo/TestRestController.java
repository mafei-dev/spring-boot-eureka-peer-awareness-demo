package org.stacksaga.eurekaclientdemo;

import com.netflix.appinfo.DataCenterInfo;
import com.netflix.discovery.EurekaClient;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
public class TestRestController {
    private final RestTemplate restTemplate;
    private final EurekaClient eurekaClient;


    @GetMapping("/hello")
    public Object hello(HttpServletRequest httpServletRequest) {
        Map<String, String> data = new HashMap<>();
        DataCenterInfo.Name name = eurekaClient.getApplicationInfoManager().getInfo().getDataCenterInfo().getName();
        data.put("data", httpServletRequest.getRemoteHost());
        data.put("LocalPort", String.valueOf(httpServletRequest.getLocalPort()));
        data.put("DataCenterInfoName", name.name());
        data.put("InstanceId", eurekaClient.getApplicationInfoManager().getInfo().getInstanceId());
        return data;
    }


    @GetMapping("/test")
    public Object test() {
        return this.restTemplate.getForEntity("//demo-client/hello", Object.class);
    }

    @GetMapping("/test1")
    public Object test1() {
        return this.restTemplate.getForEntity("//sample-service-zone1/hello", String.class);
    }

}
