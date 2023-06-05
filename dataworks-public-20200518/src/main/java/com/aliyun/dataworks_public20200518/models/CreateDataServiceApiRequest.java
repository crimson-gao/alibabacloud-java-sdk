// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceApiRequest extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("ApiDescription")
    public String apiDescription;

    /**
     * <p>The format in which the response of the API request is returned. Valid values: 0 and 1. The value 0 indicates the JSON format. The value 1 indicates the XML format. APIs generated in wizard or script mode support the JSON format. APIs generated by registration support the JSON and XML formats.</p>
     */
    @NameInMap("ApiMode")
    public Integer apiMode;

    /**
     * <p>The type of the API. Valid values: 0, 1, and 2. The value 0 indicates that the API is generated in wizard mode. The value 1 indicates that the API is generated in script mode. The value 2 indicates that the API is generated by registration.</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The ID of the folder used to store the API. The ID of the root folder in a business process is 0. The ID of the folder created by a user must be greater than 0.</p>
     */
    @NameInMap("ApiPath")
    public String apiPath;

    /**
     * <p>The ID of the API.</p>
     */
    @NameInMap("FolderId")
    public Long folderId;

    /**
     * <p>The request method of the API. Valid values: 0, 1, 2, and 3. The value 0 indicates the GET method. The value 1 indicates the POST method. The value 2 indicates the PUT method. The value 3 indicates the DELETE method. APIs generated in wizard or script mode support the GET and POST methods. APIs generated by registration support the GET, POST, PUT, and DELETE methods.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the business process.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The details of the API generated in script mode. For more information, see the ScriptDetails parameter returned by the [GetDataServiceApi](~~174013~~) operation.</p>
     */
    @NameInMap("Protocols")
    public String protocols;

    /**
     * <p>The description of the API.</p>
     */
    @NameInMap("RegistrationDetails")
    public String registrationDetails;

    @NameInMap("RequestContentType")
    public Integer requestContentType;

    /**
     * <p>The timeout period of the API request. Unit: milliseconds. Valid values: (0,30000].</p>
     */
    @NameInMap("RequestMethod")
    public Integer requestMethod;

    @NameInMap("ResourceGroupId")
    public Long resourceGroupId;

    /**
     * <p>The scope in which the API is visible. Valid values:</p>
     * <br>
     * <p>*   0: The API is visible to all members in the workspace.</p>
     * <p>*   1: The API is visible only to its owner, and permissions on the API cannot be granted to other members.</p>
     */
    @NameInMap("ResponseContentType")
    public Integer responseContentType;

    /**
     * <p>The path of the API. The path cannot exceed 200 characters in length. The path can contain letters, digits, underscores (\_), and hyphens (-) and must start with a forward slash (/).</p>
     */
    @NameInMap("ScriptDetails")
    public String scriptDetails;

    @NameInMap("SqlMode")
    public Long sqlMode;

    /**
     * <p>The name of the API. The name must be 4 to 50 characters in length. The name can contain letters, digits, and underscores (\_) and must start with a letter.</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    /**
     * <p>The protocol used by the API. Valid values: 0 and 1. The value 0 indicates HTTP. The value 1 indicates HTTPS. You can specify multiple protocols. Separate them with commas (,).</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The details of the API generated in wizard mode. For more information, see the WizardDetails parameter returned by the [GetDataServiceApi](~~174013~~) operation.</p>
     */
    @NameInMap("VisibleRange")
    public Integer visibleRange;

    /**
     * <p>The details of the API generated by registration. For more information, see the RegistrationDetails parameter returned by the [GetDataServiceApi](~~174013~~) operation.</p>
     */
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

    public CreateDataServiceApiRequest setRequestContentType(Integer requestContentType) {
        this.requestContentType = requestContentType;
        return this;
    }
    public Integer getRequestContentType() {
        return this.requestContentType;
    }

    public CreateDataServiceApiRequest setRequestMethod(Integer requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }
    public Integer getRequestMethod() {
        return this.requestMethod;
    }

    public CreateDataServiceApiRequest setResourceGroupId(Long resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public Long getResourceGroupId() {
        return this.resourceGroupId;
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

    public CreateDataServiceApiRequest setSqlMode(Long sqlMode) {
        this.sqlMode = sqlMode;
        return this;
    }
    public Long getSqlMode() {
        return this.sqlMode;
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
