// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SaveDataServiceApiTestResultRequest extends TeaModel {
    /**
     * <p>The API ID. You can call the <a href="https://help.aliyun.com/document_detail/174012.html">ListDataServiceApis</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>417381955954827</p>
     */
    @NameInMap("ApiId")
    public Long apiId;

    /**
     * <p>Specifies whether to use the test results generated by the system. If you do not configure the resultSample or failResultSample parameter, the test results generated by the system are used.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoGenerate")
    public Boolean autoGenerate;

    /**
     * <p>The sample failure response of the API. This parameter is optional.</p>
     */
    @NameInMap("FailResultSample")
    public String failResultSample;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The sample success response of the API. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>{  &quot;data&quot;: {    &quot;totalNum&quot;: 0,    &quot;pageSize&quot;: 10,    &quot;rows&quot;: [],    &quot;pageNum&quot;: 1  },  &quot;errCode&quot;: 0,  &quot;requestId&quot;: &quot;0bc14a561678159140664515*****&quot;,  &quot;errMsg&quot;: &quot;success&quot;,  &quot;apiLog&quot;: null}</p>
     */
    @NameInMap("ResultSample")
    public String resultSample;

    public static SaveDataServiceApiTestResultRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveDataServiceApiTestResultRequest self = new SaveDataServiceApiTestResultRequest();
        return TeaModel.build(map, self);
    }

    public SaveDataServiceApiTestResultRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public SaveDataServiceApiTestResultRequest setAutoGenerate(Boolean autoGenerate) {
        this.autoGenerate = autoGenerate;
        return this;
    }
    public Boolean getAutoGenerate() {
        return this.autoGenerate;
    }

    public SaveDataServiceApiTestResultRequest setFailResultSample(String failResultSample) {
        this.failResultSample = failResultSample;
        return this;
    }
    public String getFailResultSample() {
        return this.failResultSample;
    }

    public SaveDataServiceApiTestResultRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SaveDataServiceApiTestResultRequest setResultSample(String resultSample) {
        this.resultSample = resultSample;
        return this;
    }
    public String getResultSample() {
        return this.resultSample;
    }

}
