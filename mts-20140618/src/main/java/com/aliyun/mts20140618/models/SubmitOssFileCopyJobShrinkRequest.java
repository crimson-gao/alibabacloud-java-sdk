// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitOssFileCopyJobShrinkRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    @NameInMap("SourceStorage")
    public String sourceStorageShrink;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Notify")
    public String notify;

    @NameInMap("TargetStorage")
    public String targetStorageShrink;

    public static SubmitOssFileCopyJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitOssFileCopyJobShrinkRequest self = new SubmitOssFileCopyJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitOssFileCopyJobShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SubmitOssFileCopyJobShrinkRequest setSourceStorageShrink(String sourceStorageShrink) {
        this.sourceStorageShrink = sourceStorageShrink;
        return this;
    }
    public String getSourceStorageShrink() {
        return this.sourceStorageShrink;
    }

    public SubmitOssFileCopyJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitOssFileCopyJobShrinkRequest setNotify(String notify) {
        this.notify = notify;
        return this;
    }
    public String getNotify() {
        return this.notify;
    }

    public SubmitOssFileCopyJobShrinkRequest setTargetStorageShrink(String targetStorageShrink) {
        this.targetStorageShrink = targetStorageShrink;
        return this;
    }
    public String getTargetStorageShrink() {
        return this.targetStorageShrink;
    }

}
