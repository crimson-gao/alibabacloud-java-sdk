// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeFlowlogsResponseBody extends TeaModel {
    /**
     * <p>The information about the flow log.</p>
     */
    @NameInMap("FlowLogs")
    public DescribeFlowlogsResponseBodyFlowLogs flowLogs;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F7DDDC17-FA06-4AC2-8F35-59D2470FCFC1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeFlowlogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowlogsResponseBody self = new DescribeFlowlogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowlogsResponseBody setFlowLogs(DescribeFlowlogsResponseBodyFlowLogs flowLogs) {
        this.flowLogs = flowLogs;
        return this;
    }
    public DescribeFlowlogsResponseBodyFlowLogs getFlowLogs() {
        return this.flowLogs;
    }

    public DescribeFlowlogsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFlowlogsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeFlowlogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowlogsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeFlowlogsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeFlowlogsResponseBodyFlowLogsFlowLogTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeFlowlogsResponseBodyFlowLogsFlowLogTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowlogsResponseBodyFlowLogsFlowLogTagsTag self = new DescribeFlowlogsResponseBodyFlowLogsFlowLogTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLogTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLogTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeFlowlogsResponseBodyFlowLogsFlowLogTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeFlowlogsResponseBodyFlowLogsFlowLogTagsTag> tag;

        public static DescribeFlowlogsResponseBodyFlowLogsFlowLogTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowlogsResponseBodyFlowLogsFlowLogTags self = new DescribeFlowlogsResponseBodyFlowLogsFlowLogTags();
            return TeaModel.build(map, self);
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLogTags setTag(java.util.List<DescribeFlowlogsResponseBodyFlowLogsFlowLogTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeFlowlogsResponseBodyFlowLogsFlowLogTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeFlowlogsResponseBodyFlowLogsFlowLog extends TeaModel {
        /**
         * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-7qthudw0ll6jmc****</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The time when the flow log was created.</p>
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-24T13:00:52Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>myFlowlog</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>flowlog-m5evbtbpt****</p>
         */
        @NameInMap("FlowLogId")
        public String flowLogId;

        /**
         * <p>The name of the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>myFlowlog</p>
         */
        @NameInMap("FlowLogName")
        public String flowLogName;

        /**
         * <p>The flow log version.</p>
         * <p>Flow logs are automatically created in the latest version, which is <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FlowLogVersion")
        public String flowLogVersion;

        /**
         * <p>The time window for collecting log data. Unit: seconds. Valid values: <strong>60</strong> or <strong>600</strong> Default value: <strong>600</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Long interval;

        /**
         * <p>The string that defines the format of the flow log. Format:</p>
         * <p><code>${Field 1}${Field 2}${Field 3}</code></p>
         * 
         * <strong>example:</strong>
         * <p>${srcaddr}${dstaddr}${bytes}</p>
         */
        @NameInMap("LogFormatString")
        public String logFormatString;

        /**
         * <p>The Logstore that stores the captured traffic data.</p>
         * 
         * <strong>example:</strong>
         * <p>FlowLogStore</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The name of the project that stores the captured traffic data.</p>
         * 
         * <strong>example:</strong>
         * <p>FlowLogProject</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The region ID of the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the flow log. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong>: The flow log is enabled.</li>
         * <li><strong>Inactive</strong>: The flow log is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public DescribeFlowlogsResponseBodyFlowLogsFlowLogTags tags;

        /**
         * <p>The ID of the network instance connection</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-5x4o4ynzuqbv6g****</p>
         */
        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        /**
         * <p>The ID of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-bp1g9313sx675zr1lajmj</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        public static DescribeFlowlogsResponseBodyFlowLogsFlowLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowlogsResponseBodyFlowLogsFlowLog self = new DescribeFlowlogsResponseBodyFlowLogsFlowLog();
            return TeaModel.build(map, self);
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLog setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLog setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLog setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLog setFlowLogId(String flowLogId) {
            this.flowLogId = flowLogId;
            return this;
        }
        public String getFlowLogId() {
            return this.flowLogId;
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLog setFlowLogName(String flowLogName) {
            this.flowLogName = flowLogName;
            return this;
        }
        public String getFlowLogName() {
            return this.flowLogName;
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLog setFlowLogVersion(String flowLogVersion) {
            this.flowLogVersion = flowLogVersion;
            return this;
        }
        public String getFlowLogVersion() {
            return this.flowLogVersion;
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLog setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLog setLogFormatString(String logFormatString) {
            this.logFormatString = logFormatString;
            return this;
        }
        public String getLogFormatString() {
            return this.logFormatString;
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLog setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLog setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLog setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLog setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLog setTags(DescribeFlowlogsResponseBodyFlowLogsFlowLogTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeFlowlogsResponseBodyFlowLogsFlowLogTags getTags() {
            return this.tags;
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLog setTransitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        public DescribeFlowlogsResponseBodyFlowLogsFlowLog setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

    }

    public static class DescribeFlowlogsResponseBodyFlowLogs extends TeaModel {
        @NameInMap("FlowLog")
        public java.util.List<DescribeFlowlogsResponseBodyFlowLogsFlowLog> flowLog;

        public static DescribeFlowlogsResponseBodyFlowLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowlogsResponseBodyFlowLogs self = new DescribeFlowlogsResponseBodyFlowLogs();
            return TeaModel.build(map, self);
        }

        public DescribeFlowlogsResponseBodyFlowLogs setFlowLog(java.util.List<DescribeFlowlogsResponseBodyFlowLogsFlowLog> flowLog) {
            this.flowLog = flowLog;
            return this;
        }
        public java.util.List<DescribeFlowlogsResponseBodyFlowLogsFlowLog> getFlowLog() {
            return this.flowLog;
        }

    }

}
