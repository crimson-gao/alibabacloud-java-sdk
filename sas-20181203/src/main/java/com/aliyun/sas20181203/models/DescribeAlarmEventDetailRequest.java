// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventDetailRequest extends TeaModel {
    // The unique ID of the alert event.
    // 
    // >  To query the details of an alert event, you must specify the unique ID of the alert event. You can call the [DescribeAlarmEventList](~~DescribeAlarmEventList~~) operation to query the unique IDs of alert events.
    @NameInMap("AlarmUniqueInfo")
    public String alarmUniqueInfo;

    // The ID of the request source. Set the value to **sas**.
    @NameInMap("From")
    public String from;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeAlarmEventDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmEventDetailRequest self = new DescribeAlarmEventDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmEventDetailRequest setAlarmUniqueInfo(String alarmUniqueInfo) {
        this.alarmUniqueInfo = alarmUniqueInfo;
        return this;
    }
    public String getAlarmUniqueInfo() {
        return this.alarmUniqueInfo;
    }

    public DescribeAlarmEventDetailRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeAlarmEventDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAlarmEventDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
