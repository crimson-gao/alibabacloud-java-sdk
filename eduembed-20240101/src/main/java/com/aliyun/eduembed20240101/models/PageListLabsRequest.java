// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class PageListLabsRequest extends TeaModel {
    @NameInMap("Id")
    public java.util.List<Long> id;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static PageListLabsRequest build(java.util.Map<String, ?> map) throws Exception {
        PageListLabsRequest self = new PageListLabsRequest();
        return TeaModel.build(map, self);
    }

    public PageListLabsRequest setId(java.util.List<Long> id) {
        this.id = id;
        return this;
    }
    public java.util.List<Long> getId() {
        return this.id;
    }

    public PageListLabsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public PageListLabsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
