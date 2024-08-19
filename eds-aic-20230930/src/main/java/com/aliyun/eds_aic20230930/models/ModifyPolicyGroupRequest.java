// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyPolicyGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("CameraRedirect")
    public String cameraRedirect;

    /**
     * <strong>example:</strong>
     * <p>readwrite</p>
     */
    @NameInMap("Clipboard")
    public String clipboard;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Html5FileTransfer")
    public String html5FileTransfer;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("LocalDrive")
    public String localDrive;

    @NameInMap("NetRedirectPolicy")
    public ModifyPolicyGroupRequestNetRedirectPolicy netRedirectPolicy;

    /**
     * <strong>example:</strong>
     * <p>pg-4bi18ebi9tfjh****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("PolicyGroupName")
    public String policyGroupName;

    /**
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("ResolutionHeight")
    public Integer resolutionHeight;

    /**
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("ResolutionWidth")
    public Integer resolutionWidth;

    public static ModifyPolicyGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyGroupRequest self = new ModifyPolicyGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyGroupRequest setCameraRedirect(String cameraRedirect) {
        this.cameraRedirect = cameraRedirect;
        return this;
    }
    public String getCameraRedirect() {
        return this.cameraRedirect;
    }

    public ModifyPolicyGroupRequest setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public ModifyPolicyGroupRequest setHtml5FileTransfer(String html5FileTransfer) {
        this.html5FileTransfer = html5FileTransfer;
        return this;
    }
    public String getHtml5FileTransfer() {
        return this.html5FileTransfer;
    }

    public ModifyPolicyGroupRequest setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public ModifyPolicyGroupRequest setNetRedirectPolicy(ModifyPolicyGroupRequestNetRedirectPolicy netRedirectPolicy) {
        this.netRedirectPolicy = netRedirectPolicy;
        return this;
    }
    public ModifyPolicyGroupRequestNetRedirectPolicy getNetRedirectPolicy() {
        return this.netRedirectPolicy;
    }

    public ModifyPolicyGroupRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ModifyPolicyGroupRequest setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }
    public String getPolicyGroupName() {
        return this.policyGroupName;
    }

    public ModifyPolicyGroupRequest setResolutionHeight(Integer resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
        return this;
    }
    public Integer getResolutionHeight() {
        return this.resolutionHeight;
    }

    public ModifyPolicyGroupRequest setResolutionWidth(Integer resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
        return this;
    }
    public Integer getResolutionWidth() {
        return this.resolutionWidth;
    }

    public static class ModifyPolicyGroupRequestNetRedirectPolicyNetRedirectRule extends TeaModel {
        @NameInMap("Policy")
        public String policy;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Target")
        public String target;

        public static ModifyPolicyGroupRequestNetRedirectPolicyNetRedirectRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyGroupRequestNetRedirectPolicyNetRedirectRule self = new ModifyPolicyGroupRequestNetRedirectPolicyNetRedirectRule();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyGroupRequestNetRedirectPolicyNetRedirectRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ModifyPolicyGroupRequestNetRedirectPolicyNetRedirectRule setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ModifyPolicyGroupRequestNetRedirectPolicyNetRedirectRule setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class ModifyPolicyGroupRequestNetRedirectPolicy extends TeaModel {
        @NameInMap("NetRedirect")
        public String netRedirect;

        @NameInMap("NetRedirectRule")
        public java.util.List<ModifyPolicyGroupRequestNetRedirectPolicyNetRedirectRule> netRedirectRule;

        public static ModifyPolicyGroupRequestNetRedirectPolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyGroupRequestNetRedirectPolicy self = new ModifyPolicyGroupRequestNetRedirectPolicy();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyGroupRequestNetRedirectPolicy setNetRedirect(String netRedirect) {
            this.netRedirect = netRedirect;
            return this;
        }
        public String getNetRedirect() {
            return this.netRedirect;
        }

        public ModifyPolicyGroupRequestNetRedirectPolicy setNetRedirectRule(java.util.List<ModifyPolicyGroupRequestNetRedirectPolicyNetRedirectRule> netRedirectRule) {
            this.netRedirectRule = netRedirectRule;
            return this;
        }
        public java.util.List<ModifyPolicyGroupRequestNetRedirectPolicyNetRedirectRule> getNetRedirectRule() {
            return this.netRedirectRule;
        }

    }

}
