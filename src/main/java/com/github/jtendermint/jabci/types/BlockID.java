// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

/**
 * Protobuf type {@code com.github.jtendermint.jabci.types.BlockID}
 */
public  final class BlockID extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.jtendermint.jabci.types.BlockID)
    BlockIDOrBuilder {
  // Use BlockID.newBuilder() to construct.
  private BlockID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlockID() {
    hash_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private BlockID(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {

            hash_ = input.readBytes();
            break;
          }
          case 18: {
            com.github.jtendermint.jabci.types.PartSetHeader.Builder subBuilder = null;
            if (parts_ != null) {
              subBuilder = parts_.toBuilder();
            }
            parts_ = input.readMessage(com.github.jtendermint.jabci.types.PartSetHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(parts_);
              parts_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_BlockID_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_BlockID_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BlockID.class, Builder.class);
  }

  public static final int HASH_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString hash_;
  /**
   * <code>optional bytes hash = 1;</code>
   */
  public com.google.protobuf.ByteString getHash() {
    return hash_;
  }

  public static final int PARTS_FIELD_NUMBER = 2;
  private com.github.jtendermint.jabci.types.PartSetHeader parts_;
  /**
   * <code>optional .com.github.jtendermint.jabci.types.PartSetHeader parts = 2;</code>
   */
  public boolean hasParts() {
    return parts_ != null;
  }
  /**
   * <code>optional .com.github.jtendermint.jabci.types.PartSetHeader parts = 2;</code>
   */
  public com.github.jtendermint.jabci.types.PartSetHeader getParts() {
    return parts_ == null ? com.github.jtendermint.jabci.types.PartSetHeader.getDefaultInstance() : parts_;
  }
  /**
   * <code>optional .com.github.jtendermint.jabci.types.PartSetHeader parts = 2;</code>
   */
  public com.github.jtendermint.jabci.types.PartSetHeaderOrBuilder getPartsOrBuilder() {
    return getParts();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!hash_.isEmpty()) {
      output.writeBytes(1, hash_);
    }
    if (parts_ != null) {
      output.writeMessage(2, getParts());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!hash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, hash_);
    }
    if (parts_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getParts());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof BlockID)) {
      return super.equals(obj);
    }
    BlockID other = (BlockID) obj;

    boolean result = true;
    result = result && getHash()
        .equals(other.getHash());
    result = result && (hasParts() == other.hasParts());
    if (hasParts()) {
      result = result && getParts()
          .equals(other.getParts());
    }
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + getHash().hashCode();
    if (hasParts()) {
      hash = (37 * hash) + PARTS_FIELD_NUMBER;
      hash = (53 * hash) + getParts().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BlockID parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BlockID parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BlockID parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BlockID parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BlockID parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BlockID parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static BlockID parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static BlockID parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BlockID parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BlockID parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(BlockID prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.github.jtendermint.jabci.types.BlockID}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.jtendermint.jabci.types.BlockID)
      com.github.jtendermint.jabci.types.BlockIDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_BlockID_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_BlockID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BlockID.class, Builder.class);
    }

    // Construct using com.github.jtendermint.jabci.types.BlockID.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      hash_ = com.google.protobuf.ByteString.EMPTY;

      if (partsBuilder_ == null) {
        parts_ = null;
      } else {
        parts_ = null;
        partsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_BlockID_descriptor;
    }

    public BlockID getDefaultInstanceForType() {
      return BlockID.getDefaultInstance();
    }

    public BlockID build() {
      BlockID result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public BlockID buildPartial() {
      BlockID result = new BlockID(this);
      result.hash_ = hash_;
      if (partsBuilder_ == null) {
        result.parts_ = parts_;
      } else {
        result.parts_ = partsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof BlockID) {
        return mergeFrom((BlockID)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BlockID other) {
      if (other == BlockID.getDefaultInstance()) return this;
      if (other.getHash() != com.google.protobuf.ByteString.EMPTY) {
        setHash(other.getHash());
      }
      if (other.hasParts()) {
        mergeParts(other.getParts());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      BlockID parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (BlockID) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes hash = 1;</code>
     */
    public com.google.protobuf.ByteString getHash() {
      return hash_;
    }
    /**
     * <code>optional bytes hash = 1;</code>
     */
    public Builder setHash(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes hash = 1;</code>
     */
    public Builder clearHash() {
      
      hash_ = getDefaultInstance().getHash();
      onChanged();
      return this;
    }

    private com.github.jtendermint.jabci.types.PartSetHeader parts_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.PartSetHeader, com.github.jtendermint.jabci.types.PartSetHeader.Builder, com.github.jtendermint.jabci.types.PartSetHeaderOrBuilder> partsBuilder_;
    /**
     * <code>optional .com.github.jtendermint.jabci.types.PartSetHeader parts = 2;</code>
     */
    public boolean hasParts() {
      return partsBuilder_ != null || parts_ != null;
    }
    /**
     * <code>optional .com.github.jtendermint.jabci.types.PartSetHeader parts = 2;</code>
     */
    public com.github.jtendermint.jabci.types.PartSetHeader getParts() {
      if (partsBuilder_ == null) {
        return parts_ == null ? com.github.jtendermint.jabci.types.PartSetHeader.getDefaultInstance() : parts_;
      } else {
        return partsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.github.jtendermint.jabci.types.PartSetHeader parts = 2;</code>
     */
    public Builder setParts(com.github.jtendermint.jabci.types.PartSetHeader value) {
      if (partsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parts_ = value;
        onChanged();
      } else {
        partsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.github.jtendermint.jabci.types.PartSetHeader parts = 2;</code>
     */
    public Builder setParts(
        com.github.jtendermint.jabci.types.PartSetHeader.Builder builderForValue) {
      if (partsBuilder_ == null) {
        parts_ = builderForValue.build();
        onChanged();
      } else {
        partsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.github.jtendermint.jabci.types.PartSetHeader parts = 2;</code>
     */
    public Builder mergeParts(com.github.jtendermint.jabci.types.PartSetHeader value) {
      if (partsBuilder_ == null) {
        if (parts_ != null) {
          parts_ =
            com.github.jtendermint.jabci.types.PartSetHeader.newBuilder(parts_).mergeFrom(value).buildPartial();
        } else {
          parts_ = value;
        }
        onChanged();
      } else {
        partsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.github.jtendermint.jabci.types.PartSetHeader parts = 2;</code>
     */
    public Builder clearParts() {
      if (partsBuilder_ == null) {
        parts_ = null;
        onChanged();
      } else {
        parts_ = null;
        partsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.github.jtendermint.jabci.types.PartSetHeader parts = 2;</code>
     */
    public com.github.jtendermint.jabci.types.PartSetHeader.Builder getPartsBuilder() {
      
      onChanged();
      return getPartsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.github.jtendermint.jabci.types.PartSetHeader parts = 2;</code>
     */
    public com.github.jtendermint.jabci.types.PartSetHeaderOrBuilder getPartsOrBuilder() {
      if (partsBuilder_ != null) {
        return partsBuilder_.getMessageOrBuilder();
      } else {
        return parts_ == null ?
            com.github.jtendermint.jabci.types.PartSetHeader.getDefaultInstance() : parts_;
      }
    }
    /**
     * <code>optional .com.github.jtendermint.jabci.types.PartSetHeader parts = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.PartSetHeader, com.github.jtendermint.jabci.types.PartSetHeader.Builder, com.github.jtendermint.jabci.types.PartSetHeaderOrBuilder> 
        getPartsFieldBuilder() {
      if (partsBuilder_ == null) {
        partsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.jtendermint.jabci.types.PartSetHeader, com.github.jtendermint.jabci.types.PartSetHeader.Builder, com.github.jtendermint.jabci.types.PartSetHeaderOrBuilder>(
                getParts(),
                getParentForChildren(),
                isClean());
        parts_ = null;
      }
      return partsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.github.jtendermint.jabci.types.BlockID)
  }

  // @@protoc_insertion_point(class_scope:com.github.jtendermint.jabci.types.BlockID)
  private static final BlockID DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BlockID();
  }

  public static BlockID getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlockID>
      PARSER = new com.google.protobuf.AbstractParser<BlockID>() {
    public BlockID parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlockID(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlockID> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<BlockID> getParserForType() {
    return PARSER;
  }

  public BlockID getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

