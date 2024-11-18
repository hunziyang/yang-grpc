package com.yang.grpc.common.orderService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: orderService.proto")
public final class OrderServiceImplGrpc {

  private OrderServiceImplGrpc() {}

  public static final String SERVICE_NAME = "OrderServiceImpl";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.yang.grpc.common.orderService.OrderRequest,
      com.yang.grpc.common.orderService.OrderResponse> getOrderDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "orderDetail",
      requestType = com.yang.grpc.common.orderService.OrderRequest.class,
      responseType = com.yang.grpc.common.orderService.OrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yang.grpc.common.orderService.OrderRequest,
      com.yang.grpc.common.orderService.OrderResponse> getOrderDetailMethod() {
    io.grpc.MethodDescriptor<com.yang.grpc.common.orderService.OrderRequest, com.yang.grpc.common.orderService.OrderResponse> getOrderDetailMethod;
    if ((getOrderDetailMethod = OrderServiceImplGrpc.getOrderDetailMethod) == null) {
      synchronized (OrderServiceImplGrpc.class) {
        if ((getOrderDetailMethod = OrderServiceImplGrpc.getOrderDetailMethod) == null) {
          OrderServiceImplGrpc.getOrderDetailMethod = getOrderDetailMethod =
              io.grpc.MethodDescriptor.<com.yang.grpc.common.orderService.OrderRequest, com.yang.grpc.common.orderService.OrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "orderDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yang.grpc.common.orderService.OrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yang.grpc.common.orderService.OrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceImplMethodDescriptorSupplier("orderDetail"))
              .build();
        }
      }
    }
    return getOrderDetailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderServiceImplStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceImplStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceImplStub>() {
        @java.lang.Override
        public OrderServiceImplStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceImplStub(channel, callOptions);
        }
      };
    return OrderServiceImplStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderServiceImplBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceImplBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceImplBlockingStub>() {
        @java.lang.Override
        public OrderServiceImplBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceImplBlockingStub(channel, callOptions);
        }
      };
    return OrderServiceImplBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderServiceImplFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceImplFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceImplFutureStub>() {
        @java.lang.Override
        public OrderServiceImplFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceImplFutureStub(channel, callOptions);
        }
      };
    return OrderServiceImplFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OrderServiceImplImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void orderDetail(com.yang.grpc.common.orderService.OrderRequest request,
        io.grpc.stub.StreamObserver<com.yang.grpc.common.orderService.OrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOrderDetailMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOrderDetailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yang.grpc.common.orderService.OrderRequest,
                com.yang.grpc.common.orderService.OrderResponse>(
                  this, METHODID_ORDER_DETAIL)))
          .build();
    }
  }

  /**
   */
  public static final class OrderServiceImplStub extends io.grpc.stub.AbstractAsyncStub<OrderServiceImplStub> {
    private OrderServiceImplStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceImplStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceImplStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void orderDetail(com.yang.grpc.common.orderService.OrderRequest request,
        io.grpc.stub.StreamObserver<com.yang.grpc.common.orderService.OrderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOrderDetailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrderServiceImplBlockingStub extends io.grpc.stub.AbstractBlockingStub<OrderServiceImplBlockingStub> {
    private OrderServiceImplBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceImplBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceImplBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.yang.grpc.common.orderService.OrderResponse orderDetail(com.yang.grpc.common.orderService.OrderRequest request) {
      return blockingUnaryCall(
          getChannel(), getOrderDetailMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrderServiceImplFutureStub extends io.grpc.stub.AbstractFutureStub<OrderServiceImplFutureStub> {
    private OrderServiceImplFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceImplFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceImplFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yang.grpc.common.orderService.OrderResponse> orderDetail(
        com.yang.grpc.common.orderService.OrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOrderDetailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ORDER_DETAIL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderServiceImplImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderServiceImplImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ORDER_DETAIL:
          serviceImpl.orderDetail((com.yang.grpc.common.orderService.OrderRequest) request,
              (io.grpc.stub.StreamObserver<com.yang.grpc.common.orderService.OrderResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class OrderServiceImplBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderServiceImplBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.yang.grpc.common.orderService.orderService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderServiceImpl");
    }
  }

  private static final class OrderServiceImplFileDescriptorSupplier
      extends OrderServiceImplBaseDescriptorSupplier {
    OrderServiceImplFileDescriptorSupplier() {}
  }

  private static final class OrderServiceImplMethodDescriptorSupplier
      extends OrderServiceImplBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrderServiceImplMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OrderServiceImplGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderServiceImplFileDescriptorSupplier())
              .addMethod(getOrderDetailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
