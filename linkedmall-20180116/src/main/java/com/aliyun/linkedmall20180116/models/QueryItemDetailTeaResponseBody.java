// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemDetailTeaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Item")
    public QueryItemDetailTeaResponseBodyItem item;

    /**
     * <strong>example:</strong>
     * <p>The specified parameter lmItemId or itemId value is not valid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>BA157565-3358-5D80-9330-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("SubMessage")
    public String subMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryItemDetailTeaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryItemDetailTeaResponseBody self = new QueryItemDetailTeaResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryItemDetailTeaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItemDetailTeaResponseBody setItem(QueryItemDetailTeaResponseBodyItem item) {
        this.item = item;
        return this;
    }
    public QueryItemDetailTeaResponseBodyItem getItem() {
        return this.item;
    }

    public QueryItemDetailTeaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryItemDetailTeaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemDetailTeaResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryItemDetailTeaResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryItemDetailTeaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryItemDetailTeaResponseBodyItemIforestProps extends TeaModel {
        @NameInMap("IforestProp")
        public java.util.List<java.util.Map<String, ?>> iforestProp;

        public static QueryItemDetailTeaResponseBodyItemIforestProps build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailTeaResponseBodyItemIforestProps self = new QueryItemDetailTeaResponseBodyItemIforestProps();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailTeaResponseBodyItemIforestProps setIforestProp(java.util.List<java.util.Map<String, ?>> iforestProp) {
            this.iforestProp = iforestProp;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getIforestProp() {
            return this.iforestProp;
        }

    }

    public static class QueryItemDetailTeaResponseBodyItemItemImages extends TeaModel {
        @NameInMap("ItemImage")
        public java.util.List<String> itemImage;

        public static QueryItemDetailTeaResponseBodyItemItemImages build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailTeaResponseBodyItemItemImages self = new QueryItemDetailTeaResponseBodyItemItemImages();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailTeaResponseBodyItemItemImages setItemImage(java.util.List<String> itemImage) {
            this.itemImage = itemImage;
            return this;
        }
        public java.util.List<String> getItemImage() {
            return this.itemImage;
        }

    }

    public static class QueryItemDetailTeaResponseBodyItemSkusSku extends TeaModel {
        @NameInMap("CanNotBeSoldCode")
        public String canNotBeSoldCode;

        @NameInMap("CanNotBeSoldMassage")
        public String canNotBeSoldMassage;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanSell")
        public Boolean canSell;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("CustomizedAttributeMap")
        public java.util.Map<String, ?> customizedAttributeMap;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;delivery_version\&quot;:\&quot;1\&quot;}</p>
         */
        @NameInMap("ExtJson")
        public String extJson;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasQuantity")
        public Boolean hasQuantity;

        /**
         * <strong>example:</strong>
         * <p>62887962****</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>10000102-64426301****</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        /**
         * <strong>example:</strong>
         * <p>2990</p>
         */
        @NameInMap("PointPrice")
        public Long pointPrice;

        /**
         * <strong>example:</strong>
         * <p>1990</p>
         */
        @NameInMap("Points")
        public Long points;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PointsAmount")
        public Long pointsAmount;

        /**
         * <strong>example:</strong>
         * <p>2890</p>
         */
        @NameInMap("PriceCent")
        public Long priceCent;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Quantity")
        public Integer quantity;

        /**
         * <strong>example:</strong>
         * <p>1990</p>
         */
        @NameInMap("ReservePrice")
        public Long reservePrice;

        /**
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("SimpleQuantity")
        public String simpleQuantity;

        /**
         * <strong>example:</strong>
         * <p>465309897****</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("SkuPicUrl")
        public String skuPicUrl;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("SkuProperties")
        public java.util.Map<String, ?> skuProperties;

        @NameInMap("SkuTitle")
        public String skuTitle;

        public static QueryItemDetailTeaResponseBodyItemSkusSku build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailTeaResponseBodyItemSkusSku self = new QueryItemDetailTeaResponseBodyItemSkusSku();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setCanNotBeSoldCode(String canNotBeSoldCode) {
            this.canNotBeSoldCode = canNotBeSoldCode;
            return this;
        }
        public String getCanNotBeSoldCode() {
            return this.canNotBeSoldCode;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setCanNotBeSoldMassage(String canNotBeSoldMassage) {
            this.canNotBeSoldMassage = canNotBeSoldMassage;
            return this;
        }
        public String getCanNotBeSoldMassage() {
            return this.canNotBeSoldMassage;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setCustomizedAttributeMap(java.util.Map<String, ?> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, ?> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setHasQuantity(Boolean hasQuantity) {
            this.hasQuantity = hasQuantity;
            return this;
        }
        public Boolean getHasQuantity() {
            return this.hasQuantity;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setSimpleQuantity(String simpleQuantity) {
            this.simpleQuantity = simpleQuantity;
            return this;
        }
        public String getSimpleQuantity() {
            return this.simpleQuantity;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setSkuProperties(java.util.Map<String, ?> skuProperties) {
            this.skuProperties = skuProperties;
            return this;
        }
        public java.util.Map<String, ?> getSkuProperties() {
            return this.skuProperties;
        }

        public QueryItemDetailTeaResponseBodyItemSkusSku setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

    }

    public static class QueryItemDetailTeaResponseBodyItemSkus extends TeaModel {
        @NameInMap("Sku")
        public java.util.List<QueryItemDetailTeaResponseBodyItemSkusSku> sku;

        public static QueryItemDetailTeaResponseBodyItemSkus build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailTeaResponseBodyItemSkus self = new QueryItemDetailTeaResponseBodyItemSkus();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailTeaResponseBodyItemSkus setSku(java.util.List<QueryItemDetailTeaResponseBodyItemSkusSku> sku) {
            this.sku = sku;
            return this;
        }
        public java.util.List<QueryItemDetailTeaResponseBodyItemSkusSku> getSku() {
            return this.sku;
        }

    }

    public static class QueryItemDetailTeaResponseBodyItem extends TeaModel {
        @NameInMap("CanNotBeSoldCode")
        public String canNotBeSoldCode;

        @NameInMap("CanNotBeSoldMassage")
        public String canNotBeSoldMassage;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanSell")
        public Boolean canSell;

        /**
         * <strong>example:</strong>
         * <p>20177****</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CenterInventory")
        public Boolean centerInventory;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("CustomizedAttributeMap")
        public java.util.Map<String, ?> customizedAttributeMap;

        /**
         * <strong>example:</strong>
         * <p>&quot;<p>&lt;img align=\&quot;absmiddle\&quot; src=\&quot;<a href="https://img.alicdn.com/imgextra/i1/1742262291/O1CN01j0oO3L1SnK7EwwXP4_!!1742262291.jpg%5C%5C">https://img.alicdn.com/imgextra/i1/1742262291/O1CN01j0oO3L1SnK7EwwXP4_!!1742262291.jpg\\</a>&quot; style=\&quot;max-width: none;width: 750.0px;\&quot;&gt;&quot;</p>
         */
        @NameInMap("DescOption")
        public String descOption;

        @NameInMap("DescPath")
        public String descPath;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;delivery_version\&quot;:\&quot;1\&quot;}</p>
         */
        @NameInMap("ExtJson")
        public String extJson;

        @NameInMap("FirstPicUrl")
        public String firstPicUrl;

        @NameInMap("HasQuantity")
        public Boolean hasQuantity;

        @NameInMap("IforestProps")
        public QueryItemDetailTeaResponseBodyItemIforestProps iforestProps;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCanSell")
        public Boolean isCanSell;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSellerPayPostfee")
        public Boolean isSellerPayPostfee;

        /**
         * <strong>example:</strong>
         * <p>60646253****</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemImages")
        public QueryItemDetailTeaResponseBodyItemItemImages itemImages;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("ItemTotalSimpleValue")
        public String itemTotalSimpleValue;

        /**
         * <strong>example:</strong>
         * <p>entity</p>
         */
        @NameInMap("LmItemCategory")
        public String lmItemCategory;

        /**
         * <strong>example:</strong>
         * <p>10000035-61936646****</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        /**
         * <strong>example:</strong>
         * <p>2990</p>
         */
        @NameInMap("MinPoints")
        public Long minPoints;

        /**
         * <strong>example:</strong>
         * <p>1990</p>
         */
        @NameInMap("MinPrice")
        public Long minPrice;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Quantity")
        public Integer quantity;

        /**
         * <strong>example:</strong>
         * <p>2990</p>
         */
        @NameInMap("ReservePrice")
        public Long reservePrice;

        /**
         * <strong>example:</strong>
         * <p>329488****</p>
         */
        @NameInMap("SellerId")
        public Long sellerId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SellerPayPostfee")
        public Boolean sellerPayPostfee;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SellerType")
        public Integer sellerType;

        @NameInMap("SimpleQuantity")
        public String simpleQuantity;

        @NameInMap("Skus")
        public QueryItemDetailTeaResponseBodyItemSkus skus;

        @NameInMap("TbShopName")
        public String tbShopName;

        /**
         * <strong>example:</strong>
         * <p>1999</p>
         */
        @NameInMap("TotalSoldQuantity")
        public Integer totalSoldQuantity;

        @NameInMap("TotalSoldSimpleQuantity")
        public String totalSoldSimpleQuantity;

        @NameInMap("VideoPicUrl")
        public String videoPicUrl;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static QueryItemDetailTeaResponseBodyItem build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailTeaResponseBodyItem self = new QueryItemDetailTeaResponseBodyItem();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailTeaResponseBodyItem setCanNotBeSoldCode(String canNotBeSoldCode) {
            this.canNotBeSoldCode = canNotBeSoldCode;
            return this;
        }
        public String getCanNotBeSoldCode() {
            return this.canNotBeSoldCode;
        }

        public QueryItemDetailTeaResponseBodyItem setCanNotBeSoldMassage(String canNotBeSoldMassage) {
            this.canNotBeSoldMassage = canNotBeSoldMassage;
            return this;
        }
        public String getCanNotBeSoldMassage() {
            return this.canNotBeSoldMassage;
        }

        public QueryItemDetailTeaResponseBodyItem setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryItemDetailTeaResponseBodyItem setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryItemDetailTeaResponseBodyItem setCenterInventory(Boolean centerInventory) {
            this.centerInventory = centerInventory;
            return this;
        }
        public Boolean getCenterInventory() {
            return this.centerInventory;
        }

        public QueryItemDetailTeaResponseBodyItem setCustomizedAttributeMap(java.util.Map<String, ?> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, ?> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryItemDetailTeaResponseBodyItem setDescOption(String descOption) {
            this.descOption = descOption;
            return this;
        }
        public String getDescOption() {
            return this.descOption;
        }

        public QueryItemDetailTeaResponseBodyItem setDescPath(String descPath) {
            this.descPath = descPath;
            return this;
        }
        public String getDescPath() {
            return this.descPath;
        }

        public QueryItemDetailTeaResponseBodyItem setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryItemDetailTeaResponseBodyItem setFirstPicUrl(String firstPicUrl) {
            this.firstPicUrl = firstPicUrl;
            return this;
        }
        public String getFirstPicUrl() {
            return this.firstPicUrl;
        }

        public QueryItemDetailTeaResponseBodyItem setHasQuantity(Boolean hasQuantity) {
            this.hasQuantity = hasQuantity;
            return this;
        }
        public Boolean getHasQuantity() {
            return this.hasQuantity;
        }

        public QueryItemDetailTeaResponseBodyItem setIforestProps(QueryItemDetailTeaResponseBodyItemIforestProps iforestProps) {
            this.iforestProps = iforestProps;
            return this;
        }
        public QueryItemDetailTeaResponseBodyItemIforestProps getIforestProps() {
            return this.iforestProps;
        }

        public QueryItemDetailTeaResponseBodyItem setIsCanSell(Boolean isCanSell) {
            this.isCanSell = isCanSell;
            return this;
        }
        public Boolean getIsCanSell() {
            return this.isCanSell;
        }

        public QueryItemDetailTeaResponseBodyItem setIsSellerPayPostfee(Boolean isSellerPayPostfee) {
            this.isSellerPayPostfee = isSellerPayPostfee;
            return this;
        }
        public Boolean getIsSellerPayPostfee() {
            return this.isSellerPayPostfee;
        }

        public QueryItemDetailTeaResponseBodyItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemDetailTeaResponseBodyItem setItemImages(QueryItemDetailTeaResponseBodyItemItemImages itemImages) {
            this.itemImages = itemImages;
            return this;
        }
        public QueryItemDetailTeaResponseBodyItemItemImages getItemImages() {
            return this.itemImages;
        }

        public QueryItemDetailTeaResponseBodyItem setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryItemDetailTeaResponseBodyItem setItemTotalSimpleValue(String itemTotalSimpleValue) {
            this.itemTotalSimpleValue = itemTotalSimpleValue;
            return this;
        }
        public String getItemTotalSimpleValue() {
            return this.itemTotalSimpleValue;
        }

        public QueryItemDetailTeaResponseBodyItem setLmItemCategory(String lmItemCategory) {
            this.lmItemCategory = lmItemCategory;
            return this;
        }
        public String getLmItemCategory() {
            return this.lmItemCategory;
        }

        public QueryItemDetailTeaResponseBodyItem setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemDetailTeaResponseBodyItem setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryItemDetailTeaResponseBodyItem setMinPoints(Long minPoints) {
            this.minPoints = minPoints;
            return this;
        }
        public Long getMinPoints() {
            return this.minPoints;
        }

        public QueryItemDetailTeaResponseBodyItem setMinPrice(Long minPrice) {
            this.minPrice = minPrice;
            return this;
        }
        public Long getMinPrice() {
            return this.minPrice;
        }

        public QueryItemDetailTeaResponseBodyItem setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public QueryItemDetailTeaResponseBodyItem setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryItemDetailTeaResponseBodyItem setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemDetailTeaResponseBodyItem setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryItemDetailTeaResponseBodyItem setSellerPayPostfee(Boolean sellerPayPostfee) {
            this.sellerPayPostfee = sellerPayPostfee;
            return this;
        }
        public Boolean getSellerPayPostfee() {
            return this.sellerPayPostfee;
        }

        public QueryItemDetailTeaResponseBodyItem setSellerType(Integer sellerType) {
            this.sellerType = sellerType;
            return this;
        }
        public Integer getSellerType() {
            return this.sellerType;
        }

        public QueryItemDetailTeaResponseBodyItem setSimpleQuantity(String simpleQuantity) {
            this.simpleQuantity = simpleQuantity;
            return this;
        }
        public String getSimpleQuantity() {
            return this.simpleQuantity;
        }

        public QueryItemDetailTeaResponseBodyItem setSkus(QueryItemDetailTeaResponseBodyItemSkus skus) {
            this.skus = skus;
            return this;
        }
        public QueryItemDetailTeaResponseBodyItemSkus getSkus() {
            return this.skus;
        }

        public QueryItemDetailTeaResponseBodyItem setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

        public QueryItemDetailTeaResponseBodyItem setTotalSoldQuantity(Integer totalSoldQuantity) {
            this.totalSoldQuantity = totalSoldQuantity;
            return this;
        }
        public Integer getTotalSoldQuantity() {
            return this.totalSoldQuantity;
        }

        public QueryItemDetailTeaResponseBodyItem setTotalSoldSimpleQuantity(String totalSoldSimpleQuantity) {
            this.totalSoldSimpleQuantity = totalSoldSimpleQuantity;
            return this;
        }
        public String getTotalSoldSimpleQuantity() {
            return this.totalSoldSimpleQuantity;
        }

        public QueryItemDetailTeaResponseBodyItem setVideoPicUrl(String videoPicUrl) {
            this.videoPicUrl = videoPicUrl;
            return this;
        }
        public String getVideoPicUrl() {
            return this.videoPicUrl;
        }

        public QueryItemDetailTeaResponseBodyItem setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
