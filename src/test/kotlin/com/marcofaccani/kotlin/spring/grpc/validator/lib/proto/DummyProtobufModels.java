// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/GrpcServerProto.proto
// Protobuf Java Version: 4.28.3

package com.marcofaccani.kotlin.spring.grpc.validator.lib.proto;

public final class DummyProtobufModels {
  private DummyProtobufModels() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      DummyProtobufModels.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DummyProtoMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:models.DummyProtoMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1 [(.buf.validate.field) = { ... }</code>
     * @return The name.
     */
    String getName();
    /**
     * <code>string name = 1 [(.buf.validate.field) = { ... }</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>string surname = 2 [(.buf.validate.field) = { ... }</code>
     * @return The surname.
     */
    String getSurname();
    /**
     * <code>string surname = 2 [(.buf.validate.field) = { ... }</code>
     * @return The bytes for surname.
     */
    com.google.protobuf.ByteString
        getSurnameBytes();
  }
  /**
   * Protobuf type {@code models.DummyProtoMessage}
   */
  public static final class DummyProtoMessage extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:models.DummyProtoMessage)
      DummyProtoMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 3,
        /* suffix= */ "",
        DummyProtoMessage.class.getName());
    }
    // Use DummyProtoMessage.newBuilder() to construct.
    private DummyProtoMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private DummyProtoMessage() {
      name_ = "";
      surname_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DummyProtobufModels.internal_static_models_DummyProtoMessage_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DummyProtobufModels.internal_static_models_DummyProtoMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DummyProtoMessage.class, Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile Object name_ = "";
    /**
     * <code>string name = 1 [(.buf.validate.field) = { ... }</code>
     * @return The name.
     */
    @Override
    public String getName() {
      Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1 [(.buf.validate.field) = { ... }</code>
     * @return The bytes for name.
     */
    @Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SURNAME_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile Object surname_ = "";
    /**
     * <code>string surname = 2 [(.buf.validate.field) = { ... }</code>
     * @return The surname.
     */
    @Override
    public String getSurname() {
      Object ref = surname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        surname_ = s;
        return s;
      }
    }
    /**
     * <code>string surname = 2 [(.buf.validate.field) = { ... }</code>
     * @return The bytes for surname.
     */
    @Override
    public com.google.protobuf.ByteString
        getSurnameBytes() {
      Object ref = surname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        surname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, name_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(surname_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, surname_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, name_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(surname_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, surname_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof DummyProtoMessage)) {
        return super.equals(obj);
      }
      DummyProtoMessage other = (DummyProtoMessage) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (!getSurname()
          .equals(other.getSurname())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + SURNAME_FIELD_NUMBER;
      hash = (53 * hash) + getSurname().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static DummyProtoMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DummyProtoMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DummyProtoMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DummyProtoMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DummyProtoMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DummyProtoMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DummyProtoMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static DummyProtoMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static DummyProtoMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static DummyProtoMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static DummyProtoMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static DummyProtoMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(DummyProtoMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
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
     * Protobuf type {@code models.DummyProtoMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:models.DummyProtoMessage)
        DummyProtoMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return DummyProtobufModels.internal_static_models_DummyProtoMessage_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return DummyProtobufModels.internal_static_models_DummyProtoMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                DummyProtoMessage.class, Builder.class);
      }

      // Construct using com.marcofaccani.grpc.server.v1.DummyProtobufModels.DummyProtoMessage.newBuilder()
      private Builder() {

      }

      private Builder(
          BuilderParent parent) {
        super(parent);

      }
      @Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        name_ = "";
        surname_ = "";
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return DummyProtobufModels.internal_static_models_DummyProtoMessage_descriptor;
      }

      @Override
      public DummyProtoMessage getDefaultInstanceForType() {
        return DummyProtoMessage.getDefaultInstance();
      }

      @Override
      public DummyProtoMessage build() {
        DummyProtoMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public DummyProtoMessage buildPartial() {
        DummyProtoMessage result = new DummyProtoMessage(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(DummyProtoMessage result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.name_ = name_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.surname_ = surname_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof DummyProtoMessage) {
          return mergeFrom((DummyProtoMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(DummyProtoMessage other) {
        if (other == DummyProtoMessage.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getSurname().isEmpty()) {
          surname_ = other.surname_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                surname_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private Object name_ = "";
      /**
       * <code>string name = 1 [(.buf.validate.field) = { ... }</code>
       * @return The name.
       */
      public String getName() {
        Object ref = name_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string name = 1 [(.buf.validate.field) = { ... }</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1 [(.buf.validate.field) = { ... }</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1 [(.buf.validate.field) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1 [(.buf.validate.field) = { ... }</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private Object surname_ = "";
      /**
       * <code>string surname = 2 [(.buf.validate.field) = { ... }</code>
       * @return The surname.
       */
      public String getSurname() {
        Object ref = surname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          surname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string surname = 2 [(.buf.validate.field) = { ... }</code>
       * @return The bytes for surname.
       */
      public com.google.protobuf.ByteString
          getSurnameBytes() {
        Object ref = surname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          surname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string surname = 2 [(.buf.validate.field) = { ... }</code>
       * @param value The surname to set.
       * @return This builder for chaining.
       */
      public Builder setSurname(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        surname_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string surname = 2 [(.buf.validate.field) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearSurname() {
        surname_ = getDefaultInstance().getSurname();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string surname = 2 [(.buf.validate.field) = { ... }</code>
       * @param value The bytes for surname to set.
       * @return This builder for chaining.
       */
      public Builder setSurnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        surname_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:models.DummyProtoMessage)
    }

    // @@protoc_insertion_point(class_scope:models.DummyProtoMessage)
    private static final DummyProtoMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new DummyProtoMessage();
    }

    public static DummyProtoMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DummyProtoMessage>
        PARSER = new com.google.protobuf.AbstractParser<DummyProtoMessage>() {
      @Override
      public DummyProtoMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<DummyProtoMessage> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<DummyProtoMessage> getParserForType() {
      return PARSER;
    }

    @Override
    public DummyProtoMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_models_DummyProtoMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_models_DummyProtoMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\030v1/GrpcServerProto.proto\022\006models\032\033goog" +
      "le/protobuf/empty.proto\032\033buf/validate/va" +
      "lidate.proto\"D\n\021DummyProtoMessage\022\025\n\004nam" +
      "e\030\001 \001(\tB\007\272H\004r\002\020\001\022\030\n\007surname\030\002 \001(\tB\007\272H\004r\002" +
      "\030\005Bz\n\031com.marcofaccani.grpc.server.v1B\023DummyPr" +
      "otobufModelsZHgithub.com/marcofaccani/grpc-server/clientLibraries/protova" +
      "lidateb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_models_DummyProtoMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_models_DummyProtoMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_models_DummyProtoMessage_descriptor,
        new String[] { "Name", "Surname", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.EmptyProto.getDescriptor();
    build.buf.validate.ValidateProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(build.buf.validate.ValidateProto.field);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
