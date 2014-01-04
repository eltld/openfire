/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.plaso.thrift.gen;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TExerciseType implements org.apache.thrift.TBase<TExerciseType, TExerciseType._Fields>, java.io.Serializable, Cloneable, Comparable<TExerciseType> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TExerciseType");

  private static final org.apache.thrift.protocol.TField MYID_FIELD_DESC = new org.apache.thrift.protocol.TField("myid", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TYPE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("typeName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CREATE_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("createAt", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField UPDATE_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("updateAt", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ACTIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("active", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TExerciseTypeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TExerciseTypeTupleSchemeFactory());
  }

  public int myid; // required
  public String typeName; // required
  public String createAt; // required
  public String updateAt; // required
  public boolean active; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MYID((short)1, "myid"),
    TYPE_NAME((short)2, "typeName"),
    CREATE_AT((short)3, "createAt"),
    UPDATE_AT((short)4, "updateAt"),
    ACTIVE((short)5, "active");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MYID
          return MYID;
        case 2: // TYPE_NAME
          return TYPE_NAME;
        case 3: // CREATE_AT
          return CREATE_AT;
        case 4: // UPDATE_AT
          return UPDATE_AT;
        case 5: // ACTIVE
          return ACTIVE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MYID_ISSET_ID = 0;
  private static final int __ACTIVE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MYID, new org.apache.thrift.meta_data.FieldMetaData("myid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TYPE_NAME, new org.apache.thrift.meta_data.FieldMetaData("typeName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATE_AT, new org.apache.thrift.meta_data.FieldMetaData("createAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPDATE_AT, new org.apache.thrift.meta_data.FieldMetaData("updateAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACTIVE, new org.apache.thrift.meta_data.FieldMetaData("active", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TExerciseType.class, metaDataMap);
  }

  public TExerciseType() {
  }

  public TExerciseType(
    int myid,
    String typeName,
    String createAt,
    String updateAt,
    boolean active)
  {
    this();
    this.myid = myid;
    setMyidIsSet(true);
    this.typeName = typeName;
    this.createAt = createAt;
    this.updateAt = updateAt;
    this.active = active;
    setActiveIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TExerciseType(TExerciseType other) {
    __isset_bitfield = other.__isset_bitfield;
    this.myid = other.myid;
    if (other.isSetTypeName()) {
      this.typeName = other.typeName;
    }
    if (other.isSetCreateAt()) {
      this.createAt = other.createAt;
    }
    if (other.isSetUpdateAt()) {
      this.updateAt = other.updateAt;
    }
    this.active = other.active;
  }

  public TExerciseType deepCopy() {
    return new TExerciseType(this);
  }

  @Override
  public void clear() {
    setMyidIsSet(false);
    this.myid = 0;
    this.typeName = null;
    this.createAt = null;
    this.updateAt = null;
    setActiveIsSet(false);
    this.active = false;
  }

  public int getMyid() {
    return this.myid;
  }

  public TExerciseType setMyid(int myid) {
    this.myid = myid;
    setMyidIsSet(true);
    return this;
  }

  public void unsetMyid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MYID_ISSET_ID);
  }

  /** Returns true if field myid is set (has been assigned a value) and false otherwise */
  public boolean isSetMyid() {
    return EncodingUtils.testBit(__isset_bitfield, __MYID_ISSET_ID);
  }

  public void setMyidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MYID_ISSET_ID, value);
  }

  public String getTypeName() {
    return this.typeName;
  }

  public TExerciseType setTypeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

  public void unsetTypeName() {
    this.typeName = null;
  }

  /** Returns true if field typeName is set (has been assigned a value) and false otherwise */
  public boolean isSetTypeName() {
    return this.typeName != null;
  }

  public void setTypeNameIsSet(boolean value) {
    if (!value) {
      this.typeName = null;
    }
  }

  public String getCreateAt() {
    return this.createAt;
  }

  public TExerciseType setCreateAt(String createAt) {
    this.createAt = createAt;
    return this;
  }

  public void unsetCreateAt() {
    this.createAt = null;
  }

  /** Returns true if field createAt is set (has been assigned a value) and false otherwise */
  public boolean isSetCreateAt() {
    return this.createAt != null;
  }

  public void setCreateAtIsSet(boolean value) {
    if (!value) {
      this.createAt = null;
    }
  }

  public String getUpdateAt() {
    return this.updateAt;
  }

  public TExerciseType setUpdateAt(String updateAt) {
    this.updateAt = updateAt;
    return this;
  }

  public void unsetUpdateAt() {
    this.updateAt = null;
  }

  /** Returns true if field updateAt is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdateAt() {
    return this.updateAt != null;
  }

  public void setUpdateAtIsSet(boolean value) {
    if (!value) {
      this.updateAt = null;
    }
  }

  public boolean isActive() {
    return this.active;
  }

  public TExerciseType setActive(boolean active) {
    this.active = active;
    setActiveIsSet(true);
    return this;
  }

  public void unsetActive() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ACTIVE_ISSET_ID);
  }

  /** Returns true if field active is set (has been assigned a value) and false otherwise */
  public boolean isSetActive() {
    return EncodingUtils.testBit(__isset_bitfield, __ACTIVE_ISSET_ID);
  }

  public void setActiveIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ACTIVE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MYID:
      if (value == null) {
        unsetMyid();
      } else {
        setMyid((Integer)value);
      }
      break;

    case TYPE_NAME:
      if (value == null) {
        unsetTypeName();
      } else {
        setTypeName((String)value);
      }
      break;

    case CREATE_AT:
      if (value == null) {
        unsetCreateAt();
      } else {
        setCreateAt((String)value);
      }
      break;

    case UPDATE_AT:
      if (value == null) {
        unsetUpdateAt();
      } else {
        setUpdateAt((String)value);
      }
      break;

    case ACTIVE:
      if (value == null) {
        unsetActive();
      } else {
        setActive((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MYID:
      return Integer.valueOf(getMyid());

    case TYPE_NAME:
      return getTypeName();

    case CREATE_AT:
      return getCreateAt();

    case UPDATE_AT:
      return getUpdateAt();

    case ACTIVE:
      return Boolean.valueOf(isActive());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MYID:
      return isSetMyid();
    case TYPE_NAME:
      return isSetTypeName();
    case CREATE_AT:
      return isSetCreateAt();
    case UPDATE_AT:
      return isSetUpdateAt();
    case ACTIVE:
      return isSetActive();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TExerciseType)
      return this.equals((TExerciseType)that);
    return false;
  }

  public boolean equals(TExerciseType that) {
    if (that == null)
      return false;

    boolean this_present_myid = true;
    boolean that_present_myid = true;
    if (this_present_myid || that_present_myid) {
      if (!(this_present_myid && that_present_myid))
        return false;
      if (this.myid != that.myid)
        return false;
    }

    boolean this_present_typeName = true && this.isSetTypeName();
    boolean that_present_typeName = true && that.isSetTypeName();
    if (this_present_typeName || that_present_typeName) {
      if (!(this_present_typeName && that_present_typeName))
        return false;
      if (!this.typeName.equals(that.typeName))
        return false;
    }

    boolean this_present_createAt = true && this.isSetCreateAt();
    boolean that_present_createAt = true && that.isSetCreateAt();
    if (this_present_createAt || that_present_createAt) {
      if (!(this_present_createAt && that_present_createAt))
        return false;
      if (!this.createAt.equals(that.createAt))
        return false;
    }

    boolean this_present_updateAt = true && this.isSetUpdateAt();
    boolean that_present_updateAt = true && that.isSetUpdateAt();
    if (this_present_updateAt || that_present_updateAt) {
      if (!(this_present_updateAt && that_present_updateAt))
        return false;
      if (!this.updateAt.equals(that.updateAt))
        return false;
    }

    boolean this_present_active = true;
    boolean that_present_active = true;
    if (this_present_active || that_present_active) {
      if (!(this_present_active && that_present_active))
        return false;
      if (this.active != that.active)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(TExerciseType other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMyid()).compareTo(other.isSetMyid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMyid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.myid, other.myid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTypeName()).compareTo(other.isSetTypeName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTypeName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.typeName, other.typeName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreateAt()).compareTo(other.isSetCreateAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createAt, other.createAt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdateAt()).compareTo(other.isSetUpdateAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateAt, other.updateAt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetActive()).compareTo(other.isSetActive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.active, other.active);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TExerciseType(");
    boolean first = true;

    sb.append("myid:");
    sb.append(this.myid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("typeName:");
    if (this.typeName == null) {
      sb.append("null");
    } else {
      sb.append(this.typeName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createAt:");
    if (this.createAt == null) {
      sb.append("null");
    } else {
      sb.append(this.createAt);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("updateAt:");
    if (this.updateAt == null) {
      sb.append("null");
    } else {
      sb.append(this.updateAt);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("active:");
    sb.append(this.active);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TExerciseTypeStandardSchemeFactory implements SchemeFactory {
    public TExerciseTypeStandardScheme getScheme() {
      return new TExerciseTypeStandardScheme();
    }
  }

  private static class TExerciseTypeStandardScheme extends StandardScheme<TExerciseType> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TExerciseType struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MYID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.myid = iprot.readI32();
              struct.setMyidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TYPE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.typeName = iprot.readString();
              struct.setTypeNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CREATE_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.createAt = iprot.readString();
              struct.setCreateAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UPDATE_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.updateAt = iprot.readString();
              struct.setUpdateAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ACTIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.active = iprot.readBool();
              struct.setActiveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TExerciseType struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MYID_FIELD_DESC);
      oprot.writeI32(struct.myid);
      oprot.writeFieldEnd();
      if (struct.typeName != null) {
        oprot.writeFieldBegin(TYPE_NAME_FIELD_DESC);
        oprot.writeString(struct.typeName);
        oprot.writeFieldEnd();
      }
      if (struct.createAt != null) {
        oprot.writeFieldBegin(CREATE_AT_FIELD_DESC);
        oprot.writeString(struct.createAt);
        oprot.writeFieldEnd();
      }
      if (struct.updateAt != null) {
        oprot.writeFieldBegin(UPDATE_AT_FIELD_DESC);
        oprot.writeString(struct.updateAt);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ACTIVE_FIELD_DESC);
      oprot.writeBool(struct.active);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TExerciseTypeTupleSchemeFactory implements SchemeFactory {
    public TExerciseTypeTupleScheme getScheme() {
      return new TExerciseTypeTupleScheme();
    }
  }

  private static class TExerciseTypeTupleScheme extends TupleScheme<TExerciseType> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TExerciseType struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMyid()) {
        optionals.set(0);
      }
      if (struct.isSetTypeName()) {
        optionals.set(1);
      }
      if (struct.isSetCreateAt()) {
        optionals.set(2);
      }
      if (struct.isSetUpdateAt()) {
        optionals.set(3);
      }
      if (struct.isSetActive()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetMyid()) {
        oprot.writeI32(struct.myid);
      }
      if (struct.isSetTypeName()) {
        oprot.writeString(struct.typeName);
      }
      if (struct.isSetCreateAt()) {
        oprot.writeString(struct.createAt);
      }
      if (struct.isSetUpdateAt()) {
        oprot.writeString(struct.updateAt);
      }
      if (struct.isSetActive()) {
        oprot.writeBool(struct.active);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TExerciseType struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.myid = iprot.readI32();
        struct.setMyidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.typeName = iprot.readString();
        struct.setTypeNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.createAt = iprot.readString();
        struct.setCreateAtIsSet(true);
      }
      if (incoming.get(3)) {
        struct.updateAt = iprot.readString();
        struct.setUpdateAtIsSet(true);
      }
      if (incoming.get(4)) {
        struct.active = iprot.readBool();
        struct.setActiveIsSet(true);
      }
    }
  }

}

