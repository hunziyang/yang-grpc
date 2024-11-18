package com.yang.grpc.controller;

import com.yang.grpc.common.orderService.OrderRequest;
import com.yang.grpc.common.orderService.OrderServiceImplGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class OrderController {

    @GrpcClient("yang")
    private OrderServiceImplGrpc.OrderServiceImplBlockingStub orderService;

    @GetMapping
    public String test() {
        return orderService.orderDetail(OrderRequest.newBuilder().setName("yang").build()).getMessage();
    }
}
