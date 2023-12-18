// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CopySDGShrinkRequest extends TeaModel {
    @NameInMap("DestinationRegionIds")
    public String destinationRegionIdsShrink;

    @NameInMap("SDGId")
    public String SDGId;

    public static CopySDGShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CopySDGShrinkRequest self = new CopySDGShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CopySDGShrinkRequest setDestinationRegionIdsShrink(String destinationRegionIdsShrink) {
        this.destinationRegionIdsShrink = destinationRegionIdsShrink;
        return this;
    }
    public String getDestinationRegionIdsShrink() {
        return this.destinationRegionIdsShrink;
    }

    public CopySDGShrinkRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}
