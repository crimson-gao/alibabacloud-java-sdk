// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetListResponseBody extends TeaModel {
    /**
     * <p>自定义响应页面描述</p>
     * 
     * <strong>example:</strong>
     * <p>a custom list</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>自定义响应页面ID</p>
     * 
     * <strong>example:</strong>
     * <p>40000001</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("Items")
    public java.util.List<String> items;

    /**
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("Kind")
    public String kind;

    /**
     * <p>自定义响应页面名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetListResponseBody self = new GetListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetListResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetListResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetListResponseBody setItems(java.util.List<String> items) {
        this.items = items;
        return this;
    }
    public java.util.List<String> getItems() {
        return this.items;
    }

    public GetListResponseBody setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public GetListResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetListResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
