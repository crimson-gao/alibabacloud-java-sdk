// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkitemCommentResponseBody extends TeaModel {
    @NameInMap("Comment")
    public CreateWorkitemCommentResponseBodyComment comment;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public String success;

    public static CreateWorkitemCommentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemCommentResponseBody self = new CreateWorkitemCommentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemCommentResponseBody setComment(CreateWorkitemCommentResponseBodyComment comment) {
        this.comment = comment;
        return this;
    }
    public CreateWorkitemCommentResponseBodyComment getComment() {
        return this.comment;
    }

    public CreateWorkitemCommentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateWorkitemCommentResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateWorkitemCommentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkitemCommentResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateWorkitemCommentResponseBodyCommentUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>13164xxxxx41068</p>
         */
        @NameInMap("account")
        public String account;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxx/thumbnail/112m7150e256dbba0d6456bafbb65c81f90d/w/200/h/200">https://xxxxx/thumbnail/112m7150e256dbba0d6456bafbb65c81f90d/w/200/h/200</a></p>
         */
        @NameInMap("avatar")
        public String avatar;

        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>1e9903d8bxxxxxxe9df9286ef5</p>
         */
        @NameInMap("identifier")
        public String identifier;

        @NameInMap("nickName")
        public String nickName;

        @NameInMap("realName")
        public String realName;

        /**
         * <strong>example:</strong>
         * <p>workitem</p>
         */
        @NameInMap("targetType")
        public String targetType;

        public static CreateWorkitemCommentResponseBodyCommentUser build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkitemCommentResponseBodyCommentUser self = new CreateWorkitemCommentResponseBodyCommentUser();
            return TeaModel.build(map, self);
        }

        public CreateWorkitemCommentResponseBodyCommentUser setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public CreateWorkitemCommentResponseBodyCommentUser setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public CreateWorkitemCommentResponseBodyCommentUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateWorkitemCommentResponseBodyCommentUser setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public CreateWorkitemCommentResponseBodyCommentUser setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public CreateWorkitemCommentResponseBodyCommentUser setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public CreateWorkitemCommentResponseBodyCommentUser setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class CreateWorkitemCommentResponseBodyComment extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>1667202662000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>RICHTEXT/MARKDOWN</p>
         */
        @NameInMap("formatType")
        public String formatType;

        /**
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("isTop")
        public Boolean isTop;

        /**
         * <strong>example:</strong>
         * <p>1637995553000</p>
         */
        @NameInMap("modifiedTime")
        public Long modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("parentId")
        public Long parentId;

        /**
         * <strong>example:</strong>
         * <p>79d523806bdxxxxx95612a5154</p>
         */
        @NameInMap("targetIdentifier")
        public String targetIdentifier;

        /**
         * <strong>example:</strong>
         * <p>workitem</p>
         */
        @NameInMap("targetType")
        public String targetType;

        /**
         * <strong>example:</strong>
         * <p>1667202662000</p>
         */
        @NameInMap("topTime")
        public Long topTime;

        @NameInMap("user")
        public CreateWorkitemCommentResponseBodyCommentUser user;

        public static CreateWorkitemCommentResponseBodyComment build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkitemCommentResponseBodyComment self = new CreateWorkitemCommentResponseBodyComment();
            return TeaModel.build(map, self);
        }

        public CreateWorkitemCommentResponseBodyComment setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateWorkitemCommentResponseBodyComment setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateWorkitemCommentResponseBodyComment setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateWorkitemCommentResponseBodyComment setFormatType(String formatType) {
            this.formatType = formatType;
            return this;
        }
        public String getFormatType() {
            return this.formatType;
        }

        public CreateWorkitemCommentResponseBodyComment setIsTop(Boolean isTop) {
            this.isTop = isTop;
            return this;
        }
        public Boolean getIsTop() {
            return this.isTop;
        }

        public CreateWorkitemCommentResponseBodyComment setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public CreateWorkitemCommentResponseBodyComment setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public CreateWorkitemCommentResponseBodyComment setTargetIdentifier(String targetIdentifier) {
            this.targetIdentifier = targetIdentifier;
            return this;
        }
        public String getTargetIdentifier() {
            return this.targetIdentifier;
        }

        public CreateWorkitemCommentResponseBodyComment setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public CreateWorkitemCommentResponseBodyComment setTopTime(Long topTime) {
            this.topTime = topTime;
            return this;
        }
        public Long getTopTime() {
            return this.topTime;
        }

        public CreateWorkitemCommentResponseBodyComment setUser(CreateWorkitemCommentResponseBodyCommentUser user) {
            this.user = user;
            return this;
        }
        public CreateWorkitemCommentResponseBodyCommentUser getUser() {
            return this.user;
        }

    }

}
