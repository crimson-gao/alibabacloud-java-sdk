// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListChartDataForUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChartDataForUserResponseBody body;

    public static ListChartDataForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChartDataForUserResponse self = new ListChartDataForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListChartDataForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChartDataForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChartDataForUserResponse setBody(ListChartDataForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChartDataForUserResponseBody getBody() {
        return this.body;
    }

}
