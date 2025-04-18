// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallCenListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>850A84D6-0DE4-4797-A1E8-00090125k8g2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of VPC firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The information about the VPC firewalls.</p>
     */
    @NameInMap("VpcFirewalls")
    public java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewalls> vpcFirewalls;

    public static DescribeVpcFirewallCenListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallCenListResponseBody self = new DescribeVpcFirewallCenListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallCenListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallCenListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpcFirewallCenListResponseBody setVpcFirewalls(java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewalls> vpcFirewalls) {
        this.vpcFirewalls = vpcFirewalls;
        return this;
    }
    public java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewalls> getVpcFirewalls() {
        return this.vpcFirewalls;
    }

    public static class DescribeVpcFirewallCenListResponseBodyVpcFirewallsAclConfig extends TeaModel {
        @NameInMap("StrictMode")
        public Integer strictMode;

        public static DescribeVpcFirewallCenListResponseBodyVpcFirewallsAclConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenListResponseBodyVpcFirewallsAclConfig self = new DescribeVpcFirewallCenListResponseBodyVpcFirewallsAclConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsAclConfig setStrictMode(Integer strictMode) {
            this.strictMode = strictMode;
            return this;
        }
        public Integer getStrictMode() {
            return this.strictMode;
        }

    }

    public static class DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig extends TeaModel {
        /**
         * <p>Indicates whether basic protection is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BasicRules")
        public Integer basicRules;

        /**
         * <p>Indicates whether virtual patching is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnableAllPatch")
        public Integer enableAllPatch;

        /**
         * <p>The level of the rule group for the IPS. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: loose.</li>
         * <li><strong>2</strong>: medium.</li>
         * <li><strong>3</strong>: strict.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleClass")
        public Integer ruleClass;

        /**
         * <p>The mode of the IPS. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: block mode</li>
         * <li><strong>0</strong>: monitor mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RunMode")
        public Integer runMode;

        public static DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig self = new DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig setBasicRules(Integer basicRules) {
            this.basicRules = basicRules;
            return this;
        }
        public Integer getBasicRules() {
            return this.basicRules;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig setEnableAllPatch(Integer enableAllPatch) {
            this.enableAllPatch = enableAllPatch;
            return this;
        }
        public Integer getEnableAllPatch() {
            return this.enableAllPatch;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig setRuleClass(Integer ruleClass) {
            this.ruleClass = ruleClass;
            return this;
        }
        public Integer getRuleClass() {
            return this.ruleClass;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig setRunMode(Integer runMode) {
            this.runMode = runMode;
            return this;
        }
        public Integer getRunMode() {
            return this.runMode;
        }

    }

    public static class DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList extends TeaModel {
        /**
         * <p>The destination CIDR block of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX/24</p>
         */
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        /**
         * <p>The instance ID of the next hop for the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-m5eb5me6c3l5sezae****</p>
         */
        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        public static DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList self = new DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList setNextHopInstanceId(String nextHopInstanceId) {
            this.nextHopInstanceId = nextHopInstanceId;
            return this;
        }
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

    }

    public static class DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList extends TeaModel {
        /**
         * <p>An array that consists of the route entries for the VPC.</p>
         */
        @NameInMap("RouteEntryList")
        public java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList> routeEntryList;

        /**
         * <p>The route table ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-1234</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList self = new DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList setRouteEntryList(java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList> routeEntryList) {
            this.routeEntryList = routeEntryList;
            return this;
        }
        public java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList> getRouteEntryList() {
            return this.routeEntryList;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

    public static class DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc extends TeaModel {
        /**
         * <p>Indicates whether the VPC is granted the required permissions. The value is fixed as <strong>authorized</strong>, which indicates that the VPC is granted the required permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>authorized</p>
         */
        @NameInMap("AuthorizationStatus")
        public String authorizationStatus;

        /**
         * <p>An array consisting of the CIDR blocks that are protected by the VPC firewall.</p>
         */
        @NameInMap("DefendCidrList")
        public java.util.List<String> defendCidrList;

        /**
         * <p>The ID of the specified vSwitch when the routing mode is manual.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-zeq4o875u****</p>
         */
        @NameInMap("ManualVSwitchId")
        public String manualVSwitchId;

        /**
         * <p>The ID of the network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zefk9fbn8j7v585g****</p>
         */
        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        /**
         * <p>The name of the network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Test VPC</p>
         */
        @NameInMap("NetworkInstanceName")
        public String networkInstanceName;

        /**
         * <p>The type of the network instance. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>VBR</strong></li>
         * <li><strong>CCN</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkInstanceType")
        public String networkInstanceType;

        /**
         * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>158039427902****</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The region ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The routing mode of the VPC firewall. Valid values:</p>
         * <ul>
         * <li><strong>auto</strong>: automatic mode</li>
         * <li><strong>manual</strong>: manual mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("RouteMode")
        public String routeMode;

        /**
         * <p>Indicates whether the manual routing mode is supported. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SupportManualMode")
        public String supportManualMode;

        /**
         * <p>The edition of the CEN transit router. Valid values:</p>
         * <ul>
         * <li><strong>Basic</strong>: Basic Edition transit router</li>
         * <li><strong>Enterprise</strong>: Enterprise Edition transit router</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Basic</p>
         */
        @NameInMap("TransitRouterType")
        public String transitRouterType;

        /**
         * <p>An array that consists of the CIDR blocks of the VPC.</p>
         */
        @NameInMap("VpcCidrTableList")
        public java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList> vpcCidrTableList;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbwbo90rq0anm6t****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>Test instance</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc self = new DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setAuthorizationStatus(String authorizationStatus) {
            this.authorizationStatus = authorizationStatus;
            return this;
        }
        public String getAuthorizationStatus() {
            return this.authorizationStatus;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setDefendCidrList(java.util.List<String> defendCidrList) {
            this.defendCidrList = defendCidrList;
            return this;
        }
        public java.util.List<String> getDefendCidrList() {
            return this.defendCidrList;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setManualVSwitchId(String manualVSwitchId) {
            this.manualVSwitchId = manualVSwitchId;
            return this;
        }
        public String getManualVSwitchId() {
            return this.manualVSwitchId;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setNetworkInstanceId(String networkInstanceId) {
            this.networkInstanceId = networkInstanceId;
            return this;
        }
        public String getNetworkInstanceId() {
            return this.networkInstanceId;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setNetworkInstanceName(String networkInstanceName) {
            this.networkInstanceName = networkInstanceName;
            return this;
        }
        public String getNetworkInstanceName() {
            return this.networkInstanceName;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setNetworkInstanceType(String networkInstanceType) {
            this.networkInstanceType = networkInstanceType;
            return this;
        }
        public String getNetworkInstanceType() {
            return this.networkInstanceType;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setRouteMode(String routeMode) {
            this.routeMode = routeMode;
            return this;
        }
        public String getRouteMode() {
            return this.routeMode;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setSupportManualMode(String supportManualMode) {
            this.supportManualMode = supportManualMode;
            return this;
        }
        public String getSupportManualMode() {
            return this.supportManualMode;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setTransitRouterType(String transitRouterType) {
            this.transitRouterType = transitRouterType;
            return this;
        }
        public String getTransitRouterType() {
            return this.transitRouterType;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setVpcCidrTableList(java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList> vpcCidrTableList) {
            this.vpcCidrTableList = vpcCidrTableList;
            return this;
        }
        public java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList> getVpcCidrTableList() {
            return this.vpcCidrTableList;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class DescribeVpcFirewallCenListResponseBodyVpcFirewalls extends TeaModel {
        @NameInMap("AclConfig")
        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsAclConfig aclConfig;

        /**
         * <p>The ID of the CEN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-x5jayxou71ad73****</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The name of the CEN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Test CEN instance</p>
         */
        @NameInMap("CenName")
        public String cenName;

        /**
         * <p>The connection type of the VPC firewall. The value is fixed as cen, which indicates a CEN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen</p>
         */
        @NameInMap("ConnectType")
        public String connectType;

        /**
         * <p>The status of the VPC firewall. Valid values:</p>
         * <ul>
         * <li><strong>opened</strong>: The VPC firewall is enabled.</li>
         * <li><strong>closed</strong>: The VPC firewall is disabled.</li>
         * <li><strong>notconfigured</strong>: The VPC firewall is not configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>opened</p>
         */
        @NameInMap("FirewallSwitchStatus")
        public String firewallSwitchStatus;

        /**
         * <p>The intrusion prevention system (IPS) configurations.</p>
         */
        @NameInMap("IpsConfig")
        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig ipsConfig;

        /**
         * <p>The details about the VPC.</p>
         */
        @NameInMap("LocalVpc")
        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc localVpc;

        /**
         * <p>The UID of the member that is manged by your Alibaba Cloud account. The member is also an Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>Indicates whether the VPC firewall can be automatically enabled to protect VPC traffic based on route learning. Valid values:</p>
         * <ul>
         * <li><strong>passed</strong>: The VPC firewall can be automatically enabled.</li>
         * <li><strong>failed</strong>: The VPC firewall cannot be automatically enabled.</li>
         * <li><strong>unknown</strong>: The VPC firewall is in an unknown state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>failed</p>
         */
        @NameInMap("PrecheckStatus")
        public String precheckStatus;

        /**
         * <p>Indicates whether you can create a VPC firewall in a specified region. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: yes</li>
         * <li><strong>disable</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("RegionStatus")
        public String regionStatus;

        /**
         * <p>The result code of the operation that creates the VPC firewall. Valid values:</p>
         * <ul>
         * <li><strong>Unauthorized</strong>: Cloud Firewall is not authorized to access the VPC for which the VPC firewall is created, and the VPC firewall cannot be created.</li>
         * <li><strong>RegionDisable</strong>: VPC Firewall is not supported in the region of the VPC for which the VPC firewall is created, and the VPC firewall cannot be created.</li>
         * <li><strong>OpsDisable</strong>: You are not allowed to create the VPC firewall.</li>
         * <li><strong>VbrNotSupport</strong>: The VPC firewall cannot be created for a VBR that is attached to the CEN instance.</li>
         * <li>Empty string: You can create a VPC firewall for the network instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unauthorized</p>
         */
        @NameInMap("ResultCode")
        public String resultCode;

        /**
         * <p>The instance ID of the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-m5e7dbc4y****</p>
         */
        @NameInMap("VpcFirewallId")
        public String vpcFirewallId;

        /**
         * <p>The instance name of the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>Test firewall</p>
         */
        @NameInMap("VpcFirewallName")
        public String vpcFirewallName;

        public static DescribeVpcFirewallCenListResponseBodyVpcFirewalls build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenListResponseBodyVpcFirewalls self = new DescribeVpcFirewallCenListResponseBodyVpcFirewalls();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setAclConfig(DescribeVpcFirewallCenListResponseBodyVpcFirewallsAclConfig aclConfig) {
            this.aclConfig = aclConfig;
            return this;
        }
        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsAclConfig getAclConfig() {
            return this.aclConfig;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setCenName(String cenName) {
            this.cenName = cenName;
            return this;
        }
        public String getCenName() {
            return this.cenName;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setConnectType(String connectType) {
            this.connectType = connectType;
            return this;
        }
        public String getConnectType() {
            return this.connectType;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setFirewallSwitchStatus(String firewallSwitchStatus) {
            this.firewallSwitchStatus = firewallSwitchStatus;
            return this;
        }
        public String getFirewallSwitchStatus() {
            return this.firewallSwitchStatus;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setIpsConfig(DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig ipsConfig) {
            this.ipsConfig = ipsConfig;
            return this;
        }
        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig getIpsConfig() {
            return this.ipsConfig;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setLocalVpc(DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc localVpc) {
            this.localVpc = localVpc;
            return this;
        }
        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc getLocalVpc() {
            return this.localVpc;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setPrecheckStatus(String precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public String getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setRegionStatus(String regionStatus) {
            this.regionStatus = regionStatus;
            return this;
        }
        public String getRegionStatus() {
            return this.regionStatus;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setVpcFirewallId(String vpcFirewallId) {
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }
        public String getVpcFirewallId() {
            return this.vpcFirewallId;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setVpcFirewallName(String vpcFirewallName) {
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }
        public String getVpcFirewallName() {
            return this.vpcFirewallName;
        }

    }

}
