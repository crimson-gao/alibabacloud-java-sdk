// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceListRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The server component that is exposed on the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>openssl</p>
     */
    @NameInMap("ExposureComponent")
    public String exposureComponent;

    /**
     * <p>The public IP address of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>116.12.XX.XX</p>
     */
    @NameInMap("ExposureIp")
    public String exposureIp;

    /**
     * <p>The port that is exposed on the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("ExposurePort")
    public String exposurePort;

    /**
     * <p>The ID of the server group.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of server groups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>9535356</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The health status of the Elastic Compute Service (ECS) instance in the scaling group. ECS instances that are not in the Running state are considered unhealthy. Valid values:</p>
     * <ul>
     * <li>Healthy</li>
     * <li>Unhealthy</li>
     * </ul>
     * <p>Auto Scaling automatically removes unhealthy ECS instances from the scaling group and then releases the automatically created instances among the unhealthy instances.</p>
     * <p>Unhealthy ECS instances that are manually added to the scaling group are released based on the management mode of the instance lifecycle. If the lifecycle of the ECS instances is not managed by the scaling group, Auto Scaling removes the instances from the scaling group but does not release them. If the lifecycle of the ECS instances is managed by the scaling group, Auto Scaling removes the instances from the scaling group and releases them.</p>
     * <blockquote>
     * <p> Make sure that you have sufficient balance within your account. If you have overdue payments in your account, pay-as-you-go and preemptible instances are stopped or released. For information about how the status of ECS instances changes when you have overdue payments in your account, see <a href="https://help.aliyun.com/document_detail/170589.html">Overdue payments</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Unhealthy</p>
     */
    @NameInMap("HealthStatus")
    public Boolean healthStatus;

    /**
     * <p>The ID of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1g6wxdwps7s9dz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>abc_centos7.2_005</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16670360956*****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>Specifies whether the server has vulnerabilities. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The server has vulnerabilities.</li>
     * <li><strong>false</strong>: The server does not have vulnerabilities.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("VulStatus")
    public Boolean vulStatus;

    public static DescribeExposedInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedInstanceListRequest self = new DescribeExposedInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExposedInstanceListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeExposedInstanceListRequest setExposureComponent(String exposureComponent) {
        this.exposureComponent = exposureComponent;
        return this;
    }
    public String getExposureComponent() {
        return this.exposureComponent;
    }

    public DescribeExposedInstanceListRequest setExposureIp(String exposureIp) {
        this.exposureIp = exposureIp;
        return this;
    }
    public String getExposureIp() {
        return this.exposureIp;
    }

    public DescribeExposedInstanceListRequest setExposurePort(String exposurePort) {
        this.exposurePort = exposurePort;
        return this;
    }
    public String getExposurePort() {
        return this.exposurePort;
    }

    public DescribeExposedInstanceListRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeExposedInstanceListRequest setHealthStatus(Boolean healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public Boolean getHealthStatus() {
        return this.healthStatus;
    }

    public DescribeExposedInstanceListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeExposedInstanceListRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeExposedInstanceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeExposedInstanceListRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeExposedInstanceListRequest setVulStatus(Boolean vulStatus) {
        this.vulStatus = vulStatus;
        return this;
    }
    public Boolean getVulStatus() {
        return this.vulStatus;
    }

}
