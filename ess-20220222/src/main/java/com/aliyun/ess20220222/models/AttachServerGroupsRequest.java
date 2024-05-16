// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachServerGroupsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <br>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [Ensure idempotence](https://help.aliyun.com/document_detail/25965.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to add the Elastic Compute Service (ECS) instances in the scaling group to the new server group.</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("ForceAttach")
    public Boolean forceAttach;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>Details of the server groups.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServerGroups")
    public java.util.List<AttachServerGroupsRequestServerGroups> serverGroups;

    public static AttachServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachServerGroupsRequest self = new AttachServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public AttachServerGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AttachServerGroupsRequest setForceAttach(Boolean forceAttach) {
        this.forceAttach = forceAttach;
        return this;
    }
    public Boolean getForceAttach() {
        return this.forceAttach;
    }

    public AttachServerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachServerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachServerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachServerGroupsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public AttachServerGroupsRequest setServerGroups(java.util.List<AttachServerGroupsRequestServerGroups> serverGroups) {
        this.serverGroups = serverGroups;
        return this;
    }
    public java.util.List<AttachServerGroupsRequestServerGroups> getServerGroups() {
        return this.serverGroups;
    }

    public static class AttachServerGroupsRequestServerGroups extends TeaModel {
        /**
         * <p>The port number that is used by an ECS instance after Auto Scaling adds the ECS instance to the server group. Valid values: 1 to 65535.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the server group.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The type of the server group. Valid values:</p>
         * <br>
         * <p>*   ALB</p>
         * <p>*   NLB</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of an ECS instance after Auto Scaling adds the ECS instance to the server group as a backend server.</p>
         * <br>
         * <p>A higher weight specifies that a larger number of requests are forwarded to the ECS instance. If you set the Weight parameter for an ECS instance in the server group to 0, no access requests are forwarded to the ECS instance. Valid values: 0 to 100.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static AttachServerGroupsRequestServerGroups build(java.util.Map<String, ?> map) throws Exception {
            AttachServerGroupsRequestServerGroups self = new AttachServerGroupsRequestServerGroups();
            return TeaModel.build(map, self);
        }

        public AttachServerGroupsRequestServerGroups setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AttachServerGroupsRequestServerGroups setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public AttachServerGroupsRequestServerGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AttachServerGroupsRequestServerGroups setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
