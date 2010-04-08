// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Ams_Location.proto

package net.sf.RecordEditor.ProtoBuf.re.Test.ams;

/*
 *                 Warning           Warning        Warning      Warning 
 *                *------------------------------------------------------------*
 * 
 * This was generated using Protocol Buffers 2.3.0 There will be errors if
 * using other version of Protocol Buffers.
 * 
 * You can regenerate from the proto file in the copybook directory
 * 
 * Note: This package comes with the protocol buffers 2.2.0 Jar file
 * 
 */

public final class AmsLocation {
  private AmsLocation() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class Locations extends
      com.google.protobuf.GeneratedMessage {
    // Use Locations.newBuilder() to construct.
    private Locations() {
      initFields();
    }
    private Locations(boolean noInit) {}
    
    private static final Locations defaultInstance;
    public static Locations getDefaultInstance() {
      return defaultInstance;
    }
    
    public Locations getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.internal_static_net_sf_RecordEditor_ProtoBuf_re_Test_ams_Locations_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.internal_static_net_sf_RecordEditor_ProtoBuf_re_Test_ams_Locations_fieldAccessorTable;
    }
    
    // required string Brand_Id = 1;
    public static final int BRAND_ID_FIELD_NUMBER = 1;
    private boolean hasBrandId;
    private java.lang.String brandId_ = "";
    public boolean hasBrandId() { return hasBrandId; }
    public java.lang.String getBrandId() { return brandId_; }
    
    // required string Loc_Nbr = 2;
    public static final int LOC_NBR_FIELD_NUMBER = 2;
    private boolean hasLocNbr;
    private java.lang.String locNbr_ = "";
    public boolean hasLocNbr() { return hasLocNbr; }
    public java.lang.String getLocNbr() { return locNbr_; }
    
    // required string Loc_Type = 3;
    public static final int LOC_TYPE_FIELD_NUMBER = 3;
    private boolean hasLocType;
    private java.lang.String locType_ = "";
    public boolean hasLocType() { return hasLocType; }
    public java.lang.String getLocType() { return locType_; }
    
    // required string Loc_Name = 4;
    public static final int LOC_NAME_FIELD_NUMBER = 4;
    private boolean hasLocName;
    private java.lang.String locName_ = "";
    public boolean hasLocName() { return hasLocName; }
    public java.lang.String getLocName() { return locName_; }
    
    // required string Loc_Addr_Ln1 = 5;
    public static final int LOC_ADDR_LN1_FIELD_NUMBER = 5;
    private boolean hasLocAddrLn1;
    private java.lang.String locAddrLn1_ = "";
    public boolean hasLocAddrLn1() { return hasLocAddrLn1; }
    public java.lang.String getLocAddrLn1() { return locAddrLn1_; }
    
    // required string Loc_Addr_Ln2 = 6;
    public static final int LOC_ADDR_LN2_FIELD_NUMBER = 6;
    private boolean hasLocAddrLn2;
    private java.lang.String locAddrLn2_ = "";
    public boolean hasLocAddrLn2() { return hasLocAddrLn2; }
    public java.lang.String getLocAddrLn2() { return locAddrLn2_; }
    
    // required string Loc_Addr_Ln3 = 7;
    public static final int LOC_ADDR_LN3_FIELD_NUMBER = 7;
    private boolean hasLocAddrLn3;
    private java.lang.String locAddrLn3_ = "";
    public boolean hasLocAddrLn3() { return hasLocAddrLn3; }
    public java.lang.String getLocAddrLn3() { return locAddrLn3_; }
    
    // required string Loc_Postcode = 8;
    public static final int LOC_POSTCODE_FIELD_NUMBER = 8;
    private boolean hasLocPostcode;
    private java.lang.String locPostcode_ = "";
    public boolean hasLocPostcode() { return hasLocPostcode; }
    public java.lang.String getLocPostcode() { return locPostcode_; }
    
    // required string Loc_State = 9;
    public static final int LOC_STATE_FIELD_NUMBER = 9;
    private boolean hasLocState;
    private java.lang.String locState_ = "";
    public boolean hasLocState() { return hasLocState; }
    public java.lang.String getLocState() { return locState_; }
    
