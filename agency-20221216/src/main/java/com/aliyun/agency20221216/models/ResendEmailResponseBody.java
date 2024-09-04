// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ResendEmailResponseBody extends TeaModel {
    /**
     * <p>Result Code, Error code.</br>
     * Candidate Value: </br></p>
     * <ul>
     * <li>200: OK</li>
     * <li>1109: System error</li>
     * <li>3058: Frequent sending, the limit is 10 emails in every 5 minutes.</li>
     * <li>3057: InviteId is empty.</li>
     * <li>3060: Can\&quot;t find sending record of given InviteId.</li>
     * <li>3061: Registration URL is expired, unable to resend.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Result message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID, the unique request identifier generated by Alibaba Cloud.</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ResendEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResendEmailResponseBody self = new ResendEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public ResendEmailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResendEmailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResendEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResendEmailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
