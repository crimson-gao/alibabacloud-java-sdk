// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceResponseBody extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Status")
    public String status;

    @NameInMap("AlarmMethod")
    public String alarmMethod;

    @NameInMap("Dsn")
    public String dsn;

    @NameInMap("Port")
    public Long port;

    @NameInMap("PosInterval")
    public Long posInterval;

    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("Password")
    public String password;

    @NameInMap("AutoPos")
    public Boolean autoPos;

    @NameInMap("Params")
    public String params;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("Name")
    public String name;

    @NameInMap("ChannelSyncTime")
    public String channelSyncTime;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("RegisteredTime")
    public String registeredTime;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Url")
    public String url;

    @NameInMap("AutoStart")
    public Boolean autoStart;

    @NameInMap("Vendor")
    public String vendor;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Longitude")
    public String longitude;

    @NameInMap("Latitude")
    public String latitude;

    @NameInMap("Id")
    public String id;

    @NameInMap("Username")
    public String username;

    @NameInMap("Stats")
    public DescribeDeviceResponseBodyStats stats;

    @NameInMap("Directory")
    public DescribeDeviceResponseBodyDirectory directory;

    public static DescribeDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceResponseBody self = new DescribeDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDeviceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDeviceResponseBody setAlarmMethod(String alarmMethod) {
        this.alarmMethod = alarmMethod;
        return this;
    }
    public String getAlarmMethod() {
        return this.alarmMethod;
    }

    public DescribeDeviceResponseBody setDsn(String dsn) {
        this.dsn = dsn;
        return this;
    }
    public String getDsn() {
        return this.dsn;
    }

    public DescribeDeviceResponseBody setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public DescribeDeviceResponseBody setPosInterval(Long posInterval) {
        this.posInterval = posInterval;
        return this;
    }
    public Long getPosInterval() {
        return this.posInterval;
    }

    public DescribeDeviceResponseBody setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public DescribeDeviceResponseBody setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public DescribeDeviceResponseBody setAutoPos(Boolean autoPos) {
        this.autoPos = autoPos;
        return this;
    }
    public Boolean getAutoPos() {
        return this.autoPos;
    }

    public DescribeDeviceResponseBody setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public DescribeDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDeviceResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public DescribeDeviceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeDeviceResponseBody setChannelSyncTime(String channelSyncTime) {
        this.channelSyncTime = channelSyncTime;
        return this;
    }
    public String getChannelSyncTime() {
        return this.channelSyncTime;
    }

    public DescribeDeviceResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeDeviceResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DescribeDeviceResponseBody setRegisteredTime(String registeredTime) {
        this.registeredTime = registeredTime;
        return this;
    }
    public String getRegisteredTime() {
        return this.registeredTime;
    }

    public DescribeDeviceResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DescribeDeviceResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeDeviceResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DescribeDeviceResponseBody setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    public DescribeDeviceResponseBody setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public DescribeDeviceResponseBody setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public DescribeDeviceResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDeviceResponseBody setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public DescribeDeviceResponseBody setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public DescribeDeviceResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeDeviceResponseBody setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public DescribeDeviceResponseBody setStats(DescribeDeviceResponseBodyStats stats) {
        this.stats = stats;
        return this;
    }
    public DescribeDeviceResponseBodyStats getStats() {
        return this.stats;
    }

    public DescribeDeviceResponseBody setDirectory(DescribeDeviceResponseBodyDirectory directory) {
        this.directory = directory;
        return this;
    }
    public DescribeDeviceResponseBodyDirectory getDirectory() {
        return this.directory;
    }

    public static class DescribeDeviceResponseBodyStats extends TeaModel {
        @NameInMap("FailedNum")
        public Long failedNum;

        @NameInMap("StreamNum")
        public Long streamNum;

        @NameInMap("ChannelNum")
        public Long channelNum;

        @NameInMap("OnlineNum")
        public Long onlineNum;

        @NameInMap("OfflineNum")
        public Long offlineNum;

        public static DescribeDeviceResponseBodyStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceResponseBodyStats self = new DescribeDeviceResponseBodyStats();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceResponseBodyStats setFailedNum(Long failedNum) {
            this.failedNum = failedNum;
            return this;
        }
        public Long getFailedNum() {
            return this.failedNum;
        }

        public DescribeDeviceResponseBodyStats setStreamNum(Long streamNum) {
            this.streamNum = streamNum;
            return this;
        }
        public Long getStreamNum() {
            return this.streamNum;
        }

        public DescribeDeviceResponseBodyStats setChannelNum(Long channelNum) {
            this.channelNum = channelNum;
            return this;
        }
        public Long getChannelNum() {
            return this.channelNum;
        }

        public DescribeDeviceResponseBodyStats setOnlineNum(Long onlineNum) {
            this.onlineNum = onlineNum;
            return this;
        }
        public Long getOnlineNum() {
            return this.onlineNum;
        }

        public DescribeDeviceResponseBodyStats setOfflineNum(Long offlineNum) {
            this.offlineNum = offlineNum;
            return this;
        }
        public Long getOfflineNum() {
            return this.offlineNum;
        }

    }

    public static class DescribeDeviceResponseBodyDirectory extends TeaModel {
        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Name")
        public String name;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        public static DescribeDeviceResponseBodyDirectory build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceResponseBodyDirectory self = new DescribeDeviceResponseBodyDirectory();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceResponseBodyDirectory setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeDeviceResponseBodyDirectory setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeviceResponseBodyDirectory setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDeviceResponseBodyDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDeviceResponseBodyDirectory setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDeviceResponseBodyDirectory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
