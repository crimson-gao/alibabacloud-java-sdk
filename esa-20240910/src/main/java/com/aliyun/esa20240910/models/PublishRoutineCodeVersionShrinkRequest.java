// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PublishRoutineCodeVersionShrinkRequest extends TeaModel {
    /**
     * <p>The regions for canary release.</p>
     */
    @NameInMap("CanaryAreaList")
    public String canaryAreaListShrink;

    /**
     * <p>The version number for canary release.</p>
     * 
     * <strong>example:</strong>
     * <p>1710120201067203242</p>
     */
    @NameInMap("CanaryCodeVersion")
    public String canaryCodeVersion;

    /**
     * <p>The code version to be released.</p>
     * 
     * <strong>example:</strong>
     * <p>1710120201067203242</p>
     */
    @NameInMap("CodeVersion")
    public String codeVersion;

    /**
     * <p>The environment name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The routine name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PublishRoutineCodeVersion</p>
     */
    @NameInMap("Name")
    public String name;

    public static PublishRoutineCodeVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishRoutineCodeVersionShrinkRequest self = new PublishRoutineCodeVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PublishRoutineCodeVersionShrinkRequest setCanaryAreaListShrink(String canaryAreaListShrink) {
        this.canaryAreaListShrink = canaryAreaListShrink;
        return this;
    }
    public String getCanaryAreaListShrink() {
        return this.canaryAreaListShrink;
    }

    public PublishRoutineCodeVersionShrinkRequest setCanaryCodeVersion(String canaryCodeVersion) {
        this.canaryCodeVersion = canaryCodeVersion;
        return this;
    }
    public String getCanaryCodeVersion() {
        return this.canaryCodeVersion;
    }

    public PublishRoutineCodeVersionShrinkRequest setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
    public String getCodeVersion() {
        return this.codeVersion;
    }

    public PublishRoutineCodeVersionShrinkRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public PublishRoutineCodeVersionShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
