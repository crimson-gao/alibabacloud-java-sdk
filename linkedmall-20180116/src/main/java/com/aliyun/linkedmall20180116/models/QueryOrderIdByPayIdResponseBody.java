// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderIdByPayIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("LmOrderIds")
    public QueryOrderIdByPayIdResponseBodyLmOrderIds lmOrderIds;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>79C01D47-3C44-57D9-BC99-1B33F7ED14B8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryOrderIdByPayIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderIdByPayIdResponseBody self = new QueryOrderIdByPayIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderIdByPayIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderIdByPayIdResponseBody setLmOrderIds(QueryOrderIdByPayIdResponseBodyLmOrderIds lmOrderIds) {
        this.lmOrderIds = lmOrderIds;
        return this;
    }
    public QueryOrderIdByPayIdResponseBodyLmOrderIds getLmOrderIds() {
        return this.lmOrderIds;
    }

    public QueryOrderIdByPayIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderIdByPayIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryOrderIdByPayIdResponseBodyLmOrderIdsLmOrderIds extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>45******89</p>
         */
        @NameInMap("LmOrderId")
        public Long lmOrderId;

        public static QueryOrderIdByPayIdResponseBodyLmOrderIdsLmOrderIds build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderIdByPayIdResponseBodyLmOrderIdsLmOrderIds self = new QueryOrderIdByPayIdResponseBodyLmOrderIdsLmOrderIds();
            return TeaModel.build(map, self);
        }

        public QueryOrderIdByPayIdResponseBodyLmOrderIdsLmOrderIds setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

    }

    public static class QueryOrderIdByPayIdResponseBodyLmOrderIds extends TeaModel {
        @NameInMap("LmOrderIds")
        public java.util.List<QueryOrderIdByPayIdResponseBodyLmOrderIdsLmOrderIds> lmOrderIds;

        public static QueryOrderIdByPayIdResponseBodyLmOrderIds build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderIdByPayIdResponseBodyLmOrderIds self = new QueryOrderIdByPayIdResponseBodyLmOrderIds();
            return TeaModel.build(map, self);
        }

        public QueryOrderIdByPayIdResponseBodyLmOrderIds setLmOrderIds(java.util.List<QueryOrderIdByPayIdResponseBodyLmOrderIdsLmOrderIds> lmOrderIds) {
            this.lmOrderIds = lmOrderIds;
            return this;
        }
        public java.util.List<QueryOrderIdByPayIdResponseBodyLmOrderIdsLmOrderIds> getLmOrderIds() {
            return this.lmOrderIds;
        }

    }

}
