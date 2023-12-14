// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAppJVMConfigResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Java VM info list.</p>
     */
    @NameInMap("JvmInfoList")
    public java.util.List<GetAppJVMConfigResponseBodyJvmInfoList> jvmInfoList;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAppJVMConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppJVMConfigResponseBody self = new GetAppJVMConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppJVMConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAppJVMConfigResponseBody setJvmInfoList(java.util.List<GetAppJVMConfigResponseBodyJvmInfoList> jvmInfoList) {
        this.jvmInfoList = jvmInfoList;
        return this;
    }
    public java.util.List<GetAppJVMConfigResponseBodyJvmInfoList> getJvmInfoList() {
        return this.jvmInfoList;
    }

    public GetAppJVMConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppJVMConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppJVMConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAppJVMConfigResponseBodyJvmInfoList extends TeaModel {
        /**
         * <p>Agent version.</p>
         */
        @NameInMap("AgentVersion")
        public String agentVersion;

        /**
         * <p>The name of the elastic container instance.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>Ip address.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The PID.</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>Process Id.</p>
         */
        @NameInMap("ProcId")
        public String procId;

        /**
         * <p>Java VM config.</p>
         */
        @NameInMap("VmArgs")
        public String vmArgs;

        public static GetAppJVMConfigResponseBodyJvmInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetAppJVMConfigResponseBodyJvmInfoList self = new GetAppJVMConfigResponseBodyJvmInfoList();
            return TeaModel.build(map, self);
        }

        public GetAppJVMConfigResponseBodyJvmInfoList setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public GetAppJVMConfigResponseBodyJvmInfoList setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetAppJVMConfigResponseBodyJvmInfoList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetAppJVMConfigResponseBodyJvmInfoList setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public GetAppJVMConfigResponseBodyJvmInfoList setProcId(String procId) {
            this.procId = procId;
            return this;
        }
        public String getProcId() {
            return this.procId;
        }

        public GetAppJVMConfigResponseBodyJvmInfoList setVmArgs(String vmArgs) {
            this.vmArgs = vmArgs;
            return this;
        }
        public String getVmArgs() {
            return this.vmArgs;
        }

    }

}
