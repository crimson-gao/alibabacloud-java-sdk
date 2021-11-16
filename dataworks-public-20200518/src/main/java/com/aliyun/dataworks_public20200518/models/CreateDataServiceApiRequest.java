// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceApiRequest extends TeaModel {
    @NameInMap("ApiDescription")
    public String apiDescription;

    @NameInMap("ApiMode")
    public Integer apiMode;

    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("ApiPath")
    public String apiPath;

    @NameInMap("FolderId")
    public Long folderId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Protocols")
    public String protocols;

    @NameInMap("RegistrationDetails")
    public String registrationDetails;

    @NameInMap("RequestMethod")
    public Integer requestMethod;

    @NameInMap("ResponseContentType")
    public Integer responseContentType;

    @NameInMap("ScriptDetails")
    public String scriptDetails;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Timeout")
    public Integer timeout;

    @NameInMap("VisibleRange")
    public Integer visibleRange;

    @NameInMap("WizardDetails")
    public String wizardDetails;

    public static CreateDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceApiRequest self = new CreateDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceApiRequest setApiDescription(String apiDescription) {
        this.apiDescription = apiDescription;
        return this;
    }
    public String getApiDescription() {
        return this.apiDescription;
    }

    public CreateDataServiceApiRequest setApiMode(Integer apiMode) {
        this.apiMode = apiMode;
        return this;
    }
    public Integer getApiMode() {
        return this.apiMode;
    }

    public CreateDataServiceApiRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public CreateDataServiceApiRequest setApiPath(String apiPath) {
        this.apiPath = apiPath;
        return this;
    }
    public String getApiPath() {
        return this.apiPath;
    }

    public CreateDataServiceApiRequest setFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }
    public Long getFolderId() {
        return this.folderId;
    }

    public CreateDataServiceApiRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateDataServiceApiRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataServiceApiRequest setProtocols(String protocols) {
        this.protocols = protocols;
        return this;
    }
    public String getProtocols() {
        return this.protocols;
    }

    public CreateDataServiceApiRequest setRegistrationDetails(String registrationDetails) {
        this.registrationDetails = registrationDetails;
        return this;
    }
    public String getRegistrationDetails() {
        return this.registrationDetails;
    }

    public CreateDataServiceApiRequest setRequestMethod(Integer requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }
    public Integer getRequestMethod() {
        return this.requestMethod;
    }

    public CreateDataServiceApiRequest setResponseContentType(Integer responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public Integer getResponseContentType() {
        return this.responseContentType;
    }

    public CreateDataServiceApiRequest setScriptDetails(String scriptDetails) {
        this.scriptDetails = scriptDetails;
        return this;
    }
    public String getScriptDetails() {
        return this.scriptDetails;
    }

    public CreateDataServiceApiRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public CreateDataServiceApiRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public CreateDataServiceApiRequest setVisibleRange(Integer visibleRange) {
        this.visibleRange = visibleRange;
        return this;
    }
    public Integer getVisibleRange() {
        return this.visibleRange;
    }

    public CreateDataServiceApiRequest setWizardDetails(String wizardDetails) {
        this.wizardDetails = wizardDetails;
        return this;
    }
    public String getWizardDetails() {
        return this.wizardDetails;
    }

}
