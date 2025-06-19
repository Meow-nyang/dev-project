package com.playdata.boardservice.client;

import com.playdata.boardservice.common.dto.CommonResDto;
import com.playdata.boardservice.common.dto.ProductClientDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-service")
public interface UserServiceClient {

    @PostMapping("/user/userInfo")
    String getUserInfo(@RequestBody String email);
}
