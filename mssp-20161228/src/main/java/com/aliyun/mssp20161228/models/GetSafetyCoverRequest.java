// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetSafetyCoverRequest extends TeaModel {
    /**
     * <p>Filter time type, supports filtering by the last 7 days, the last 30 days, the last half year, or custom time periods.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("DateType")
    public String dateType;

    /**
     * <p>End time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1732268720000</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>Start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1732255620000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    /**
     * <p>Alert event source.</p>
     * 
     * <strong>example:</strong>
     * <p>该接口不用传</p>
     */
    @NameInMap("SuspEventSource")
    public String suspEventSource;

    public static GetSafetyCoverRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSafetyCoverRequest self = new GetSafetyCoverRequest();
        return TeaModel.build(map, self);
    }

    public GetSafetyCoverRequest setDateType(String dateType) {
        this.dateType = dateType;
        return this;
    }
    public String getDateType() {
        return this.dateType;
    }

    public GetSafetyCoverRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetSafetyCoverRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetSafetyCoverRequest setSuspEventSource(String suspEventSource) {
        this.suspEventSource = suspEventSource;
        return this;
    }
    public String getSuspEventSource() {
        return this.suspEventSource;
    }

}
