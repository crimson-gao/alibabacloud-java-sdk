// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListResourceTagsRequest extends TeaModel {
    /**
     * <p>The globally unique ID of the CMK.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    public static ListResourceTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTagsRequest self = new ListResourceTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceTagsRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
