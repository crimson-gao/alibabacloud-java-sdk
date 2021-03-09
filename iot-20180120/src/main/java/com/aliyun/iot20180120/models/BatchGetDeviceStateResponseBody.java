// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetDeviceStateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("DeviceStatusList")
    public BatchGetDeviceStateResponseBodyDeviceStatusList deviceStatusList;

    public static BatchGetDeviceStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetDeviceStateResponseBody self = new BatchGetDeviceStateResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetDeviceStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetDeviceStateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchGetDeviceStateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetDeviceStateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetDeviceStateResponseBody setDeviceStatusList(BatchGetDeviceStateResponseBodyDeviceStatusList deviceStatusList) {
        this.deviceStatusList = deviceStatusList;
        return this;
    }
    public BatchGetDeviceStateResponseBodyDeviceStatusList getDeviceStatusList() {
        return this.deviceStatusList;
    }

    public static class BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Status")
        public String status;

        @NameInMap("AsAddress")
        public String asAddress;

        @NameInMap("LastOnlineTime")
        public String lastOnlineTime;

        @NameInMap("IotId")
        public String iotId;

        public static BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus build(java.util.Map<String, ?> map) throws Exception {
            BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus self = new BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus();
            return TeaModel.build(map, self);
        }

        public BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus setAsAddress(String asAddress) {
            this.asAddress = asAddress;
            return this;
        }
        public String getAsAddress() {
            return this.asAddress;
        }

        public BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus setLastOnlineTime(String lastOnlineTime) {
            this.lastOnlineTime = lastOnlineTime;
            return this;
        }
        public String getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        public BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class BatchGetDeviceStateResponseBodyDeviceStatusList extends TeaModel {
        @NameInMap("DeviceStatus")
        public java.util.List<BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus> deviceStatus;

        public static BatchGetDeviceStateResponseBodyDeviceStatusList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetDeviceStateResponseBodyDeviceStatusList self = new BatchGetDeviceStateResponseBodyDeviceStatusList();
            return TeaModel.build(map, self);
        }

        public BatchGetDeviceStateResponseBodyDeviceStatusList setDeviceStatus(java.util.List<BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus> deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public java.util.List<BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus> getDeviceStatus() {
            return this.deviceStatus;
        }

    }

}
