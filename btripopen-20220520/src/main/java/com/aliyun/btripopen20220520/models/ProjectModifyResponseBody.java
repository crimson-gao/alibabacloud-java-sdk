// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ProjectModifyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("module")
    public Boolean module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static ProjectModifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProjectModifyResponseBody self = new ProjectModifyResponseBody();
        return TeaModel.build(map, self);
    }

    public ProjectModifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProjectModifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ProjectModifyResponseBody setModule(Boolean module) {
        this.module = module;
        return this;
    }
    public Boolean getModule() {
        return this.module;
    }

    public ProjectModifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProjectModifyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ProjectModifyResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
