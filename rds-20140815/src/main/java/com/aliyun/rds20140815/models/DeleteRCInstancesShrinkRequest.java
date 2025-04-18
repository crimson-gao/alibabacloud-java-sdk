// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCInstancesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, service limits, and insufficient inventory errors.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, the instance is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to forcefully release a running instance. Valid values:</p>
     * <ul>
     * <li><strong>Yes</strong></li>
     * <li><strong>No</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Yes</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The details of the instance.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceIdShrink;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to release an expired subscription instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TerminateSubscription")
    public Boolean terminateSubscription;

    public static DeleteRCInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCInstancesShrinkRequest self = new DeleteRCInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRCInstancesShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteRCInstancesShrinkRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteRCInstancesShrinkRequest setInstanceIdShrink(String instanceIdShrink) {
        this.instanceIdShrink = instanceIdShrink;
        return this;
    }
    public String getInstanceIdShrink() {
        return this.instanceIdShrink;
    }

    public DeleteRCInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteRCInstancesShrinkRequest setTerminateSubscription(Boolean terminateSubscription) {
        this.terminateSubscription = terminateSubscription;
        return this;
    }
    public Boolean getTerminateSubscription() {
        return this.terminateSubscription;
    }

}