    // required string Loc_Actv_Ind = 10;
    public static final int LOC_ACTV_IND_FIELD_NUMBER = 10;
    private boolean hasLocActvInd;
    private java.lang.String locActvInd_ = "";
    public boolean hasLocActvInd() { return hasLocActvInd; }
    public java.lang.String getLocActvInd() { return locActvInd_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      if (!hasBrandId) return false;
      if (!hasLocNbr) return false;
      if (!hasLocType) return false;
      if (!hasLocName) return false;
      if (!hasLocAddrLn1) return false;
      if (!hasLocAddrLn2) return false;
      if (!hasLocAddrLn3) return false;
      if (!hasLocPostcode) return false;
      if (!hasLocState) return false;
      if (!hasLocActvInd) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasBrandId()) {
        output.writeString(1, getBrandId());
      }
      if (hasLocNbr()) {
        output.writeString(2, getLocNbr());
      }
      if (hasLocType()) {
        output.writeString(3, getLocType());
      }
      if (hasLocName()) {
        output.writeString(4, getLocName());
      }
      if (hasLocAddrLn1()) {
        output.writeString(5, getLocAddrLn1());
      }
      if (hasLocAddrLn2()) {
        output.writeString(6, getLocAddrLn2());
      }
      if (hasLocAddrLn3()) {
        output.writeString(7, getLocAddrLn3());
      }
      if (hasLocPostcode()) {
        output.writeString(8, getLocPostcode());
      }
      if (hasLocState()) {
        output.writeString(9, getLocState());
      }
      if (hasLocActvInd()) {
        output.writeString(10, getLocActvInd());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasBrandId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getBrandId());
      }
      if (hasLocNbr()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getLocNbr());
      }
      if (hasLocType()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getLocType());
      }
      if (hasLocName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getLocName());
      }
      if (hasLocAddrLn1()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(5, getLocAddrLn1());
      }
      if (hasLocAddrLn2()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(6, getLocAddrLn2());
      }
      if (hasLocAddrLn3()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(7, getLocAddrLn3());
      }
      if (hasLocPostcode()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(8, getLocPostcode());
      }
      if (hasLocState()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(9, getLocState());
      }
      if (hasLocActvInd()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(10, getLocActvInd());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations parseDelimitedFrom(
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
    public static net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations result;
      
      // Construct using net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations();
        return builder;
      }
      
      protected net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations.getDescriptor();
      }
      
      public net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations getDefaultInstanceForType() {
        return net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations) {
          return mergeFrom((net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations other) {
        if (other == net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations.getDefaultInstance()) return this;
        if (other.hasBrandId()) {
          setBrandId(other.getBrandId());
        }
        if (other.hasLocNbr()) {
          setLocNbr(other.getLocNbr());
        }
        if (other.hasLocType()) {
          setLocType(other.getLocType());
        }
        if (other.hasLocName()) {
          setLocName(other.getLocName());
        }
        if (other.hasLocAddrLn1()) {
          setLocAddrLn1(other.getLocAddrLn1());
        }
        if (other.hasLocAddrLn2()) {
          setLocAddrLn2(other.getLocAddrLn2());
        }
        if (other.hasLocAddrLn3()) {
          setLocAddrLn3(other.getLocAddrLn3());
        }
        if (other.hasLocPostcode()) {
          setLocPostcode(other.getLocPostcode());
        }
        if (other.hasLocState()) {
          setLocState(other.getLocState());
        }
        if (other.hasLocActvInd()) {
          setLocActvInd(other.getLocActvInd());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
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
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setBrandId(input.readString());
              break;
            }
            case 18: {
              setLocNbr(input.readString());
              break;
            }
            case 26: {
              setLocType(input.readString());
              break;
            }
            case 34: {
              setLocName(input.readString());
              break;
            }
            case 42: {
              setLocAddrLn1(input.readString());
              break;
            }
            case 50: {
              setLocAddrLn2(input.readString());
              break;
            }
            case 58: {
              setLocAddrLn3(input.readString());
              break;
            }
            case 66: {
              setLocPostcode(input.readString());
              break;
            }
            case 74: {
              setLocState(input.readString());
              break;
            }
            case 82: {
              setLocActvInd(input.readString());
              break;
            }
          }
        }
      }
      
      
      // required string Brand_Id = 1;
      public boolean hasBrandId() {
        return result.hasBrandId();
      }
      public java.lang.String getBrandId() {
        return result.getBrandId();
      }
      public Builder setBrandId(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasBrandId = true;
        result.brandId_ = value;
        return this;
      }
      public Builder clearBrandId() {
        result.hasBrandId = false;
        result.brandId_ = getDefaultInstance().getBrandId();
        return this;
      }
      
      // required string Loc_Nbr = 2;
      public boolean hasLocNbr() {
        return result.hasLocNbr();
      }
      public java.lang.String getLocNbr() {
        return result.getLocNbr();
      }
      public Builder setLocNbr(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasLocNbr = true;
        result.locNbr_ = value;
        return this;
      }
      public Builder clearLocNbr() {
        result.hasLocNbr = false;
        result.locNbr_ = getDefaultInstance().getLocNbr();
        return this;
      }
      
      // required string Loc_Type = 3;
      public boolean hasLocType() {
        return result.hasLocType();
      }
      public java.lang.String getLocType() {
        return result.getLocType();
      }
      public Builder setLocType(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasLocType = true;
        result.locType_ = value;
        return this;
      }
      public Builder clearLocType() {
        result.hasLocType = false;
        result.locType_ = getDefaultInstance().getLocType();
        return this;
      }
      
      // required string Loc_Name = 4;
      public boolean hasLocName() {
        return result.hasLocName();
      }
      public java.lang.String getLocName() {
        return result.getLocName();
      }
      public Builder setLocName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasLocName = true;
        result.locName_ = value;
        return this;
      }
      public Builder clearLocName() {
        result.hasLocName = false;
        result.locName_ = getDefaultInstance().getLocName();
        return this;
      }
      
      // required string Loc_Addr_Ln1 = 5;
      public boolean hasLocAddrLn1() {
        return result.hasLocAddrLn1();
      }
      public java.lang.String getLocAddrLn1() {
        return result.getLocAddrLn1();
      }
      public Builder setLocAddrLn1(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasLocAddrLn1 = true;
        result.locAddrLn1_ = value;
        return this;
      }
      public Builder clearLocAddrLn1() {
        result.hasLocAddrLn1 = false;
        result.locAddrLn1_ = getDefaultInstance().getLocAddrLn1();
        return this;
      }
      
      // required string Loc_Addr_Ln2 = 6;
      public boolean hasLocAddrLn2() {
        return result.hasLocAddrLn2();
      }
      public java.lang.String getLocAddrLn2() {
        return result.getLocAddrLn2();
      }
      public Builder setLocAddrLn2(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasLocAddrLn2 = true;
        result.locAddrLn2_ = value;
        return this;
      }
      public Builder clearLocAddrLn2() {
        result.hasLocAddrLn2 = false;
        result.locAddrLn2_ = getDefaultInstance().getLocAddrLn2();
        return this;
      }
      
      // required string Loc_Addr_Ln3 = 7;
      public boolean hasLocAddrLn3() {
        return result.hasLocAddrLn3();
      }
      public java.lang.String getLocAddrLn3() {
        return result.getLocAddrLn3();
      }
      public Builder setLocAddrLn3(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasLocAddrLn3 = true;
        result.locAddrLn3_ = value;
        return this;
      }
      public Builder clearLocAddrLn3() {
        result.hasLocAddrLn3 = false;
        result.locAddrLn3_ = getDefaultInstance().getLocAddrLn3();
        return this;
      }
      
      // required string Loc_Postcode = 8;
      public boolean hasLocPostcode() {
        return result.hasLocPostcode();
      }
      public java.lang.String getLocPostcode() {
        return result.getLocPostcode();
      }
      public Builder setLocPostcode(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasLocPostcode = true;
        result.locPostcode_ = value;
        return this;
      }
      public Builder clearLocPostcode() {
        result.hasLocPostcode = false;
        result.locPostcode_ = getDefaultInstance().getLocPostcode();
        return this;
      }
      
      // required string Loc_State = 9;
      public boolean hasLocState() {
        return result.hasLocState();
      }
      public java.lang.String getLocState() {
        return result.getLocState();
      }
      public Builder setLocState(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasLocState = true;
        result.locState_ = value;
        return this;
      }
      public Builder clearLocState() {
        result.hasLocState = false;
        result.locState_ = getDefaultInstance().getLocState();
        return this;
      }
      
      // required string Loc_Actv_Ind = 10;
      public boolean hasLocActvInd() {
        return result.hasLocActvInd();
      }
      public java.lang.String getLocActvInd() {
        return result.getLocActvInd();
      }
      public Builder setLocActvInd(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasLocActvInd = true;
        result.locActvInd_ = value;
        return this;
      }
      public Builder clearLocActvInd() {
        result.hasLocActvInd = false;
        result.locActvInd_ = getDefaultInstance().getLocActvInd();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.sf.RecordEditor.ProtoBuf.re.Test.ams.Locations)
    }
    
    static {
      defaultInstance = new Locations(true);
      net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.sf.RecordEditor.ProtoBuf.re.Test.ams.Locations)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_sf_RecordEditor_ProtoBuf_re_Test_ams_Locations_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_sf_RecordEditor_ProtoBuf_re_Test_ams_Locations_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022Ams_Location.proto\022(net.sf.RecordEdito" +
      "r.ProtoBuf.re.Test.ams\"\323\001\n\tLocations\022\020\n\010" +
      "Brand_Id\030\001 \002(\t\022\017\n\007Loc_Nbr\030\002 \002(\t\022\020\n\010Loc_T" +
      "ype\030\003 \002(\t\022\020\n\010Loc_Name\030\004 \002(\t\022\024\n\014Loc_Addr_" +
      "Ln1\030\005 \002(\t\022\024\n\014Loc_Addr_Ln2\030\006 \002(\t\022\024\n\014Loc_A" +
      "ddr_Ln3\030\007 \002(\t\022\024\n\014Loc_Postcode\030\010 \002(\t\022\021\n\tL" +
      "oc_State\030\t \002(\t\022\024\n\014Loc_Actv_Ind\030\n \002(\tB\002H\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_net_sf_RecordEditor_ProtoBuf_re_Test_ams_Locations_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_net_sf_RecordEditor_ProtoBuf_re_Test_ams_Locations_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_sf_RecordEditor_ProtoBuf_re_Test_ams_Locations_descriptor,
              new java.lang.String[] { "BrandId", "LocNbr", "LocType", "LocName", "LocAddrLn1", "LocAddrLn2", "LocAddrLn3", "LocPostcode", "LocState", "LocActvInd", },
              net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations.class,
              net.sf.RecordEditor.ProtoBuf.re.Test.ams.AmsLocation.Locations.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
