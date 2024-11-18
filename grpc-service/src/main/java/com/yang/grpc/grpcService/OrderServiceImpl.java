package com.yang.grpc.grpcService;

import com.yang.grpc.common.orderService.OrderRequest;
import com.yang.grpc.common.orderService.OrderResponse;
import com.yang.grpc.common.orderService.OrderServiceImplGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class OrderServiceImpl extends OrderServiceImplGrpc.OrderServiceImplImplBase {

    @Override
    public void orderDetail(OrderRequest request, StreamObserver<OrderResponse> responseObserver) {
        responseObserver.onNext(OrderResponse.newBuilder().setMessage("Yang 的订单").build());
        responseObserver.onCompleted();
    }
}
