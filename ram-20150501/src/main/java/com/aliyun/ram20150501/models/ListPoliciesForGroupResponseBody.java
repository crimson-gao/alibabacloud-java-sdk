// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesForGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the policies.</p>
     */
    @NameInMap("Policies")
    public ListPoliciesForGroupResponseBodyPolicies policies;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B8A4E7D-6CFF-471D-84DF-195A7A241ECB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPoliciesForGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForGroupResponseBody self = new ListPoliciesForGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPoliciesForGroupResponseBody setPolicies(ListPoliciesForGroupResponseBodyPolicies policies) {
        this.policies = policies;
        return this;
    }
    public ListPoliciesForGroupResponseBodyPolicies getPolicies() {
        return this.policies;
    }

    public ListPoliciesForGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPoliciesForGroupResponseBodyPoliciesPolicy extends TeaModel {
        /**
         * <p>The time when the policy was attached to the RAM user group.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("AttachDate")
        public String attachDate;

        /**
         * <p>The default version of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("DefaultVersion")
        public String defaultVersion;

        /**
         * <p>The description of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS administrator</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS-Administrator</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The type of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static ListPoliciesForGroupResponseBodyPoliciesPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesForGroupResponseBodyPoliciesPolicy self = new ListPoliciesForGroupResponseBodyPoliciesPolicy();
            return TeaModel.build(map, self);
        }

        public ListPoliciesForGroupResponseBodyPoliciesPolicy setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

        public ListPoliciesForGroupResponseBodyPoliciesPolicy setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public ListPoliciesForGroupResponseBodyPoliciesPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPoliciesForGroupResponseBodyPoliciesPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPoliciesForGroupResponseBodyPoliciesPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ListPoliciesForGroupResponseBodyPolicies extends TeaModel {
        @NameInMap("Policy")
        public java.util.List<ListPoliciesForGroupResponseBodyPoliciesPolicy> policy;

        public static ListPoliciesForGroupResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesForGroupResponseBodyPolicies self = new ListPoliciesForGroupResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListPoliciesForGroupResponseBodyPolicies setPolicy(java.util.List<ListPoliciesForGroupResponseBodyPoliciesPolicy> policy) {
            this.policy = policy;
            return this;
        }
        public java.util.List<ListPoliciesForGroupResponseBodyPoliciesPolicy> getPolicy() {
            return this.policy;
        }

    }

}
