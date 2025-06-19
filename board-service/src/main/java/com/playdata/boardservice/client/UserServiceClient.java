package com.playdata.boardservice.client;

import com.playdata.boardservice.common.dto.CommonResDto;
import com.playdata.boardservice.common.dto.ProductClientDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(name = "user-service")
public interface UserServiceClient {

    @PostMapping("/user/userInfo")
    String getUserInfo(@RequestBody Map<String, String> map);
}
