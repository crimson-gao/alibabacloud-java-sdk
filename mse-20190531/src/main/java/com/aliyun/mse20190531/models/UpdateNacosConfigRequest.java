// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>postoffice</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The list of IP addresses where the beta release of the configuration is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>196.168.XX.XX</p>
     */
    @NameInMap("BetaIps")
    public String betaIps;

    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ky-check-****.yml</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>The description of the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Basic configurations</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The encryption key.</p>
     * 
     * <strong>example:</strong>
     * <p>122wdwe****</p>
     */
    @NameInMap("EncryptedDataKey")
    public String encryptedDataKey;

    /**
     * <p>The name of the group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>resource</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-7pp2a****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The MD5 value of the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>045439703a273a94306422b****</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>The ID of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>78b7af66-d15f-4541-b886-11ed81ecb6c0</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The list of tags.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-20</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The format of the configuration. Supported formats include TEXT, JSON, XML, and HTML.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateNacosConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosConfigRequest self = new UpdateNacosConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNacosConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateNacosConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateNacosConfigRequest setBetaIps(String betaIps) {
        this.betaIps = betaIps;
        return this;
    }
    public String getBetaIps() {
        return this.betaIps;
    }

    public UpdateNacosConfigRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateNacosConfigRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateNacosConfigRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateNacosConfigRequest setEncryptedDataKey(String encryptedDataKey) {
        this.encryptedDataKey = encryptedDataKey;
        return this;
    }
    public String getEncryptedDataKey() {
        return this.encryptedDataKey;
    }

    public UpdateNacosConfigRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public UpdateNacosConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateNacosConfigRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public UpdateNacosConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateNacosConfigRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateNacosConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
