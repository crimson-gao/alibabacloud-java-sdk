// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateBusinessRequest extends TeaModel {
    /**
     * <p>The ID of the workflow. You can call the <a href="https://help.aliyun.com/document_detail/173945.html">ListBusiness</a> operation to obtain the workflow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>300000</p>
     */
    @NameInMap("BusinessId")
    public Long businessId;

    /**
     * <p>The name of the workflow. You can call the <a href="https://help.aliyun.com/document_detail/173945.html">ListBusiness</a> operation to obtain the workflow name.</p>
     * 
     * <strong>example:</strong>
     * <p>MyBusiness</p>
     */
    @NameInMap("BusinessName")
    public String businessName;

    /**
     * <p>The description of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>modified from my first business</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The owner of the workflow. You can call the <a href="https://help.aliyun.com/document_detail/173945.html">ListBusiness</a> operation to obtain the workflow owner.</p>
     * 
     * <strong>example:</strong>
     * <p>348428****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Management page to obtain the workspace ID. You must configure either this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Management page to obtain the workspace name. You must configure either this parameter or ProjectId parameter to determine the DataWorks workspace to which the operation is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static UpdateBusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBusinessRequest self = new UpdateBusinessRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBusinessRequest setBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }
    public Long getBusinessId() {
        return this.businessId;
    }

    public UpdateBusinessRequest setBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }
    public String getBusinessName() {
        return this.businessName;
    }

    public UpdateBusinessRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBusinessRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateBusinessRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateBusinessRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
