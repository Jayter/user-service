package com.eugenet.user.service.api;

import com.eugenet.user.service.domain.User;

import feign.Headers;
import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "user-endpoint", url = "${user-service.facade-url}/user")
public interface UserEndpoint {

    @Headers("tenant: {}")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<User> getAllUsers(@RequestHeader("tenant") String language);
}
