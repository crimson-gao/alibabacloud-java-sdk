// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeBadSqlDetectionResponseBody extends TeaModel {
    /**
     * <p>The information about the request denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
     *     &quot;AuthPrincipalOwnerId&quot;: &quot;1**<em><strong><strong><strong><strong><strong><strong><strong>7&quot;,
     *     &quot;EncodedDiagnosticMessage&quot;: &quot;AQIBIAAAAOPdwKY2QLOvgMEc7SkkoJfj1kvZwsaRqNYMh10Tv0wTe0fCzaCdrvgazfNb0EnJKETgXyhR+3BIQjx9WAqZryejBsp1Bl4qI5En/D9dEhcXAtKCxCmE2kZCiEzpy8BoEUt+bs0DmlaGWO5xkEpttypLIB4rUhDvZd+zwPg4EXk4KSSWSWsurxtqDkKEMshKlQFBTKvJcKwyhk62IeYly4hQ+5IpXjkh1GQXuDRCQ==&quot;,
     *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
     *     &quot;AuthPrincipalDisplayName&quot;: &quot;2</strong></strong></strong></strong></strong></strong></strong></em>9&quot;,
     *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
     *     &quot;AuthAction&quot;: &quot;adb:DescribeExcessivePrimaryKeys&quot;
     * }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-xxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The queried detection items and detection results.</p>
     */
    @NameInMap("DetectionItems")
    public java.util.List<DescribeBadSqlDetectionResponseBodyDetectionItems> detectionItems;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>584CFCAE-E3C8-5BBB-B46C-724E77A830A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeBadSqlDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBadSqlDetectionResponseBody self = new DescribeBadSqlDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBadSqlDetectionResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeBadSqlDetectionResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeBadSqlDetectionResponseBody setDetectionItems(java.util.List<DescribeBadSqlDetectionResponseBodyDetectionItems> detectionItems) {
        this.detectionItems = detectionItems;
        return this;
    }
    public java.util.List<DescribeBadSqlDetectionResponseBodyDetectionItems> getDetectionItems() {
        return this.detectionItems;
    }

    public DescribeBadSqlDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBadSqlDetectionResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBadSqlDetectionResponseBodyDetectionItemsResultsDiagnosisResults extends TeaModel {
        /**
         * <p>The diagnostic code.</p>
         * 
         * <strong>example:</strong>
         * <p>Large amounts of data are returned to the client.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The information about the diagnostic result.</p>
         * 
         * <strong>example:</strong>
         * <p>Large amounts of data are returned to the client. Import the data to OSS.</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The operator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>TableScan[234]</p>
         */
        @NameInMap("OperatorId")
        public String operatorId;

        /**
         * <p>The stage ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Stage[67]</p>
         */
        @NameInMap("StageId")
        public String stageId;

        public static DescribeBadSqlDetectionResponseBodyDetectionItemsResultsDiagnosisResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeBadSqlDetectionResponseBodyDetectionItemsResultsDiagnosisResults self = new DescribeBadSqlDetectionResponseBodyDetectionItemsResultsDiagnosisResults();
            return TeaModel.build(map, self);
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItemsResultsDiagnosisResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItemsResultsDiagnosisResults setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItemsResultsDiagnosisResults setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItemsResultsDiagnosisResults setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

    }

    public static class DescribeBadSqlDetectionResponseBodyDetectionItemsResults extends TeaModel {
        /**
         * <p>The total execution duration. Unit: milliseconds.</p>
         * <blockquote>
         * <p> This value is the cumulative value of the <code>QueuedTime</code>, <code>TotalPlanningTime</code>, and <code>ExecutionTime</code> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>709</p>
         */
        @NameInMap("Cost")
        public Long cost;

        /**
         * <p>The diagnostic result items.</p>
         */
        @NameInMap("DiagnosisResults")
        public java.util.List<DescribeBadSqlDetectionResponseBodyDetectionItemsResultsDiagnosisResults> diagnosisResults;

        /**
         * <p>The total CPU time consumed by all operators in the stage, which is equivalent to the total CPU time of the stage. You can use this parameter to determine which parts of the stage consume a large amount of computing resources. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2345</p>
         */
        @NameInMap("OperatorCost")
        public Long operatorCost;

        /**
         * <p>The amount of returned data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>235433</p>
         */
        @NameInMap("OutputDataSize")
        public Long outputDataSize;

        /**
         * <p>The SQL pattern ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3467484070025860498</p>
         */
        @NameInMap("PatternId")
        public String patternId;

        /**
         * <p>The peak memory. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("PeakMemory")
        public Long peakMemory;

        /**
         * <p>The query ID.</p>
         * 
         * <strong>example:</strong>
         * <p>202410161002191720161451770345363xxxx</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The SQL statement.</p>
         * <blockquote>
         * <p> For performance considerations, an SQL statement cannot exceed 5,120 characters in length. Otherwise, the SQL statement is truncated. You can call the <a href="https://help.aliyun.com/document_detail/308212.html">DownloadDiagnosisRecords</a> operation to download the information about SQL statements that meet a query condition for an AnalyticDB for MySQL cluster, including the complete SQL statements.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM device WHERE product_key = \&quot;h66zXfxet2X\&quot; AND name = \&quot;device@zntbtfptv5_9237117\&quot;</p>
         */
        @NameInMap("SQL")
        public String SQL;

        /**
         * <p>The amount of scanned data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2342</p>
         */
        @NameInMap("ScanSize")
        public Long scanSize;

        /**
         * <p>The start time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-06T02:11:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The total number of stages generated.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalStages")
        public Integer totalStages;

        public static DescribeBadSqlDetectionResponseBodyDetectionItemsResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeBadSqlDetectionResponseBodyDetectionItemsResults self = new DescribeBadSqlDetectionResponseBodyDetectionItemsResults();
            return TeaModel.build(map, self);
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItemsResults setCost(Long cost) {
            this.cost = cost;
            return this;
        }
        public Long getCost() {
            return this.cost;
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItemsResults setDiagnosisResults(java.util.List<DescribeBadSqlDetectionResponseBodyDetectionItemsResultsDiagnosisResults> diagnosisResults) {
            this.diagnosisResults = diagnosisResults;
            return this;
        }
        public java.util.List<DescribeBadSqlDetectionResponseBodyDetectionItemsResultsDiagnosisResults> getDiagnosisResults() {
            return this.diagnosisResults;
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItemsResults setOperatorCost(Long operatorCost) {
            this.operatorCost = operatorCost;
            return this;
        }
        public Long getOperatorCost() {
            return this.operatorCost;
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItemsResults setOutputDataSize(Long outputDataSize) {
            this.outputDataSize = outputDataSize;
            return this;
        }
        public Long getOutputDataSize() {
            return this.outputDataSize;
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItemsResults setPatternId(String patternId) {
            this.patternId = patternId;
            return this;
        }
        public String getPatternId() {
            return this.patternId;
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItemsResults setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItemsResults setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItemsResults setSQL(String SQL) {
            this.SQL = SQL;
            return this;
        }
        public String getSQL() {
            return this.SQL;
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItemsResults setScanSize(Long scanSize) {
            this.scanSize = scanSize;
            return this;
        }
        public Long getScanSize() {
            return this.scanSize;
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItemsResults setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItemsResults setTotalStages(Integer totalStages) {
            this.totalStages = totalStages;
            return this;
        }
        public Integer getTotalStages() {
            return this.totalStages;
        }

    }

    public static class DescribeBadSqlDetectionResponseBodyDetectionItems extends TeaModel {
        /**
         * <p>The information about the detection result.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL statements that result in high peak memory are detected.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the detection item.</p>
         * 
         * <strong>example:</strong>
         * <p>Cost</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The detection result items.</p>
         */
        @NameInMap("Results")
        public java.util.List<DescribeBadSqlDetectionResponseBodyDetectionItemsResults> results;

        /**
         * <p>The severity level of the detection result. Valid values:</p>
         * <ul>
         * <li>NORMAL</li>
         * <li>WARNING</li>
         * <li>CRITICAL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WARNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeBadSqlDetectionResponseBodyDetectionItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBadSqlDetectionResponseBodyDetectionItems self = new DescribeBadSqlDetectionResponseBodyDetectionItems();
            return TeaModel.build(map, self);
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItems setResults(java.util.List<DescribeBadSqlDetectionResponseBodyDetectionItemsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<DescribeBadSqlDetectionResponseBodyDetectionItemsResults> getResults() {
            return this.results;
        }

        public DescribeBadSqlDetectionResponseBodyDetectionItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
