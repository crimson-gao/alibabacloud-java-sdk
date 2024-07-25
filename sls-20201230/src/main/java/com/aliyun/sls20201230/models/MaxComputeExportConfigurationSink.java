// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MaxComputeExportConfigurationSink extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("fields")
    public java.util.List<String> fields;

    @NameInMap("odpsAccessKeyId")
    @Deprecated
    public String odpsAccessKeyId;

    @NameInMap("odpsAccessSecret")
    @Deprecated
    public String odpsAccessSecret;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxxxxxxx">http://xxxxxxxx</a></p>
     */
    @NameInMap("odpsEndpoint")
    public String odpsEndpoint;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_project</p>
     */
    @NameInMap("odpsProject")
    public String odpsProject;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::xxxxxxx</p>
     */
    @NameInMap("odpsRolearn")
    public String odpsRolearn;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_table</p>
     */
    @NameInMap("odpsTable")
    public String odpsTable;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("odpsTunnelEndpoint")
    public String odpsTunnelEndpoint;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("partitionColumn")
    public java.util.List<String> partitionColumn;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>%Y_%m_%d</p>
     */
    @NameInMap("partitionTimeFormat")
    public String partitionTimeFormat;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>+0800</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

    public static MaxComputeExportConfigurationSink build(java.util.Map<String, ?> map) throws Exception {
        MaxComputeExportConfigurationSink self = new MaxComputeExportConfigurationSink();
        return TeaModel.build(map, self);
    }

    public MaxComputeExportConfigurationSink setFields(java.util.List<String> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<String> getFields() {
        return this.fields;
    }

    public MaxComputeExportConfigurationSink setOdpsAccessKeyId(String odpsAccessKeyId) {
        this.odpsAccessKeyId = odpsAccessKeyId;
        return this;
    }
    public String getOdpsAccessKeyId() {
        return this.odpsAccessKeyId;
    }

    public MaxComputeExportConfigurationSink setOdpsAccessSecret(String odpsAccessSecret) {
        this.odpsAccessSecret = odpsAccessSecret;
        return this;
    }
    public String getOdpsAccessSecret() {
        return this.odpsAccessSecret;
    }

    public MaxComputeExportConfigurationSink setOdpsEndpoint(String odpsEndpoint) {
        this.odpsEndpoint = odpsEndpoint;
        return this;
    }
    public String getOdpsEndpoint() {
        return this.odpsEndpoint;
    }

    public MaxComputeExportConfigurationSink setOdpsProject(String odpsProject) {
        this.odpsProject = odpsProject;
        return this;
    }
    public String getOdpsProject() {
        return this.odpsProject;
    }

    public MaxComputeExportConfigurationSink setOdpsRolearn(String odpsRolearn) {
        this.odpsRolearn = odpsRolearn;
        return this;
    }
    public String getOdpsRolearn() {
        return this.odpsRolearn;
    }

    public MaxComputeExportConfigurationSink setOdpsTable(String odpsTable) {
        this.odpsTable = odpsTable;
        return this;
    }
    public String getOdpsTable() {
        return this.odpsTable;
    }

    public MaxComputeExportConfigurationSink setOdpsTunnelEndpoint(String odpsTunnelEndpoint) {
        this.odpsTunnelEndpoint = odpsTunnelEndpoint;
        return this;
    }
    public String getOdpsTunnelEndpoint() {
        return this.odpsTunnelEndpoint;
    }

    public MaxComputeExportConfigurationSink setPartitionColumn(java.util.List<String> partitionColumn) {
        this.partitionColumn = partitionColumn;
        return this;
    }
    public java.util.List<String> getPartitionColumn() {
        return this.partitionColumn;
    }

    public MaxComputeExportConfigurationSink setPartitionTimeFormat(String partitionTimeFormat) {
        this.partitionTimeFormat = partitionTimeFormat;
        return this;
    }
    public String getPartitionTimeFormat() {
        return this.partitionTimeFormat;
    }

    public MaxComputeExportConfigurationSink setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
