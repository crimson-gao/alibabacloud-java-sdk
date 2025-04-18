// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    @NameInMap("InstanceDescription")
    public String instanceDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MaxConcurrentConversation")
    public Integer maxConcurrentConversation;

    /**
     * <strong>example:</strong>
     * <p>Provided</p>
     */
    @NameInMap("NluServiceType")
    public String nluServiceType;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmwd4qr3z773y</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setCallingNumber(java.util.List<String> callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    public CreateInstanceRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setMaxConcurrentConversation(Integer maxConcurrentConversation) {
        this.maxConcurrentConversation = maxConcurrentConversation;
        return this;
    }
    public Integer getMaxConcurrentConversation() {
        return this.maxConcurrentConversation;
    }

    public CreateInstanceRequest setNluServiceType(String nluServiceType) {
        this.nluServiceType = nluServiceType;
        return this;
    }
    public String getNluServiceType() {
        return this.nluServiceType;
    }

    public CreateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
