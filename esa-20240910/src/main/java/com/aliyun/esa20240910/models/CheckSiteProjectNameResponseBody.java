// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckSiteProjectNameResponseBody extends TeaModel {
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
     * <p>dcdn_waf_userAccount_log</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>34DCBC8A-<strong><strong>-</strong></strong>-****-6DAA11D7DDBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckSiteProjectNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSiteProjectNameResponseBody self = new CheckSiteProjectNameResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSiteProjectNameResponseBody setCheck(Boolean check) {
        this.check = check;
        return this;
    }
    public Boolean getCheck() {
        return this.check;
    }

    public CheckSiteProjectNameResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CheckSiteProjectNameResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CheckSiteProjectNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
