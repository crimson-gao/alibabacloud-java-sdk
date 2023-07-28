// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPlanResponseBody extends TeaModel {
    /**
     * <p>Details about the execution of the SQL statement.</p>
     */
    @NameInMap("Detail")
    public DescribeSQLPlanResponseBodyDetail detail;

    /**
     * <p>The original details of the SQL statement.</p>
     */
    @NameInMap("OriginInfo")
    public String originInfo;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about the plan stages.</p>
     */
    @NameInMap("StageList")
    public java.util.List<DescribeSQLPlanResponseBodyStageList> stageList;

    public static DescribeSQLPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPlanResponseBody self = new DescribeSQLPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPlanResponseBody setDetail(DescribeSQLPlanResponseBodyDetail detail) {
        this.detail = detail;
        return this;
    }
    public DescribeSQLPlanResponseBodyDetail getDetail() {
        return this.detail;
    }

    public DescribeSQLPlanResponseBody setOriginInfo(String originInfo) {
        this.originInfo = originInfo;
        return this;
    }
    public String getOriginInfo() {
        return this.originInfo;
    }

    public DescribeSQLPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLPlanResponseBody setStageList(java.util.List<DescribeSQLPlanResponseBodyStageList> stageList) {
        this.stageList = stageList;
        return this;
    }
    public java.util.List<DescribeSQLPlanResponseBodyStageList> getStageList() {
        return this.stageList;
    }

    public static class DescribeSQLPlanResponseBodyDetail extends TeaModel {
        /**
         * <p>The total CPU time consumed by all operators on multithreaded servers when the SQL statement is executed. Unit: milliseconds.</p>
         */
        @NameInMap("CPUTime")
        public Long CPUTime;

        /**
         * <p>The IP address of the client that is used to execute the SQL statement.</p>
         */
        @NameInMap("ClientIP")
        public String clientIP;

        /**
         * <p>The name of the database on which the SQL statement is executed.</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The total number of rows generated by the SQL statement.</p>
         */
        @NameInMap("OutputRows")
        public Long outputRows;

        /**
         * <p>The total amount of data generated by the SQL statement. Unit: byte.</p>
         */
        @NameInMap("OutputSize")
        public Long outputSize;

        /**
         * <p>The maximum memory usage when the SQL statement is executed. Unit: byte.</p>
         */
        @NameInMap("PeakMemory")
        public Long peakMemory;

        /**
         * <p>The time when the execution plan of the SQL statement is generated. Unit: milliseconds.</p>
         */
        @NameInMap("PlanningTime")
        public Long planningTime;

        /**
         * <p>The amount of time that the SQL statement is queued before it is executed. Unit: milliseconds.</p>
         */
        @NameInMap("QueuedTime")
        public Long queuedTime;

        /**
         * <p>The SQL statement.</p>
         */
        @NameInMap("SQL")
        public String SQL;

        /**
         * <p>The beginning of the time range in which the SQL statement is executed. The time is in the UNIX timestamp format. Unit: milliseconds.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The final execution state of the SQL statement. Valid values:</p>
         * <br>
         * <p>*   FINISHED</p>
         * <p>*   FAILED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The total number of stages in the SQL statement.</p>
         */
        @NameInMap("TotalStage")
        public Long totalStage;

        /**
         * <p>The total number of tasks in the SQL statement.</p>
         */
        @NameInMap("TotalTask")
        public Long totalTask;

        /**
         * <p>The time consumed to execute the SQL statement. Unit: milliseconds.</p>
         */
        @NameInMap("TotalTime")
        public Long totalTime;

        /**
         * <p>The name of the user who submitted the SQL statement.</p>
         */
        @NameInMap("User")
        public String user;

        public static DescribeSQLPlanResponseBodyDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLPlanResponseBodyDetail self = new DescribeSQLPlanResponseBodyDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSQLPlanResponseBodyDetail setCPUTime(Long CPUTime) {
            this.CPUTime = CPUTime;
            return this;
        }
        public Long getCPUTime() {
            return this.CPUTime;
        }

        public DescribeSQLPlanResponseBodyDetail setClientIP(String clientIP) {
            this.clientIP = clientIP;
            return this;
        }
        public String getClientIP() {
            return this.clientIP;
        }

        public DescribeSQLPlanResponseBodyDetail setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeSQLPlanResponseBodyDetail setOutputRows(Long outputRows) {
            this.outputRows = outputRows;
            return this;
        }
        public Long getOutputRows() {
            return this.outputRows;
        }

        public DescribeSQLPlanResponseBodyDetail setOutputSize(Long outputSize) {
            this.outputSize = outputSize;
            return this;
        }
        public Long getOutputSize() {
            return this.outputSize;
        }

        public DescribeSQLPlanResponseBodyDetail setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeSQLPlanResponseBodyDetail setPlanningTime(Long planningTime) {
            this.planningTime = planningTime;
            return this;
        }
        public Long getPlanningTime() {
            return this.planningTime;
        }

        public DescribeSQLPlanResponseBodyDetail setQueuedTime(Long queuedTime) {
            this.queuedTime = queuedTime;
            return this;
        }
        public Long getQueuedTime() {
            return this.queuedTime;
        }

        public DescribeSQLPlanResponseBodyDetail setSQL(String SQL) {
            this.SQL = SQL;
            return this;
        }
        public String getSQL() {
            return this.SQL;
        }

        public DescribeSQLPlanResponseBodyDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeSQLPlanResponseBodyDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeSQLPlanResponseBodyDetail setTotalStage(Long totalStage) {
            this.totalStage = totalStage;
            return this;
        }
        public Long getTotalStage() {
            return this.totalStage;
        }

        public DescribeSQLPlanResponseBodyDetail setTotalTask(Long totalTask) {
            this.totalTask = totalTask;
            return this;
        }
        public Long getTotalTask() {
            return this.totalTask;
        }

        public DescribeSQLPlanResponseBodyDetail setTotalTime(Long totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public Long getTotalTime() {
            return this.totalTime;
        }

        public DescribeSQLPlanResponseBodyDetail setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class DescribeSQLPlanResponseBodyStageList extends TeaModel {
        /**
         * <p>The average `CPU Time` value on each compute node in the stage. Unit: milliseconds.</p>
         */
        @NameInMap("CPUTimeAvg")
        public Long CPUTimeAvg;

        /**
         * <p>The maximum `CPU Time` value on each compute node in the stage. Unit: milliseconds.</p>
         */
        @NameInMap("CPUTimeMax")
        public Long CPUTimeMax;

        /**
         * <p>The minimum `CPU Time` value on each compute node in the stage. Unit: milliseconds.</p>
         */
        @NameInMap("CPUTimeMin")
        public Long CPUTimeMin;

        /**
         * <p>The average amount of input data on each compute node in the stage. Unit: byte.</p>
         */
        @NameInMap("InputSizeAvg")
        public Long inputSizeAvg;

        /**
         * <p>The maximum amount of input data on each compute node in the stage. Unit: byte.</p>
         */
        @NameInMap("InputSizeMax")
        public Long inputSizeMax;

        /**
         * <p>The minimum amount of input data on each compute node in the stage. Unit: byte.</p>
         */
        @NameInMap("InputSizeMin")
        public Long inputSizeMin;

        /**
         * <p>The total CPU time consumed by all operators in the stage, which is equivalent to the total CPU time of the stage. You can use this parameter to determine which parts of the stage consume a large amount of computing resources. Unit: milliseconds.</p>
         */
        @NameInMap("OperatorCost")
        public Long operatorCost;

        /**
         * <p>The maximum memory usage when the SQL statement is executed. Unit: byte.</p>
         */
        @NameInMap("PeakMemory")
        public Long peakMemory;

        /**
         * <p>The average amount of data scanned by a scan operator on each storage node in the stage. Unit: byte.</p>
         */
        @NameInMap("ScanSizeAvg")
        public Long scanSizeAvg;

        /**
         * <p>The maximum amount of data scanned by a scan operator on each storage node in the stage. Unit: byte.</p>
         */
        @NameInMap("ScanSizeMax")
        public Long scanSizeMax;

        /**
         * <p>The minimum amount of data scanned by a scan operator on each storage node in the stage. Unit: byte.</p>
         */
        @NameInMap("ScanSizeMin")
        public Long scanSizeMin;

        /**
         * <p>The average amount of time consumed by a scan operator to read data on each storage node in the stage. Unit: milliseconds.</p>
         */
        @NameInMap("ScanTimeAvg")
        public Long scanTimeAvg;

        /**
         * <p>The maximum amount of time consumed by a scan operator to read data on each storage node in the stage. Unit: milliseconds.</p>
         */
        @NameInMap("ScanTimeMax")
        public Long scanTimeMax;

        /**
         * <p>The minimum amount of time consumed by a scan operator to read data on each storage node in the stage. Unit: milliseconds.</p>
         */
        @NameInMap("ScanTimeMin")
        public Long scanTimeMin;

        /**
         * <p>The ID of the stage.</p>
         */
        @NameInMap("StageId")
        public Integer stageId;

        /**
         * <p>The final execution state of the stage. Valid values:</p>
         * <br>
         * <p>*   FINISHED</p>
         * <p>*   CANCELED</p>
         * <p>*   ABORTED</p>
         * <p>*   FAILED</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeSQLPlanResponseBodyStageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLPlanResponseBodyStageList self = new DescribeSQLPlanResponseBodyStageList();
            return TeaModel.build(map, self);
        }

        public DescribeSQLPlanResponseBodyStageList setCPUTimeAvg(Long CPUTimeAvg) {
            this.CPUTimeAvg = CPUTimeAvg;
            return this;
        }
        public Long getCPUTimeAvg() {
            return this.CPUTimeAvg;
        }

        public DescribeSQLPlanResponseBodyStageList setCPUTimeMax(Long CPUTimeMax) {
            this.CPUTimeMax = CPUTimeMax;
            return this;
        }
        public Long getCPUTimeMax() {
            return this.CPUTimeMax;
        }

        public DescribeSQLPlanResponseBodyStageList setCPUTimeMin(Long CPUTimeMin) {
            this.CPUTimeMin = CPUTimeMin;
            return this;
        }
        public Long getCPUTimeMin() {
            return this.CPUTimeMin;
        }

        public DescribeSQLPlanResponseBodyStageList setInputSizeAvg(Long inputSizeAvg) {
            this.inputSizeAvg = inputSizeAvg;
            return this;
        }
        public Long getInputSizeAvg() {
            return this.inputSizeAvg;
        }

        public DescribeSQLPlanResponseBodyStageList setInputSizeMax(Long inputSizeMax) {
            this.inputSizeMax = inputSizeMax;
            return this;
        }
        public Long getInputSizeMax() {
            return this.inputSizeMax;
        }

        public DescribeSQLPlanResponseBodyStageList setInputSizeMin(Long inputSizeMin) {
            this.inputSizeMin = inputSizeMin;
            return this;
        }
        public Long getInputSizeMin() {
            return this.inputSizeMin;
        }

        public DescribeSQLPlanResponseBodyStageList setOperatorCost(Long operatorCost) {
            this.operatorCost = operatorCost;
            return this;
        }
        public Long getOperatorCost() {
            return this.operatorCost;
        }

        public DescribeSQLPlanResponseBodyStageList setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeSQLPlanResponseBodyStageList setScanSizeAvg(Long scanSizeAvg) {
            this.scanSizeAvg = scanSizeAvg;
            return this;
        }
        public Long getScanSizeAvg() {
            return this.scanSizeAvg;
        }

        public DescribeSQLPlanResponseBodyStageList setScanSizeMax(Long scanSizeMax) {
            this.scanSizeMax = scanSizeMax;
            return this;
        }
        public Long getScanSizeMax() {
            return this.scanSizeMax;
        }

        public DescribeSQLPlanResponseBodyStageList setScanSizeMin(Long scanSizeMin) {
            this.scanSizeMin = scanSizeMin;
            return this;
        }
        public Long getScanSizeMin() {
            return this.scanSizeMin;
        }

        public DescribeSQLPlanResponseBodyStageList setScanTimeAvg(Long scanTimeAvg) {
            this.scanTimeAvg = scanTimeAvg;
            return this;
        }
        public Long getScanTimeAvg() {
            return this.scanTimeAvg;
        }

        public DescribeSQLPlanResponseBodyStageList setScanTimeMax(Long scanTimeMax) {
            this.scanTimeMax = scanTimeMax;
            return this;
        }
        public Long getScanTimeMax() {
            return this.scanTimeMax;
        }

        public DescribeSQLPlanResponseBodyStageList setScanTimeMin(Long scanTimeMin) {
            this.scanTimeMin = scanTimeMin;
            return this;
        }
        public Long getScanTimeMin() {
            return this.scanTimeMin;
        }

        public DescribeSQLPlanResponseBodyStageList setStageId(Integer stageId) {
            this.stageId = stageId;
            return this;
        }
        public Integer getStageId() {
            return this.stageId;
        }

        public DescribeSQLPlanResponseBodyStageList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
