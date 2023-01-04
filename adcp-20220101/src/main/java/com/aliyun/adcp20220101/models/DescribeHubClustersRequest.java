// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClustersRequest extends TeaModel {
    // The scenario where master instances are used. Valid values:
    // 
    // *   `Default`: standard scenarios.
    // *   `XFlow`: workflow scenarios.
    // 
    // Default value: `Default`.
    @NameInMap("Profile")
    public String profile;

    public static DescribeHubClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHubClustersRequest self = new DescribeHubClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHubClustersRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

}
