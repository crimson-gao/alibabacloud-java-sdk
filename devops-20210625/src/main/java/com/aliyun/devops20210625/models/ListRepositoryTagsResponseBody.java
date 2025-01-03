// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryTagsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>”“</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListRepositoryTagsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListRepositoryTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryTagsResponseBody self = new ListRepositoryTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryTagsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoryTagsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRepositoryTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryTagsResponseBody setResult(java.util.List<ListRepositoryTagsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryTagsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListRepositoryTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRepositoryTagsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListRepositoryTagsResponseBodyResultCommitSignature extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("gpgKeyId")
        public String gpgKeyId;

        /**
         * <strong>example:</strong>
         * <p>verified</p>
         */
        @NameInMap("verificationStatus")
        public String verificationStatus;

        public static ListRepositoryTagsResponseBodyResultCommitSignature build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryTagsResponseBodyResultCommitSignature self = new ListRepositoryTagsResponseBodyResultCommitSignature();
            return TeaModel.build(map, self);
        }

        public ListRepositoryTagsResponseBodyResultCommitSignature setGpgKeyId(String gpgKeyId) {
            this.gpgKeyId = gpgKeyId;
            return this;
        }
        public String getGpgKeyId() {
            return this.gpgKeyId;
        }

        public ListRepositoryTagsResponseBodyResultCommitSignature setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

    }

    public static class ListRepositoryTagsResponseBodyResultCommit extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("authorEmail")
        public String authorEmail;

        @NameInMap("authorName")
        public String authorName;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 10:00:00</p>
         */
        @NameInMap("authoredDate")
        public String authoredDate;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 09:00:00</p>
         */
        @NameInMap("committedDate")
        public String committedDate;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("committerEmail")
        public String committerEmail;

        @NameInMap("committerName")
        public String committerName;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 10:00:00</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>de02b625ba8488f92eb204bcb3773a40c1b4ddac</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("message")
        public String message;

        @NameInMap("parentIds")
        public java.util.List<String> parentIds;

        /**
         * <strong>example:</strong>
         * <p>de02b625</p>
         */
        @NameInMap("shortId")
        public String shortId;

        @NameInMap("signature")
        public ListRepositoryTagsResponseBodyResultCommitSignature signature;

        @NameInMap("title")
        public String title;

        public static ListRepositoryTagsResponseBodyResultCommit build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryTagsResponseBodyResultCommit self = new ListRepositoryTagsResponseBodyResultCommit();
            return TeaModel.build(map, self);
        }

        public ListRepositoryTagsResponseBodyResultCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public ListRepositoryTagsResponseBodyResultCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public ListRepositoryTagsResponseBodyResultCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public ListRepositoryTagsResponseBodyResultCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public ListRepositoryTagsResponseBodyResultCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public ListRepositoryTagsResponseBodyResultCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public ListRepositoryTagsResponseBodyResultCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRepositoryTagsResponseBodyResultCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRepositoryTagsResponseBodyResultCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListRepositoryTagsResponseBodyResultCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public ListRepositoryTagsResponseBodyResultCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public ListRepositoryTagsResponseBodyResultCommit setSignature(ListRepositoryTagsResponseBodyResultCommitSignature signature) {
            this.signature = signature;
            return this;
        }
        public ListRepositoryTagsResponseBodyResultCommitSignature getSignature() {
            return this.signature;
        }

        public ListRepositoryTagsResponseBodyResultCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListRepositoryTagsResponseBodyResult extends TeaModel {
        @NameInMap("commit")
        public ListRepositoryTagsResponseBodyResultCommit commit;

        /**
         * <strong>example:</strong>
         * <p>9a494e7b88ca35cde00579af2df4ab46136c022e</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>tag v1.0</p>
         */
        @NameInMap("name")
        public String name;

        public static ListRepositoryTagsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryTagsResponseBodyResult self = new ListRepositoryTagsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryTagsResponseBodyResult setCommit(ListRepositoryTagsResponseBodyResultCommit commit) {
            this.commit = commit;
            return this;
        }
        public ListRepositoryTagsResponseBodyResultCommit getCommit() {
            return this.commit;
        }

        public ListRepositoryTagsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRepositoryTagsResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListRepositoryTagsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
