// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateOrderResponseBody extends TeaModel {
    // The ID of the ticket.
    @NameInMap("CreateOrderResult")
    public CreateOrderResponseBodyCreateOrderResult createOrderResult;

    // The error code.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static CreateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderResponseBody self = new CreateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrderResponseBody setCreateOrderResult(CreateOrderResponseBodyCreateOrderResult createOrderResult) {
        this.createOrderResult = createOrderResult;
        return this;
    }
    public CreateOrderResponseBodyCreateOrderResult getCreateOrderResult() {
        return this.createOrderResult;
    }

    public CreateOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateOrderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateOrderResponseBodyCreateOrderResult extends TeaModel {
        @NameInMap("OrderIds")
        public java.util.List<Long> orderIds;

        public static CreateOrderResponseBodyCreateOrderResult build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseBodyCreateOrderResult self = new CreateOrderResponseBodyCreateOrderResult();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseBodyCreateOrderResult setOrderIds(java.util.List<Long> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<Long> getOrderIds() {
            return this.orderIds;
        }

    }

}
