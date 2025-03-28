// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class CreateTagsRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>Only <code>cn-hangzhou</code> is supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The information about the tags.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TagKeyValueParamList")
    public java.util.List<CreateTagsRequestTagKeyValueParamList> tagKeyValueParamList;

    public static CreateTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTagsRequest self = new CreateTagsRequest();
        return TeaModel.build(map, self);
    }

    public CreateTagsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTagsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTagsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTagsRequest setTagKeyValueParamList(java.util.List<CreateTagsRequestTagKeyValueParamList> tagKeyValueParamList) {
        this.tagKeyValueParamList = tagKeyValueParamList;
        return this;
    }
    public java.util.List<CreateTagsRequestTagKeyValueParamList> getTagKeyValueParamList() {
        return this.tagKeyValueParamList;
    }

    public static class CreateTagsRequestTagKeyValueParamListTagValueParamList extends TeaModel {
        /**
         * <p>The description of the value for tag N.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>Test environment</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The value of tag N.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTagsRequestTagKeyValueParamListTagValueParamList build(java.util.Map<String, ?> map) throws Exception {
            CreateTagsRequestTagKeyValueParamListTagValueParamList self = new CreateTagsRequestTagKeyValueParamListTagValueParamList();
            return TeaModel.build(map, self);
        }

        public CreateTagsRequestTagKeyValueParamListTagValueParamList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTagsRequestTagKeyValueParamListTagValueParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateTagsRequestTagKeyValueParamList extends TeaModel {
        /**
         * <p>The description of the key for tag N.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>Business environment</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The value of tag N.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Environment</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The information about the tag values.</p>
         */
        @NameInMap("TagValueParamList")
        public java.util.List<CreateTagsRequestTagKeyValueParamListTagValueParamList> tagValueParamList;

        public static CreateTagsRequestTagKeyValueParamList build(java.util.Map<String, ?> map) throws Exception {
            CreateTagsRequestTagKeyValueParamList self = new CreateTagsRequestTagKeyValueParamList();
            return TeaModel.build(map, self);
        }

        public CreateTagsRequestTagKeyValueParamList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTagsRequestTagKeyValueParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTagsRequestTagKeyValueParamList setTagValueParamList(java.util.List<CreateTagsRequestTagKeyValueParamListTagValueParamList> tagValueParamList) {
            this.tagValueParamList = tagValueParamList;
            return this;
        }
        public java.util.List<CreateTagsRequestTagKeyValueParamListTagValueParamList> getTagValueParamList() {
            return this.tagValueParamList;
        }

    }

}
