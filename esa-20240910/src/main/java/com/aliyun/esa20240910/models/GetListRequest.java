// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>40000001</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetListRequest self = new GetListRequest();
        return TeaModel.build(map, self);
    }

    public GetListRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
