// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteDirectoryRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Id")
    public String id;

    public static DeleteDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDirectoryRequest self = new DeleteDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDirectoryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteDirectoryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
