package com.jjb.acl.infrastructure;

import com.jjb.unicorn.facility.util.DataTypeUtils;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 批量执行步骤过程
 * @author jjb
 */
public class TmBthStepExec implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer bthInstId;

    private Date processDate;

    private String stepName;

    private Date startTime;

    private Date endTime;

    private String hintMessage;

    private String stepStatus;

    private String exitMessage;

    private Integer jpaVersion;

    /**
     * <p>ID</p>
     */
    public Integer getId() {
        return id;
    }

    /**
     * <p>ID</p>
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <p>BTH_INST_ID</p>
     */
    public Integer getBthInstId() {
        return bthInstId;
    }

    /**
     * <p>BTH_INST_ID</p>
     */
    public void setBthInstId(Integer bthInstId) {
        this.bthInstId = bthInstId;
    }

    /**
     * <p>批量处理日期</p>
     */
    public Date getProcessDate() {
        return processDate;
    }

    /**
     * <p>批量处理日期</p>
     */
    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    /**
     * <p>步骤名称</p>
     */
    public String getStepName() {
        return stepName;
    }

    /**
     * <p>步骤名称</p>
     */
    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    /**
     * <p>开始时间</p>
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * <p>开始时间</p>
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>结束时间</p>
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * <p>结束时间</p>
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>当前提示消息</p>
     * <p>供诸如等待文件步骤等提供显示的信息，让监控人员知道当前步骤在做什么。</p>
     */
    public String getHintMessage() {
        return hintMessage;
    }

    /**
     * <p>当前提示消息</p>
     * <p>供诸如等待文件步骤等提供显示的信息，让监控人员知道当前步骤在做什么。</p>
     */
    public void setHintMessage(String hintMessage) {
        this.hintMessage = hintMessage;
    }

    /**
     * <p>步骤状态</p>
     */
    public String getStepStatus() {
        return stepStatus;
    }

    /**
     * <p>步骤状态</p>
     */
    public void setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
    }

    /**
     * <p>步骤退出信息</p>
     */
    public String getExitMessage() {
        return exitMessage;
    }

    /**
     * <p>步骤退出信息</p>
     */
    public void setExitMessage(String exitMessage) {
        this.exitMessage = exitMessage;
    }

    /**
     * <p>乐观锁版本号</p>
     */
    public Integer getJpaVersion() {
        return jpaVersion;
    }

    /**
     * <p>乐观锁版本号</p>
     */
    public void setJpaVersion(Integer jpaVersion) {
        this.jpaVersion = jpaVersion;
    }

    public Map<String, Serializable> convertToMap() {
        HashMap<String, Serializable> map = new HashMap<String, Serializable>();
        map.put("id", id);
        map.put("bthInstId", bthInstId);
        map.put("processDate", processDate);
        map.put("stepName", stepName);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        map.put("hintMessage", hintMessage);
        map.put("stepStatus", stepStatus);
        map.put("exitMessage", exitMessage);
        map.put("jpaVersion", jpaVersion);
        return map;
    }

    public void updateFromMap(Map<String, Serializable> map) {
        if (map.containsKey("id")) this.setId(DataTypeUtils.getIntegerValue(map.get("id")));
        if (map.containsKey("bthInstId")) this.setBthInstId(DataTypeUtils.getIntegerValue(map.get("bthInstId")));
        if (map.containsKey("processDate")) this.setProcessDate(DataTypeUtils.getDateValue(map.get("processDate")));
        if (map.containsKey("stepName")) this.setStepName(DataTypeUtils.getStringValue(map.get("stepName")));
        if (map.containsKey("startTime")) this.setStartTime(DataTypeUtils.getDateValue(map.get("startTime")));
        if (map.containsKey("endTime")) this.setEndTime(DataTypeUtils.getDateValue(map.get("endTime")));
        if (map.containsKey("hintMessage")) this.setHintMessage(DataTypeUtils.getStringValue(map.get("hintMessage")));
        if (map.containsKey("stepStatus")) this.setStepStatus(DataTypeUtils.getStringValue(map.get("stepStatus")));
        if (map.containsKey("exitMessage")) this.setExitMessage(DataTypeUtils.getStringValue(map.get("exitMessage")));
        if (map.containsKey("jpaVersion")) this.setJpaVersion(DataTypeUtils.getIntegerValue(map.get("jpaVersion")));
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode())+"["+
        "serialVersionUID="+serialVersionUID+
        ", id="+id+
        "id="+id+
        ", bthInstId="+bthInstId+
        "bthInstId="+bthInstId+
        ", processDate="+processDate+
        "processDate="+processDate+
        ", stepName="+stepName+
        "stepName="+stepName+
        ", startTime="+startTime+
        "startTime="+startTime+
        ", endTime="+endTime+
        "endTime="+endTime+
        ", hintMessage="+hintMessage+
        "hintMessage="+hintMessage+
        ", stepStatus="+stepStatus+
        "stepStatus="+stepStatus+
        ", exitMessage="+exitMessage+
        "exitMessage="+exitMessage+
        ", jpaVersion="+jpaVersion+
        "jpaVersion="+jpaVersion+
        "]";
    }

    public void fillDefaultValues() {
        if (bthInstId == null) bthInstId = 0;
        if (processDate == null) processDate = new Date();
        if (stepName == null) stepName = "";
        if (startTime == null) startTime = new Date();
        if (endTime == null) endTime = new Date();
        if (hintMessage == null) hintMessage = "";
        if (stepStatus == null) stepStatus = "";
        if (exitMessage == null) exitMessage = "";
        if (jpaVersion == null) jpaVersion = 0;
    }
}