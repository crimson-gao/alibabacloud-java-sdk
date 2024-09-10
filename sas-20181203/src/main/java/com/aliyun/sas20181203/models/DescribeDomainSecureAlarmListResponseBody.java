// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureAlarmListResponseBody extends TeaModel {
    @NameInMap("AlarmList")
    public java.util.List<DescribeDomainSecureAlarmListResponseBodyAlarmList> alarmList;

    /**
     * <strong>example:</strong>
     * <p>D03DD0FD-6041-5107-AC00-383E28F1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDomainSecureAlarmListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureAlarmListResponseBody self = new DescribeDomainSecureAlarmListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureAlarmListResponseBody setAlarmList(java.util.List<DescribeDomainSecureAlarmListResponseBodyAlarmList> alarmList) {
        this.alarmList = alarmList;
        return this;
    }
    public java.util.List<DescribeDomainSecureAlarmListResponseBodyAlarmList> getAlarmList() {
        return this.alarmList;
    }

    public DescribeDomainSecureAlarmListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainSecureAlarmListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDomainSecureAlarmListResponseBodyAlarmList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Trojan</p>
         */
        @NameInMap("AlarmEventName")
        public String alarmEventName;

        @NameInMap("AlarmEventNameOriginal")
        public String alarmEventNameOriginal;

        /**
         * <strong>example:</strong>
         * <p>Malicious Software</p>
         */
        @NameInMap("AlarmEventType")
        public String alarmEventType;

        /**
         * <strong>example:</strong>
         * <p>8df914418f4211fbf756efe7a6f4****</p>
         */
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoBreaking")
        public Boolean autoBreaking;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanBeDealOnLine")
        public Boolean canBeDealOnLine;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanCancelFault")
        public Boolean canCancelFault;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ContainHwMode")
        public Boolean containHwMode;

        /**
         * <strong>example:</strong>
         * <p>aegis_****</p>
         */
        @NameInMap("DataSource")
        public String dataSource;

        /**
         * <strong>example:</strong>
         * <p>y</p>
         */
        @NameInMap("Dealed")
        public Boolean dealed;

        /**
         * <strong>example:</strong>
         * <p>The detection model finds that there is a Trojan horse program on your server. The Trojan horse program is a program specially used to invade the user\&quot;s host. Generally, it will download and release another malicious program after being implanted into the system through disguise.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1543740301000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>1656901794000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasTraceInfo")
        public Boolean hasTraceInfo;

        /**
         * <strong>example:</strong>
         * <p>i-e****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>TestInstance</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>95.214.<em>.</em></p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <strong>example:</strong>
         * <p>serious</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>kill_and_quara.Success</p>
         */
        @NameInMap("OperateErrorCode")
        public String operateErrorCode;

        /**
         * <strong>example:</strong>
         * <p>1631699497000</p>
         */
        @NameInMap("OperateTime")
        public Long operateTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SaleVersion")
        public String saleVersion;

        /**
         * <strong>example:</strong>
         * <p>270789</p>
         */
        @NameInMap("SecurityEventIds")
        public String securityEventIds;

        /**
         * <strong>example:</strong>
         * <p>A malicious program implanted by hacker after intrusion will occupy your bandwidth and attack other servers, and may affect you own service. The malicious process may also have self-deleting behavior or disguise as a system service to evade detection.</p>
         */
        @NameInMap("Solution")
        public String solution;

        /**
         * <strong>example:</strong>
         * <p>[\&quot;authority_maintenance\&quot;]</p>
         */
        @NameInMap("Stages")
        public String stages;

        /**
         * <strong>example:</strong>
         * <p>1543740301000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuspiciousEventCount")
        public Integer suspiciousEventCount;

        /**
         * <strong>example:</strong>
         * <p>47900178-885d-4fa4-9d77-****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeDomainSecureAlarmListResponseBodyAlarmList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSecureAlarmListResponseBodyAlarmList self = new DescribeDomainSecureAlarmListResponseBodyAlarmList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setAlarmEventName(String alarmEventName) {
            this.alarmEventName = alarmEventName;
            return this;
        }
        public String getAlarmEventName() {
            return this.alarmEventName;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setAlarmEventNameOriginal(String alarmEventNameOriginal) {
            this.alarmEventNameOriginal = alarmEventNameOriginal;
            return this;
        }
        public String getAlarmEventNameOriginal() {
            return this.alarmEventNameOriginal;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setAlarmEventType(String alarmEventType) {
            this.alarmEventType = alarmEventType;
            return this;
        }
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setAlarmUniqueInfo(String alarmUniqueInfo) {
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setAutoBreaking(Boolean autoBreaking) {
            this.autoBreaking = autoBreaking;
            return this;
        }
        public Boolean getAutoBreaking() {
            return this.autoBreaking;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setCanBeDealOnLine(Boolean canBeDealOnLine) {
            this.canBeDealOnLine = canBeDealOnLine;
            return this;
        }
        public Boolean getCanBeDealOnLine() {
            return this.canBeDealOnLine;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setCanCancelFault(Boolean canCancelFault) {
            this.canCancelFault = canCancelFault;
            return this;
        }
        public Boolean getCanCancelFault() {
            return this.canCancelFault;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setContainHwMode(Boolean containHwMode) {
            this.containHwMode = containHwMode;
            return this;
        }
        public Boolean getContainHwMode() {
            return this.containHwMode;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setDealed(Boolean dealed) {
            this.dealed = dealed;
            return this;
        }
        public Boolean getDealed() {
            return this.dealed;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setHasTraceInfo(Boolean hasTraceInfo) {
            this.hasTraceInfo = hasTraceInfo;
            return this;
        }
        public Boolean getHasTraceInfo() {
            return this.hasTraceInfo;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setOperateErrorCode(String operateErrorCode) {
            this.operateErrorCode = operateErrorCode;
            return this;
        }
        public String getOperateErrorCode() {
            return this.operateErrorCode;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setSaleVersion(String saleVersion) {
            this.saleVersion = saleVersion;
            return this;
        }
        public String getSaleVersion() {
            return this.saleVersion;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setSecurityEventIds(String securityEventIds) {
            this.securityEventIds = securityEventIds;
            return this;
        }
        public String getSecurityEventIds() {
            return this.securityEventIds;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setStages(String stages) {
            this.stages = stages;
            return this;
        }
        public String getStages() {
            return this.stages;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setSuspiciousEventCount(Integer suspiciousEventCount) {
            this.suspiciousEventCount = suspiciousEventCount;
            return this;
        }
        public Integer getSuspiciousEventCount() {
            return this.suspiciousEventCount;
        }

        public DescribeDomainSecureAlarmListResponseBodyAlarmList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
