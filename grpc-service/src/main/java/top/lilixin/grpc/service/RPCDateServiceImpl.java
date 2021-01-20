package top.lilixin.grpc.service;

import io.grpc.stub.StreamObserver;
import top.lilixin.grpc.api.RPCDateRequest;
import top.lilixin.grpc.api.RPCDateResponse;
import top.lilixin.grpc.api.RPCDateServiceGrpc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

/**
 * @Description 服务实现类
 * @Author lilixin
 * @Date 2021/1/20 5:32 下午
 **/
public class RPCDateServiceImpl extends RPCDateServiceGrpc.RPCDateServiceImplBase{
    private static final Logger logger = Logger.getLogger(RPCDateServiceImpl.class.getName());

    @Override
    public void getDate(RPCDateRequest request, StreamObserver<RPCDateResponse> responseObserver) {
        //定义请求结果
        RPCDateResponse rpcDateResponse = null;
        String userName = request.getUserName();
        String response = "hello " + userName + "！ today is " + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        logger.info("服务端收到请求 参数="+userName);
        //定义响应
        try {
            rpcDateResponse = RPCDateResponse
                    .newBuilder()
                    .setServerDate(response)
                    .build();
        } catch (Exception e) {
            responseObserver.onError(e);
        }finally {
            responseObserver.onNext(rpcDateResponse);
        }

        responseObserver.onCompleted();
        logger.info("服务端处理请求 完成 参数="+userName);
    }
}
