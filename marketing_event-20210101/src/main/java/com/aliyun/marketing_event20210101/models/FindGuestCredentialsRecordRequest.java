// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class FindGuestCredentialsRecordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>34429</p>
     */
    @NameInMap("ActivityId")
    public String activityId;

    /**
     * <strong>example:</strong>
     * <p>2023-08-07 12:00:00</p>
     */
    @NameInMap("DateTimeString")
    public String dateTimeString;

    public static FindGuestCredentialsRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        FindGuestCredentialsRecordRequest self = new FindGuestCredentialsRecordRequest();
        return TeaModel.build(map, self);
    }

    public FindGuestCredentialsRecordRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public FindGuestCredentialsRecordRequest setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
        return this;
    }
    public String getDateTimeString() {
        return this.dateTimeString;
    }

}
