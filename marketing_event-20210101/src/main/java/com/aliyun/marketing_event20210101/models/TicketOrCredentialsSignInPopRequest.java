// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class TicketOrCredentialsSignInPopRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4546</p>
     */
    @NameInMap("ActivityId")
    public String activityId;

    /**
     * <strong>example:</strong>
     * <p>4546-100000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>会议名称</p>
     */
    @NameInMap("ConferenceName")
    public String conferenceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Z10</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>入口名称</p>
     */
    @NameInMap("EntryName")
    public String entryName;

    /**
     * <strong>example:</strong>
     * <p>429005111100000</p>
     */
    @NameInMap("Idcard")
    public String idcard;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-25 14:11</p>
     */
    @NameInMap("SignTime")
    public String signTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static TicketOrCredentialsSignInPopRequest build(java.util.Map<String, ?> map) throws Exception {
        TicketOrCredentialsSignInPopRequest self = new TicketOrCredentialsSignInPopRequest();
        return TeaModel.build(map, self);
    }

    public TicketOrCredentialsSignInPopRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public TicketOrCredentialsSignInPopRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TicketOrCredentialsSignInPopRequest setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
        return this;
    }
    public String getConferenceName() {
        return this.conferenceName;
    }

    public TicketOrCredentialsSignInPopRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public TicketOrCredentialsSignInPopRequest setEntryName(String entryName) {
        this.entryName = entryName;
        return this;
    }
    public String getEntryName() {
        return this.entryName;
    }

    public TicketOrCredentialsSignInPopRequest setIdcard(String idcard) {
        this.idcard = idcard;
        return this;
    }
    public String getIdcard() {
        return this.idcard;
    }

    public TicketOrCredentialsSignInPopRequest setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public TicketOrCredentialsSignInPopRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
