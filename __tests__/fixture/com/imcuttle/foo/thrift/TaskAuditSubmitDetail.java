/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.imcuttle.foo.thrift;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class TaskAuditSubmitDetail implements org.apache.thrift.TBase<TaskAuditSubmitDetail, TaskAuditSubmitDetail._Fields>, java.io.Serializable, Cloneable, Comparable<TaskAuditSubmitDetail> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TaskAuditSubmitDetail");

  private static final org.apache.thrift.protocol.TField TIMES_FIELD_DESC = new org.apache.thrift.protocol.TField("times", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField AUDIT_SUBMITTER_FIELD_DESC = new org.apache.thrift.protocol.TField("auditSubmitter", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField AUDIT_SUBMIT_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("auditSubmitTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField ORIGIN_STAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("originStage", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField LATEST_STAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("latestStage", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TaskAuditSubmitDetailStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TaskAuditSubmitDetailTupleSchemeFactory());
  }

  private int times; // required
  private int auditSubmitter; // required
  private long auditSubmitTime; // required
  private int originStage; // optional
  private int latestStage; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TIMES((short)1, "times"),
    AUDIT_SUBMITTER((short)2, "auditSubmitter"),
    AUDIT_SUBMIT_TIME((short)3, "auditSubmitTime"),
    ORIGIN_STAGE((short)4, "originStage"),
    LATEST_STAGE((short)5, "latestStage");

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
        case 1: // TIMES
          return TIMES;
        case 2: // AUDIT_SUBMITTER
          return AUDIT_SUBMITTER;
        case 3: // AUDIT_SUBMIT_TIME
          return AUDIT_SUBMIT_TIME;
        case 4: // ORIGIN_STAGE
          return ORIGIN_STAGE;
        case 5: // LATEST_STAGE
          return LATEST_STAGE;
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
  private static final int __TIMES_ISSET_ID = 0;
  private static final int __AUDITSUBMITTER_ISSET_ID = 1;
  private static final int __AUDITSUBMITTIME_ISSET_ID = 2;
  private static final int __ORIGINSTAGE_ISSET_ID = 3;
  private static final int __LATESTSTAGE_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ORIGIN_STAGE,_Fields.LATEST_STAGE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TIMES, new org.apache.thrift.meta_data.FieldMetaData("times", org.apache.thrift.TFieldRequirementType.REQUIRED,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.AUDIT_SUBMITTER, new org.apache.thrift.meta_data.FieldMetaData("auditSubmitter", org.apache.thrift.TFieldRequirementType.REQUIRED,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.AUDIT_SUBMIT_TIME, new org.apache.thrift.meta_data.FieldMetaData("auditSubmitTime", org.apache.thrift.TFieldRequirementType.REQUIRED,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ORIGIN_STAGE, new org.apache.thrift.meta_data.FieldMetaData("originStage", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LATEST_STAGE, new org.apache.thrift.meta_data.FieldMetaData("latestStage", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TaskAuditSubmitDetail.class, metaDataMap);
  }

  public TaskAuditSubmitDetail() {
  }

  public TaskAuditSubmitDetail(
    int times,
    int auditSubmitter,
    long auditSubmitTime)
  {
    this();
    this.times = times;
    setTimesIsSet(true);
    this.auditSubmitter = auditSubmitter;
    setAuditSubmitterIsSet(true);
    this.auditSubmitTime = auditSubmitTime;
    setAuditSubmitTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaskAuditSubmitDetail(TaskAuditSubmitDetail other) {
    __isset_bitfield = other.__isset_bitfield;
    this.times = other.times;
    this.auditSubmitter = other.auditSubmitter;
    this.auditSubmitTime = other.auditSubmitTime;
    this.originStage = other.originStage;
    this.latestStage = other.latestStage;
  }

  public TaskAuditSubmitDetail deepCopy() {
    return new TaskAuditSubmitDetail(this);
  }

  @Override
  public void clear() {
    setTimesIsSet(false);
    this.times = 0;
    setAuditSubmitterIsSet(false);
    this.auditSubmitter = 0;
    setAuditSubmitTimeIsSet(false);
    this.auditSubmitTime = 0;
    setOriginStageIsSet(false);
    this.originStage = 0;
    setLatestStageIsSet(false);
    this.latestStage = 0;
  }

  public int getTimes() {
    return this.times;
  }

  public void setTimes(int times) {
    this.times = times;
    setTimesIsSet(true);
  }

  public void unsetTimes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMES_ISSET_ID);
  }

  /** Returns true if field times is set (has been assigned a value) and false otherwise */
  public boolean isSetTimes() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMES_ISSET_ID);
  }

  public void setTimesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMES_ISSET_ID, value);
  }

  public int getAuditSubmitter() {
    return this.auditSubmitter;
  }

  public void setAuditSubmitter(int auditSubmitter) {
    this.auditSubmitter = auditSubmitter;
    setAuditSubmitterIsSet(true);
  }

  public void unsetAuditSubmitter() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AUDITSUBMITTER_ISSET_ID);
  }

  /** Returns true if field auditSubmitter is set (has been assigned a value) and false otherwise */
  public boolean isSetAuditSubmitter() {
    return EncodingUtils.testBit(__isset_bitfield, __AUDITSUBMITTER_ISSET_ID);
  }

  public void setAuditSubmitterIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AUDITSUBMITTER_ISSET_ID, value);
  }

  public long getAuditSubmitTime() {
    return this.auditSubmitTime;
  }

  public void setAuditSubmitTime(long auditSubmitTime) {
    this.auditSubmitTime = auditSubmitTime;
    setAuditSubmitTimeIsSet(true);
  }

  public void unsetAuditSubmitTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AUDITSUBMITTIME_ISSET_ID);
  }

  /** Returns true if field auditSubmitTime is set (has been assigned a value) and false otherwise */
  public boolean isSetAuditSubmitTime() {
    return EncodingUtils.testBit(__isset_bitfield, __AUDITSUBMITTIME_ISSET_ID);
  }

  public void setAuditSubmitTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AUDITSUBMITTIME_ISSET_ID, value);
  }

  public int getOriginStage() {
    return this.originStage;
  }

  public void setOriginStage(int originStage) {
    this.originStage = originStage;
    setOriginStageIsSet(true);
  }

  public void unsetOriginStage() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ORIGINSTAGE_ISSET_ID);
  }

  /** Returns true if field originStage is set (has been assigned a value) and false otherwise */
  public boolean isSetOriginStage() {
    return EncodingUtils.testBit(__isset_bitfield, __ORIGINSTAGE_ISSET_ID);
  }

  public void setOriginStageIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ORIGINSTAGE_ISSET_ID, value);
  }

  public int getLatestStage() {
    return this.latestStage;
  }

  public void setLatestStage(int latestStage) {
    this.latestStage = latestStage;
    setLatestStageIsSet(true);
  }

  public void unsetLatestStage() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LATESTSTAGE_ISSET_ID);
  }

  /** Returns true if field latestStage is set (has been assigned a value) and false otherwise */
  public boolean isSetLatestStage() {
    return EncodingUtils.testBit(__isset_bitfield, __LATESTSTAGE_ISSET_ID);
  }

  public void setLatestStageIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LATESTSTAGE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TIMES:
      if (value == null) {
        unsetTimes();
      } else {
        setTimes((Integer)value);
      }
      break;

    case AUDIT_SUBMITTER:
      if (value == null) {
        unsetAuditSubmitter();
      } else {
        setAuditSubmitter((Integer)value);
      }
      break;

    case AUDIT_SUBMIT_TIME:
      if (value == null) {
        unsetAuditSubmitTime();
      } else {
        setAuditSubmitTime((Long)value);
      }
      break;

    case ORIGIN_STAGE:
      if (value == null) {
        unsetOriginStage();
      } else {
        setOriginStage((Integer)value);
      }
      break;

    case LATEST_STAGE:
      if (value == null) {
        unsetLatestStage();
      } else {
        setLatestStage((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TIMES:
      return getTimes();

    case AUDIT_SUBMITTER:
      return getAuditSubmitter();

    case AUDIT_SUBMIT_TIME:
      return getAuditSubmitTime();

    case ORIGIN_STAGE:
      return getOriginStage();

    case LATEST_STAGE:
      return getLatestStage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TIMES:
      return isSetTimes();
    case AUDIT_SUBMITTER:
      return isSetAuditSubmitter();
    case AUDIT_SUBMIT_TIME:
      return isSetAuditSubmitTime();
    case ORIGIN_STAGE:
      return isSetOriginStage();
    case LATEST_STAGE:
      return isSetLatestStage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TaskAuditSubmitDetail)
      return this.equals((TaskAuditSubmitDetail)that);
    return false;
  }

  public boolean equals(TaskAuditSubmitDetail that) {
    if (that == null)
      return false;

    boolean this_present_times = true;
    boolean that_present_times = true;
    if (this_present_times || that_present_times) {
      if (!(this_present_times && that_present_times))
        return false;
      if (this.times != that.times)
        return false;
    }

    boolean this_present_auditSubmitter = true;
    boolean that_present_auditSubmitter = true;
    if (this_present_auditSubmitter || that_present_auditSubmitter) {
      if (!(this_present_auditSubmitter && that_present_auditSubmitter))
        return false;
      if (this.auditSubmitter != that.auditSubmitter)
        return false;
    }

    boolean this_present_auditSubmitTime = true;
    boolean that_present_auditSubmitTime = true;
    if (this_present_auditSubmitTime || that_present_auditSubmitTime) {
      if (!(this_present_auditSubmitTime && that_present_auditSubmitTime))
        return false;
      if (this.auditSubmitTime != that.auditSubmitTime)
        return false;
    }

    boolean this_present_originStage = true && this.isSetOriginStage();
    boolean that_present_originStage = true && that.isSetOriginStage();
    if (this_present_originStage || that_present_originStage) {
      if (!(this_present_originStage && that_present_originStage))
        return false;
      if (this.originStage != that.originStage)
        return false;
    }

    boolean this_present_latestStage = true && this.isSetLatestStage();
    boolean that_present_latestStage = true && that.isSetLatestStage();
    if (this_present_latestStage || that_present_latestStage) {
      if (!(this_present_latestStage && that_present_latestStage))
        return false;
      if (this.latestStage != that.latestStage)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_times = true;
    list.add(present_times);
    if (present_times)
      list.add(times);

    boolean present_auditSubmitter = true;
    list.add(present_auditSubmitter);
    if (present_auditSubmitter)
      list.add(auditSubmitter);

    boolean present_auditSubmitTime = true;
    list.add(present_auditSubmitTime);
    if (present_auditSubmitTime)
      list.add(auditSubmitTime);

    boolean present_originStage = true && (isSetOriginStage());
    list.add(present_originStage);
    if (present_originStage)
      list.add(originStage);

    boolean present_latestStage = true && (isSetLatestStage());
    list.add(present_latestStage);
    if (present_latestStage)
      list.add(latestStage);

    return list.hashCode();
  }

  @Override
  public int compareTo(TaskAuditSubmitDetail other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTimes()).compareTo(other.isSetTimes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.times, other.times);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAuditSubmitter()).compareTo(other.isSetAuditSubmitter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuditSubmitter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.auditSubmitter, other.auditSubmitter);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAuditSubmitTime()).compareTo(other.isSetAuditSubmitTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuditSubmitTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.auditSubmitTime, other.auditSubmitTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOriginStage()).compareTo(other.isSetOriginStage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOriginStage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.originStage, other.originStage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLatestStage()).compareTo(other.isSetLatestStage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLatestStage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.latestStage, other.latestStage);
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
    StringBuilder sb = new StringBuilder("TaskAuditSubmitDetail(");
    boolean first = true;

    sb.append("times:");
    sb.append(this.times);
    first = false;
    if (!first) sb.append(", ");
    sb.append("auditSubmitter:");
    sb.append(this.auditSubmitter);
    first = false;
    if (!first) sb.append(", ");
    sb.append("auditSubmitTime:");
    sb.append(this.auditSubmitTime);
    first = false;
    if (isSetOriginStage()) {
      if (!first) sb.append(", ");
      sb.append("originStage:");
      sb.append(this.originStage);
      first = false;
    }
    if (isSetLatestStage()) {
      if (!first) sb.append(", ");
      sb.append("latestStage:");
      sb.append(this.latestStage);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTimes()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'times' is unset! Struct:" + toString());
    }

    if (!isSetAuditSubmitter()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'auditSubmitter' is unset! Struct:" + toString());
    }

    if (!isSetAuditSubmitTime()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'auditSubmitTime' is unset! Struct:" + toString());
    }

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

  private static class TaskAuditSubmitDetailStandardSchemeFactory implements SchemeFactory {
    public TaskAuditSubmitDetailStandardScheme getScheme() {
      return new TaskAuditSubmitDetailStandardScheme();
    }
  }

  private static class TaskAuditSubmitDetailStandardScheme extends StandardScheme<TaskAuditSubmitDetail> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TaskAuditSubmitDetail struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // TIMES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.times = iprot.readI32();
              struct.setTimesIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AUDIT_SUBMITTER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.auditSubmitter = iprot.readI32();
              struct.setAuditSubmitterIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AUDIT_SUBMIT_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.auditSubmitTime = iprot.readI64();
              struct.setAuditSubmitTimeIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ORIGIN_STAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.originStage = iprot.readI32();
              struct.setOriginStageIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LATEST_STAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.latestStage = iprot.readI32();
              struct.setLatestStageIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TaskAuditSubmitDetail struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TIMES_FIELD_DESC);
      oprot.writeI32(struct.times);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AUDIT_SUBMITTER_FIELD_DESC);
      oprot.writeI32(struct.auditSubmitter);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AUDIT_SUBMIT_TIME_FIELD_DESC);
      oprot.writeI64(struct.auditSubmitTime);
      oprot.writeFieldEnd();
      if (struct.isSetOriginStage()) {
        oprot.writeFieldBegin(ORIGIN_STAGE_FIELD_DESC);
        oprot.writeI32(struct.originStage);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLatestStage()) {
        oprot.writeFieldBegin(LATEST_STAGE_FIELD_DESC);
        oprot.writeI32(struct.latestStage);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TaskAuditSubmitDetailTupleSchemeFactory implements SchemeFactory {
    public TaskAuditSubmitDetailTupleScheme getScheme() {
      return new TaskAuditSubmitDetailTupleScheme();
    }
  }

  private static class TaskAuditSubmitDetailTupleScheme extends TupleScheme<TaskAuditSubmitDetail> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TaskAuditSubmitDetail struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.times);
      oprot.writeI32(struct.auditSubmitter);
      oprot.writeI64(struct.auditSubmitTime);
      BitSet optionals = new BitSet();
      if (struct.isSetOriginStage()) {
        optionals.set(0);
      }
      if (struct.isSetLatestStage()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetOriginStage()) {
        oprot.writeI32(struct.originStage);
      }
      if (struct.isSetLatestStage()) {
        oprot.writeI32(struct.latestStage);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TaskAuditSubmitDetail struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.times = iprot.readI32();
      struct.setTimesIsSet(true);
      struct.auditSubmitter = iprot.readI32();
      struct.setAuditSubmitterIsSet(true);
      struct.auditSubmitTime = iprot.readI64();
      struct.setAuditSubmitTimeIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.originStage = iprot.readI32();
        struct.setOriginStageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.latestStage = iprot.readI32();
        struct.setLatestStageIsSet(true);
      }
    }
  }

}

