// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryTreeResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListRepositoryTreeResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    public static ListRepositoryTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryTreeResponseBody self = new ListRepositoryTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryTreeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoryTreeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRepositoryTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryTreeResponseBody setResult(java.util.List<ListRepositoryTreeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryTreeResponseBodyResult> getResult() {
        return this.result;
    }

    public ListRepositoryTreeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRepositoryTreeResponseBodyResult extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("isLFS")
        public Boolean isLFS;

        @NameInMap("mode")
        public String mode;

        @NameInMap("name")
        public String name;

        @NameInMap("path")
        public String path;

        @NameInMap("type")
        public String type;

        public static ListRepositoryTreeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryTreeResponseBodyResult self = new ListRepositoryTreeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryTreeResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRepositoryTreeResponseBodyResult setIsLFS(Boolean isLFS) {
            this.isLFS = isLFS;
            return this;
        }
        public Boolean getIsLFS() {
            return this.isLFS;
        }

        public ListRepositoryTreeResponseBodyResult setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListRepositoryTreeResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoryTreeResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListRepositoryTreeResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
