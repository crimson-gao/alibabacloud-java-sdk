// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveAppsAuthoritiesRequest extends TeaModel {
    /**
     * <p>The ID of the API. This ID is generated by the system and globally unique.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The IDs of applications. Separate multiple application IDs with commas (,). A maximum of 100 applications IDs can be entered.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>The ID of the API group. This ID is generated by the system and globally unique.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **TEST**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static RemoveAppsAuthoritiesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAppsAuthoritiesRequest self = new RemoveAppsAuthoritiesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveAppsAuthoritiesRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public RemoveAppsAuthoritiesRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public RemoveAppsAuthoritiesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveAppsAuthoritiesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RemoveAppsAuthoritiesRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
