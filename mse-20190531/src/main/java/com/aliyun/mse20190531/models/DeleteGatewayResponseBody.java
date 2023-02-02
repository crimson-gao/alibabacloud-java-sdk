// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The value 200 indicates that the request was successful. Other values indicate that the request failed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public DeleteGatewayResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     * <br>
     * <p>*   If the request is successful, a success message is returned.</p>
     * <p>*   If the request fails, an error message is returned, such as the "TaskId not found" message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayResponseBody self = new DeleteGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteGatewayResponseBody setData(DeleteGatewayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteGatewayResponseBodyData getData() {
        return this.data;
    }

    public DeleteGatewayResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteGatewayResponseBodyData extends TeaModel {
        /**
         * <p>The unique ID of the gateway. The ID is automatically generated by the system.</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the gateway was last updated.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the primary key.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the gateway.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The information about the user.</p>
         */
        @NameInMap("PrimaryUser")
        public String primaryUser;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The number of gateway replicas.</p>
         */
        @NameInMap("Replica")
        public Integer replica;

        /**
         * <p>The ID of the security group.</p>
         */
        @NameInMap("SecurityGroup")
        public String securityGroup;

        /**
         * <p>The specifications of the gateway.</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The status of the gateway. Valid values: 0: The gateway is being created. 1: The gateway fails to be created. 2: The gateway is running. 3: The gateway is changing. 4: The gateway is scaling down. 6: The gateway is scaling up. 8: The gateway is being deleted. 10: The gateway is restarting. 11: The gateway is being rebuilt. 12: The gateway is updating. 13: The gateway fails to be updated.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the virtual private cloud (VPC) where the gateway resides.</p>
         */
        @NameInMap("Vpc")
        public String vpc;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("Vswitch")
        public String vswitch;

        public static DeleteGatewayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteGatewayResponseBodyData self = new DeleteGatewayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteGatewayResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public DeleteGatewayResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteGatewayResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DeleteGatewayResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteGatewayResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteGatewayResponseBodyData setPrimaryUser(String primaryUser) {
            this.primaryUser = primaryUser;
            return this;
        }
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        public DeleteGatewayResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DeleteGatewayResponseBodyData setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public DeleteGatewayResponseBodyData setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public DeleteGatewayResponseBodyData setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DeleteGatewayResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DeleteGatewayResponseBodyData setVpc(String vpc) {
            this.vpc = vpc;
            return this;
        }
        public String getVpc() {
            return this.vpc;
        }

        public DeleteGatewayResponseBodyData setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

    }

}
