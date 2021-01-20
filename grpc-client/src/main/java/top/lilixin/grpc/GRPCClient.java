package top.lilixin.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import top.lilixin.grpc.api.RPCDateRequest;
import top.lilixin.grpc.api.RPCDateResponse;
import top.lilixin.grpc.api.RPCDateServiceGrpc;

import java.util.logging.Logger;

/**
 * @Description grpc 客户端
 * @Author lilixin
 * @Date 2021/1/20 5:58 下午
 **/
public class GRPCClient {
    private static final Logger logger = Logger.getLogger(GRPCClient.class.getName());
    private static final String host = "127.0.0.1";
    private static final int serverPort = 9999;

    public static void main(String[] args) {
        // 1. 拿到一个通信的channel
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(host, serverPort)
                .usePlaintext()
                .build();
        try {
            // 2.拿到对象
            RPCDateServiceGrpc.RPCDateServiceBlockingStub rpcDateService = RPCDateServiceGrpc.newBlockingStub(channel);
            RPCDateRequest rpcDateRequest = RPCDateRequest
                    .newBuilder()
                    .setUserName("lilixin")
                    .build();
            // 3. 请求
            RPCDateResponse date = rpcDateService.getDate(rpcDateRequest);
            // 4. 输出结果
            logger.info("响应结果="+date.getServerDate());
        }finally {
            // 5.关闭channel, 释放资源.
            channel.shutdown();
        }
    }
}
