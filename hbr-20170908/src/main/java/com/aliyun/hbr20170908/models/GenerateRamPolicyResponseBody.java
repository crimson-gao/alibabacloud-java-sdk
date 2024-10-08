// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class GenerateRamPolicyResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The content of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;Version&quot;: &quot;1&quot;,     &quot;Statement&quot;: [         {             &quot;Effect&quot;: &quot;Deny&quot;,             &quot;Action&quot;: [                 &quot;hbr:CreateRestore&quot;,                 &quot;hbr:CreateRestoreJob&quot;,                 &quot;hbr:CreateHanaRestore&quot;,                 &quot;hbr:CreateUniRestorePlan&quot;,                 &quot;hbr:CreateSqlServerRestore&quot;             ],             &quot;Resource&quot;: [                 &quot;acs:hbr:<em>:1178</em><em><strong><strong>531:vault/v-000</strong></strong></em><em>blx06&quot;,                 &quot;acs:hbr:</em>:1178<strong><strong><strong>531:vault/v-000</strong></strong></strong>blx06/client/*&quot;             ]         }     ] }</p>
     */
    @NameInMap("PolicyDocument")
    public String policyDocument;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GenerateRamPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateRamPolicyResponseBody self = new GenerateRamPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateRamPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateRamPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateRamPolicyResponseBody setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public GenerateRamPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateRamPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
