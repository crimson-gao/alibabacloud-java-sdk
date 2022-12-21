// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSQLReviewOptimizeDetailRequest extends TeaModel {
    // The key that is used to query the details of optimization suggestions. You can call the [ListSQLReviewOriginSQL](~~257870~~) operation to query the key.
    @NameInMap("SQLReviewQueryKey")
    public String SQLReviewQueryKey;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the ID of the tenant.
    @NameInMap("Tid")
    public Long tid;

    public static GetSQLReviewOptimizeDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSQLReviewOptimizeDetailRequest self = new GetSQLReviewOptimizeDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetSQLReviewOptimizeDetailRequest setSQLReviewQueryKey(String SQLReviewQueryKey) {
        this.SQLReviewQueryKey = SQLReviewQueryKey;
        return this;
    }
    public String getSQLReviewQueryKey() {
        return this.SQLReviewQueryKey;
    }

    public GetSQLReviewOptimizeDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
