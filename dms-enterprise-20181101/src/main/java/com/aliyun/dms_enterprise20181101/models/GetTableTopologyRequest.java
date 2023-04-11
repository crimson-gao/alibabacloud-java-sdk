// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableTopologyRequest extends TeaModel {
    /**
     * <p>The GUID of the table in Data Management (DMS).</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You can call the [ListLogicTables](~~141875~~) operation with ReturnGuid set to true to query the GUIDs of logical tables in a specific logical database.</p>
     * <br>
     * <p>*   You can call the [ListTables](~~141878~~) operation with ReturnGuid set to true to query the GUIDs of tables in a specific physical database.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the "View information about the current tenant" section of the [Tenant information](~~181330~~) topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetTableTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableTopologyRequest self = new GetTableTopologyRequest();
        return TeaModel.build(map, self);
    }

    public GetTableTopologyRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetTableTopologyRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
