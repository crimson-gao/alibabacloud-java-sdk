// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineCanaryEnvsResponseBody extends TeaModel {
    /**
     * <p>The canary release environments that are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>presetCanaryShanghai</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CDCD94C0-F7FE-412F-B8F8-7E3C610C78E5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRoutineCanaryEnvsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineCanaryEnvsResponseBody self = new DescribeRoutineCanaryEnvsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineCanaryEnvsResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public DescribeRoutineCanaryEnvsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
