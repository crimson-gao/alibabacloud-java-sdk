// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigDeliveryChannelsRequest extends TeaModel {
    /**
     * <p>The ID of the delivery channel. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cdc-d9106457e0d900b1****</p>
     */
    @NameInMap("DeliveryChannelIds")
    public String deliveryChannelIds;

    public static ListConfigDeliveryChannelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigDeliveryChannelsRequest self = new ListConfigDeliveryChannelsRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigDeliveryChannelsRequest setDeliveryChannelIds(String deliveryChannelIds) {
        this.deliveryChannelIds = deliveryChannelIds;
        return this;
    }
    public String getDeliveryChannelIds() {
        return this.deliveryChannelIds;
    }

}
