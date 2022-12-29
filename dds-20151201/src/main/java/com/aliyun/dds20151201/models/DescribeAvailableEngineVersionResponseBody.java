// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAvailableEngineVersionResponseBody extends TeaModel {
    // The list of one or more engine versions to which an ApsaraDB for MongoDB instance can be upgraded.
    // 
    // >  An empty string is returned if the latest version is being used.
    @NameInMap("EngineVersions")
    public DescribeAvailableEngineVersionResponseBodyEngineVersions engineVersions;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableEngineVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableEngineVersionResponseBody self = new DescribeAvailableEngineVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableEngineVersionResponseBody setEngineVersions(DescribeAvailableEngineVersionResponseBodyEngineVersions engineVersions) {
        this.engineVersions = engineVersions;
        return this;
    }
    public DescribeAvailableEngineVersionResponseBodyEngineVersions getEngineVersions() {
        return this.engineVersions;
    }

    public DescribeAvailableEngineVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAvailableEngineVersionResponseBodyEngineVersions extends TeaModel {
        @NameInMap("EngineVersion")
        public java.util.List<String> engineVersion;

        public static DescribeAvailableEngineVersionResponseBodyEngineVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableEngineVersionResponseBodyEngineVersions self = new DescribeAvailableEngineVersionResponseBodyEngineVersions();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableEngineVersionResponseBodyEngineVersions setEngineVersion(java.util.List<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public java.util.List<String> getEngineVersion() {
            return this.engineVersion;
        }

    }

}
