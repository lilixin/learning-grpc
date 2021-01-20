package top.lilixin.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import sun.rmi.runtime.Log;
import top.lilixin.grpc.service.RPCDateServiceImpl;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * @Description TODO
 * @Author lilixin
 * @Date 2021/1/20 5:54 下午
 **/
public class GRPCServer {
    private static final Logger logger = Logger.getLogger(GRPCServer.class.getName());

    private static final int port = 9999;

    public static void main(String[] args) {
        try {
            Server server = ServerBuilder
                    .forPort(port)
                    .addService(new RPCDateServiceImpl())
                    .build().start();

            logger.info("GRpc服务端启动成功 port="+port);

            server.awaitTermination();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
