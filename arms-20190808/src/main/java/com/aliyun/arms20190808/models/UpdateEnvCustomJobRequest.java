// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateEnvCustomJobRequest extends TeaModel {
    /**
     * <p>Locale, the default is Chinese zh | en.</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>yaml configuration string.</p>
     */
    @NameInMap("ConfigYaml")
    public String configYaml;

    /**
     * <p>Custom job name.</p>
     */
    @NameInMap("CustomJobName")
    public String customJobName;

    /**
     * <p>Environment ID.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Custom task status: run or stop.</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateEnvCustomJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvCustomJobRequest self = new UpdateEnvCustomJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvCustomJobRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public UpdateEnvCustomJobRequest setConfigYaml(String configYaml) {
        this.configYaml = configYaml;
        return this;
    }
    public String getConfigYaml() {
        return this.configYaml;
    }

    public UpdateEnvCustomJobRequest setCustomJobName(String customJobName) {
        this.customJobName = customJobName;
        return this;
    }
    public String getCustomJobName() {
        return this.customJobName;
    }

    public UpdateEnvCustomJobRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public UpdateEnvCustomJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateEnvCustomJobRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
