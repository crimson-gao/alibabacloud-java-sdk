// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterDetailResponseBody extends TeaModel {
    /**
     * <p>The ID of the queried ACK cluster.</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The type of the managed Kubernetes cluster. This parameter is returned for a managed Kubernetes cluster. Valid values:</p>
     * <br>
     * <p>*   `ack.pro.small`: professional managed Kubernetes cluster.</p>
     * <p>*   `ack.standard`: standard managed Kubernetes cluster.</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>The type of the cluster. Valid values:</p>
     * <br>
     * <p>*   `Kubernetes`: dedicated Kubernetes cluster</p>
     * <p>*   `ManagedKubernetes`: managed Kubernetes cluster</p>
     * <p>*   `Ask`: ASK cluster</p>
     * <p>*   `ExternalKubernetes`: registered external Kubernetes cluster</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The time when the cluster was created.</p>
     */
    @NameInMap("created")
    public String created;

    /**
     * <p>The current Kubernetes version of the cluster. For more information about the Kubernetes versions supported by ACK, see [Release notes for Kubernetes versions](~~185269~~).</p>
     */
    @NameInMap("current_version")
    public String currentVersion;

    /**
     * <p>Indicates whether deletion protection is enabled. If deletion protection is enabled, the cluster cannot be deleted in the ACK console or by calling the API. Valid values:</p>
     * <br>
     * <p>*   `true`: Deletion protection is enabled. You cannot delete the cluster in the ACK console or by calling the API.</p>
     * <p>*   `false`: Deletion protection is not enabled. You can delete the cluster in the ACK console or by calling the API.</p>
     */
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    /**
     * <p>The Docker version that is used by the cluster.</p>
     */
    @NameInMap("docker_version")
    public String dockerVersion;

    /**
     * <p>The ID of the Server Load Balancer (SLB) instance that is used for the Ingress of the cluster.</p>
     */
    @NameInMap("external_loadbalancer_id")
    public String externalLoadbalancerId;

    /**
     * <p>The Kubernetes version that is initially used by the cluster.</p>
     */
    @NameInMap("init_version")
    public String initVersion;

    /**
     * <p>The maintenance window of the cluster. This feature is available in only professional managed Kubernetes clusters.</p>
     */
    @NameInMap("maintenance_window")
    public MaintenanceWindow maintenanceWindow;

    /**
     * <p>The address of the cluster. It includes an internal endpoint and a public endpoint.</p>
     */
    @NameInMap("master_url")
    public String masterUrl;

    /**
     * <p>The metadata of the cluster.</p>
     */
    @NameInMap("meta_data")
    public String metaData;

    /**
     * <p>The name of the cluster.</p>
     * <br>
     * <p>The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). It cannot start with a hyphen (-).</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The network mode of the cluster. Valid values:</p>
     * <br>
     * <p>*   `classic`: the classic network</p>
     * <p>*   `vpc`: virtual private cloud (VPC)</p>
     * <p>*   `overlay`: overlay network</p>
     * <p>*   `calico`: network powered by Calico</p>
     * <br>
     * <p>Default value`: vpc`.</p>
     */
    @NameInMap("network_mode")
    public String networkMode;

    /**
     * <p>The Kubernetes version to which the cluster can be upgraded.</p>
     */
    @NameInMap("next_version")
    public String nextVersion;

    @NameInMap("parameters")
    public java.util.Map<String, String> parameters;

    /**
     * <p>Indicates whether Alibaba Cloud DNS PrivateZone is enabled.</p>
     * <br>
     * <p>*   `true`: indicates that Alibaba Cloud DNS PrivateZone is enabled.</p>
     * <p>*   `false`: indicates that Alibaba Cloud DNS PrivateZone is not enabled.</p>
     */
    @NameInMap("private_zone")
    public Boolean privateZone;

    /**
     * <p>Indicates the scenario in which the cluster is used. Valid values:</p>
     * <br>
     * <p>*   `Default`: indicates that the cluster is used in non-edge computing scenarios.</p>
     * <p>*   `Edge`: indicates that the ACK cluster is used in edge computing scenarios.</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>The ID of the region where the cluster is deployed.</p>
     */
    @NameInMap("region_id")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the cluster belongs.</p>
     */
    @NameInMap("resource_group_id")
    public String resourceGroupId;

    /**
     * <p>The ID of the security group to which the instances of the cluster belong.</p>
     */
    @NameInMap("security_group_id")
    public String securityGroupId;

    /**
     * <p>The number of nodes in the cluster. Master nodes and worker nodes are included.</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>The state of the cluster. Valid values:</p>
     * <br>
     * <p>*   `initial`: The cluster is being created.</p>
     * <p>*   `failed`: The cluster failed to be created.</p>
     * <p>*   `running`: The cluster is running.</p>
     * <p>*   `updating`: The cluster is being upgraded.</p>
     * <p>*   `updating_failed`: The cluster failed to be upgraded.</p>
     * <p>*   `scaling`: The cluster is being scaled.</p>
     * <p>*   `waiting`: The registered cluster is waiting for connecting.</p>
     * <p>*   `disconnected`: The registeredcluster is disconnected.</p>
     * <p>*   `stopped`: The cluster is stopped.</p>
     * <p>*   `deleting`: The cluster is being deleted.</p>
     * <p>*   `deleted`: The cluster is deleted.</p>
     * <p>*   `delete_failed`: The cluster failed to be deleted.</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The pod CIDR block. It must be a valid and private CIDR block, and must be one of the following CIDR blocks or their subnets:</p>
     * <br>
     * <p>*   10.0.0.0/8</p>
     * <p>*   172.16-31.0.0/12-16</p>
     * <p>*   192.168.0.0/16</p>
     * <br>
     * <p>The pod CIDR block cannot overlap with that of the VPC or those of the ACK clusters that are deployed in the VPC.</p>
     * <br>
     * <p>For more information about the network segmentation of ACK clusters, see [Plan CIDR blocks for ACK clusters in a VPC](~~186964~~).</p>
     */
    @NameInMap("subnet_cidr")
    public String subnetCidr;

    /**
     * <p>The labels of the cluster.</p>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>The time when the cluster was updated.</p>
     */
    @NameInMap("updated")
    public String updated;

    /**
     * <p>The ID of the VPC where the cluster is deployed. This parameter is required when you create an ACK cluster.</p>
     */
    @NameInMap("vpc_id")
    public String vpcId;

    /**
     * <p>The IDs of the vSwitches. You can select one to three vSwitches when you create an ACK cluster. vSwitches in different zones are recommended to ensure high availability.</p>
     */
    @NameInMap("vswitch_id")
    public String vswitchId;

    /**
     * <p>The name of the worker RAM role. The RAM role is assigned to the worker nodes of the cluster and allows the worker nodes to manage Elastic Compute Service (ECS) instances.</p>
     */
    @NameInMap("worker_ram_role_name")
    public String workerRamRoleName;

    /**
     * <p>The ID of the zone where the cluster is deployed.</p>
     */
    @NameInMap("zone_id")
    public String zoneId;

    public static DescribeClusterDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterDetailResponseBody self = new DescribeClusterDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterDetailResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterDetailResponseBody setClusterSpec(String clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    public DescribeClusterDetailResponseBody setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeClusterDetailResponseBody setCreated(String created) {
        this.created = created;
        return this;
    }
    public String getCreated() {
        return this.created;
    }

    public DescribeClusterDetailResponseBody setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }
    public String getCurrentVersion() {
        return this.currentVersion;
    }

    public DescribeClusterDetailResponseBody setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public DescribeClusterDetailResponseBody setDockerVersion(String dockerVersion) {
        this.dockerVersion = dockerVersion;
        return this;
    }
    public String getDockerVersion() {
        return this.dockerVersion;
    }

    public DescribeClusterDetailResponseBody setExternalLoadbalancerId(String externalLoadbalancerId) {
        this.externalLoadbalancerId = externalLoadbalancerId;
        return this;
    }
    public String getExternalLoadbalancerId() {
        return this.externalLoadbalancerId;
    }

    public DescribeClusterDetailResponseBody setInitVersion(String initVersion) {
        this.initVersion = initVersion;
        return this;
    }
    public String getInitVersion() {
        return this.initVersion;
    }

    public DescribeClusterDetailResponseBody setMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }
    public MaintenanceWindow getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    public DescribeClusterDetailResponseBody setMasterUrl(String masterUrl) {
        this.masterUrl = masterUrl;
        return this;
    }
    public String getMasterUrl() {
        return this.masterUrl;
    }

    public DescribeClusterDetailResponseBody setMetaData(String metaData) {
        this.metaData = metaData;
        return this;
    }
    public String getMetaData() {
        return this.metaData;
    }

    public DescribeClusterDetailResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeClusterDetailResponseBody setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }
    public String getNetworkMode() {
        return this.networkMode;
    }

    public DescribeClusterDetailResponseBody setNextVersion(String nextVersion) {
        this.nextVersion = nextVersion;
        return this;
    }
    public String getNextVersion() {
        return this.nextVersion;
    }

    public DescribeClusterDetailResponseBody setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public DescribeClusterDetailResponseBody setPrivateZone(Boolean privateZone) {
        this.privateZone = privateZone;
        return this;
    }
    public Boolean getPrivateZone() {
        return this.privateZone;
    }

    public DescribeClusterDetailResponseBody setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public DescribeClusterDetailResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeClusterDetailResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeClusterDetailResponseBody setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeClusterDetailResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DescribeClusterDetailResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeClusterDetailResponseBody setSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }
    public String getSubnetCidr() {
        return this.subnetCidr;
    }

    public DescribeClusterDetailResponseBody setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public DescribeClusterDetailResponseBody setUpdated(String updated) {
        this.updated = updated;
        return this;
    }
    public String getUpdated() {
        return this.updated;
    }

    public DescribeClusterDetailResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeClusterDetailResponseBody setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public DescribeClusterDetailResponseBody setWorkerRamRoleName(String workerRamRoleName) {
        this.workerRamRoleName = workerRamRoleName;
        return this;
    }
    public String getWorkerRamRoleName() {
        return this.workerRamRoleName;
    }

    public DescribeClusterDetailResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
