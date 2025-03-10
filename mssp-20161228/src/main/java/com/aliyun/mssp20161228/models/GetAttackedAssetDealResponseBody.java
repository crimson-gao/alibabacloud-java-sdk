// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetAttackedAssetDealResponseBody extends TeaModel {
    /**
     * <p>Interface return code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data query result.</p>
     */
    @NameInMap("Data")
    public GetAttackedAssetDealResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1E74F11C-B4A8-5774-962C-02003BA8504E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the query was successful.<br />
     * <strong>Enum values:</strong></p>
     * <ul>
     * <li>true: Success.</li>
     * <li>false: Failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAttackedAssetDealResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAttackedAssetDealResponseBody self = new GetAttackedAssetDealResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAttackedAssetDealResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAttackedAssetDealResponseBody setData(GetAttackedAssetDealResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAttackedAssetDealResponseBodyData getData() {
        return this.data;
    }

    public GetAttackedAssetDealResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAttackedAssetDealResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAttackedAssetDealResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAttackedAssetDealResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAttackedAssetDealResponseBodyDataEcsTrendList extends TeaModel {
        /**
         * <p>Date point.</p>
         * 
         * <strong>example:</strong>
         * <p>202312或20231205</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>Number of processed items.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DealCount")
        public Long dealCount;

        /**
         * <p>Number of discovered items.</p>
         * 
         * <strong>example:</strong>
         * <p>暂时无值，有疑问请联系管理员</p>
         */
        @NameInMap("FindCount")
        public Long findCount;

        public static GetAttackedAssetDealResponseBodyDataEcsTrendList build(java.util.Map<String, ?> map) throws Exception {
            GetAttackedAssetDealResponseBodyDataEcsTrendList self = new GetAttackedAssetDealResponseBodyDataEcsTrendList();
            return TeaModel.build(map, self);
        }

        public GetAttackedAssetDealResponseBodyDataEcsTrendList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetAttackedAssetDealResponseBodyDataEcsTrendList setDealCount(Long dealCount) {
            this.dealCount = dealCount;
            return this;
        }
        public Long getDealCount() {
            return this.dealCount;
        }

        public GetAttackedAssetDealResponseBodyDataEcsTrendList setFindCount(Long findCount) {
            this.findCount = findCount;
            return this;
        }
        public Long getFindCount() {
            return this.findCount;
        }

    }

    public static class GetAttackedAssetDealResponseBodyData extends TeaModel {
        /**
         * <p>Collection of attacked asset convergence trends.</p>
         */
        @NameInMap("EcsTrendList")
        public java.util.List<GetAttackedAssetDealResponseBodyDataEcsTrendList> ecsTrendList;

        public static GetAttackedAssetDealResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAttackedAssetDealResponseBodyData self = new GetAttackedAssetDealResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAttackedAssetDealResponseBodyData setEcsTrendList(java.util.List<GetAttackedAssetDealResponseBodyDataEcsTrendList> ecsTrendList) {
            this.ecsTrendList = ecsTrendList;
            return this;
        }
        public java.util.List<GetAttackedAssetDealResponseBodyDataEcsTrendList> getEcsTrendList() {
            return this.ecsTrendList;
        }

    }

}
