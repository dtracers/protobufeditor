// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressbookSD1_PersonPhoneNo.proto

package com.example.tutorial;

public final class AddressbookSD1PersonPhoneNo {
  private AddressbookSD1PersonPhoneNo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PhoneNumberOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string number = 1;
    boolean hasNumber();
    String getNumber();
    
    // optional .PhoneType type = 2 [default = HOME];
    boolean hasType();
    com.example.tutorial.AddressbookSD1PersonEnum.PhoneType getType();
  }
  public static final class PhoneNumber extends
      com.google.protobuf.GeneratedMessage
      implements PhoneNumberOrBuilder {
    // Use PhoneNumber.newBuilder() to construct.
    private PhoneNumber(Builder builder) {
      super(builder);
    }
    private PhoneNumber(boolean noInit) {}
    
    private static final PhoneNumber defaultInstance;
    public static PhoneNumber getDefaultInstance() {
      return defaultInstance;
    }
    
    public PhoneNumber getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.tutorial.AddressbookSD1PersonPhoneNo.internal_static_PhoneNumber_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.tutorial.AddressbookSD1PersonPhoneNo.internal_static_PhoneNumber_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string number = 1;
    public static final int NUMBER_FIELD_NUMBER = 1;
    private java.lang.Object number_;
    public boolean hasNumber() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getNumber() {
      java.lang.Object ref = number_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          number_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNumberBytes() {
      java.lang.Object ref = number_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        number_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional .PhoneType type = 2 [default = HOME];
    public static final int TYPE_FIELD_NUMBER = 2;
    private com.example.tutorial.AddressbookSD1PersonEnum.PhoneType type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.example.tutorial.AddressbookSD1PersonEnum.PhoneType getType() {
      return type_;
    }
    
    private void initFields() {
      number_ = "";
      type_ = com.example.tutorial.AddressbookSD1PersonEnum.PhoneType.HOME;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasNumber()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNumberBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, type_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getNumberBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, type_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumberOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.example.tutorial.AddressbookSD1PersonPhoneNo.internal_static_PhoneNumber_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.example.tutorial.AddressbookSD1PersonPhoneNo.internal_static_PhoneNumber_fieldAccessorTable;
      }
      
      // Construct using com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        number_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = com.example.tutorial.AddressbookSD1PersonEnum.PhoneType.HOME;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber.getDescriptor();
      }
      
      public com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber getDefaultInstanceForType() {
        return com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber.getDefaultInstance();
      }
      
      public com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber build() {
        com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber buildPartial() {
        com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber result = new com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.number_ = number_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber) {
          return mergeFrom((com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber other) {
        if (other == com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber.getDefaultInstance()) return this;
        if (other.hasNumber()) {
          setNumber(other.getNumber());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasNumber()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              number_ = input.readBytes();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              com.example.tutorial.AddressbookSD1PersonEnum.PhoneType value = com.example.tutorial.AddressbookSD1PersonEnum.PhoneType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                type_ = value;
              }
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string number = 1;
      private java.lang.Object number_ = "";
      public boolean hasNumber() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getNumber() {
        java.lang.Object ref = number_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          number_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setNumber(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        number_ = value;
        onChanged();
        return this;
      }
      public Builder clearNumber() {
        bitField0_ = (bitField0_ & ~0x00000001);
        number_ = getDefaultInstance().getNumber();
        onChanged();
        return this;
      }
      void setNumber(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        number_ = value;
        onChanged();
      }
      
      // optional .PhoneType type = 2 [default = HOME];
      private com.example.tutorial.AddressbookSD1PersonEnum.PhoneType type_ = com.example.tutorial.AddressbookSD1PersonEnum.PhoneType.HOME;
      public boolean hasType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.example.tutorial.AddressbookSD1PersonEnum.PhoneType getType() {
        return type_;
      }
      public Builder setType(com.example.tutorial.AddressbookSD1PersonEnum.PhoneType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = com.example.tutorial.AddressbookSD1PersonEnum.PhoneType.HOME;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:PhoneNumber)
    }
    
    static {
      defaultInstance = new PhoneNumber(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:PhoneNumber)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_PhoneNumber_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PhoneNumber_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"addressbookSD1_PersonPhoneNo.proto\032\037ad" +
      "dressbookSD1_PersonEnum.proto\"=\n\013PhoneNu" +
      "mber\022\016\n\006number\030\001 \002(\t\022\036\n\004type\030\002 \001(\0162\n.Pho" +
      "neType:\004HOMEB\026\n\024com.example.tutorial"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_PhoneNumber_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_PhoneNumber_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_PhoneNumber_descriptor,
              new java.lang.String[] { "Number", "Type", },
              com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber.class,
              com.example.tutorial.AddressbookSD1PersonPhoneNo.PhoneNumber.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.example.tutorial.AddressbookSD1PersonEnum.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
