// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GenerateServicePolicyRequest extends TeaModel {
    /**
     * <p>The type of operation N for which you want to generate the policy information.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CreateServiceInstance: creates a serviceInstance by calling the CreateServiceInstance operation.</li>
     * <li>UpdateServiceInstance: updates a serviceInstance by calling the UpdateServiceInstance operation.</li>
     * <li>DeleteServiceInstance: deletes a serviceInstance by calling the DeleteServiceInstance operation.</li>
     * </ul>
     * <blockquote>
     * <p> The default value is the combination of all valid values.</p>
     * </blockquote>
     */
    @NameInMap("OperationTypes")
    public java.util.List<String> operationTypes;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-b3e9ed878b0c4xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The service version.</p>
     * 
     * <strong>example:</strong>
     * <p>draft</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    /**
     * <p>The name of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>GPU-单机版</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The trial policy. Valid values:</p>
     * <ul>
     * <li>Trial: Trials are supported.</li>
     * <li>NotTrial: Trials are not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NotTrial</p>
     */
    @NameInMap("TrialType")
    public String trialType;

    public static GenerateServicePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateServicePolicyRequest self = new GenerateServicePolicyRequest();
        return TeaModel.build(map, self);
    }

    public GenerateServicePolicyRequest setOperationTypes(java.util.List<String> operationTypes) {
        this.operationTypes = operationTypes;
        return this;
    }
    public java.util.List<String> getOperationTypes() {
        return this.operationTypes;
    }

    public GenerateServicePolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GenerateServicePolicyRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GenerateServicePolicyRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public GenerateServicePolicyRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GenerateServicePolicyRequest setTrialType(String trialType) {
        this.trialType = trialType;
        return this;
    }
    public String getTrialType() {
        return this.trialType;
    }

}
