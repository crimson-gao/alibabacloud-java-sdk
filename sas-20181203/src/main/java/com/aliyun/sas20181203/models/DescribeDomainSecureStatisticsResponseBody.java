// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureStatisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AlarmCount")
    public Integer alarmCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NoSslCount")
    public Integer noSslCount;

    /**
     * <strong>example:</strong>
     * <p>1EE7B150-D67E-53FD-A52D-3E8E669A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskCount")
    public Integer riskCount;

    /**
     * <strong>example:</strong>
     * <p>72</p>
     */
    @NameInMap("TotalDomainCount")
    public Integer totalDomainCount;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("VulCount")
    public Integer vulCount;

    public static DescribeDomainSecureStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureStatisticsResponseBody self = new DescribeDomainSecureStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureStatisticsResponseBody setAlarmCount(Integer alarmCount) {
        this.alarmCount = alarmCount;
        return this;
    }
    public Integer getAlarmCount() {
        return this.alarmCount;
    }

    public DescribeDomainSecureStatisticsResponseBody setNoSslCount(Integer noSslCount) {
        this.noSslCount = noSslCount;
        return this;
    }
    public Integer getNoSslCount() {
        return this.noSslCount;
    }

    public DescribeDomainSecureStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainSecureStatisticsResponseBody setRiskCount(Integer riskCount) {
        this.riskCount = riskCount;
        return this;
    }
    public Integer getRiskCount() {
        return this.riskCount;
    }

    public DescribeDomainSecureStatisticsResponseBody setTotalDomainCount(Integer totalDomainCount) {
        this.totalDomainCount = totalDomainCount;
        return this;
    }
    public Integer getTotalDomainCount() {
        return this.totalDomainCount;
    }

    public DescribeDomainSecureStatisticsResponseBody setVulCount(Integer vulCount) {
        this.vulCount = vulCount;
        return this;
    }
    public Integer getVulCount() {
        return this.vulCount;
    }

}
