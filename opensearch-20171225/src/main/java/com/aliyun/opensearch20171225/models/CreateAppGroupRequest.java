// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateAppGroupRequest extends TeaModel {
    @NameInMap("chargeType")
    public String chargeType;

    @NameInMap("name")
    public String name;

    @NameInMap("quota")
    public CreateAppGroupRequestQuota quota;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("type")
    public String type;

    public static CreateAppGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupRequest self = new CreateAppGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateAppGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAppGroupRequest setQuota(CreateAppGroupRequestQuota quota) {
        this.quota = quota;
        return this;
    }
    public CreateAppGroupRequestQuota getQuota() {
        return this.quota;
    }

    public CreateAppGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAppGroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateAppGroupRequestQuota extends TeaModel {
        @NameInMap("computeResource")
        public Integer computeResource;

        @NameInMap("docSize")
        public Integer docSize;

        @NameInMap("spec")
        public String spec;

        public static CreateAppGroupRequestQuota build(java.util.Map<String, ?> map) throws Exception {
            CreateAppGroupRequestQuota self = new CreateAppGroupRequestQuota();
            return TeaModel.build(map, self);
        }

        public CreateAppGroupRequestQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public CreateAppGroupRequestQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public CreateAppGroupRequestQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

}
