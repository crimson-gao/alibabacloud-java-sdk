// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    // 下一个查询开始Token。
    @NameInMap("nextToken")
    public String nextToken;

    // 返回的标签列表。
    @NameInMap("tagResources")
    public java.util.List<ListTagResourcesResponseBodyTagResources> tagResources;

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

    public ListTagResourcesResponseBody setTagResources(java.util.List<ListTagResourcesResponseBodyTagResources> tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public java.util.List<ListTagResourcesResponseBodyTagResources> getTagResources() {
        return this.tagResources;
    }

    public static class ListTagResourcesResponseBodyTagResources extends TeaModel {
        // 资源 id。
        @NameInMap("resourceId")
        public String resourceId;

        // 资源类型。
        @NameInMap("resourceType")
        public String resourceType;

        // 标签的键。
        @NameInMap("tagKey")
        public String tagKey;

        // 标签的值。
        @NameInMap("tagValue")
        public String tagValue;

        public static ListTagResourcesResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResources self = new ListTagResourcesResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagResourcesResponseBodyTagResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagResourcesResponseBodyTagResources setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesResponseBodyTagResources setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
