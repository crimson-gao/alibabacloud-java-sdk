// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderWithDesignatedTbUidRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20******05</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("BuyerMessages")
    public String buyerMessages;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeliveryAddress")
    public String deliveryAddress;

    /**
     * <strong>example:</strong>
     * <p>{ \&quot;serviceType\&quot;: -4,\&quot;id\&quot;: \&quot;20\&quot;, \&quot;postFee\&quot;: 0}</p>
     */
    @NameInMap("DeliveryInfo")
    public String deliveryInfo;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtInfo")
    public String extInfo;

    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("OrderExpireTime")
    public Long orderExpireTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;lmItemId\&quot;:\&quot;10028102-655199865844\&quot;,\&quot;number\&quot;:1,\&quot;skuId\&quot;: 4900752886354}]</p>
     */
    @NameInMap("OrderItems")
    public String orderItems;

    /**
     * <strong>example:</strong>
     * <p>146******54</p>
     */
    @NameInMap("OutTradeId")
    public String outTradeId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ANONY</p>
     */
    @NameInMap("TbAccountType")
    public String tbAccountType;

    /**
     * <strong>example:</strong>
     * <p>677******211</p>
     */
    @NameInMap("TbUserId")
    public Long tbUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>321******211</p>
     */
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static CreateOrderWithDesignatedTbUidRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderWithDesignatedTbUidRequest self = new CreateOrderWithDesignatedTbUidRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderWithDesignatedTbUidRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateOrderWithDesignatedTbUidRequest setBuyerMessages(String buyerMessages) {
        this.buyerMessages = buyerMessages;
        return this;
    }
    public String getBuyerMessages() {
        return this.buyerMessages;
    }

    public CreateOrderWithDesignatedTbUidRequest setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public CreateOrderWithDesignatedTbUidRequest setDeliveryInfo(String deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
        return this;
    }
    public String getDeliveryInfo() {
        return this.deliveryInfo;
    }

    public CreateOrderWithDesignatedTbUidRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CreateOrderWithDesignatedTbUidRequest setOrderExpireTime(Long orderExpireTime) {
        this.orderExpireTime = orderExpireTime;
        return this;
    }
    public Long getOrderExpireTime() {
        return this.orderExpireTime;
    }

    public CreateOrderWithDesignatedTbUidRequest setOrderItems(String orderItems) {
        this.orderItems = orderItems;
        return this;
    }
    public String getOrderItems() {
        return this.orderItems;
    }

    public CreateOrderWithDesignatedTbUidRequest setOutTradeId(String outTradeId) {
        this.outTradeId = outTradeId;
        return this;
    }
    public String getOutTradeId() {
        return this.outTradeId;
    }

    public CreateOrderWithDesignatedTbUidRequest setTbAccountType(String tbAccountType) {
        this.tbAccountType = tbAccountType;
        return this;
    }
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    public CreateOrderWithDesignatedTbUidRequest setTbUserId(Long tbUserId) {
        this.tbUserId = tbUserId;
        return this;
    }
    public Long getTbUserId() {
        return this.tbUserId;
    }

    public CreateOrderWithDesignatedTbUidRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
