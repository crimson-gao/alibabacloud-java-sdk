// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ScaleUpClusterResponseBody extends TeaModel {
    @NameInMap("Data")
    public ScaleUpClusterResponseBodyData data;

    @NameInMap("ErrCode")
    public Integer errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ScaleUpClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScaleUpClusterResponseBody self = new ScaleUpClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ScaleUpClusterResponseBody setData(ScaleUpClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ScaleUpClusterResponseBodyData getData() {
        return this.data;
    }

    public ScaleUpClusterResponseBody setErrCode(Integer errCode) {
        this.errCode = errCode;
        return this;
    }
    public Integer getErrCode() {
        return this.errCode;
    }

    public ScaleUpClusterResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ScaleUpClusterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ScaleUpClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScaleUpClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ScaleUpClusterResponseBodyData extends TeaModel {
        @NameInMap("OrderIds")
        public java.util.List<String> orderIds;

        public static ScaleUpClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ScaleUpClusterResponseBodyData self = new ScaleUpClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ScaleUpClusterResponseBodyData setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

    }

}
