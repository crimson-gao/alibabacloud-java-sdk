// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RemoveCheckResultWhiteListRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>Deprecated</p>
     */
    @NameInMap("CheckGroupId")
    public String checkGroupId;

    /**
     * <p>The IDs of the check items.</p>
     */
    @NameInMap("CheckIds")
    public java.util.List<Long> checkIds;

    /**
     * <p>The ID of the whitelist rule.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to query the IDs of whitelist rules.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>Deprecated</p>
     */
    @NameInMap("Type")
    public String type;

    public static RemoveCheckResultWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveCheckResultWhiteListRequest self = new RemoveCheckResultWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public RemoveCheckResultWhiteListRequest setCheckGroupId(String checkGroupId) {
        this.checkGroupId = checkGroupId;
        return this;
    }
    public String getCheckGroupId() {
        return this.checkGroupId;
    }

    public RemoveCheckResultWhiteListRequest setCheckIds(java.util.List<Long> checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

    public RemoveCheckResultWhiteListRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public RemoveCheckResultWhiteListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
