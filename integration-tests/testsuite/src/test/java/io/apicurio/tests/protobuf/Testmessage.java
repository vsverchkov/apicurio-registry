// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: integration-tests/testsuite/src/test/resources/serdes/testmessage.proto

package io.apicurio.tests.protobuf;

public final class Testmessage {
  private Testmessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_apicurio_tests_protobuf_ProtobufTestMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_apicurio_tests_protobuf_ProtobufTestMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_apicurio_tests_protobuf_Header_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_apicurio_tests_protobuf_Header_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_apicurio_tests_protobuf_Point_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_apicurio_tests_protobuf_Point_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGintegration-tests/testsuite/src/test/r" +
      "esources/serdes/testmessage.proto\022\032io.ap" +
      "icurio.tests.protobuf\032\037google/protobuf/t" +
      "imestamp.proto\"\334\001\n\023ProtobufTestMessage\0222" +
      "\n\006header\030\001 \001(\0132\".io.apicurio.tests.proto" +
      "buf.Header\022\n\n\002d1\030\002 \001(\001\022\n\n\002s1\030\004 \001(\t\022\n\n\002i1" +
      "\030\007 \001(\005\022\013\n\003bi1\030\014 \001(\003\022.\n\nstate_time\030\026 \001(\0132" +
      "\032.google.protobuf.Timestamp\0220\n\005point\030\036 \001" +
      "(\0132!.io.apicurio.tests.protobuf.Point\"\251\001" +
      "\n\006Header\022(\n\004time\030\001 \001(\0132\032.google.protobuf" +
      ".Timestamp\022\016\n\006source\030\002 \001(\t\022\023\n\013destinatio" +
      "n\030\003 \001(\t\022\014\n\004uuid\030\004 \001(\t\022\024\n\014source_uuids\030\005 " +
      "\003(\t\022\027\n\017message_type_id\030\006 \001(\t\022\023\n\013raw_mess" +
      "age\030\007 \001(\t\"{\n\005Point\022\023\n\tlongitude\030\001 \001(\001H\000\022" +
      "\022\n\010latitude\030\002 \001(\001H\001\022\022\n\010altitude\030\003 \001(\001H\002B" +
      "\021\n\017longitude_oneofB\020\n\016latitude_oneofB\020\n\016" +
      "altitude_oneofB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_io_apicurio_tests_protobuf_ProtobufTestMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_apicurio_tests_protobuf_ProtobufTestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_apicurio_tests_protobuf_ProtobufTestMessage_descriptor,
        new java.lang.String[] { "Header", "D1", "S1", "I1", "Bi1", "StateTime", "Point", });
    internal_static_io_apicurio_tests_protobuf_Header_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_io_apicurio_tests_protobuf_Header_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_apicurio_tests_protobuf_Header_descriptor,
        new java.lang.String[] { "Time", "Source", "Destination", "Uuid", "SourceUuids", "MessageTypeId", "RawMessage", });
    internal_static_io_apicurio_tests_protobuf_Point_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_io_apicurio_tests_protobuf_Point_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_apicurio_tests_protobuf_Point_descriptor,
        new java.lang.String[] { "Longitude", "Latitude", "Altitude", "LongitudeOneof", "LatitudeOneof", "AltitudeOneof", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
