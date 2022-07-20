// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayQosListRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BeginTs")
    public String beginTs;

    @NameInMap("Definition")
    public String definition;

    @NameInMap("EndTs")
    public String endTs;

    @NameInMap("ItemConfigs")
    public String itemConfigs;

    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("Network")
    public String network;

    @NameInMap("Os")
    public String os;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TerminalType")
    public String terminalType;

    public static DescribePlayQosListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayQosListRequest self = new DescribePlayQosListRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlayQosListRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribePlayQosListRequest setBeginTs(String beginTs) {
        this.beginTs = beginTs;
        return this;
    }
    public String getBeginTs() {
        return this.beginTs;
    }

    public DescribePlayQosListRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public DescribePlayQosListRequest setEndTs(String endTs) {
        this.endTs = endTs;
        return this;
    }
    public String getEndTs() {
        return this.endTs;
    }

    public DescribePlayQosListRequest setItemConfigs(String itemConfigs) {
        this.itemConfigs = itemConfigs;
        return this;
    }
    public String getItemConfigs() {
        return this.itemConfigs;
    }

    public DescribePlayQosListRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribePlayQosListRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public DescribePlayQosListRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribePlayQosListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribePlayQosListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePlayQosListRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
