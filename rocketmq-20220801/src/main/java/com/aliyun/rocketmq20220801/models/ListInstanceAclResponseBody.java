// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstanceAclResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>MissingInstanceId</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListInstanceAclResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>InstanceId</p>
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
     * <p>The instance cannot be found.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>DA4D2F89-E2C8-5F04-936B-60D55B055FA7</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListInstanceAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceAclResponseBody self = new ListInstanceAclResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceAclResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListInstanceAclResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceAclResponseBody setData(ListInstanceAclResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstanceAclResponseBodyData getData() {
        return this.data;
    }

    public ListInstanceAclResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListInstanceAclResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListInstanceAclResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstanceAclResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceAclResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstanceAclResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>APACHE</p>
         */
        @NameInMap("aclType")
        public String aclType;

        @NameInMap("actions")
        public java.util.List<String> actions;

        /**
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("decision")
        public String decision;

        /**
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("ipWhitelists")
        public java.util.List<String> ipWhitelists;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("resourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>Topic</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("username")
        public String username;

        public static ListInstanceAclResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceAclResponseBodyDataList self = new ListInstanceAclResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListInstanceAclResponseBodyDataList setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public ListInstanceAclResponseBodyDataList setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public ListInstanceAclResponseBodyDataList setDecision(String decision) {
            this.decision = decision;
            return this;
        }
        public String getDecision() {
            return this.decision;
        }

        public ListInstanceAclResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceAclResponseBodyDataList setIpWhitelists(java.util.List<String> ipWhitelists) {
            this.ipWhitelists = ipWhitelists;
            return this;
        }
        public java.util.List<String> getIpWhitelists() {
            return this.ipWhitelists;
        }

        public ListInstanceAclResponseBodyDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstanceAclResponseBodyDataList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListInstanceAclResponseBodyDataList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListInstanceAclResponseBodyDataList setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListInstanceAclResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListInstanceAclResponseBodyDataList> list;

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
         * <p>24</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListInstanceAclResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceAclResponseBodyData self = new ListInstanceAclResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceAclResponseBodyData setList(java.util.List<ListInstanceAclResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListInstanceAclResponseBodyDataList> getList() {
            return this.list;
        }

        public ListInstanceAclResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListInstanceAclResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListInstanceAclResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
