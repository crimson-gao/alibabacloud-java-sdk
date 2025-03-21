// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetWithholdSignPageUrlResponseBody extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>6103AD7B-21C2-523B-89D0-579DA58D08E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WithholdSignResponse")
    public GetWithholdSignPageUrlResponseBodyWithholdSignResponse withholdSignResponse;

    public static GetWithholdSignPageUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWithholdSignPageUrlResponseBody self = new GetWithholdSignPageUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWithholdSignPageUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWithholdSignPageUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWithholdSignPageUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWithholdSignPageUrlResponseBody setWithholdSignResponse(GetWithholdSignPageUrlResponseBodyWithholdSignResponse withholdSignResponse) {
        this.withholdSignResponse = withholdSignResponse;
        return this;
    }
    public GetWithholdSignPageUrlResponseBodyWithholdSignResponse getWithholdSignResponse() {
        return this.withholdSignResponse;
    }

    public static class GetWithholdSignPageUrlResponseBodyWithholdSignResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0AF7F437-C869-477D-A21A-CF402493FFFE</p>
         */
        @NameInMap("OutRequestNo")
        public String outRequestNo;

        @NameInMap("PageUrl")
        public String pageUrl;

        public static GetWithholdSignPageUrlResponseBodyWithholdSignResponse build(java.util.Map<String, ?> map) throws Exception {
            GetWithholdSignPageUrlResponseBodyWithholdSignResponse self = new GetWithholdSignPageUrlResponseBodyWithholdSignResponse();
            return TeaModel.build(map, self);
        }

        public GetWithholdSignPageUrlResponseBodyWithholdSignResponse setOutRequestNo(String outRequestNo) {
            this.outRequestNo = outRequestNo;
            return this;
        }
        public String getOutRequestNo() {
            return this.outRequestNo;
        }

        public GetWithholdSignPageUrlResponseBodyWithholdSignResponse setPageUrl(String pageUrl) {
            this.pageUrl = pageUrl;
            return this;
        }
        public String getPageUrl() {
            return this.pageUrl;
        }

    }

}
