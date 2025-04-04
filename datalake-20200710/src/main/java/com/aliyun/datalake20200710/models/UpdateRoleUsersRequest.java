// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateRoleUsersRequest extends TeaModel {
    /**
     * <p>The name of the role.</p>
     * 
     * <strong>example:</strong>
     * <p>test_role_8</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The list of users or roles. The format of the name must meet the following requirements:</p>
     * <p>RAM user: acs:ram::[accountId]:user/[userName].</p>
     * <p>RAM role: acs:ram::[accountId]:role/[roleName].</p>
     */
    @NameInMap("Users")
    public java.util.List<Principal> users;

    public static UpdateRoleUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleUsersRequest self = new UpdateRoleUsersRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRoleUsersRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public UpdateRoleUsersRequest setUsers(java.util.List<Principal> users) {
        this.users = users;
        return this;
    }
    public java.util.List<Principal> getUsers() {
        return this.users;
    }

}
