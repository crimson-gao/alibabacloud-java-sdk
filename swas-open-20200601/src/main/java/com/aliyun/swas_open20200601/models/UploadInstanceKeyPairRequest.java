// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class UploadInstanceKeyPairRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the simple application server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2ad1ae67295445f598017499dc****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>test_gin</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The public key.</p>
     * 
     * <strong>example:</strong>
     * <p>ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAID5aQ5bM0Am3mWe+upjSXqisUT4DLR6ExwvA0***** <strong>@</strong>.com</p>
     */
    @NameInMap("PublicKey")
    public String publicKey;

    /**
     * <p>The region ID of the simple application server. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UploadInstanceKeyPairRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadInstanceKeyPairRequest self = new UploadInstanceKeyPairRequest();
        return TeaModel.build(map, self);
    }

    public UploadInstanceKeyPairRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UploadInstanceKeyPairRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UploadInstanceKeyPairRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public UploadInstanceKeyPairRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public UploadInstanceKeyPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
