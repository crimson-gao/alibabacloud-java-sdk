// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdatePolicyBindingShrinkRequest extends TeaModel {
    /**
     * <p>The advanced options.</p>
     */
    @NameInMap("AdvancedOptions")
    public String advancedOptionsShrink;

    /**
     * <p>The ID of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1************dtv</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>Specifies whether to disable the backup policy for the data source. Valid values:</p>
     * <ul>
     * <li>true: disables the backup policy for the data source</li>
     * <li>false: enables the backup policy for the data source</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Disabled")
    public Boolean disabled;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;<em>.doc\&quot;,\&quot;</em>.xltm\&quot;]</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;<em>.doc\&quot;,\&quot;</em>.xltm\&quot;]</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>The description of the association.</p>
     * 
     * <strong>example:</strong>
     * <p>po-000<strong><strong><strong><strong><strong><strong>5xx-i-2ze</strong></strong></strong></strong></strong></strong>nw4</p>
     */
    @NameInMap("PolicyBindingDescription")
    public String policyBindingDescription;

    /**
     * <p>The ID of the backup policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>po-000************ky9</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <strong>example:</strong>
     * <p>backup/</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><strong>UDM_ECS</strong>: ECS instance backup</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UDM_ECS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <strong>example:</strong>
     * <p>0:24:5120</p>
     */
    @NameInMap("SpeedLimit")
    public String speedLimit;

    public static UpdatePolicyBindingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyBindingShrinkRequest self = new UpdatePolicyBindingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyBindingShrinkRequest setAdvancedOptionsShrink(String advancedOptionsShrink) {
        this.advancedOptionsShrink = advancedOptionsShrink;
        return this;
    }
    public String getAdvancedOptionsShrink() {
        return this.advancedOptionsShrink;
    }

    public UpdatePolicyBindingShrinkRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public UpdatePolicyBindingShrinkRequest setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public UpdatePolicyBindingShrinkRequest setExclude(String exclude) {
        this.exclude = exclude;
        return this;
    }
    public String getExclude() {
        return this.exclude;
    }

    public UpdatePolicyBindingShrinkRequest setInclude(String include) {
        this.include = include;
        return this;
    }
    public String getInclude() {
        return this.include;
    }

    public UpdatePolicyBindingShrinkRequest setPolicyBindingDescription(String policyBindingDescription) {
        this.policyBindingDescription = policyBindingDescription;
        return this;
    }
    public String getPolicyBindingDescription() {
        return this.policyBindingDescription;
    }

    public UpdatePolicyBindingShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UpdatePolicyBindingShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdatePolicyBindingShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdatePolicyBindingShrinkRequest setSpeedLimit(String speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }
    public String getSpeedLimit() {
        return this.speedLimit;
    }

}
