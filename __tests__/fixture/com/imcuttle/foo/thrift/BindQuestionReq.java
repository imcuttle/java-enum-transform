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
public class BindQuestionReq implements org.apache.thrift.TBase<BindQuestionReq, BindQuestionReq._Fields>, java.io.Serializable, Cloneable, Comparable<BindQuestionReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BindQuestionReq");

  private static final org.apache.thrift.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("taskId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField QUESTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("questionId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField EXAM_PAPER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("examPaperId", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField QUESTION_ORIGIN_FIELD_DESC = new org.apache.thrift.protocol.TField("questionOrigin", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField SNAPSHOT_IMG_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("snapshotImgIds", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField OPERATOR_USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("operatorUserId", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BindQuestionReqStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BindQuestionReqTupleSchemeFactory());
  }

  private long taskId; // required
  private int questionId; // required
  private long examPaperId; // optional
  private int questionOrigin; // required
  private List<String> snapshotImgIds; // optional
  private int operatorUserId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TASK_ID((short)1, "taskId"),
    QUESTION_ID((short)2, "questionId"),
    EXAM_PAPER_ID((short)3, "examPaperId"),
    QUESTION_ORIGIN((short)4, "questionOrigin"),
    SNAPSHOT_IMG_IDS((short)5, "snapshotImgIds"),
    OPERATOR_USER_ID((short)6, "operatorUserId");

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
        case 1: // TASK_ID
          return TASK_ID;
        case 2: // QUESTION_ID
          return QUESTION_ID;
        case 3: // EXAM_PAPER_ID
          return EXAM_PAPER_ID;
        case 4: // QUESTION_ORIGIN
          return QUESTION_ORIGIN;
        case 5: // SNAPSHOT_IMG_IDS
          return SNAPSHOT_IMG_IDS;
        case 6: // OPERATOR_USER_ID
          return OPERATOR_USER_ID;
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
  private static final int __TASKID_ISSET_ID = 0;
  private static final int __QUESTIONID_ISSET_ID = 1;
  private static final int __EXAMPAPERID_ISSET_ID = 2;
  private static final int __QUESTIONORIGIN_ISSET_ID = 3;
  private static final int __OPERATORUSERID_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.EXAM_PAPER_ID,_Fields.SNAPSHOT_IMG_IDS,_Fields.OPERATOR_USER_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("taskId", org.apache.thrift.TFieldRequirementType.REQUIRED,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.QUESTION_ID, new org.apache.thrift.meta_data.FieldMetaData("questionId", org.apache.thrift.TFieldRequirementType.REQUIRED,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EXAM_PAPER_ID, new org.apache.thrift.meta_data.FieldMetaData("examPaperId", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.QUESTION_ORIGIN, new org.apache.thrift.meta_data.FieldMetaData("questionOrigin", org.apache.thrift.TFieldRequirementType.REQUIRED,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SNAPSHOT_IMG_IDS, new org.apache.thrift.meta_data.FieldMetaData("snapshotImgIds", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.OPERATOR_USER_ID, new org.apache.thrift.meta_data.FieldMetaData("operatorUserId", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BindQuestionReq.class, metaDataMap);
  }

  public BindQuestionReq() {
  }

  public BindQuestionReq(
    long taskId,
    int questionId,
    int questionOrigin)
  {
    this();
    this.taskId = taskId;
    setTaskIdIsSet(true);
    this.questionId = questionId;
    setQuestionIdIsSet(true);
    this.questionOrigin = questionOrigin;
    setQuestionOriginIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BindQuestionReq(BindQuestionReq other) {
    __isset_bitfield = other.__isset_bitfield;
    this.taskId = other.taskId;
    this.questionId = other.questionId;
    this.examPaperId = other.examPaperId;
    this.questionOrigin = other.questionOrigin;
    if (other.isSetSnapshotImgIds()) {
      List<String> __this__snapshotImgIds = new ArrayList<String>(other.snapshotImgIds);
      this.snapshotImgIds = __this__snapshotImgIds;
    }
    this.operatorUserId = other.operatorUserId;
  }

  public BindQuestionReq deepCopy() {
    return new BindQuestionReq(this);
  }

  @Override
  public void clear() {
    setTaskIdIsSet(false);
    this.taskId = 0;
    setQuestionIdIsSet(false);
    this.questionId = 0;
    setExamPaperIdIsSet(false);
    this.examPaperId = 0;
    setQuestionOriginIsSet(false);
    this.questionOrigin = 0;
    this.snapshotImgIds = null;
    setOperatorUserIdIsSet(false);
    this.operatorUserId = 0;
  }

  public long getTaskId() {
    return this.taskId;
  }

  public void setTaskId(long taskId) {
    this.taskId = taskId;
    setTaskIdIsSet(true);
  }

  public void unsetTaskId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TASKID_ISSET_ID);
  }

  /** Returns true if field taskId is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskId() {
    return EncodingUtils.testBit(__isset_bitfield, __TASKID_ISSET_ID);
  }

  public void setTaskIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TASKID_ISSET_ID, value);
  }

  public int getQuestionId() {
    return this.questionId;
  }

  public void setQuestionId(int questionId) {
    this.questionId = questionId;
    setQuestionIdIsSet(true);
  }

  public void unsetQuestionId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __QUESTIONID_ISSET_ID);
  }

  /** Returns true if field questionId is set (has been assigned a value) and false otherwise */
  public boolean isSetQuestionId() {
    return EncodingUtils.testBit(__isset_bitfield, __QUESTIONID_ISSET_ID);
  }

  public void setQuestionIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __QUESTIONID_ISSET_ID, value);
  }

  public long getExamPaperId() {
    return this.examPaperId;
  }

  public void setExamPaperId(long examPaperId) {
    this.examPaperId = examPaperId;
    setExamPaperIdIsSet(true);
  }

  public void unsetExamPaperId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXAMPAPERID_ISSET_ID);
  }

  /** Returns true if field examPaperId is set (has been assigned a value) and false otherwise */
  public boolean isSetExamPaperId() {
    return EncodingUtils.testBit(__isset_bitfield, __EXAMPAPERID_ISSET_ID);
  }

  public void setExamPaperIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXAMPAPERID_ISSET_ID, value);
  }

  public int getQuestionOrigin() {
    return this.questionOrigin;
  }

  public void setQuestionOrigin(int questionOrigin) {
    this.questionOrigin = questionOrigin;
    setQuestionOriginIsSet(true);
  }

  public void unsetQuestionOrigin() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __QUESTIONORIGIN_ISSET_ID);
  }

  /** Returns true if field questionOrigin is set (has been assigned a value) and false otherwise */
  public boolean isSetQuestionOrigin() {
    return EncodingUtils.testBit(__isset_bitfield, __QUESTIONORIGIN_ISSET_ID);
  }

  public void setQuestionOriginIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __QUESTIONORIGIN_ISSET_ID, value);
  }

  public int getSnapshotImgIdsSize() {
    return (this.snapshotImgIds == null) ? 0 : this.snapshotImgIds.size();
  }

  public java.util.Iterator<String> getSnapshotImgIdsIterator() {
    return (this.snapshotImgIds == null) ? null : this.snapshotImgIds.iterator();
  }

  public void addToSnapshotImgIds(String elem) {
    if (this.snapshotImgIds == null) {
      this.snapshotImgIds = new ArrayList<String>();
    }
    this.snapshotImgIds.add(elem);
  }

  public List<String> getSnapshotImgIds() {
    return this.snapshotImgIds;
  }

  public void setSnapshotImgIds(List<String> snapshotImgIds) {
    this.snapshotImgIds = snapshotImgIds;
  }

  public void unsetSnapshotImgIds() {
    this.snapshotImgIds = null;
  }

  /** Returns true if field snapshotImgIds is set (has been assigned a value) and false otherwise */
  public boolean isSetSnapshotImgIds() {
    return this.snapshotImgIds != null;
  }

  public void setSnapshotImgIdsIsSet(boolean value) {
    if (!value) {
      this.snapshotImgIds = null;
    }
  }

  public int getOperatorUserId() {
    return this.operatorUserId;
  }

  public void setOperatorUserId(int operatorUserId) {
    this.operatorUserId = operatorUserId;
    setOperatorUserIdIsSet(true);
  }

  public void unsetOperatorUserId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OPERATORUSERID_ISSET_ID);
  }

  /** Returns true if field operatorUserId is set (has been assigned a value) and false otherwise */
  public boolean isSetOperatorUserId() {
    return EncodingUtils.testBit(__isset_bitfield, __OPERATORUSERID_ISSET_ID);
  }

  public void setOperatorUserIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OPERATORUSERID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASK_ID:
      if (value == null) {
        unsetTaskId();
      } else {
        setTaskId((Long)value);
      }
      break;

    case QUESTION_ID:
      if (value == null) {
        unsetQuestionId();
      } else {
        setQuestionId((Integer)value);
      }
      break;

    case EXAM_PAPER_ID:
      if (value == null) {
        unsetExamPaperId();
      } else {
        setExamPaperId((Long)value);
      }
      break;

    case QUESTION_ORIGIN:
      if (value == null) {
        unsetQuestionOrigin();
      } else {
        setQuestionOrigin((Integer)value);
      }
      break;

    case SNAPSHOT_IMG_IDS:
      if (value == null) {
        unsetSnapshotImgIds();
      } else {
        setSnapshotImgIds((List<String>)value);
      }
      break;

    case OPERATOR_USER_ID:
      if (value == null) {
        unsetOperatorUserId();
      } else {
        setOperatorUserId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK_ID:
      return getTaskId();

    case QUESTION_ID:
      return getQuestionId();

    case EXAM_PAPER_ID:
      return getExamPaperId();

    case QUESTION_ORIGIN:
      return getQuestionOrigin();

    case SNAPSHOT_IMG_IDS:
      return getSnapshotImgIds();

    case OPERATOR_USER_ID:
      return getOperatorUserId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASK_ID:
      return isSetTaskId();
    case QUESTION_ID:
      return isSetQuestionId();
    case EXAM_PAPER_ID:
      return isSetExamPaperId();
    case QUESTION_ORIGIN:
      return isSetQuestionOrigin();
    case SNAPSHOT_IMG_IDS:
      return isSetSnapshotImgIds();
    case OPERATOR_USER_ID:
      return isSetOperatorUserId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BindQuestionReq)
      return this.equals((BindQuestionReq)that);
    return false;
  }

  public boolean equals(BindQuestionReq that) {
    if (that == null)
      return false;

    boolean this_present_taskId = true;
    boolean that_present_taskId = true;
    if (this_present_taskId || that_present_taskId) {
      if (!(this_present_taskId && that_present_taskId))
        return false;
      if (this.taskId != that.taskId)
        return false;
    }

    boolean this_present_questionId = true;
    boolean that_present_questionId = true;
    if (this_present_questionId || that_present_questionId) {
      if (!(this_present_questionId && that_present_questionId))
        return false;
      if (this.questionId != that.questionId)
        return false;
    }

    boolean this_present_examPaperId = true && this.isSetExamPaperId();
    boolean that_present_examPaperId = true && that.isSetExamPaperId();
    if (this_present_examPaperId || that_present_examPaperId) {
      if (!(this_present_examPaperId && that_present_examPaperId))
        return false;
      if (this.examPaperId != that.examPaperId)
        return false;
    }

    boolean this_present_questionOrigin = true;
    boolean that_present_questionOrigin = true;
    if (this_present_questionOrigin || that_present_questionOrigin) {
      if (!(this_present_questionOrigin && that_present_questionOrigin))
        return false;
      if (this.questionOrigin != that.questionOrigin)
        return false;
    }

    boolean this_present_snapshotImgIds = true && this.isSetSnapshotImgIds();
    boolean that_present_snapshotImgIds = true && that.isSetSnapshotImgIds();
    if (this_present_snapshotImgIds || that_present_snapshotImgIds) {
      if (!(this_present_snapshotImgIds && that_present_snapshotImgIds))
        return false;
      if (!this.snapshotImgIds.equals(that.snapshotImgIds))
        return false;
    }

    boolean this_present_operatorUserId = true && this.isSetOperatorUserId();
    boolean that_present_operatorUserId = true && that.isSetOperatorUserId();
    if (this_present_operatorUserId || that_present_operatorUserId) {
      if (!(this_present_operatorUserId && that_present_operatorUserId))
        return false;
      if (this.operatorUserId != that.operatorUserId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_taskId = true;
    list.add(present_taskId);
    if (present_taskId)
      list.add(taskId);

    boolean present_questionId = true;
    list.add(present_questionId);
    if (present_questionId)
      list.add(questionId);

    boolean present_examPaperId = true && (isSetExamPaperId());
    list.add(present_examPaperId);
    if (present_examPaperId)
      list.add(examPaperId);

    boolean present_questionOrigin = true;
    list.add(present_questionOrigin);
    if (present_questionOrigin)
      list.add(questionOrigin);

    boolean present_snapshotImgIds = true && (isSetSnapshotImgIds());
    list.add(present_snapshotImgIds);
    if (present_snapshotImgIds)
      list.add(snapshotImgIds);

    boolean present_operatorUserId = true && (isSetOperatorUserId());
    list.add(present_operatorUserId);
    if (present_operatorUserId)
      list.add(operatorUserId);

    return list.hashCode();
  }

  @Override
  public int compareTo(BindQuestionReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTaskId()).compareTo(other.isSetTaskId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskId, other.taskId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQuestionId()).compareTo(other.isSetQuestionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuestionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.questionId, other.questionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExamPaperId()).compareTo(other.isSetExamPaperId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExamPaperId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.examPaperId, other.examPaperId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQuestionOrigin()).compareTo(other.isSetQuestionOrigin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuestionOrigin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.questionOrigin, other.questionOrigin);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSnapshotImgIds()).compareTo(other.isSetSnapshotImgIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSnapshotImgIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.snapshotImgIds, other.snapshotImgIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOperatorUserId()).compareTo(other.isSetOperatorUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperatorUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operatorUserId, other.operatorUserId);
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
    StringBuilder sb = new StringBuilder("BindQuestionReq(");
    boolean first = true;

    sb.append("taskId:");
    sb.append(this.taskId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("questionId:");
    sb.append(this.questionId);
    first = false;
    if (isSetExamPaperId()) {
      if (!first) sb.append(", ");
      sb.append("examPaperId:");
      sb.append(this.examPaperId);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("questionOrigin:");
    sb.append(this.questionOrigin);
    first = false;
    if (isSetSnapshotImgIds()) {
      if (!first) sb.append(", ");
      sb.append("snapshotImgIds:");
      if (this.snapshotImgIds == null) {
        sb.append("null");
      } else {
        sb.append(this.snapshotImgIds);
      }
      first = false;
    }
    if (isSetOperatorUserId()) {
      if (!first) sb.append(", ");
      sb.append("operatorUserId:");
      sb.append(this.operatorUserId);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTaskId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'taskId' is unset! Struct:" + toString());
    }

    if (!isSetQuestionId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'questionId' is unset! Struct:" + toString());
    }

    if (!isSetQuestionOrigin()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'questionOrigin' is unset! Struct:" + toString());
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

  private static class BindQuestionReqStandardSchemeFactory implements SchemeFactory {
    public BindQuestionReqStandardScheme getScheme() {
      return new BindQuestionReqStandardScheme();
    }
  }

  private static class BindQuestionReqStandardScheme extends StandardScheme<BindQuestionReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BindQuestionReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // TASK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.taskId = iprot.readI64();
              struct.setTaskIdIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // QUESTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.questionId = iprot.readI32();
              struct.setQuestionIdIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXAM_PAPER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.examPaperId = iprot.readI64();
              struct.setExamPaperIdIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // QUESTION_ORIGIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.questionOrigin = iprot.readI32();
              struct.setQuestionOriginIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SNAPSHOT_IMG_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list56 = iprot.readListBegin();
                struct.snapshotImgIds = new ArrayList<String>(_list56.size);
                String _elem57;
                for (int _i58 = 0; _i58 < _list56.size; ++_i58)
                {
                  _elem57 = iprot.readString();
                  struct.snapshotImgIds.add(_elem57);
                }
                iprot.readListEnd();
              }
              struct.setSnapshotImgIdsIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // OPERATOR_USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.operatorUserId = iprot.readI32();
              struct.setOperatorUserIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BindQuestionReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
      oprot.writeI64(struct.taskId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(QUESTION_ID_FIELD_DESC);
      oprot.writeI32(struct.questionId);
      oprot.writeFieldEnd();
      if (struct.isSetExamPaperId()) {
        oprot.writeFieldBegin(EXAM_PAPER_ID_FIELD_DESC);
        oprot.writeI64(struct.examPaperId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(QUESTION_ORIGIN_FIELD_DESC);
      oprot.writeI32(struct.questionOrigin);
      oprot.writeFieldEnd();
      if (struct.snapshotImgIds != null) {
        if (struct.isSetSnapshotImgIds()) {
          oprot.writeFieldBegin(SNAPSHOT_IMG_IDS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.snapshotImgIds.size()));
            for (String _iter59 : struct.snapshotImgIds)
            {
              oprot.writeString(_iter59);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetOperatorUserId()) {
        oprot.writeFieldBegin(OPERATOR_USER_ID_FIELD_DESC);
        oprot.writeI32(struct.operatorUserId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BindQuestionReqTupleSchemeFactory implements SchemeFactory {
    public BindQuestionReqTupleScheme getScheme() {
      return new BindQuestionReqTupleScheme();
    }
  }

  private static class BindQuestionReqTupleScheme extends TupleScheme<BindQuestionReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BindQuestionReq struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.taskId);
      oprot.writeI32(struct.questionId);
      oprot.writeI32(struct.questionOrigin);
      BitSet optionals = new BitSet();
      if (struct.isSetExamPaperId()) {
        optionals.set(0);
      }
      if (struct.isSetSnapshotImgIds()) {
        optionals.set(1);
      }
      if (struct.isSetOperatorUserId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetExamPaperId()) {
        oprot.writeI64(struct.examPaperId);
      }
      if (struct.isSetSnapshotImgIds()) {
        {
          oprot.writeI32(struct.snapshotImgIds.size());
          for (String _iter60 : struct.snapshotImgIds)
          {
            oprot.writeString(_iter60);
          }
        }
      }
      if (struct.isSetOperatorUserId()) {
        oprot.writeI32(struct.operatorUserId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BindQuestionReq struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.taskId = iprot.readI64();
      struct.setTaskIdIsSet(true);
      struct.questionId = iprot.readI32();
      struct.setQuestionIdIsSet(true);
      struct.questionOrigin = iprot.readI32();
      struct.setQuestionOriginIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.examPaperId = iprot.readI64();
        struct.setExamPaperIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list61 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.snapshotImgIds = new ArrayList<String>(_list61.size);
          String _elem62;
          for (int _i63 = 0; _i63 < _list61.size; ++_i63)
          {
            _elem62 = iprot.readString();
            struct.snapshotImgIds.add(_elem62);
          }
        }
        struct.setSnapshotImgIdsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.operatorUserId = iprot.readI32();
        struct.setOperatorUserIdIsSet(true);
      }
    }
  }

}

