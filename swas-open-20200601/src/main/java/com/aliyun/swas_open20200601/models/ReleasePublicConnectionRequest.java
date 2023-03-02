// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ReleasePublicConnectionRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DatabaseInstanceId")
    public String databaseInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static ReleasePublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicConnectionRequest self = new ReleasePublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ReleasePublicConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ReleasePublicConnectionRequest setDatabaseInstanceId(String databaseInstanceId) {
        this.databaseInstanceId = databaseInstanceId;
        return this;
    }
    public String getDatabaseInstanceId() {
        return this.databaseInstanceId;
    }

    public ReleasePublicConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}