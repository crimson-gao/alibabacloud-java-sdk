// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBuildRiskByKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeImageBuildRiskByKeyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>52870893-48A7-5A9E-9E05-6253E5B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeImageBuildRiskByKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBuildRiskByKeyResponseBody self = new DescribeImageBuildRiskByKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageBuildRiskByKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeImageBuildRiskByKeyResponseBody setData(DescribeImageBuildRiskByKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeImageBuildRiskByKeyResponseBodyData getData() {
        return this.data;
    }

    public DescribeImageBuildRiskByKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeImageBuildRiskByKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageBuildRiskByKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeImageBuildRiskByKeyResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>do not use root user</p>
         */
        @NameInMap("Advice")
        public String advice;

        /**
         * <strong>example:</strong>
         * <p>the root user has excessive permissions</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>user root</p>
         */
        @NameInMap("LayerCmd")
        public String layerCmd;

        /**
         * <strong>example:</strong>
         * <p>6ec898e6274f942e0e4a053eff1c3119026a6704e56cff206b2cec71f636****</p>
         */
        @NameInMap("LayerDigest")
        public String layerDigest;

        /**
         * <strong>example:</strong>
         * <p>the root user has excessive permissions</p>
         */
        @NameInMap("Promt")
        public String promt;

        /**
         * <strong>example:</strong>
         * <p>other</p>
         */
        @NameInMap("RiskClass")
        public String riskClass;

        /**
         * <strong>example:</strong>
         * <p>other</p>
         */
        @NameInMap("RiskClassName")
        public String riskClassName;

        /**
         * <strong>example:</strong>
         * <p>no_user</p>
         */
        @NameInMap("RiskKey")
        public String riskKey;

        /**
         * <strong>example:</strong>
         * <p>no_user</p>
         */
        @NameInMap("RiskKeyName")
        public String riskKeyName;

        /**
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static DescribeImageBuildRiskByKeyResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageBuildRiskByKeyResponseBodyDataList self = new DescribeImageBuildRiskByKeyResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeImageBuildRiskByKeyResponseBodyDataList setAdvice(String advice) {
            this.advice = advice;
            return this;
        }
        public String getAdvice() {
            return this.advice;
        }

        public DescribeImageBuildRiskByKeyResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImageBuildRiskByKeyResponseBodyDataList setLayerCmd(String layerCmd) {
            this.layerCmd = layerCmd;
            return this;
        }
        public String getLayerCmd() {
            return this.layerCmd;
        }

        public DescribeImageBuildRiskByKeyResponseBodyDataList setLayerDigest(String layerDigest) {
            this.layerDigest = layerDigest;
            return this;
        }
        public String getLayerDigest() {
            return this.layerDigest;
        }

        public DescribeImageBuildRiskByKeyResponseBodyDataList setPromt(String promt) {
            this.promt = promt;
            return this;
        }
        public String getPromt() {
            return this.promt;
        }

        public DescribeImageBuildRiskByKeyResponseBodyDataList setRiskClass(String riskClass) {
            this.riskClass = riskClass;
            return this;
        }
        public String getRiskClass() {
            return this.riskClass;
        }

        public DescribeImageBuildRiskByKeyResponseBodyDataList setRiskClassName(String riskClassName) {
            this.riskClassName = riskClassName;
            return this;
        }
        public String getRiskClassName() {
            return this.riskClassName;
        }

        public DescribeImageBuildRiskByKeyResponseBodyDataList setRiskKey(String riskKey) {
            this.riskKey = riskKey;
            return this;
        }
        public String getRiskKey() {
            return this.riskKey;
        }

        public DescribeImageBuildRiskByKeyResponseBodyDataList setRiskKeyName(String riskKeyName) {
            this.riskKeyName = riskKeyName;
            return this;
        }
        public String getRiskKeyName() {
            return this.riskKeyName;
        }

        public DescribeImageBuildRiskByKeyResponseBodyDataList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class DescribeImageBuildRiskByKeyResponseBodyDataPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>109</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeImageBuildRiskByKeyResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageBuildRiskByKeyResponseBodyDataPageInfo self = new DescribeImageBuildRiskByKeyResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageBuildRiskByKeyResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageBuildRiskByKeyResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageBuildRiskByKeyResponseBodyDataPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeImageBuildRiskByKeyResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<DescribeImageBuildRiskByKeyResponseBodyDataList> list;

        @NameInMap("PageInfo")
        public DescribeImageBuildRiskByKeyResponseBodyDataPageInfo pageInfo;

        public static DescribeImageBuildRiskByKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageBuildRiskByKeyResponseBodyData self = new DescribeImageBuildRiskByKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeImageBuildRiskByKeyResponseBodyData setList(java.util.List<DescribeImageBuildRiskByKeyResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeImageBuildRiskByKeyResponseBodyDataList> getList() {
            return this.list;
        }

        public DescribeImageBuildRiskByKeyResponseBodyData setPageInfo(DescribeImageBuildRiskByKeyResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public DescribeImageBuildRiskByKeyResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
