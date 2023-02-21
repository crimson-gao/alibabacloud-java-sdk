// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class SplitVideoPartsAdvanceRequest extends TeaModel {
    @NameInMap("Template")
    public String template;

    @NameInMap("VideoUrl")
    public java.io.InputStream videoUrlObject;

    public static SplitVideoPartsAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SplitVideoPartsAdvanceRequest self = new SplitVideoPartsAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SplitVideoPartsAdvanceRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public SplitVideoPartsAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

}
