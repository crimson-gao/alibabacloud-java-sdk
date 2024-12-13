// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    @NameInMap("endTimeMs")
    public Long endTimeMs;

    @NameInMap("instanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("instanceStatus")
    public java.util.List<String> instanceStatus;

    @NameInMap("limit")
    public String limit;

    /**
     * <p>The function version or alias.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("startKey")
    public String startKey;

    @NameInMap("startTimeMs")
    public Long startTimeMs;

    /**
     * <p>Specifies whether to list all instances. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("withAllActive")
    public Boolean withAllActive;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setEndTimeMs(Long endTimeMs) {
        this.endTimeMs = endTimeMs;
        return this;
    }
    public Long getEndTimeMs() {
        return this.endTimeMs;
    }

    public ListInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ListInstancesRequest setInstanceStatus(java.util.List<String> instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public java.util.List<String> getInstanceStatus() {
        return this.instanceStatus;
    }

    public ListInstancesRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public ListInstancesRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public ListInstancesRequest setStartKey(String startKey) {
        this.startKey = startKey;
        return this;
    }
    public String getStartKey() {
        return this.startKey;
    }

    public ListInstancesRequest setStartTimeMs(Long startTimeMs) {
        this.startTimeMs = startTimeMs;
        return this;
    }
    public Long getStartTimeMs() {
        return this.startTimeMs;
    }

    public ListInstancesRequest setWithAllActive(Boolean withAllActive) {
        this.withAllActive = withAllActive;
        return this;
    }
    public Boolean getWithAllActive() {
        return this.withAllActive;
    }

}
