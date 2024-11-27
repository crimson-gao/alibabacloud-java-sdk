// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewaysRequest extends TeaModel {
    /**
     * <p>Query exactly by gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cpv4sqdl****</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>Keyword, search with full match, case-insensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>Query exactly by gateway name.</p>
     * 
     * <strong>example:</strong>
     * <p>itemcenter-gateway</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("tags")
    public java.util.List<ListGatewaysRequestTags> tags;

    public static ListGatewaysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewaysRequest self = new ListGatewaysRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewaysRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListGatewaysRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListGatewaysRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListGatewaysRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGatewaysRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGatewaysRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListGatewaysRequest setTags(java.util.List<ListGatewaysRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListGatewaysRequestTags> getTags() {
        return this.tags;
    }

    public static class ListGatewaysRequestTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ListGatewaysRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListGatewaysRequestTags self = new ListGatewaysRequestTags();
            return TeaModel.build(map, self);
        }

        public ListGatewaysRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGatewaysRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
