// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryWithholdTradeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("QueryWithholdTradeResponse")
    public QueryWithholdTradeResponseBodyQueryWithholdTradeResponse queryWithholdTradeResponse;

    /**
     * <strong>example:</strong>
     * <p>0825B1A4-0870-50BD-8AA3-9618587BEBC2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryWithholdTradeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWithholdTradeResponseBody self = new QueryWithholdTradeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWithholdTradeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryWithholdTradeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryWithholdTradeResponseBody setQueryWithholdTradeResponse(QueryWithholdTradeResponseBodyQueryWithholdTradeResponse queryWithholdTradeResponse) {
        this.queryWithholdTradeResponse = queryWithholdTradeResponse;
        return this;
    }
    public QueryWithholdTradeResponseBodyQueryWithholdTradeResponse getQueryWithholdTradeResponse() {
        return this.queryWithholdTradeResponse;
    }

    public QueryWithholdTradeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryWithholdTradeResponseBodyQueryWithholdTradeResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("OutTradeNo")
        public String outTradeNo;

        @NameInMap("PaymentDate")
        public String paymentDate;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("SettleStatus")
        public String settleStatus;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("TotalAmount")
        public String totalAmount;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("TradeNo")
        public String tradeNo;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("TradeStatus")
        public String tradeStatus;

        public static QueryWithholdTradeResponseBodyQueryWithholdTradeResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryWithholdTradeResponseBodyQueryWithholdTradeResponse self = new QueryWithholdTradeResponseBodyQueryWithholdTradeResponse();
            return TeaModel.build(map, self);
        }

        public QueryWithholdTradeResponseBodyQueryWithholdTradeResponse setOutTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
            return this;
        }
        public String getOutTradeNo() {
            return this.outTradeNo;
        }

        public QueryWithholdTradeResponseBodyQueryWithholdTradeResponse setPaymentDate(String paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }
        public String getPaymentDate() {
            return this.paymentDate;
        }

        public QueryWithholdTradeResponseBodyQueryWithholdTradeResponse setSettleStatus(String settleStatus) {
            this.settleStatus = settleStatus;
            return this;
        }
        public String getSettleStatus() {
            return this.settleStatus;
        }

        public QueryWithholdTradeResponseBodyQueryWithholdTradeResponse setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public String getTotalAmount() {
            return this.totalAmount;
        }

        public QueryWithholdTradeResponseBodyQueryWithholdTradeResponse setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
            return this;
        }
        public String getTradeNo() {
            return this.tradeNo;
        }

        public QueryWithholdTradeResponseBodyQueryWithholdTradeResponse setTradeStatus(String tradeStatus) {
            this.tradeStatus = tradeStatus;
            return this;
        }
        public String getTradeStatus() {
            return this.tradeStatus;
        }

    }

}
