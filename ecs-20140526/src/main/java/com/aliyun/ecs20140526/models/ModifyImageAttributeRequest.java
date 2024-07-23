// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyImageAttributeRequest extends TeaModel {
    /**
     * <p>The new boot mode of the image. Valid values:</p>
     * <ul>
     * <li>BIOS: Basic Input/Output System (BIOS)</li>
     * <li>UEFI: Unified Extensible Firmware Interface (UEFI)</li>
     * <li>UEFI-Preferred: BIOS and UEFI</li>
     * </ul>
     * <blockquote>
     * <p> Before you change the boot mode, we recommend that you obtain the boot modes supported by the image. If you specify an unsupported boot mode for the image, ECS instances that use the image cannot start as expected. If you do not know which boot modes are supported by the image, we recommend that you use the image check feature to perform a check. For information about the image check feature, see <a href="https://help.aliyun.com/document_detail/439819.html">Overview</a>.</p>
     * </blockquote>
     * <blockquote>
     * <p> For information about the UEFI-Preferred boot mode, see <a href="https://help.aliyun.com/document_detail/2244655.html">Best practices for ECS instance boot modes</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>BIOS</p>
     */
    @NameInMap("BootMode")
    public String bootMode;

    /**
     * <p>The new description of the custom image. The description must be 2 to 256 characters in length It cannot start with <a href="http://https://%E3%80%82">http:// or https://.</a></p>
     * <p>This parameter is empty by default, which specifies that the original description is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The attributes of the custom image.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Features")
    public ModifyImageAttributeRequestFeatures features;

    /**
     * <p>The name of the image family. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with acs: or aliyun. <a href="http://https://%E3%80%82%E3%80%81%EF%BC%88.%EF%BC%89%E3%80%81%EF%BC%88:%EF%BC%89%E3%80%81%EF%BC%88_%EF%BC%89%EF%BC%88-%EF%BC%89%E3%80%82">It cannot contain http:// or https://. It can contain letters, digits, periods (.), colons (:), underscores (_), and hyphens (-).</a></p>
     * <p>By default, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the custom image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp18ygjuqnwhechc****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the custom image. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with acs: or aliyun. <a href="http://https://%E3%80%82%E3%80%81%EF%BC%88.%EF%BC%89%E3%80%81%EF%BC%88:%EF%BC%89%E3%80%81%EF%BC%88_%EF%BC%89%EF%BC%88-%EF%BC%89%E3%80%82">It cannot contain http:// or https://. It can contain letters, digits, periods (.), colons (:), underscores (_), and hyphens (-).</a></p>
     * <p>By default, this parameter is empty. In this case, the original name is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>testImageName</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The type of the license that is used to activate the operating system after the image is imported. Set the value to BYOL.</p>
     * <p>BYOL: The license that comes with the source operating system is used. When you use the BYOL license, make sure that your license key is supported by Alibaba Cloud.</p>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("LicenseType")
    public String licenseType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the custom image. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The new state of the custom image. Valid values:</p>
     * <ul>
     * <li>Deprecated: puts the image into the Deprecated state. If the custom image is shared, you must unshare it before you can put it into the Deprecated state. Images in the Deprecated state cannot be shared or copied, but can be used to create instances or replace system disks.</li>
     * <li>Available: puts the image into the Available state. You can restore an image from the Deprecated state to the Available state.</li>
     * </ul>
     * <blockquote>
     * <p>If you want to roll back a custom image in the image family to a previous version, you can put the latest available custom image into the Deprecated state. If no custom images are in the Available state within the image family, an image family cannot be used to create instances. Proceed with caution if only a single custom image is in the Available state within the image family.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Deprecated</p>
     */
    @NameInMap("Status")
    public String status;

    public static ModifyImageAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageAttributeRequest self = new ModifyImageAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImageAttributeRequest setBootMode(String bootMode) {
        this.bootMode = bootMode;
        return this;
    }
    public String getBootMode() {
        return this.bootMode;
    }

    public ModifyImageAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyImageAttributeRequest setFeatures(ModifyImageAttributeRequestFeatures features) {
        this.features = features;
        return this;
    }
    public ModifyImageAttributeRequestFeatures getFeatures() {
        return this.features;
    }

    public ModifyImageAttributeRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public ModifyImageAttributeRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyImageAttributeRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ModifyImageAttributeRequest setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    public String getLicenseType() {
        return this.licenseType;
    }

    public ModifyImageAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyImageAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyImageAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyImageAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyImageAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyImageAttributeRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ModifyImageAttributeRequestFeatures extends TeaModel {
        /**
         * <p>Specifies whether to support the Non-Volatile Memory Express (NVMe) protocol. Valid values:</p>
         * <ul>
         * <li>supported: The image supports NVMe. Instances created from this image also support NVMe.</li>
         * <li>unsupported: The image does not support NVMe. Instances created from this image do not support NVMe.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>supported</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("NvmeSupport")
        public String nvmeSupport;

        public static ModifyImageAttributeRequestFeatures build(java.util.Map<String, ?> map) throws Exception {
            ModifyImageAttributeRequestFeatures self = new ModifyImageAttributeRequestFeatures();
            return TeaModel.build(map, self);
        }

        public ModifyImageAttributeRequestFeatures setNvmeSupport(String nvmeSupport) {
            this.nvmeSupport = nvmeSupport;
            return this;
        }
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

    }

}
