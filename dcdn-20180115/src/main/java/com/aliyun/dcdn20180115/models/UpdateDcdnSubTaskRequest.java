// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnSubTaskRequest extends TeaModel {
    /**
     * <p>The domain names that you want to include in the operations report. If you do not specify a domain name, all domain names that belong to your Alibaba Cloud account are included.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time of the operations report. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-17T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The IDs of the metrics that you want to update. Separate IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/270075.html">DescribeDcdnSubList</a> operation to query the IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>2,4,6</p>
     */
    @NameInMap("ReportIds")
    public String reportIds;

    /**
     * <p>The start time of the operations report. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-04-17T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static UpdateDcdnSubTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnSubTaskRequest self = new UpdateDcdnSubTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnSubTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateDcdnSubTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateDcdnSubTaskRequest setReportIds(String reportIds) {
        this.reportIds = reportIds;
        return this;
    }
    public String getReportIds() {
        return this.reportIds;
    }

    public UpdateDcdnSubTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
