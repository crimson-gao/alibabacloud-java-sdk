// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttributeRequest extends TeaModel {
    @NameInMap("CpuOptions")
    public ModifyInstanceAttributeRequestCpuOptions cpuOptions;

    /**
     * <p>The performance mode of the burstable instance. Valid values:</p>
     * <ul>
     * <li>Standard</li>
     * <li>Unlimited</li>
     * </ul>
     * <p>For more information about the performance modes of burstable instances, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The release protection attribute of the instance. This parameter specifies whether you can use the ECS console or call the <a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a> operation to release the instance.</p>
     * <blockquote>
     * <p> This parameter is applicable only to pay-as-you-go instances. The release protection attribute can protect instances against manual releases, but not against automatic releases.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The description of the instance. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testInstanceDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the Jumbo Frames feature for the instance. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>You can enable the Jumbo Frames feature only for specific instance types. For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">MTU and jumbo frames</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableJumboFrame")
    public Boolean enableJumboFrame;

    /**
     * <p>The hostname of the instance. Take note of the following items:</p>
     * <ul>
     * <li>When you change the hostname of the instance, the instance cannot be in the Creating (<code>Pending</code>) or Starting (<code>Starting</code>) state. Otherwise, the new hostname and the configurations in <code>/etc/hosts</code> may not take effect. You can call the <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> operation to query the status of the instance.</li>
     * <li>After you change the hostname, you must call the <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> operation for the new hostname to take effect.</li>
     * </ul>
     * <p>The following limits apply to the hostnames of instances that run different operating systems:</p>
     * <ul>
     * <li>For Windows Server, the hostname must be 2 to 15 characters in length and can contain letters, digits, and hyphens (-). The hostname cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.</li>
     * <li>For other operating systems such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-). The hostname cannot contain consecutive periods (.) or hyphens (-). The hostname cannot start or end with a period (.) or a hyphen (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testHostName</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4ph****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the instance. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testInstanceName</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of queues supported by the primary ENI.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("NetworkInterfaceQueueNumber")
    public Integer networkInterfaceQueueNumber;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the instance. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
     * <pre><code>( ) ` ~ ! @ # $ % ^ &amp; * - _ + = | { } [ ] : ; \\&quot; &lt; &gt; , . ? /
     * </code></pre>
     * <p>The password of a Windows instance cannot start with a forward slash (/).</p>
     * <blockquote>
     * <p> For security reasons, we recommend that you use HTTPS to send requests if <code>Password</code> is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <blockquote>
     * <p> This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("PrivateDnsNameOptions")
    public ModifyInstanceAttributeRequestPrivateDnsNameOptions privateDnsNameOptions;

    /**
     * <blockquote>
     * <p> This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("Recyclable")
    public Boolean recyclable;

    /**
     * <blockquote>
     * <p> This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("RemoteConnectionOptions")
    public ModifyInstanceAttributeRequestRemoteConnectionOptions remoteConnectionOptions;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IDs of replacement security groups.</p>
     * <ul>
     * <li>All security group IDs must be unique.</li>
     * <li>The instance is moved from the current security groups to the replacement security groups. If you want the instance to remain in the current security groups, add the IDs of the current security groups to the list.</li>
     * <li>You can move the instance to security groups of a different type. However, the list cannot contain the IDs of both basic and advanced security groups.</li>
     * <li>The security groups and the instance must belong to the same VPC.</li>
     * <li>The valid values of N vary based on the maximum number of security groups to which the instance can belong. For more information, see the <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a> section in the &quot;Limits and quotas&quot; topic.</li>
     * <li>New security groups become valid for the instance after a short delay.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sg-bp15ed6xe1yxeycg7o****</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The user data of the instance. The user data must be encoded in Base64.</p>
     * <p>The maximum size of the raw data before encoding is 32 KB. We recommend that you do not pass in confidential information such as passwords and private keys in plaintext. If you must pass in confidential information, we recommend that you encrypt and Base64-encode the information before you pass it in. Then, you can decode and decrypt the information in the same way within the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyBoZWxsbyBlY3Mh</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static ModifyInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttributeRequest self = new ModifyInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAttributeRequest setCpuOptions(ModifyInstanceAttributeRequestCpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
        return this;
    }
    public ModifyInstanceAttributeRequestCpuOptions getCpuOptions() {
        return this.cpuOptions;
    }

    public ModifyInstanceAttributeRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public ModifyInstanceAttributeRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public ModifyInstanceAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyInstanceAttributeRequest setEnableJumboFrame(Boolean enableJumboFrame) {
        this.enableJumboFrame = enableJumboFrame;
        return this;
    }
    public Boolean getEnableJumboFrame() {
        return this.enableJumboFrame;
    }

    public ModifyInstanceAttributeRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ModifyInstanceAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceAttributeRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceAttributeRequest setNetworkInterfaceQueueNumber(Integer networkInterfaceQueueNumber) {
        this.networkInterfaceQueueNumber = networkInterfaceQueueNumber;
        return this;
    }
    public Integer getNetworkInterfaceQueueNumber() {
        return this.networkInterfaceQueueNumber;
    }

    public ModifyInstanceAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceAttributeRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyInstanceAttributeRequest setPrivateDnsNameOptions(ModifyInstanceAttributeRequestPrivateDnsNameOptions privateDnsNameOptions) {
        this.privateDnsNameOptions = privateDnsNameOptions;
        return this;
    }
    public ModifyInstanceAttributeRequestPrivateDnsNameOptions getPrivateDnsNameOptions() {
        return this.privateDnsNameOptions;
    }

    public ModifyInstanceAttributeRequest setRecyclable(Boolean recyclable) {
        this.recyclable = recyclable;
        return this;
    }
    public Boolean getRecyclable() {
        return this.recyclable;
    }

    public ModifyInstanceAttributeRequest setRemoteConnectionOptions(ModifyInstanceAttributeRequestRemoteConnectionOptions remoteConnectionOptions) {
        this.remoteConnectionOptions = remoteConnectionOptions;
        return this;
    }
    public ModifyInstanceAttributeRequestRemoteConnectionOptions getRemoteConnectionOptions() {
        return this.remoteConnectionOptions;
    }

    public ModifyInstanceAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyInstanceAttributeRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public ModifyInstanceAttributeRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class ModifyInstanceAttributeRequestCpuOptions extends TeaModel {
        /**
         * <p>The CPU topology type of the instance. Valid values:</p>
         * <ul>
         * <li><code>ContinuousCoreToHTMapping</code>: The Hyper-Threading (HT) technology allows continuous threads to run on the same core in the CPU topology of the instance.</li>
         * <li><code>DiscreteCoreToHTMapping</code>: The HT technology allows discrete threads to run on the same core in the CPU topology of the instance.</li>
         * </ul>
         * <p>By default, this parameter is left empty.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is supported only by specific instance families. For information about the supported instance families, see <a href="https://help.aliyun.com/document_detail/2636059.html">View and modify CPU topologies</a>.</p>
         * </li>
         * <li><p>Before you specify this parameter, make sure that the instance is in the Stopped (<code>Stopped</code>) state.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DiscreteCoreToHTMapping</p>
         */
        @NameInMap("TopologyType")
        public String topologyType;

        public static ModifyInstanceAttributeRequestCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceAttributeRequestCpuOptions self = new ModifyInstanceAttributeRequestCpuOptions();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceAttributeRequestCpuOptions setTopologyType(String topologyType) {
            this.topologyType = topologyType;
            return this;
        }
        public String getTopologyType() {
            return this.topologyType;
        }

    }

    public static class ModifyInstanceAttributeRequestPrivateDnsNameOptions extends TeaModel {
        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableInstanceIdDnsAAAARecord")
        public Boolean enableInstanceIdDnsAAAARecord;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableInstanceIdDnsARecord")
        public Boolean enableInstanceIdDnsARecord;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableIpDnsARecord")
        public Boolean enableIpDnsARecord;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableIpDnsPtrRecord")
        public Boolean enableIpDnsPtrRecord;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("HostnameType")
        public String hostnameType;

        public static ModifyInstanceAttributeRequestPrivateDnsNameOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceAttributeRequestPrivateDnsNameOptions self = new ModifyInstanceAttributeRequestPrivateDnsNameOptions();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceAttributeRequestPrivateDnsNameOptions setEnableInstanceIdDnsAAAARecord(Boolean enableInstanceIdDnsAAAARecord) {
            this.enableInstanceIdDnsAAAARecord = enableInstanceIdDnsAAAARecord;
            return this;
        }
        public Boolean getEnableInstanceIdDnsAAAARecord() {
            return this.enableInstanceIdDnsAAAARecord;
        }

        public ModifyInstanceAttributeRequestPrivateDnsNameOptions setEnableInstanceIdDnsARecord(Boolean enableInstanceIdDnsARecord) {
            this.enableInstanceIdDnsARecord = enableInstanceIdDnsARecord;
            return this;
        }
        public Boolean getEnableInstanceIdDnsARecord() {
            return this.enableInstanceIdDnsARecord;
        }

        public ModifyInstanceAttributeRequestPrivateDnsNameOptions setEnableIpDnsARecord(Boolean enableIpDnsARecord) {
            this.enableIpDnsARecord = enableIpDnsARecord;
            return this;
        }
        public Boolean getEnableIpDnsARecord() {
            return this.enableIpDnsARecord;
        }

        public ModifyInstanceAttributeRequestPrivateDnsNameOptions setEnableIpDnsPtrRecord(Boolean enableIpDnsPtrRecord) {
            this.enableIpDnsPtrRecord = enableIpDnsPtrRecord;
            return this;
        }
        public Boolean getEnableIpDnsPtrRecord() {
            return this.enableIpDnsPtrRecord;
        }

        public ModifyInstanceAttributeRequestPrivateDnsNameOptions setHostnameType(String hostnameType) {
            this.hostnameType = hostnameType;
            return this;
        }
        public String getHostnameType() {
            return this.hostnameType;
        }

    }

    public static class ModifyInstanceAttributeRequestRemoteConnectionOptions extends TeaModel {
        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("Type")
        public String type;

        public static ModifyInstanceAttributeRequestRemoteConnectionOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceAttributeRequestRemoteConnectionOptions self = new ModifyInstanceAttributeRequestRemoteConnectionOptions();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceAttributeRequestRemoteConnectionOptions setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ModifyInstanceAttributeRequestRemoteConnectionOptions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
