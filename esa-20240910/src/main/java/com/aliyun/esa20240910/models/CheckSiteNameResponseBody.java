// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckSiteNameResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsSubSite")
    public Boolean isSubSite;

    @NameInMap("Messeage")
    public String messeage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Passed")
    public Boolean passed;

    /**
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckSiteNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSiteNameResponseBody self = new CheckSiteNameResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSiteNameResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CheckSiteNameResponseBody setIsSubSite(Boolean isSubSite) {
        this.isSubSite = isSubSite;
        return this;
    }
    public Boolean getIsSubSite() {
        return this.isSubSite;
    }

    public CheckSiteNameResponseBody setMesseage(String messeage) {
        this.messeage = messeage;
        return this;
    }
    public String getMesseage() {
        return this.messeage;
    }

    public CheckSiteNameResponseBody setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }
    public Boolean getPassed() {
        return this.passed;
    }

    public CheckSiteNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
