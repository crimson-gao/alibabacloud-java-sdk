// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RenderOrderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogsId")
    public String logsId;

    /**
     * <strong>example:</strong>
     * <p>SKU_IS_MISSING</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public RenderOrderResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>DAAA6391-3339-5333-9E4D-C71CD26A231F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static RenderOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenderOrderResponseBody self = new RenderOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public RenderOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenderOrderResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public RenderOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenderOrderResponseBody setModel(RenderOrderResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public RenderOrderResponseBodyModel getModel() {
        return this.model;
    }

    public RenderOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenderOrderResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RenderOrderResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public RenderOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RenderOrderResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public String id;

        @NameInMap("PostFee")
        public Long postFee;

        @NameInMap("ServiceType")
        public Long serviceType;

        public static RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos self = new RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos setPostFee(Long postFee) {
            this.postFee = postFee;
            return this;
        }
        public Long getPostFee() {
            return this.postFee;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos setServiceType(Long serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Long getServiceType() {
            return this.serviceType;
        }

    }

    public static class RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfos extends TeaModel {
        @NameInMap("DeliveryInfos")
        public java.util.List<RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos> deliveryInfos;

        public static RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfos self = new RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfos setDeliveryInfos(java.util.List<RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos> deliveryInfos) {
            this.deliveryInfos = deliveryInfos;
            return this;
        }
        public java.util.List<RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos> getDeliveryInfos() {
            return this.deliveryInfos;
        }

    }

    public static class RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos extends TeaModel {
        @NameInMap("ActualPrice")
        public Long actualPrice;

        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("Cash")
        public Long cash;

        /**
         * <strong>example:</strong>
         * <p>658057729548</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>iphone12</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("ItemPicUrl")
        public String itemPicUrl;

        /**
         * <strong>example:</strong>
         * <p>10001036-254415474010492928</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>39</p>
         */
        @NameInMap("Points")
        public Long points;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Quantity")
        public Integer quantity;

        /**
         * <strong>example:</strong>
         * <p>107184918</p>
         */
        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("SellerNick")
        public String sellerNick;

        /**
         * <strong>example:</strong>
         * <p>4931861303981</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        /**
         * <strong>example:</strong>
         * <p>liu_12</p>
         */
        @NameInMap("SkuName")
        public String skuName;

        public static RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos self = new RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setActualPrice(Long actualPrice) {
            this.actualPrice = actualPrice;
            return this;
        }
        public Long getActualPrice() {
            return this.actualPrice;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setCash(Long cash) {
            this.cash = cash;
            return this;
        }
        public Long getCash() {
            return this.cash;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setItemPicUrl(String itemPicUrl) {
            this.itemPicUrl = itemPicUrl;
            return this;
        }
        public String getItemPicUrl() {
            return this.itemPicUrl;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
            return this;
        }
        public String getSellerNick() {
            return this.sellerNick;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

    }

    public static class RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfos extends TeaModel {
        @NameInMap("LmItemInfos")
        public java.util.List<RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos> lmItemInfos;

        public static RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfos self = new RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfos setLmItemInfos(java.util.List<RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos> lmItemInfos) {
            this.lmItemInfos = lmItemInfos;
            return this;
        }
        public java.util.List<RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos> getLmItemInfos() {
            return this.lmItemInfos;
        }

    }

    public static class RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfos extends TeaModel {
        @NameInMap("DeliveryInfos")
        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfos deliveryInfos;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        @NameInMap("LmItemInfos")
        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfos lmItemInfos;

        public static RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfos self = new RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfos setDeliveryInfos(RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfos deliveryInfos) {
            this.deliveryInfos = deliveryInfos;
            return this;
        }
        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosDeliveryInfos getDeliveryInfos() {
            return this.deliveryInfos;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfos setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfos setLmItemInfos(RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfos lmItemInfos) {
            this.lmItemInfos = lmItemInfos;
            return this;
        }
        public RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfosLmItemInfos getLmItemInfos() {
            return this.lmItemInfos;
        }

    }

    public static class RenderOrderResponseBodyModelRenderOrderInfos extends TeaModel {
        @NameInMap("RenderOrderInfos")
        public java.util.List<RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfos> renderOrderInfos;

        public static RenderOrderResponseBodyModelRenderOrderInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderResponseBodyModelRenderOrderInfos self = new RenderOrderResponseBodyModelRenderOrderInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderResponseBodyModelRenderOrderInfos setRenderOrderInfos(java.util.List<RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfos> renderOrderInfos) {
            this.renderOrderInfos = renderOrderInfos;
            return this;
        }
        public java.util.List<RenderOrderResponseBodyModelRenderOrderInfosRenderOrderInfos> getRenderOrderInfos() {
            return this.renderOrderInfos;
        }

    }

    public static class RenderOrderResponseBodyModel extends TeaModel {
        @NameInMap("RenderOrderInfos")
        public RenderOrderResponseBodyModelRenderOrderInfos renderOrderInfos;

        public static RenderOrderResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderResponseBodyModel self = new RenderOrderResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public RenderOrderResponseBodyModel setRenderOrderInfos(RenderOrderResponseBodyModelRenderOrderInfos renderOrderInfos) {
            this.renderOrderInfos = renderOrderInfos;
            return this;
        }
        public RenderOrderResponseBodyModelRenderOrderInfos getRenderOrderInfos() {
            return this.renderOrderInfos;
        }

    }

}
