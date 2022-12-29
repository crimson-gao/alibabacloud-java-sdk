// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class EvaluateResourceResponseBody extends TeaModel {
    // Indicates whether the resources are sufficient in the region. Valid values:
    // 
    // *   **1**: The resources are sufficient.
    // *   **0**: The resources are insufficient.
    @NameInMap("DBInstanceAvailable")
    public String DBInstanceAvailable;

    // The database engine of the instance. The returned value is MongoDB.
    @NameInMap("Engine")
    public String engine;

    // The database engine version of the instance.
    @NameInMap("EngineVersion")
    public String engineVersion;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static EvaluateResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EvaluateResourceResponseBody self = new EvaluateResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public EvaluateResourceResponseBody setDBInstanceAvailable(String DBInstanceAvailable) {
        this.DBInstanceAvailable = DBInstanceAvailable;
        return this;
    }
    public String getDBInstanceAvailable() {
        return this.DBInstanceAvailable;
    }

    public EvaluateResourceResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public EvaluateResourceResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public EvaluateResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
