// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityFollowerResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetQualityFollowerResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>You have no permission.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>38cbdef0-f6cf-49</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetQualityFollowerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityFollowerResponseBody self = new GetQualityFollowerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityFollowerResponseBody setData(java.util.List<GetQualityFollowerResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetQualityFollowerResponseBodyData> getData() {
        return this.data;
    }

    public GetQualityFollowerResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetQualityFollowerResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetQualityFollowerResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityFollowerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityFollowerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityFollowerResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlarmMode")
        public Integer alarmMode;

        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Follower")
        public String follower;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("FollowerAccountName")
        public String followerAccountName;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <strong>example:</strong>
         * <p>autotest</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>dual</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static GetQualityFollowerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityFollowerResponseBodyData self = new GetQualityFollowerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityFollowerResponseBodyData setAlarmMode(Integer alarmMode) {
            this.alarmMode = alarmMode;
            return this;
        }
        public Integer getAlarmMode() {
            return this.alarmMode;
        }

        public GetQualityFollowerResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetQualityFollowerResponseBodyData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetQualityFollowerResponseBodyData setFollower(String follower) {
            this.follower = follower;
            return this;
        }
        public String getFollower() {
            return this.follower;
        }

        public GetQualityFollowerResponseBodyData setFollowerAccountName(String followerAccountName) {
            this.followerAccountName = followerAccountName;
            return this;
        }
        public String getFollowerAccountName() {
            return this.followerAccountName;
        }

        public GetQualityFollowerResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityFollowerResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetQualityFollowerResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetQualityFollowerResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
