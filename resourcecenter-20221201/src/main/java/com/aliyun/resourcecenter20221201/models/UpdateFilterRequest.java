// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class UpdateFilterRequest extends TeaModel {
    /**
     * <p>The configurations of the filter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;regions&quot;: [],
     *   &quot;tagFilters&quot;: [
     *     [{ &quot;type&quot;: &quot;notContainTagKey&quot;, &quot;tagKey&quot;: &quot;xxx&quot;, &quot;tagValue&quot;: &quot;&quot; }],
     *     [{ &quot;tagKey&quot;: &quot;xxx&quot;, &quot;tagValue&quot;: &quot;xxx&quot; }]
     *   ],
     *   &quot;resourceTypes&quot;: [
     *     &quot;ACS::ECS::AutoSnapshotPolicy&quot;
     *   ]
     * }</p>
     */
    @NameInMap("FilterConfiguration")
    public String filterConfiguration;

    /**
     * <p>The name of the filter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("FilterName")
    public String filterName;

    public static UpdateFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFilterRequest self = new UpdateFilterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFilterRequest setFilterConfiguration(String filterConfiguration) {
        this.filterConfiguration = filterConfiguration;
        return this;
    }
    public String getFilterConfiguration() {
        return this.filterConfiguration;
    }

    public UpdateFilterRequest setFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }
    public String getFilterName() {
        return this.filterName;
    }

}
