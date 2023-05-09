// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CreateSchedruleOnDemandRequest extends TeaModel {
    /**
     * <p>The threshold of inbound bandwidth. Unit: Mbit/s. Minimum value: **100**.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).</p>
     * <br>
     * <p>For more information about sample requests, see the **"Examples"** section of this topic.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The stop method of the scheduling rule. Valid values:</p>
     * <br>
     * <p>*   **auto**: The scheduling rule automatically stops.</p>
     * <p>*   **manual**: The scheduling rule is manually stopped.</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    /**
     * <p>Specifies whether the scheduling rule is enabled. Valid values:</p>
     * <br>
     * <p>*   **on**: enabled</p>
     * <p>*   **off**: disabled</p>
     */
    @NameInMap("RuleConditionCnt")
    public String ruleConditionCnt;

    /**
     * <p>The scheduling action. Set the value to **declare**, which indicates that the route is advertised.</p>
     */
    @NameInMap("RuleConditionKpps")
    public String ruleConditionKpps;

    /**
     * <p>If the inbound bandwidth or packets consecutively exceed the threshold for the specified number of times, the scheduling rule is triggered and traffic is rerouted to the on-demand instance. The specified number of times is the value of this parameter.</p>
     * <br>
     * <p>>  The threshold of inbound bandwidth is the value of **RuleConditionMbps**. The threshold of inbound packets is the value of **RuleConditionKpps**.</p>
     */
    @NameInMap("RuleConditionMbps")
    public String ruleConditionMbps;

    /**
     * <p>The threshold of inbound packets. Unit: Kpps. Minimum value: **10**.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The start time of the period during which the scheduling rule is automatically stopped. The time must be in the 24-hour clock and in the `hh:mm` format.</p>
     * <br>
     * <p>If the system detects that DDoS attacks stop, the system no longer reroutes traffic to the on-demand instance from the time you specified. We recommend that you set this parameter to a value that is defined as off-peak hours.</p>
     * <br>
     * <p>>  This parameter takes effect only when the **RuleUndoMode** parameter is set to **auto**.</p>
     */
    @NameInMap("RuleSwitch")
    public String ruleSwitch;

    /**
     * <p>The time zone of the time when the scheduling rule automatically stops. The time zone must be in the `GMT-hh:mm` format.</p>
     * <br>
     * <p>For example, the value `GMT-08:00` indicates that the time zone is UTC+8.</p>
     * <br>
     * <p>>  This parameter takes effect only when the **RuleUndoMode** parameter is set to **auto**.</p>
     */
    @NameInMap("RuleUndoBeginTime")
    public String ruleUndoBeginTime;

    /**
     * <p>The region ID of the on-demand instance.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~118703~~) operation to query all regions supported by Anti-DDoS Origin.</p>
     */
    @NameInMap("RuleUndoEndTime")
    public String ruleUndoEndTime;

    /**
     * <p>The end time of the period during which the scheduling rule is automatically stopped. The time must be in the 24-hour clock and in the `hh:mm` format.</p>
     */
    @NameInMap("RuleUndoMode")
    public String ruleUndoMode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    public static CreateSchedruleOnDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSchedruleOnDemandRequest self = new CreateSchedruleOnDemandRequest();
        return TeaModel.build(map, self);
    }

    public CreateSchedruleOnDemandRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSchedruleOnDemandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSchedruleOnDemandRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public CreateSchedruleOnDemandRequest setRuleConditionCnt(String ruleConditionCnt) {
        this.ruleConditionCnt = ruleConditionCnt;
        return this;
    }
    public String getRuleConditionCnt() {
        return this.ruleConditionCnt;
    }

    public CreateSchedruleOnDemandRequest setRuleConditionKpps(String ruleConditionKpps) {
        this.ruleConditionKpps = ruleConditionKpps;
        return this;
    }
    public String getRuleConditionKpps() {
        return this.ruleConditionKpps;
    }

    public CreateSchedruleOnDemandRequest setRuleConditionMbps(String ruleConditionMbps) {
        this.ruleConditionMbps = ruleConditionMbps;
        return this;
    }
    public String getRuleConditionMbps() {
        return this.ruleConditionMbps;
    }

    public CreateSchedruleOnDemandRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateSchedruleOnDemandRequest setRuleSwitch(String ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public String getRuleSwitch() {
        return this.ruleSwitch;
    }

    public CreateSchedruleOnDemandRequest setRuleUndoBeginTime(String ruleUndoBeginTime) {
        this.ruleUndoBeginTime = ruleUndoBeginTime;
        return this;
    }
    public String getRuleUndoBeginTime() {
        return this.ruleUndoBeginTime;
    }

    public CreateSchedruleOnDemandRequest setRuleUndoEndTime(String ruleUndoEndTime) {
        this.ruleUndoEndTime = ruleUndoEndTime;
        return this;
    }
    public String getRuleUndoEndTime() {
        return this.ruleUndoEndTime;
    }

    public CreateSchedruleOnDemandRequest setRuleUndoMode(String ruleUndoMode) {
        this.ruleUndoMode = ruleUndoMode;
        return this;
    }
    public String getRuleUndoMode() {
        return this.ruleUndoMode;
    }

    public CreateSchedruleOnDemandRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
