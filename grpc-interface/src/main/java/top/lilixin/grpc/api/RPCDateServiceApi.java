// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpcdataservice.proto

package top.lilixin.grpc.api;

public final class RPCDateServiceApi {
  private RPCDateServiceApi() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_top_lilixin_grpc_api_RPCDateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_top_lilixin_grpc_api_RPCDateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_top_lilixin_grpc_api_RPCDateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_top_lilixin_grpc_api_RPCDateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024rpcdataservice.proto\022\024top.lilixin.grpc" +
      ".api\"\"\n\016RPCDateRequest\022\020\n\010userName\030\001 \001(\t" +
      "\"%\n\017RPCDateResponse\022\022\n\nserverDate\030\001 \001(\t2" +
      "j\n\016RPCDateService\022X\n\007getDate\022$.top.lilix" +
      "in.grpc.api.RPCDateRequest\032%.top.lilixin" +
      ".grpc.api.RPCDateResponse\"\000B+\n\024top.lilix" +
      "in.grpc.apiB\021RPCDateServiceApiP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_top_lilixin_grpc_api_RPCDateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_top_lilixin_grpc_api_RPCDateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_top_lilixin_grpc_api_RPCDateRequest_descriptor,
        new java.lang.String[] { "UserName", });
    internal_static_top_lilixin_grpc_api_RPCDateResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_top_lilixin_grpc_api_RPCDateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_top_lilixin_grpc_api_RPCDateResponse_descriptor,
        new java.lang.String[] { "ServerDate", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
