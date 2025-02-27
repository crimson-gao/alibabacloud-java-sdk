// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4507D1CD-526A-4E2B-A1E2-3AB045D1EE0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the RAM user.</p>
     */
    @NameInMap("User")
    public GetUserResponseBodyUser user;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserResponseBody setUser(GetUserResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public GetUserResponseBodyUser getUser() {
        return this.user;
    }

    public static class GetUserResponseBodyUserTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>operator</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetUserResponseBodyUserTagsTag build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserTagsTag self = new GetUserResponseBodyUserTagsTag();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetUserResponseBodyUserTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetUserResponseBodyUserTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<GetUserResponseBodyUserTagsTag> tag;

        public static GetUserResponseBodyUserTags build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserTags self = new GetUserResponseBodyUserTags();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserTags setTag(java.util.List<GetUserResponseBodyUserTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<GetUserResponseBodyUserTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class GetUserResponseBodyUser extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a cloud computing engineer.</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The time when the RAM user was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-12T09:12:00Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The display name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The email address of the RAM user.</p>
         * <blockquote>
         * <p>This parameter is valid only on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The last time when the RAM user logged on to the Alibaba Cloud Management Console.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-12T09:12:00Z</p>
         */
        @NameInMap("LastLoginDate")
        public String lastLoginDate;

        /**
         * <p>The mobile phone number of the RAM user.</p>
         * <blockquote>
         * <p>This parameter is valid only on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86-1868888****</p>
         */
        @NameInMap("MobilePhone")
        public String mobilePhone;

        /**
         * <p>The source of the RAM user. Valid value:</p>
         * <ul>
         * <li>Manual: The RAM user is manually created in the RAM console.</li>
         * <li>SCIM: The RAM user is mapped by using System for Cross-domain Identity Management (SCIM).</li>
         * <li>CloudSSO: The RAM user is mapped from a CloudSSO user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudSSO</p>
         */
        @NameInMap("ProvisionType")
        public String provisionType;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public GetUserResponseBodyUserTags tags;

        /**
         * <p>The time when the information about the RAM user was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-13T07:39:22Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        /**
         * <p>The ID of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>20732900249392****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The logon name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
         */
        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static GetUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUser self = new GetUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUser setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public GetUserResponseBodyUser setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetUserResponseBodyUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetUserResponseBodyUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserResponseBodyUser setLastLoginDate(String lastLoginDate) {
            this.lastLoginDate = lastLoginDate;
            return this;
        }
        public String getLastLoginDate() {
            return this.lastLoginDate;
        }

        public GetUserResponseBodyUser setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public GetUserResponseBodyUser setProvisionType(String provisionType) {
            this.provisionType = provisionType;
            return this;
        }
        public String getProvisionType() {
            return this.provisionType;
        }

        public GetUserResponseBodyUser setTags(GetUserResponseBodyUserTags tags) {
            this.tags = tags;
            return this;
        }
        public GetUserResponseBodyUserTags getTags() {
            return this.tags;
        }

        public GetUserResponseBodyUser setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public GetUserResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetUserResponseBodyUser setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

}
