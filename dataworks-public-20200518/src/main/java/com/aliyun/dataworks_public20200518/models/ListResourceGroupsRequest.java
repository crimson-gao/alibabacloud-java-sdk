// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsRequest extends TeaModel {
    /**
     * <p>The category of the resource group. Valid values:</p>
     * <ul>
     * <li>default (default): shared resource group</li>
     * <li>single: exclusive resource group</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("BizExtKey")
    public String bizExtKey;

    /**
     * <p>The keyword that is used for fuzzy match by resource group name and identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The type of the resource group that you want to query. Valid values:</p>
     * <ul>
     * <li>0: DataWorks</li>
     * <li>1: scheduling</li>
     * <li>2: MaxCompute</li>
     * <li>3: Platform for AI (PAI)</li>
     * <li>4: Data Integration</li>
     * <li>7: exclusive resource group for scheduling (An ID is generated for the purchased resource when you purchase an exclusive resource group for scheduling.)</li>
     * <li>9: DataService Studio</li>
     * <li>Default value: 1</li>
     * </ul>
     * <p>If the value indicates a compute engine, the resource groups to query are the ones that were created when you purchased the compute engine.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ResourceGroupType")
    public Integer resourceGroupType;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzbn7pti3zfa</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListResourceGroupsRequestTags> tags;

    public static ListResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsRequest self = new ListResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsRequest setBizExtKey(String bizExtKey) {
        this.bizExtKey = bizExtKey;
        return this;
    }
    public String getBizExtKey() {
        return this.bizExtKey;
    }

    public ListResourceGroupsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListResourceGroupsRequest setResourceGroupType(Integer resourceGroupType) {
        this.resourceGroupType = resourceGroupType;
        return this;
    }
    public Integer getResourceGroupType() {
        return this.resourceGroupType;
    }

    public ListResourceGroupsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ListResourceGroupsRequest setTags(java.util.List<ListResourceGroupsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListResourceGroupsRequestTags> getTags() {
        return this.tags;
    }

    public static class ListResourceGroupsRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListResourceGroupsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsRequestTags self = new ListResourceGroupsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceGroupsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
