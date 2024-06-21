// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    /**
     * <p>The query token that is returned in this call.</p>
     * 
     * <strong>example:</strong>
     * <p>RGuYpqDdKhzXb8C3.D1BwQgc1tMBsoxdGiEKHHUUCf****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C3F7E6AE-43B2-4730-B6A3-FD17552B8F65</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of tags that are added to the Anti-DDoS Origin instance.</p>
     */
    @NameInMap("TagResources")
    public ListTagResourcesResponseBodyTagResources tagResources;

    public static ListTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesResponseBody self = new ListTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResourcesResponseBody setTagResources(ListTagResourcesResponseBodyTagResources tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public ListTagResourcesResponseBodyTagResources getTagResources() {
        return this.tagResources;
    }

    public static class ListTagResourcesResponseBodyTagResourcesTagResource extends TeaModel {
        /**
         * <p>The ID of the Anti-DDoS Origin instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-n6w1r7nz****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource. The value is fixed as <strong>INSTANCE</strong>, which indicates instances.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The key of the tag that is added to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag that is added to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListTagResourcesResponseBodyTagResourcesTagResource build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResourcesTagResource self = new ListTagResourcesResponseBodyTagResourcesTagResource();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListTagResourcesResponseBodyTagResources extends TeaModel {
        @NameInMap("TagResource")
        public java.util.List<ListTagResourcesResponseBodyTagResourcesTagResource> tagResource;

        public static ListTagResourcesResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResources self = new ListTagResourcesResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResources setTagResource(java.util.List<ListTagResourcesResponseBodyTagResourcesTagResource> tagResource) {
            this.tagResource = tagResource;
            return this;
        }
        public java.util.List<ListTagResourcesResponseBodyTagResourcesTagResource> getTagResource() {
            return this.tagResource;
        }

    }

}
