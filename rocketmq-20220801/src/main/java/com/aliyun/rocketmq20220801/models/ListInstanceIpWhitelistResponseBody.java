// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstanceIpWhitelistResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>Instance.NotFound</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListInstanceIpWhitelistResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Parameter instanceId is mandatory for this action .</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7358418D-83BD-507A-8079-611C63E05674</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListInstanceIpWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceIpWhitelistResponseBody self = new ListInstanceIpWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceIpWhitelistResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListInstanceIpWhitelistResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceIpWhitelistResponseBody setData(ListInstanceIpWhitelistResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstanceIpWhitelistResponseBodyData getData() {
        return this.data;
    }

    public ListInstanceIpWhitelistResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListInstanceIpWhitelistResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListInstanceIpWhitelistResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstanceIpWhitelistResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceIpWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceIpWhitelistResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstanceIpWhitelistResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<String> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListInstanceIpWhitelistResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceIpWhitelistResponseBodyData self = new ListInstanceIpWhitelistResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceIpWhitelistResponseBodyData setList(java.util.List<String> list) {
            this.list = list;
            return this;
        }
        public java.util.List<String> getList() {
            return this.list;
        }

        public ListInstanceIpWhitelistResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListInstanceIpWhitelistResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListInstanceIpWhitelistResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
