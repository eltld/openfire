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

public class TStudentExercise implements org.apache.thrift.TBase<TStudentExercise, TStudentExercise._Fields>, java.io.Serializable, Cloneable, Comparable<TStudentExercise> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TStudentExercise");

  private static final org.apache.thrift.protocol.TField MYID_FIELD_DESC = new org.apache.thrift.protocol.TField("myid", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField STUDENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("studentId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField EXERCISE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("exerciseId", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField CREATE_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("createAt", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ETYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("etype", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField ANSWER_FIELD_DESC = new org.apache.thrift.protocol.TField("answer", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TStudentExerciseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TStudentExerciseTupleSchemeFactory());
  }

  public int myid; // required
  public int studentId; // required
  public int exerciseId; // required
  public String createAt; // required
  /**
   * 
   * @see STudentExerciseType
   */
  public STudentExerciseType etype; // required
  public String answer; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MYID((short)1, "myid"),
    STUDENT_ID((short)2, "studentId"),
    EXERCISE_ID((short)3, "exerciseId"),
    CREATE_AT((short)4, "createAt"),
    /**
     * 
     * @see STudentExerciseType
     */
    ETYPE((short)5, "etype"),
    ANSWER((short)6, "answer");

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
        case 2: // STUDENT_ID
          return STUDENT_ID;
        case 3: // EXERCISE_ID
          return EXERCISE_ID;
        case 4: // CREATE_AT
          return CREATE_AT;
        case 5: // ETYPE
          return ETYPE;
        case 6: // ANSWER
          return ANSWER;
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
  private static final int __STUDENTID_ISSET_ID = 1;
  private static final int __EXERCISEID_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MYID, new org.apache.thrift.meta_data.FieldMetaData("myid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STUDENT_ID, new org.apache.thrift.meta_data.FieldMetaData("studentId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EXERCISE_ID, new org.apache.thrift.meta_data.FieldMetaData("exerciseId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CREATE_AT, new org.apache.thrift.meta_data.FieldMetaData("createAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ETYPE, new org.apache.thrift.meta_data.FieldMetaData("etype", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, STudentExerciseType.class)));
    tmpMap.put(_Fields.ANSWER, new org.apache.thrift.meta_data.FieldMetaData("answer", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TStudentExercise.class, metaDataMap);
  }

  public TStudentExercise() {
  }

  public TStudentExercise(
    int myid,
    int studentId,
    int exerciseId,
    String createAt,
    STudentExerciseType etype,
    String answer)
  {
    this();
    this.myid = myid;
    setMyidIsSet(true);
    this.studentId = studentId;
    setStudentIdIsSet(true);
    this.exerciseId = exerciseId;
    setExerciseIdIsSet(true);
    this.createAt = createAt;
    this.etype = etype;
    this.answer = answer;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TStudentExercise(TStudentExercise other) {
    __isset_bitfield = other.__isset_bitfield;
    this.myid = other.myid;
    this.studentId = other.studentId;
    this.exerciseId = other.exerciseId;
    if (other.isSetCreateAt()) {
      this.createAt = other.createAt;
    }
    if (other.isSetEtype()) {
      this.etype = other.etype;
    }
    if (other.isSetAnswer()) {
      this.answer = other.answer;
    }
  }

  public TStudentExercise deepCopy() {
    return new TStudentExercise(this);
  }

  @Override
  public void clear() {
    setMyidIsSet(false);
    this.myid = 0;
    setStudentIdIsSet(false);
    this.studentId = 0;
    setExerciseIdIsSet(false);
    this.exerciseId = 0;
    this.createAt = null;
    this.etype = null;
    this.answer = null;
  }

  public int getMyid() {
    return this.myid;
  }

  public TStudentExercise setMyid(int myid) {
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

  public int getStudentId() {
    return this.studentId;
  }

  public TStudentExercise setStudentId(int studentId) {
    this.studentId = studentId;
    setStudentIdIsSet(true);
    return this;
  }

  public void unsetStudentId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STUDENTID_ISSET_ID);
  }

  /** Returns true if field studentId is set (has been assigned a value) and false otherwise */
  public boolean isSetStudentId() {
    return EncodingUtils.testBit(__isset_bitfield, __STUDENTID_ISSET_ID);
  }

  public void setStudentIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STUDENTID_ISSET_ID, value);
  }

  public int getExerciseId() {
    return this.exerciseId;
  }

  public TStudentExercise setExerciseId(int exerciseId) {
    this.exerciseId = exerciseId;
    setExerciseIdIsSet(true);
    return this;
  }

  public void unsetExerciseId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXERCISEID_ISSET_ID);
  }

  /** Returns true if field exerciseId is set (has been assigned a value) and false otherwise */
  public boolean isSetExerciseId() {
    return EncodingUtils.testBit(__isset_bitfield, __EXERCISEID_ISSET_ID);
  }

  public void setExerciseIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXERCISEID_ISSET_ID, value);
  }

  public String getCreateAt() {
    return this.createAt;
  }

  public TStudentExercise setCreateAt(String createAt) {
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

  /**
   * 
   * @see STudentExerciseType
   */
  public STudentExerciseType getEtype() {
    return this.etype;
  }

  /**
   * 
   * @see STudentExerciseType
   */
  public TStudentExercise setEtype(STudentExerciseType etype) {
    this.etype = etype;
    return this;
  }

  public void unsetEtype() {
    this.etype = null;
  }

  /** Returns true if field etype is set (has been assigned a value) and false otherwise */
  public boolean isSetEtype() {
    return this.etype != null;
  }

  public void setEtypeIsSet(boolean value) {
    if (!value) {
      this.etype = null;
    }
  }

  public String getAnswer() {
    return this.answer;
  }

  public TStudentExercise setAnswer(String answer) {
    this.answer = answer;
    return this;
  }

  public void unsetAnswer() {
    this.answer = null;
  }

  /** Returns true if field answer is set (has been assigned a value) and false otherwise */
  public boolean isSetAnswer() {
    return this.answer != null;
  }

  public void setAnswerIsSet(boolean value) {
    if (!value) {
      this.answer = null;
    }
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

    case STUDENT_ID:
      if (value == null) {
        unsetStudentId();
      } else {
        setStudentId((Integer)value);
      }
      break;

    case EXERCISE_ID:
      if (value == null) {
        unsetExerciseId();
      } else {
        setExerciseId((Integer)value);
      }
      break;

    case CREATE_AT:
      if (value == null) {
        unsetCreateAt();
      } else {
        setCreateAt((String)value);
      }
      break;

    case ETYPE:
      if (value == null) {
        unsetEtype();
      } else {
        setEtype((STudentExerciseType)value);
      }
      break;

    case ANSWER:
      if (value == null) {
        unsetAnswer();
      } else {
        setAnswer((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MYID:
      return Integer.valueOf(getMyid());

    case STUDENT_ID:
      return Integer.valueOf(getStudentId());

    case EXERCISE_ID:
      return Integer.valueOf(getExerciseId());

    case CREATE_AT:
      return getCreateAt();

    case ETYPE:
      return getEtype();

    case ANSWER:
      return getAnswer();

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
    case STUDENT_ID:
      return isSetStudentId();
    case EXERCISE_ID:
      return isSetExerciseId();
    case CREATE_AT:
      return isSetCreateAt();
    case ETYPE:
      return isSetEtype();
    case ANSWER:
      return isSetAnswer();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TStudentExercise)
      return this.equals((TStudentExercise)that);
    return false;
  }

  public boolean equals(TStudentExercise that) {
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

    boolean this_present_studentId = true;
    boolean that_present_studentId = true;
    if (this_present_studentId || that_present_studentId) {
      if (!(this_present_studentId && that_present_studentId))
        return false;
      if (this.studentId != that.studentId)
        return false;
    }

    boolean this_present_exerciseId = true;
    boolean that_present_exerciseId = true;
    if (this_present_exerciseId || that_present_exerciseId) {
      if (!(this_present_exerciseId && that_present_exerciseId))
        return false;
      if (this.exerciseId != that.exerciseId)
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

    boolean this_present_etype = true && this.isSetEtype();
    boolean that_present_etype = true && that.isSetEtype();
    if (this_present_etype || that_present_etype) {
      if (!(this_present_etype && that_present_etype))
        return false;
      if (!this.etype.equals(that.etype))
        return false;
    }

    boolean this_present_answer = true && this.isSetAnswer();
    boolean that_present_answer = true && that.isSetAnswer();
    if (this_present_answer || that_present_answer) {
      if (!(this_present_answer && that_present_answer))
        return false;
      if (!this.answer.equals(that.answer))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(TStudentExercise other) {
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
    lastComparison = Boolean.valueOf(isSetStudentId()).compareTo(other.isSetStudentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStudentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.studentId, other.studentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExerciseId()).compareTo(other.isSetExerciseId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExerciseId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exerciseId, other.exerciseId);
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
    lastComparison = Boolean.valueOf(isSetEtype()).compareTo(other.isSetEtype());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEtype()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.etype, other.etype);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAnswer()).compareTo(other.isSetAnswer());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnswer()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.answer, other.answer);
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
    StringBuilder sb = new StringBuilder("TStudentExercise(");
    boolean first = true;

    sb.append("myid:");
    sb.append(this.myid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("studentId:");
    sb.append(this.studentId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("exerciseId:");
    sb.append(this.exerciseId);
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
    sb.append("etype:");
    if (this.etype == null) {
      sb.append("null");
    } else {
      sb.append(this.etype);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("answer:");
    if (this.answer == null) {
      sb.append("null");
    } else {
      sb.append(this.answer);
    }
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

  private static class TStudentExerciseStandardSchemeFactory implements SchemeFactory {
    public TStudentExerciseStandardScheme getScheme() {
      return new TStudentExerciseStandardScheme();
    }
  }

  private static class TStudentExerciseStandardScheme extends StandardScheme<TStudentExercise> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TStudentExercise struct) throws org.apache.thrift.TException {
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
          case 2: // STUDENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.studentId = iprot.readI32();
              struct.setStudentIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXERCISE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.exerciseId = iprot.readI32();
              struct.setExerciseIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CREATE_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.createAt = iprot.readString();
              struct.setCreateAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ETYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.etype = STudentExerciseType.findByValue(iprot.readI32());
              struct.setEtypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ANSWER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.answer = iprot.readString();
              struct.setAnswerIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TStudentExercise struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MYID_FIELD_DESC);
      oprot.writeI32(struct.myid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STUDENT_ID_FIELD_DESC);
      oprot.writeI32(struct.studentId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(EXERCISE_ID_FIELD_DESC);
      oprot.writeI32(struct.exerciseId);
      oprot.writeFieldEnd();
      if (struct.createAt != null) {
        oprot.writeFieldBegin(CREATE_AT_FIELD_DESC);
        oprot.writeString(struct.createAt);
        oprot.writeFieldEnd();
      }
      if (struct.etype != null) {
        oprot.writeFieldBegin(ETYPE_FIELD_DESC);
        oprot.writeI32(struct.etype.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.answer != null) {
        oprot.writeFieldBegin(ANSWER_FIELD_DESC);
        oprot.writeString(struct.answer);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TStudentExerciseTupleSchemeFactory implements SchemeFactory {
    public TStudentExerciseTupleScheme getScheme() {
      return new TStudentExerciseTupleScheme();
    }
  }

  private static class TStudentExerciseTupleScheme extends TupleScheme<TStudentExercise> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TStudentExercise struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMyid()) {
        optionals.set(0);
      }
      if (struct.isSetStudentId()) {
        optionals.set(1);
      }
      if (struct.isSetExerciseId()) {
        optionals.set(2);
      }
      if (struct.isSetCreateAt()) {
        optionals.set(3);
      }
      if (struct.isSetEtype()) {
        optionals.set(4);
      }
      if (struct.isSetAnswer()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetMyid()) {
        oprot.writeI32(struct.myid);
      }
      if (struct.isSetStudentId()) {
        oprot.writeI32(struct.studentId);
      }
      if (struct.isSetExerciseId()) {
        oprot.writeI32(struct.exerciseId);
      }
      if (struct.isSetCreateAt()) {
        oprot.writeString(struct.createAt);
      }
      if (struct.isSetEtype()) {
        oprot.writeI32(struct.etype.getValue());
      }
      if (struct.isSetAnswer()) {
        oprot.writeString(struct.answer);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TStudentExercise struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.myid = iprot.readI32();
        struct.setMyidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.studentId = iprot.readI32();
        struct.setStudentIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.exerciseId = iprot.readI32();
        struct.setExerciseIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.createAt = iprot.readString();
        struct.setCreateAtIsSet(true);
      }
      if (incoming.get(4)) {
        struct.etype = STudentExerciseType.findByValue(iprot.readI32());
        struct.setEtypeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.answer = iprot.readString();
        struct.setAnswerIsSet(true);
      }
    }
  }

}

