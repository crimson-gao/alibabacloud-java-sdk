// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotProbeRequest extends TeaModel {
    @NameInMap("ProbeId")
    public String probeId;

    public static DeleteHoneypotProbeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotProbeRequest self = new DeleteHoneypotProbeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotProbeRequest setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }
    public String getProbeId() {
        return this.probeId;
    }

}
