// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBusinessLicenseRequest extends TeaModel {
    // 图片链接（长度不超 2048，不支持 base64）
    @NameInMap("Url")
    public String url;

    @NameInMap("WorkflowOp")
    public String workflowOp;

    // 图片二进制字节流，最大10MB
    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeBusinessLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBusinessLicenseRequest self = new RecognizeBusinessLicenseRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeBusinessLicenseRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeBusinessLicenseRequest setWorkflowOp(String workflowOp) {
        this.workflowOp = workflowOp;
        return this;
    }
    public String getWorkflowOp() {
        return this.workflowOp;
    }

    public RecognizeBusinessLicenseRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
