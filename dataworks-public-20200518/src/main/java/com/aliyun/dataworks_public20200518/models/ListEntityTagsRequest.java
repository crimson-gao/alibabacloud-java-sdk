// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListEntityTagsRequest extends TeaModel {
    /**
     * <p>The unique identifier of the entity. Example: maxcompute-table.projectA.tableA.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table.projectA.tableA</p>
     */
    @NameInMap("QualifiedName")
    public String qualifiedName;

    public static ListEntityTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEntityTagsRequest self = new ListEntityTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListEntityTagsRequest setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

}
