// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetCorpAccomplishmentTasksShrinkHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public String accountContextShrink;

    public static GetCorpAccomplishmentTasksShrinkHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetCorpAccomplishmentTasksShrinkHeaders self = new GetCorpAccomplishmentTasksShrinkHeaders();
        return TeaModel.build(map, self);
    }

    public GetCorpAccomplishmentTasksShrinkHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetCorpAccomplishmentTasksShrinkHeaders setAccountContextShrink(String accountContextShrink) {
        this.accountContextShrink = accountContextShrink;
        return this;
    }
    public String getAccountContextShrink() {
        return this.accountContextShrink;
    }

}
