// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetWorkTaskSummaryResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data returned by the interface.</p>
     */
    @NameInMap("Data")
    public GetWorkTaskSummaryResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Prompt message for the response result.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EF801DD1-D934-51B3-92D4-776CE17B184F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the call was successful. - <strong>true</strong>: The call was successful. - <strong>false</strong>: The call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetWorkTaskSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkTaskSummaryResponseBody self = new GetWorkTaskSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkTaskSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkTaskSummaryResponseBody setData(GetWorkTaskSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkTaskSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetWorkTaskSummaryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetWorkTaskSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkTaskSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkTaskSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkTaskSummaryResponseBodyData extends TeaModel {
        /**
         * <p>Average response time (in minutes).</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("DealAverageDuration")
        public Long dealAverageDuration;

        /**
         * <p>Year-over-year growth rate of average response time.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DealAverageDurationGrowthRate")
        public String dealAverageDurationGrowthRate;

        /**
         * <p>Number of work orders responded to.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DealWorkTaskCount")
        public Long dealWorkTaskCount;

        /**
         * <p>Year-over-year growth rate of the number of work orders responded to.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DealWorkTaskCountRate")
        public String dealWorkTaskCountRate;

        /**
         * <p>Number of service responses.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WorkTaskCount")
        public Long workTaskCount;

        /**
         * <p>Problem closure rate.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("WorkTaskDealRate")
        public String workTaskDealRate;

        /**
         * <p>Year-over-year growth rate of problem closure rate.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("WorkTaskDealRateGrowthRate")
        public String workTaskDealRateGrowthRate;

        /**
         * <p>Year-over-year growth rate of service responses.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("WorkTaskGrowthRate")
        public String workTaskGrowthRate;

        public static GetWorkTaskSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkTaskSummaryResponseBodyData self = new GetWorkTaskSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkTaskSummaryResponseBodyData setDealAverageDuration(Long dealAverageDuration) {
            this.dealAverageDuration = dealAverageDuration;
            return this;
        }
        public Long getDealAverageDuration() {
            return this.dealAverageDuration;
        }

        public GetWorkTaskSummaryResponseBodyData setDealAverageDurationGrowthRate(String dealAverageDurationGrowthRate) {
            this.dealAverageDurationGrowthRate = dealAverageDurationGrowthRate;
            return this;
        }
        public String getDealAverageDurationGrowthRate() {
            return this.dealAverageDurationGrowthRate;
        }

        public GetWorkTaskSummaryResponseBodyData setDealWorkTaskCount(Long dealWorkTaskCount) {
            this.dealWorkTaskCount = dealWorkTaskCount;
            return this;
        }
        public Long getDealWorkTaskCount() {
            return this.dealWorkTaskCount;
        }

        public GetWorkTaskSummaryResponseBodyData setDealWorkTaskCountRate(String dealWorkTaskCountRate) {
            this.dealWorkTaskCountRate = dealWorkTaskCountRate;
            return this;
        }
        public String getDealWorkTaskCountRate() {
            return this.dealWorkTaskCountRate;
        }

        public GetWorkTaskSummaryResponseBodyData setWorkTaskCount(Long workTaskCount) {
            this.workTaskCount = workTaskCount;
            return this;
        }
        public Long getWorkTaskCount() {
            return this.workTaskCount;
        }

        public GetWorkTaskSummaryResponseBodyData setWorkTaskDealRate(String workTaskDealRate) {
            this.workTaskDealRate = workTaskDealRate;
            return this;
        }
        public String getWorkTaskDealRate() {
            return this.workTaskDealRate;
        }

        public GetWorkTaskSummaryResponseBodyData setWorkTaskDealRateGrowthRate(String workTaskDealRateGrowthRate) {
            this.workTaskDealRateGrowthRate = workTaskDealRateGrowthRate;
            return this;
        }
        public String getWorkTaskDealRateGrowthRate() {
            return this.workTaskDealRateGrowthRate;
        }

        public GetWorkTaskSummaryResponseBodyData setWorkTaskGrowthRate(String workTaskGrowthRate) {
            this.workTaskGrowthRate = workTaskGrowthRate;
            return this;
        }
        public String getWorkTaskGrowthRate() {
            return this.workTaskGrowthRate;
        }

    }

}
