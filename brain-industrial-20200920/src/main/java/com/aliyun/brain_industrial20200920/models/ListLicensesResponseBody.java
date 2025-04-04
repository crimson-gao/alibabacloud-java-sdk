// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListLicensesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("LicenseList")
    public java.util.List<ListLicensesResponseBodyLicenseList> licenseList;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>FAC892CE-5A94-5616-91DC-629B09CC6792</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalPage")
    public String totalPage;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalPageCount")
    public String totalPageCount;

    public static ListLicensesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLicensesResponseBody self = new ListLicensesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLicensesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListLicensesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLicensesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListLicensesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListLicensesResponseBody setLicenseList(java.util.List<ListLicensesResponseBodyLicenseList> licenseList) {
        this.licenseList = licenseList;
        return this;
    }
    public java.util.List<ListLicensesResponseBodyLicenseList> getLicenseList() {
        return this.licenseList;
    }

    public ListLicensesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLicensesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLicensesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLicensesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLicensesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListLicensesResponseBody setTotalPage(String totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public String getTotalPage() {
        return this.totalPage;
    }

    public ListLicensesResponseBody setTotalPageCount(String totalPageCount) {
        this.totalPageCount = totalPageCount;
        return this;
    }
    public String getTotalPageCount() {
        return this.totalPageCount;
    }

    public static class ListLicensesResponseBodyLicenseList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-10-14 14:15:45</p>
         */
        @NameInMap("ActivateTime")
        public String activateTime;

        @NameInMap("AdaptiveMachine")
        public Integer adaptiveMachine;

        @NameInMap("AllDuration")
        public String allDuration;

        /**
         * <strong>example:</strong>
         * <p>2024-10-14 13:17:20</p>
         */
        @NameInMap("BuyTime")
        public String buyTime;

        /**
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("CpuLimit")
        public Integer cpuLimit;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>2024-10-14 14:15:45</p>
         */
        @NameInMap("EffectTime")
        public String effectTime;

        /**
         * <strong>example:</strong>
         * <p>2025-10-14 14:15:45</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>451f14ee73604aesdfe4da606764ce09</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>aics_1000</p>
         */
        @NameInMap("LicenseSpecCode")
        public String licenseSpecCode;

        @NameInMap("LicenseSpecName")
        public String licenseSpecName;

        /**
         * <strong>example:</strong>
         * <p>brainindustrial_aicsruntime_public_cn</p>
         */
        @NameInMap("LicenseSpecType")
        public String licenseSpecType;

        /**
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("MemoryLimit")
        public Integer memoryLimit;

        /**
         * <strong>example:</strong>
         * <p>activated</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("UnActivateAllDuration")
        public String unActivateAllDuration;

        public static ListLicensesResponseBodyLicenseList build(java.util.Map<String, ?> map) throws Exception {
            ListLicensesResponseBodyLicenseList self = new ListLicensesResponseBodyLicenseList();
            return TeaModel.build(map, self);
        }

        public ListLicensesResponseBodyLicenseList setActivateTime(String activateTime) {
            this.activateTime = activateTime;
            return this;
        }
        public String getActivateTime() {
            return this.activateTime;
        }

        public ListLicensesResponseBodyLicenseList setAdaptiveMachine(Integer adaptiveMachine) {
            this.adaptiveMachine = adaptiveMachine;
            return this;
        }
        public Integer getAdaptiveMachine() {
            return this.adaptiveMachine;
        }

        public ListLicensesResponseBodyLicenseList setAllDuration(String allDuration) {
            this.allDuration = allDuration;
            return this;
        }
        public String getAllDuration() {
            return this.allDuration;
        }

        public ListLicensesResponseBodyLicenseList setBuyTime(String buyTime) {
            this.buyTime = buyTime;
            return this;
        }
        public String getBuyTime() {
            return this.buyTime;
        }

        public ListLicensesResponseBodyLicenseList setCpuLimit(Integer cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }
        public Integer getCpuLimit() {
            return this.cpuLimit;
        }

        public ListLicensesResponseBodyLicenseList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLicensesResponseBodyLicenseList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListLicensesResponseBodyLicenseList setEffectTime(String effectTime) {
            this.effectTime = effectTime;
            return this;
        }
        public String getEffectTime() {
            return this.effectTime;
        }

        public ListLicensesResponseBodyLicenseList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListLicensesResponseBodyLicenseList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLicensesResponseBodyLicenseList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListLicensesResponseBodyLicenseList setLicenseSpecCode(String licenseSpecCode) {
            this.licenseSpecCode = licenseSpecCode;
            return this;
        }
        public String getLicenseSpecCode() {
            return this.licenseSpecCode;
        }

        public ListLicensesResponseBodyLicenseList setLicenseSpecName(String licenseSpecName) {
            this.licenseSpecName = licenseSpecName;
            return this;
        }
        public String getLicenseSpecName() {
            return this.licenseSpecName;
        }

        public ListLicensesResponseBodyLicenseList setLicenseSpecType(String licenseSpecType) {
            this.licenseSpecType = licenseSpecType;
            return this;
        }
        public String getLicenseSpecType() {
            return this.licenseSpecType;
        }

        public ListLicensesResponseBodyLicenseList setMemoryLimit(Integer memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public Integer getMemoryLimit() {
            return this.memoryLimit;
        }

        public ListLicensesResponseBodyLicenseList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLicensesResponseBodyLicenseList setUnActivateAllDuration(String unActivateAllDuration) {
            this.unActivateAllDuration = unActivateAllDuration;
            return this;
        }
        public String getUnActivateAllDuration() {
            return this.unActivateAllDuration;
        }

    }

}
