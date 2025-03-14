// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSkillGroupResponseBody body;

    public static ListSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupResponse self = new ListSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkillGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSkillGroupResponse setBody(ListSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillGroupResponseBody getBody() {
        return this.body;
    }

}
