// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteTLSCipherPolicyRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the Classic Load Balancer (CLB) instance is created.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the TLS policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tls-bp1lp2076qx4ebridp******</p>
     */
    @NameInMap("TLSCipherPolicyId")
    public String TLSCipherPolicyId;

    public static DeleteTLSCipherPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTLSCipherPolicyRequest self = new DeleteTLSCipherPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTLSCipherPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteTLSCipherPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteTLSCipherPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteTLSCipherPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteTLSCipherPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteTLSCipherPolicyRequest setTLSCipherPolicyId(String TLSCipherPolicyId) {
        this.TLSCipherPolicyId = TLSCipherPolicyId;
        return this;
    }
    public String getTLSCipherPolicyId() {
        return this.TLSCipherPolicyId;
    }

}
