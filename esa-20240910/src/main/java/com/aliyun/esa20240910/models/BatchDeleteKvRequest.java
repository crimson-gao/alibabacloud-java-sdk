// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchDeleteKvRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Keys")
    public java.util.List<String> keys;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static BatchDeleteKvRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteKvRequest self = new BatchDeleteKvRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteKvRequest setKeys(java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public BatchDeleteKvRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
