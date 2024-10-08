// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckUserProjectNameResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Check")
    public Boolean check;

    /**
     * <strong>example:</strong>
     * <p>project name pass the check</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>ali-dcdn-log-56</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>34DCBC8A-<strong><strong>-</strong></strong>-****-6DAA11D7DDBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckUserProjectNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUserProjectNameResponseBody self = new CheckUserProjectNameResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUserProjectNameResponseBody setCheck(Boolean check) {
        this.check = check;
        return this;
    }
    public Boolean getCheck() {
        return this.check;
    }

    public CheckUserProjectNameResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CheckUserProjectNameResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CheckUserProjectNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
