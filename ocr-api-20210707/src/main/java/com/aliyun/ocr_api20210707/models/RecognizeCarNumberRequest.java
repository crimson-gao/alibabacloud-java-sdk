// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCarNumberRequest extends TeaModel {
    // 图片链接（长度不超 2048，不支持 base64）
    @NameInMap("Url")
    public String url;

    @NameInMap("WorkflowOp")
    public String workflowOp;

    // 图片二进制字节流，最大10MB
    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeCarNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCarNumberRequest self = new RecognizeCarNumberRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeCarNumberRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeCarNumberRequest setWorkflowOp(String workflowOp) {
        this.workflowOp = workflowOp;
        return this;
    }
    public String getWorkflowOp() {
        return this.workflowOp;
    }

    public RecognizeCarNumberRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
