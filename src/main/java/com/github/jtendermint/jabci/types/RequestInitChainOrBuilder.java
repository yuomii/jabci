// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

public interface RequestInitChainOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.github.jtendermint.jabci.types.RequestInitChain)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 1;</code>
   */
  java.util.List<com.github.jtendermint.jabci.types.Validator> 
      getValidatorsList();
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 1;</code>
   */
  com.github.jtendermint.jabci.types.Validator getValidators(int index);
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 1;</code>
   */
  int getValidatorsCount();
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 1;</code>
   */
  java.util.List<? extends com.github.jtendermint.jabci.types.ValidatorOrBuilder> 
      getValidatorsOrBuilderList();
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 1;</code>
   */
  com.github.jtendermint.jabci.types.ValidatorOrBuilder getValidatorsOrBuilder(
          int index);

  /**
   * <code>optional bytes app_state_bytes = 2;</code>
   */
  com.google.protobuf.ByteString getAppStateBytes();
}
