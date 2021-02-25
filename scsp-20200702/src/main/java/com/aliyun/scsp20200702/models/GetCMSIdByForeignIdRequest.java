// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetCMSIdByForeignIdRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Nick")
    public String nick;

    @NameInMap("ForeignId")
    public String foreignId;

    @NameInMap("SourceId")
    public Long sourceId;

    public static GetCMSIdByForeignIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCMSIdByForeignIdRequest self = new GetCMSIdByForeignIdRequest();
        return TeaModel.build(map, self);
    }

    public GetCMSIdByForeignIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetCMSIdByForeignIdRequest setNick(String nick) {
        this.nick = nick;
        return this;
    }
    public String getNick() {
        return this.nick;
    }

    public GetCMSIdByForeignIdRequest setForeignId(String foreignId) {
        this.foreignId = foreignId;
        return this;
    }
    public String getForeignId() {
        return this.foreignId;
    }

    public GetCMSIdByForeignIdRequest setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public Long getSourceId() {
        return this.sourceId;
    }

}
