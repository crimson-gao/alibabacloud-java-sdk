// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ListSparkJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{   &quot;createTime&quot;:&quot;2020-12-28 09:00:00&quot;,   &quot;jobName&quot;:&quot;SparkPi&quot; }</p>
     */
    @NameInMap("Condition")
    public java.util.Map<String, ?> condition;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySparkCluster</p>
     */
    @NameInMap("VcName")
    public String vcName;

    public static ListSparkJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSparkJobRequest self = new ListSparkJobRequest();
        return TeaModel.build(map, self);
    }

    public ListSparkJobRequest setCondition(java.util.Map<String, ?> condition) {
        this.condition = condition;
        return this;
    }
    public java.util.Map<String, ?> getCondition() {
        return this.condition;
    }

    public ListSparkJobRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSparkJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSparkJobRequest setVcName(String vcName) {
        this.vcName = vcName;
        return this;
    }
    public String getVcName() {
        return this.vcName;
    }

}
