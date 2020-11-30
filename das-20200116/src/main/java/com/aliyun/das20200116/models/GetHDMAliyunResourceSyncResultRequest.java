// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetHDMAliyunResourceSyncResultRequest extends TeaModel {
    @NameInMap("Uid")
    public String uid;

    @NameInMap("accessKey")
    public String accessKey;

    @NameInMap("signature")
    public String signature;

    @NameInMap("timestamp")
    public String timestamp;

    @NameInMap("__context")
    public String context;

    @NameInMap("skipAuth")
    public String skipAuth;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("TaskId")
    public String taskId;

    public static GetHDMAliyunResourceSyncResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHDMAliyunResourceSyncResultRequest self = new GetHDMAliyunResourceSyncResultRequest();
        return TeaModel.build(map, self);
    }

    public GetHDMAliyunResourceSyncResultRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public GetHDMAliyunResourceSyncResultRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetHDMAliyunResourceSyncResultRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public GetHDMAliyunResourceSyncResultRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public GetHDMAliyunResourceSyncResultRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public GetHDMAliyunResourceSyncResultRequest setSkipAuth(String skipAuth) {
        this.skipAuth = skipAuth;
        return this;
    }
    public String getSkipAuth() {
        return this.skipAuth;
    }

    public GetHDMAliyunResourceSyncResultRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetHDMAliyunResourceSyncResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
