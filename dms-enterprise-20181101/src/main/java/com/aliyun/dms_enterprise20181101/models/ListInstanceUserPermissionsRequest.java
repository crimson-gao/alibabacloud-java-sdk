// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstanceUserPermissionsRequest extends TeaModel {
    /**
     * <p>The user who grants the permissions.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The time when the permissions expire.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The nickname of the user. You can call the [ListUsers](~~141938~~) or [GetUser](~~147098~~) operation to query the nickname of the user.</p>
     * <br>
     * <p>>  The value of the NickName parameter is that of the UserName parameter.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static ListInstanceUserPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceUserPermissionsRequest self = new ListInstanceUserPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceUserPermissionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceUserPermissionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstanceUserPermissionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstanceUserPermissionsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListInstanceUserPermissionsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
