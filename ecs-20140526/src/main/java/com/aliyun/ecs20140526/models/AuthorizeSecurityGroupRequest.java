// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is no longer used. Use `Permissions.N.Description` to specify the description of security group rule N.</p>
     */
    @NameInMap("Description")
    @Deprecated
    public String description;

    /**
     * <p>This parameter is no longer used. Use `Permissions.N.DestCidrIp` to specify the destination IPv4 CIDR block.</p>
     */
    @NameInMap("DestCidrIp")
    @Deprecated
    public String destCidrIp;

    /**
     * <p>This parameter is no longer used. Use `Permissions.N.IpProtocol` to specify the transport layer protocol.</p>
     */
    @NameInMap("IpProtocol")
    @Deprecated
    public String ipProtocol;

    /**
     * <p>This parameter is no longer used. Use `Permissions.N.Ipv6SourceCidrIp` to specify the source IPv6 CIDR block.</p>
     */
    @NameInMap("Ipv6DestCidrIp")
    @Deprecated
    public String ipv6DestCidrIp;

    /**
     * <p>This parameter is no longer used. Use `Permissions.N.Ipv6SourceCidrIp` to specify the source IPv6 CIDR block.</p>
     */
    @NameInMap("Ipv6SourceCidrIp")
    @Deprecated
    public String ipv6SourceCidrIp;

    /**
     * <p>This parameter is no longer used. Use `Permissions.N.NicType` to specify the network interface type.</p>
     */
    @NameInMap("NicType")
    @Deprecated
    public String nicType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Security group rule N. Valid values of N: 1 to 100.</p>
     */
    @NameInMap("Permissions")
    public java.util.List<AuthorizeSecurityGroupRequestPermissions> permissions;

    /**
     * <p>This parameter is no longer used. Use `Permissions.N.Policy` to specify whether to allow inbound access.</p>
     */
    @NameInMap("Policy")
    @Deprecated
    public String policy;

    /**
     * <p>This parameter is no longer used. Use `Permissions.N.PortRange` to specify the range of destination ports.</p>
     */
    @NameInMap("PortRange")
    @Deprecated
    public String portRange;

    /**
     * <p>This parameter is no longer used. Use `Permissions.N.Priority` to specify the rule priority.</p>
     */
    @NameInMap("Priority")
    @Deprecated
    public String priority;

    /**
     * <p>The region ID of the security group. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>This parameter is no longer used. Use `Permissions.N.SourceCidrIp` to specify the source IPv4 CIDR block.</p>
     */
    @NameInMap("SourceCidrIp")
    @Deprecated
    public String sourceCidrIp;

    /**
     * <p>This parameter is no longer used. Use `Permissions.N.SourceGroupId` to specify the ID of the source security group.</p>
     */
    @NameInMap("SourceGroupId")
    @Deprecated
    public String sourceGroupId;

    /**
     * <p>This parameter is no longer used. Use `Permissions.N.SourceGroupOwnerAccount` to specify the Alibaba Cloud account that manages the source security group.</p>
     */
    @NameInMap("SourceGroupOwnerAccount")
    @Deprecated
    public String sourceGroupOwnerAccount;

    /**
     * <p>This parameter is no longer used. Use `Permissions.N.SourceGroupOwnerId` to specify the ID of the Alibaba Cloud account that manages the source security group.</p>
     */
    @NameInMap("SourceGroupOwnerId")
    @Deprecated
    public Long sourceGroupOwnerId;

    /**
     * <p>This parameter is no longer used. Use `Permissions.N.SourcePortRange` to specify the range of source ports.</p>
     */
    @NameInMap("SourcePortRange")
    @Deprecated
    public String sourcePortRange;

    /**
     * <p>This parameter is no longer used. Use `Permissions.N.SourcePrefixListId` to specify the ID of the source prefix list.</p>
     */
    @NameInMap("SourcePrefixListId")
    @Deprecated
    public String sourcePrefixListId;

    public static AuthorizeSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSecurityGroupRequest self = new AuthorizeSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeSecurityGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AuthorizeSecurityGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AuthorizeSecurityGroupRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public AuthorizeSecurityGroupRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public AuthorizeSecurityGroupRequest setIpv6DestCidrIp(String ipv6DestCidrIp) {
        this.ipv6DestCidrIp = ipv6DestCidrIp;
        return this;
    }
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    public AuthorizeSecurityGroupRequest setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
        this.ipv6SourceCidrIp = ipv6SourceCidrIp;
        return this;
    }
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    public AuthorizeSecurityGroupRequest setNicType(String nicType) {
        this.nicType = nicType;
        return this;
    }
    public String getNicType() {
        return this.nicType;
    }

    public AuthorizeSecurityGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AuthorizeSecurityGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AuthorizeSecurityGroupRequest setPermissions(java.util.List<AuthorizeSecurityGroupRequestPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<AuthorizeSecurityGroupRequestPermissions> getPermissions() {
        return this.permissions;
    }

    public AuthorizeSecurityGroupRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AuthorizeSecurityGroupRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public AuthorizeSecurityGroupRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public AuthorizeSecurityGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AuthorizeSecurityGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AuthorizeSecurityGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AuthorizeSecurityGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public AuthorizeSecurityGroupRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public AuthorizeSecurityGroupRequest setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    public AuthorizeSecurityGroupRequest setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
        this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
        return this;
    }
    public String getSourceGroupOwnerAccount() {
        return this.sourceGroupOwnerAccount;
    }

    public AuthorizeSecurityGroupRequest setSourceGroupOwnerId(Long sourceGroupOwnerId) {
        this.sourceGroupOwnerId = sourceGroupOwnerId;
        return this;
    }
    public Long getSourceGroupOwnerId() {
        return this.sourceGroupOwnerId;
    }

    public AuthorizeSecurityGroupRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public AuthorizeSecurityGroupRequest setSourcePrefixListId(String sourcePrefixListId) {
        this.sourcePrefixListId = sourcePrefixListId;
        return this;
    }
    public String getSourcePrefixListId() {
        return this.sourcePrefixListId;
    }

    public static class AuthorizeSecurityGroupRequestPermissions extends TeaModel {
        /**
         * <p>The description of security group rule N. The description must be 1 to 512 characters in length.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination IPv4 CIDR block for security group rule N. CIDR blocks and IPv4 addresses are supported.</p>
         * <br>
         * <p>This parameter is specified to meet quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        /**
         * <p>The transport layer protocol of security group rule N. The value of this parameter is case-insensitive. Valid values:</p>
         * <br>
         * <p>*   TCP</p>
         * <p>*   UDP</p>
         * <p>*   ICMP</p>
         * <p>*   ICMPv6</p>
         * <p>*   GRE</p>
         * <p>*   ALL: All protocols are supported.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The destination IPv6 CIDR block for security group rule N. CIDR blocks and IPv6 addresses are supported.</p>
         * <br>
         * <p>This parameter is specified to meet quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         * <br>
         * <p>> This parameter is valid only when the source is ECS instances that reside in VPCs and support IPv6 CIDR blocks. You cannot specify both this parameter and the `DestCidrIp` parameter.</p>
         */
        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        /**
         * <p>The source IPv6 CIDR block for security group rule N. CIDR blocks and IPv6 addresses are supported.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         * <br>
         * <p>> This parameter takes effect only if the sources are ECS instances that reside in VPCs and support IPv6 CIDR blocks. You cannot specify this parameter and `SourceCidrIp` at the same time.</p>
         */
        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        /**
         * <p>The network interface controller (NIC) type of security group rule N when the security group is in the classic network. Valid values:</p>
         * <br>
         * <p>*   internet: public NIC.</p>
         * <p>*   intranet: internal NIC.</p>
         * <br>
         * <p>If the security group is in a VPC, this parameter is set to intranet by default and cannot be changed.</p>
         * <br>
         * <p>If you specify only DestGroupId when you configure access between security groups, this parameter must be set to intranet.</p>
         * <br>
         * <p>Default value: internet.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("NicType")
        public String nicType;

        /**
         * <p>The action of security group rule N that determines whether to allow inbound access. Valid values:</p>
         * <br>
         * <p>*   accept: allows access.</p>
         * <p>*   drop: denies access and returns no responses. In this case, the request times out or the connection cannot be established.</p>
         * <br>
         * <p>Default value: accept.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The range of destination ports that correspond to the transport layer protocol for security group rule N. Valid values:</p>
         * <br>
         * <p>*   If you set IpProtocol to TCP or UDP, the port number range is 1 to 65535. Specify a port range in the format of \<Start port number>/\<End port number>. Example: 1/200.</p>
         * <p>*   If you set IpProtocol to ICMP, the port number range is -1/-1.</p>
         * <p>*   If you set IpProtocol to GRE, the port number range is -1/-1.</p>
         * <p>*   If you set IpProtocol to ALL, the port number range is -1/-1.</p>
         * <br>
         * <p>For more information, see [Typical applications of commonly used ports](~~40724~~).</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of security group rule N. A smaller value specifies a higher priority. Valid values: 1 to 100.</p>
         * <br>
         * <p>Default value: 1.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The source IPv4 CIDR block for security group rule N. CIDR blocks and IPv4 addresses are supported.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The ID of the source security group to be referenced in security group rule N.</p>
         * <br>
         * <p>*   At least one of `SourceGroupId`, `SourceCidrIp`, `Ipv6SourceCidrIp`, and `SourcePrefixListId` must be specified.</p>
         * <p>*   If `SourceGroupId` is specified but `SourceCidrIp` or `Ipv6SourceCidrIp` is not specified, `NicType` must be set to `intranet`.</p>
         * <p>*   If both `SourceGroupId` and `SourceCidrIp` are specified, `SourceCidrIp` takes precedence.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         * <br>
         * <p>Take note of the following items:</p>
         * <br>
         * <p>*   For advanced security groups, security groups cannot be used as authorization objects.</p>
         * <p>*   For each basic security group, up to 20 security groups can be used as authorization objects.</p>
         */
        @NameInMap("SourceGroupId")
        public String sourceGroupId;

        /**
         * <p>The Alibaba Cloud account that manages the source security group when you set a security group rule across accounts.</p>
         * <br>
         * <p>*   If you do not specify `SourceGroupOwnerAccount` and `SourceGroupOwnerId`, access permissions are configured for another security group managed by your account.</p>
         * <p>*   If you specify `SourceCidrIp`, `SourceGroupOwnerAccount` becomes invalid.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("SourceGroupOwnerAccount")
        public String sourceGroupOwnerAccount;

        /**
         * <p>The ID of the Alibaba Cloud account that manages the source security group when you set security group rule N across accounts.</p>
         * <br>
         * <p>*   If you do not specify `SourceGroupOwnerAccount` and `SourceGroupOwnerId`, access permissions are configured for another security group managed by your account.</p>
         * <p>*   If you specify `SourceCidrIp`, `SourceGroupOwnerAccount` is ignored.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("SourceGroupOwnerId")
        public Long sourceGroupOwnerId;

        /**
         * <p>The range of source ports that correspond to the transport layer protocol for security group rule N. Valid values:</p>
         * <br>
         * <p>*   If you set IpProtocol to TCP or UDP, the port number range is 1 to 65535. Specify a port range in the format of \<Start port number>/\<End port number>. Example: 1/200.</p>
         * <p>*   If you set IpProtocol to ICMP, the port number range is -1/-1.</p>
         * <p>*   If you set IpProtocol to GRE, the port number range is -1/-1.</p>
         * <p>*   If you set IpProtocol to ALL, the port number range is -1/-1.</p>
         * <br>
         * <p>This parameter is specified to meet quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        /**
         * <p>The ID of the source prefix list to which you want to control access. You can call the [DescribePrefixLists](~~205046~~) operation to query the IDs of available prefix lists.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         * <br>
         * <p>Take note of the following items:</p>
         * <br>
         * <p>*   If a security group is in the classic network, you cannot reference prefix lists in the security group rules. For information about the limits on security groups and prefix lists, see the "Security group limits" section in [Limits](~~25412#SecurityGroupQuota1~~).</p>
         * <p>*   If you specify `SourceCidrIp`, `Ipv6SourceCidrIp`, or `SourceGroupId`, this parameter is ignored.</p>
         */
        @NameInMap("SourcePrefixListId")
        public String sourcePrefixListId;

        public static AuthorizeSecurityGroupRequestPermissions build(java.util.Map<String, ?> map) throws Exception {
            AuthorizeSecurityGroupRequestPermissions self = new AuthorizeSecurityGroupRequestPermissions();
            return TeaModel.build(map, self);
        }

        public AuthorizeSecurityGroupRequestPermissions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AuthorizeSecurityGroupRequestPermissions setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public AuthorizeSecurityGroupRequestPermissions setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public AuthorizeSecurityGroupRequestPermissions setIpv6DestCidrIp(String ipv6DestCidrIp) {
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        public AuthorizeSecurityGroupRequestPermissions setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        public AuthorizeSecurityGroupRequestPermissions setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public AuthorizeSecurityGroupRequestPermissions setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public AuthorizeSecurityGroupRequestPermissions setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public AuthorizeSecurityGroupRequestPermissions setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public AuthorizeSecurityGroupRequestPermissions setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public AuthorizeSecurityGroupRequestPermissions setSourceGroupId(String sourceGroupId) {
            this.sourceGroupId = sourceGroupId;
            return this;
        }
        public String getSourceGroupId() {
            return this.sourceGroupId;
        }

        public AuthorizeSecurityGroupRequestPermissions setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
            this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
            return this;
        }
        public String getSourceGroupOwnerAccount() {
            return this.sourceGroupOwnerAccount;
        }

        public AuthorizeSecurityGroupRequestPermissions setSourceGroupOwnerId(Long sourceGroupOwnerId) {
            this.sourceGroupOwnerId = sourceGroupOwnerId;
            return this;
        }
        public Long getSourceGroupOwnerId() {
            return this.sourceGroupOwnerId;
        }

        public AuthorizeSecurityGroupRequestPermissions setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public AuthorizeSecurityGroupRequestPermissions setSourcePrefixListId(String sourcePrefixListId) {
            this.sourcePrefixListId = sourcePrefixListId;
            return this;
        }
        public String getSourcePrefixListId() {
            return this.sourcePrefixListId;
        }

    }

}
