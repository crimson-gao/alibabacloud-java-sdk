// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetFileLastCommitResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>F7B85D1B-D1C2-140F-A039-341859F130B9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetFileLastCommitResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetFileLastCommitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileLastCommitResponseBody self = new GetFileLastCommitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileLastCommitResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetFileLastCommitResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetFileLastCommitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileLastCommitResponseBody setResult(GetFileLastCommitResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetFileLastCommitResponseBodyResult getResult() {
        return this.result;
    }

    public GetFileLastCommitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFileLastCommitResponseBodyResultSignature extends TeaModel {
        /**
         * <p>GPG密钥ID</p>
         * 
         * <strong>example:</strong>
         * <p>34d2c47c7ce46a5c4639c5ffe208</p>
         */
        @NameInMap("gpgKeyId")
        public String gpgKeyId;

        /**
         * <strong>example:</strong>
         * <p>verified</p>
         */
        @NameInMap("verificationStatus")
        public String verificationStatus;

        public static GetFileLastCommitResponseBodyResultSignature build(java.util.Map<String, ?> map) throws Exception {
            GetFileLastCommitResponseBodyResultSignature self = new GetFileLastCommitResponseBodyResultSignature();
            return TeaModel.build(map, self);
        }

        public GetFileLastCommitResponseBodyResultSignature setGpgKeyId(String gpgKeyId) {
            this.gpgKeyId = gpgKeyId;
            return this;
        }
        public String getGpgKeyId() {
            return this.gpgKeyId;
        }

        public GetFileLastCommitResponseBodyResultSignature setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

    }

    public static class GetFileLastCommitResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-08-08 18:09:09</p>
         */
        @NameInMap("authorDate")
        public String authorDate;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("authorEmail")
        public String authorEmail;

        /**
         * <strong>example:</strong>
         * <p>test-codeup</p>
         */
        @NameInMap("authorName")
        public String authorName;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 15:00:02</p>
         */
        @NameInMap("committedDate")
        public String committedDate;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("committerEmail")
        public String committerEmail;

        /**
         * <strong>example:</strong>
         * <p>committer-codeup</p>
         */
        @NameInMap("committerName")
        public String committerName;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>ff4fb5ac6d1f44f452654336d2dba468ae6c8d04</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("message")
        public String message;

        @NameInMap("parentIds")
        public java.util.List<String> parentIds;

        /**
         * <strong>example:</strong>
         * <p>ff4fb5ac</p>
         */
        @NameInMap("shortId")
        public String shortId;

        @NameInMap("signature")
        public GetFileLastCommitResponseBodyResultSignature signature;

        @NameInMap("title")
        public String title;

        public static GetFileLastCommitResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetFileLastCommitResponseBodyResult self = new GetFileLastCommitResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetFileLastCommitResponseBodyResult setAuthorDate(String authorDate) {
            this.authorDate = authorDate;
            return this;
        }
        public String getAuthorDate() {
            return this.authorDate;
        }

        public GetFileLastCommitResponseBodyResult setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public GetFileLastCommitResponseBodyResult setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public GetFileLastCommitResponseBodyResult setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public GetFileLastCommitResponseBodyResult setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public GetFileLastCommitResponseBodyResult setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public GetFileLastCommitResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetFileLastCommitResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetFileLastCommitResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetFileLastCommitResponseBodyResult setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public GetFileLastCommitResponseBodyResult setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public GetFileLastCommitResponseBodyResult setSignature(GetFileLastCommitResponseBodyResultSignature signature) {
            this.signature = signature;
            return this;
        }
        public GetFileLastCommitResponseBodyResultSignature getSignature() {
            return this.signature;
        }

        public GetFileLastCommitResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
