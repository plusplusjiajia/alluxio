// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

public interface LongColumnStatsDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.table.LongColumnStatsData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 low_value = 1;</code>
   */
  boolean hasLowValue();
  /**
   * <code>optional int64 low_value = 1;</code>
   */
  long getLowValue();

  /**
   * <code>optional int64 high_value = 2;</code>
   */
  boolean hasHighValue();
  /**
   * <code>optional int64 high_value = 2;</code>
   */
  long getHighValue();

  /**
   * <code>optional int64 num_nulls = 3;</code>
   */
  boolean hasNumNulls();
  /**
   * <code>optional int64 num_nulls = 3;</code>
   */
  long getNumNulls();

  /**
   * <code>optional int64 num_distincts = 4;</code>
   */
  boolean hasNumDistincts();
  /**
   * <code>optional int64 num_distincts = 4;</code>
   */
  long getNumDistincts();

  /**
   * <code>optional string bit_vectors = 5;</code>
   */
  boolean hasBitVectors();
  /**
   * <code>optional string bit_vectors = 5;</code>
   */
  java.lang.String getBitVectors();
  /**
   * <code>optional string bit_vectors = 5;</code>
   */
  com.google.protobuf.ByteString
      getBitVectorsBytes();
}
