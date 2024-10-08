// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateVaultRequest extends TeaModel {
    /**
     * <p>The description of the backup vault. The description must be 0 to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>vault description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2fa2xeiebyy</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the backup vault.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v-*********************</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    /**
     * <p>The name of the backup vault. The name must be 1 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>vaultname</p>
     */
    @NameInMap("VaultName")
    public String vaultName;

    public static UpdateVaultRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVaultRequest self = new UpdateVaultRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVaultRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateVaultRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateVaultRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

    public UpdateVaultRequest setVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }
    public String getVaultName() {
        return this.vaultName;
    }

}
