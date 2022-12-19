// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeNoticeConfigResponseBody extends TeaModel {
    // An array that consists of the notification settings.
    @NameInMap("NoticeConfigList")
    public java.util.List<DescribeNoticeConfigResponseBodyNoticeConfigList> noticeConfigList;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNoticeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNoticeConfigResponseBody self = new DescribeNoticeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNoticeConfigResponseBody setNoticeConfigList(java.util.List<DescribeNoticeConfigResponseBodyNoticeConfigList> noticeConfigList) {
        this.noticeConfigList = noticeConfigList;
        return this;
    }
    public java.util.List<DescribeNoticeConfigResponseBodyNoticeConfigList> getNoticeConfigList() {
        return this.noticeConfigList;
    }

    public DescribeNoticeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNoticeConfigResponseBodyNoticeConfigList extends TeaModel {
        // The ID of the user.
        @NameInMap("AliUid")
        public Long aliUid;

        // The number of the page to return.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The identifier of the notification item. Valid values:
        // 
        // *   **yundun\_security_Weekreport**: notification for unhandled vulnerabilities.
        // *   **yundun\_sas\_antiransomware_task**: notification for results of restoration tasks.
        // *   **sas_healthcheck**: notification for baseline checks.
        // *   **sas_suspicious**: notification for alerts generated by Security Center.
        // *   **yundun\_aegis\_AV_true**: notification for precision defense.
        // *   **yundun\_sas\_ak_leakage**: notification for AccessKey pair leaks.
        // *   **yundun\_sas\_config_alert**: notification for configuration assessment.
        // *   **yundun\_sas\_vul_Emergency**: notification for urgent vulnerabilities.
        // *   **yundun\_webguard_event**: notification for web tamper proofing.
        // *   **yundun\_sas\_cloud\_native_firewall**: notification for alerts generated by the container firewall feature.
        // *   **yundun\_sas\_cloud\_native\_firewall_Defense**: notification for proactive defense implemented by the container firewall feature.
        // *   **yundun\_IP_Blocking**: notification for blocked brute-force attacks initiated from malicious IP addresses.
        // *   **yundun\_sas\_anti\_virus_config**: notification for virus scan.
        // *   **yundun\_sas_log**: notification for excess logs.
        // *   **yundun\_honeypot_alarm**: notification for alerts generated by the honeypot feature.
        // *   **aliyun\_rasp_alarm**: notification for alerts generated by the application security feature.
        // *   **virusScheduleTask**: notification for completion of scheduled virus scans.
        // *   **yundun\_anti_Virus**: notification that no security checks are performed.
        // *   **sas_vulnerability**: notification for vulnerabilities.
        // *   **weeklyreport**: notification for weekly reports.
        // *   **agent**: notification that the Security Center agent is offline.
        // *   **bruteforcesuccess**: notification for protection against brute-force attacks.
        // *   **webshell**: notification for webshells.
        // *   **suspicious**: notification for alerts generated by Server Guard.
        // *   **patch**: deprecated.
        // *   **remotelogin**: notification for remote logons.
        // *   **health**: notification for security checks.
        // *   **yundun\_sas\_cloudsiem_log**: notification of insufficient threat analysis log capacity.
        // >  If the value is **yundun\_security_Weekreport**, weekly reports are sent to notify you of unhandled vulnerabilities.
        @NameInMap("Project")
        public String project;

        // The notification method. Valid values:
        // 
        // *   **1**: text message
        // *   **2**: email
        // *   **4**: internal message
        // *   **3**: text message and email
        // *   **5**: text message and internal message
        // *   **6**: email and internal message
        // *   **7**: text message, email, and internal message
        @NameInMap("Route")
        public Integer route;

        // The time period during which Security Center sends notifications. Valid values:
        // 
        // *   **0**: any time
        // *   **1**: 08:00 to 22:00
        @NameInMap("TimeLimit")
        public Integer timeLimit;

        public static DescribeNoticeConfigResponseBodyNoticeConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNoticeConfigResponseBodyNoticeConfigList self = new DescribeNoticeConfigResponseBodyNoticeConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeNoticeConfigResponseBodyNoticeConfigList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeNoticeConfigResponseBodyNoticeConfigList setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeNoticeConfigResponseBodyNoticeConfigList setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public DescribeNoticeConfigResponseBodyNoticeConfigList setRoute(Integer route) {
            this.route = route;
            return this;
        }
        public Integer getRoute() {
            return this.route;
        }

        public DescribeNoticeConfigResponseBodyNoticeConfigList setTimeLimit(Integer timeLimit) {
            this.timeLimit = timeLimit;
            return this;
        }
        public Integer getTimeLimit() {
            return this.timeLimit;
        }

    }

}
