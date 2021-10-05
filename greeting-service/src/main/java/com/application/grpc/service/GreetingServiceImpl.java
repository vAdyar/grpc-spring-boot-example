package com.application.grpc.service;

import com.application.grpc.GreetingRequest;
import com.application.grpc.GreetingResponse;
import com.application.grpc.GreetingServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {

    @Override
    public void greeting(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        String message = request.getMessage();

        System.out.println("Received message: "+message);

        GreetingResponse greetingResponse = GreetingResponse.newBuilder()
                .setMessage("Received request:" + message + " Hello from the server.")
                .build();

        responseObserver.onNext(greetingResponse);
        responseObserver.onCompleted();
    }
}
