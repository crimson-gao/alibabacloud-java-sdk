// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class BindGuestRfidPopRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4546</p>
     */
    @NameInMap("ActivityId")
    public Long activityId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Z10</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <strong>example:</strong>
     * <p>2024-09-25 14:11</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2024-09-25 14:11</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>451246</p>
     */
    @NameInMap("GuestTicketRecordId")
    public Long guestTicketRecordId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asdojzopf</p>
     */
    @NameInMap("Rfid")
    public String rfid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4546-100000</p>
     */
    @NameInMap("TicketCode")
    public String ticketCode;

    public static BindGuestRfidPopRequest build(java.util.Map<String, ?> map) throws Exception {
        BindGuestRfidPopRequest self = new BindGuestRfidPopRequest();
        return TeaModel.build(map, self);
    }

    public BindGuestRfidPopRequest setActivityId(Long activityId) {
        this.activityId = activityId;
        return this;
    }
    public Long getActivityId() {
        return this.activityId;
    }

    public BindGuestRfidPopRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BindGuestRfidPopRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public BindGuestRfidPopRequest setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public BindGuestRfidPopRequest setGuestTicketRecordId(Long guestTicketRecordId) {
        this.guestTicketRecordId = guestTicketRecordId;
        return this;
    }
    public Long getGuestTicketRecordId() {
        return this.guestTicketRecordId;
    }

    public BindGuestRfidPopRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public BindGuestRfidPopRequest setRfid(String rfid) {
        this.rfid = rfid;
        return this;
    }
    public String getRfid() {
        return this.rfid;
    }

    public BindGuestRfidPopRequest setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
        return this;
    }
    public String getTicketCode() {
        return this.ticketCode;
    }

}
