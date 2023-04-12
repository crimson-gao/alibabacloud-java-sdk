// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigDeliveryChannelsRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the delivery channel. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("DeliveryChannelIds")
    public String deliveryChannelIds;

    public static ListAggregateConfigDeliveryChannelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateConfigDeliveryChannelsRequest self = new ListAggregateConfigDeliveryChannelsRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregateConfigDeliveryChannelsRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public ListAggregateConfigDeliveryChannelsRequest setDeliveryChannelIds(String deliveryChannelIds) {
        this.deliveryChannelIds = deliveryChannelIds;
        return this;
    }
    public String getDeliveryChannelIds() {
        return this.deliveryChannelIds;
    }

}
