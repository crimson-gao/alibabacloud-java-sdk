// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetPhoneWithTokenResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>If OK is returned, the request is successful.</li>
     * <li>For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/85198.html">API response codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public GetPhoneWithTokenResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0F335F48-<strong><strong>-</strong></strong>-****-CA7914FE5D77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPhoneWithTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneWithTokenResponseBody self = new GetPhoneWithTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhoneWithTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPhoneWithTokenResponseBody setData(GetPhoneWithTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPhoneWithTokenResponseBodyData getData() {
        return this.data;
    }

    public GetPhoneWithTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPhoneWithTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPhoneWithTokenResponseBodyData extends TeaModel {
        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>13900001234</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        public static GetPhoneWithTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPhoneWithTokenResponseBodyData self = new GetPhoneWithTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPhoneWithTokenResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

    }

}
