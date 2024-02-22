// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyBindAccountRequest extends TeaModel {
    /**
     * <p>The AccessKey ID of the cloud account.</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    /**
     * <p>The ID of the cloud account.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The username of the cloud account.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The ID that is generated by the system when the account is added. You can call the ListBindAccount operation to query the ID.</p>
     */
    @NameInMap("BindId")
    public Long bindId;

    /**
     * <p>The code of the cloud service provider.</p>
     * <br>
     * <p>Enumeration values:</p>
     * <br>
     * <p>*   qcloud</p>
     * <p>*   hcloud</p>
     */
    @NameInMap("CloudCode")
    public String cloudCode;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyBindAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBindAccountRequest self = new ModifyBindAccountRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBindAccountRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ModifyBindAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ModifyBindAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyBindAccountRequest setBindId(Long bindId) {
        this.bindId = bindId;
        return this;
    }
    public Long getBindId() {
        return this.bindId;
    }

    public ModifyBindAccountRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public ModifyBindAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
