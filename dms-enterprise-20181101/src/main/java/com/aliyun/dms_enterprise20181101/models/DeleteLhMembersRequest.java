// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteLhMembersRequest extends TeaModel {
    // The ID of the user to be removed. You can call the [ListUsers](~~141938~~) or [GetUser](~~147098~~) operation to obtain the user ID.
    @NameInMap("MemberIds")
    public java.util.List<Integer> memberIds;

    // The ID of the object.
    // 
    // *   If the object is a workspace, you can call the [GetLhSpaceByName](~~424379~~) operation to obtain the workspace ID.
    // *   If the object is a task flow, you can call the [ListLhTaskFlowAndScenario](~~426672~~) operation to obtain the task flow ID.
    @NameInMap("ObjectId")
    public Long objectId;

    // The type of the object. Valid values:
    // 
    // *   **0**: workspace
    // *   **1**: task flow
    @NameInMap("ObjectType")
    public Integer objectType;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    public static DeleteLhMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLhMembersRequest self = new DeleteLhMembersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLhMembersRequest setMemberIds(java.util.List<Integer> memberIds) {
        this.memberIds = memberIds;
        return this;
    }
    public java.util.List<Integer> getMemberIds() {
        return this.memberIds;
    }

    public DeleteLhMembersRequest setObjectId(Long objectId) {
        this.objectId = objectId;
        return this;
    }
    public Long getObjectId() {
        return this.objectId;
    }

    public DeleteLhMembersRequest setObjectType(Integer objectType) {
        this.objectType = objectType;
        return this;
    }
    public Integer getObjectType() {
        return this.objectType;
    }

    public DeleteLhMembersRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
