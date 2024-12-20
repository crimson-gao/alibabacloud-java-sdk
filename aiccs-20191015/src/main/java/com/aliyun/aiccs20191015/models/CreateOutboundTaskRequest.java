// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateOutboundTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ani")
    public String ani;

    @NameInMap("CallInfos")
    public String callInfos;

    @NameInMap("DepartmentId")
    public Long departmentId;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ExtAttrs")
    public String extAttrs;

    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Model")
    public Integer model;

    @NameInMap("RetryInterval")
    public Integer retryInterval;

    @NameInMap("RetryTime")
    public Integer retryTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SkillGroup")
    public Long skillGroup;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskType")
    public Integer taskType;

    public static CreateOutboundTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOutboundTaskRequest self = new CreateOutboundTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateOutboundTaskRequest setAni(String ani) {
        this.ani = ani;
        return this;
    }
    public String getAni() {
        return this.ani;
    }

    public CreateOutboundTaskRequest setCallInfos(String callInfos) {
        this.callInfos = callInfos;
        return this;
    }
    public String getCallInfos() {
        return this.callInfos;
    }

    public CreateOutboundTaskRequest setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public Long getDepartmentId() {
        return this.departmentId;
    }

    public CreateOutboundTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOutboundTaskRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CreateOutboundTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateOutboundTaskRequest setExtAttrs(String extAttrs) {
        this.extAttrs = extAttrs;
        return this;
    }
    public String getExtAttrs() {
        return this.extAttrs;
    }

    public CreateOutboundTaskRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateOutboundTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateOutboundTaskRequest setModel(Integer model) {
        this.model = model;
        return this;
    }
    public Integer getModel() {
        return this.model;
    }

    public CreateOutboundTaskRequest setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public CreateOutboundTaskRequest setRetryTime(Integer retryTime) {
        this.retryTime = retryTime;
        return this;
    }
    public Integer getRetryTime() {
        return this.retryTime;
    }

    public CreateOutboundTaskRequest setSkillGroup(Long skillGroup) {
        this.skillGroup = skillGroup;
        return this;
    }
    public Long getSkillGroup() {
        return this.skillGroup;
    }

    public CreateOutboundTaskRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public CreateOutboundTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateOutboundTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateOutboundTaskRequest setTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }
    public Integer getTaskType() {
        return this.taskType;
    }

}
