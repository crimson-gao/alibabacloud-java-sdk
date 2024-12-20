// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("ItemList")
    public QueryBizItemListResponseBodyItemList itemList;

    /**
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>5B9B6D8D-A78D-521D-B6B6-08CDC182****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryBizItemListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemListResponseBody self = new QueryBizItemListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBizItemListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBizItemListResponseBody setItemList(QueryBizItemListResponseBodyItemList itemList) {
        this.itemList = itemList;
        return this;
    }
    public QueryBizItemListResponseBodyItemList getItemList() {
        return this.itemList;
    }

    public QueryBizItemListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBizItemListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryBizItemListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBizItemListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBizItemListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList extends TeaModel {
        @NameInMap("UserLabelList")
        public java.util.List<String> userLabelList;

        public static QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList self = new QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList setUserLabelList(java.util.List<String> userLabelList) {
            this.userLabelList = userLabelList;
            return this;
        }
        public java.util.List<String> getUserLabelList() {
            return this.userLabelList;
        }

    }

    public static class QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel extends TeaModel {
        @NameInMap("AccessUrl")
        public String accessUrl;

        @NameInMap("CanBuy")
        public Boolean canBuy;

        @NameInMap("CharacteristicCode")
        public String characteristicCode;

        @NameInMap("CharacteristicName")
        public String characteristicName;

        @NameInMap("Exclusive")
        public Boolean exclusive;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("PointPrice")
        public Long pointPrice;

        /**
         * <strong>example:</strong>
         * <p>2990</p>
         */
        @NameInMap("Points")
        public Long points;

        /**
         * <strong>example:</strong>
         * <p>2990</p>
         */
        @NameInMap("PointsAmount")
        public Long pointsAmount;

        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("Recommend")
        public Boolean recommend;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("SubBizCode")
        public String subBizCode;

        @NameInMap("UserLabelList")
        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList userLabelList;

        public static QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel self = new QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setAccessUrl(String accessUrl) {
            this.accessUrl = accessUrl;
            return this;
        }
        public String getAccessUrl() {
            return this.accessUrl;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setCanBuy(Boolean canBuy) {
            this.canBuy = canBuy;
            return this;
        }
        public Boolean getCanBuy() {
            return this.canBuy;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setCharacteristicCode(String characteristicCode) {
            this.characteristicCode = characteristicCode;
            return this;
        }
        public String getCharacteristicCode() {
            return this.characteristicCode;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setCharacteristicName(String characteristicName) {
            this.characteristicName = characteristicName;
            return this;
        }
        public String getCharacteristicName() {
            return this.characteristicName;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setExclusive(Boolean exclusive) {
            this.exclusive = exclusive;
            return this;
        }
        public Boolean getExclusive() {
            return this.exclusive;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setRecommend(Boolean recommend) {
            this.recommend = recommend;
            return this;
        }
        public Boolean getRecommend() {
            return this.recommend;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setUserLabelList(QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList userLabelList) {
            this.userLabelList = userLabelList;
            return this;
        }
        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList getUserLabelList() {
            return this.userLabelList;
        }

    }

    public static class QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModels extends TeaModel {
        @NameInMap("GradePriceModel")
        public java.util.List<QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel> gradePriceModel;

        public static QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModels build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModels self = new QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModels();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModels setGradePriceModel(java.util.List<QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel> gradePriceModel) {
            this.gradePriceModel = gradePriceModel;
            return this;
        }
        public java.util.List<QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel> getGradePriceModel() {
            return this.gradePriceModel;
        }

    }

    public static class QueryBizItemListResponseBodyItemListItemSkuListSkuUserLabelList extends TeaModel {
        @NameInMap("UserLabelList")
        public java.util.List<String> userLabelList;

        public static QueryBizItemListResponseBodyItemListItemSkuListSkuUserLabelList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListResponseBodyItemListItemSkuListSkuUserLabelList self = new QueryBizItemListResponseBodyItemListItemSkuListSkuUserLabelList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSkuUserLabelList setUserLabelList(java.util.List<String> userLabelList) {
            this.userLabelList = userLabelList;
            return this;
        }
        public java.util.List<String> getUserLabelList() {
            return this.userLabelList;
        }

    }

    public static class QueryBizItemListResponseBodyItemListItemSkuListSku extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>202109240050220000008822****</p>
         */
        @NameInMap("BenefitId")
        public String benefitId;

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

        @NameInMap("GradePriceModels")
        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModels gradePriceModels;

        /**
         * <strong>example:</strong>
         * <p>2990</p>
         */
        @NameInMap("Points")
        public Long points;

        /**
         * <strong>example:</strong>
         * <p>2990</p>
         */
        @NameInMap("PointsAmount")
        public Long pointsAmount;

        /**
         * <strong>example:</strong>
         * <p>1990</p>
         */
        @NameInMap("PriceCent")
        public Long priceCent;

        /**
         * <strong>example:</strong>
         * <p>482694857****</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("SkuPicUrl")
        public String skuPicUrl;

        @NameInMap("SkuTitle")
        public String skuTitle;

        /**
         * <strong>example:</strong>
         * <p>4990</p>
         */
        @NameInMap("TaoBaoCurrentPrice")
        public Long taoBaoCurrentPrice;

        @NameInMap("UserLabelList")
        public QueryBizItemListResponseBodyItemListItemSkuListSkuUserLabelList userLabelList;

        public static QueryBizItemListResponseBodyItemListItemSkuListSku build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListResponseBodyItemListItemSkuListSku self = new QueryBizItemListResponseBodyItemListItemSkuListSku();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSku setBenefitId(String benefitId) {
            this.benefitId = benefitId;
            return this;
        }
        public String getBenefitId() {
            return this.benefitId;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSku setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSku setCustomizedAttributeMap(java.util.Map<String, ?> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, ?> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSku setGradePriceModels(QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModels gradePriceModels) {
            this.gradePriceModels = gradePriceModels;
            return this;
        }
        public QueryBizItemListResponseBodyItemListItemSkuListSkuGradePriceModels getGradePriceModels() {
            return this.gradePriceModels;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSku setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSku setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSku setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSku setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSku setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSku setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSku setTaoBaoCurrentPrice(Long taoBaoCurrentPrice) {
            this.taoBaoCurrentPrice = taoBaoCurrentPrice;
            return this;
        }
        public Long getTaoBaoCurrentPrice() {
            return this.taoBaoCurrentPrice;
        }

        public QueryBizItemListResponseBodyItemListItemSkuListSku setUserLabelList(QueryBizItemListResponseBodyItemListItemSkuListSkuUserLabelList userLabelList) {
            this.userLabelList = userLabelList;
            return this;
        }
        public QueryBizItemListResponseBodyItemListItemSkuListSkuUserLabelList getUserLabelList() {
            return this.userLabelList;
        }

    }

    public static class QueryBizItemListResponseBodyItemListItemSkuList extends TeaModel {
        @NameInMap("Sku")
        public java.util.List<QueryBizItemListResponseBodyItemListItemSkuListSku> sku;

        public static QueryBizItemListResponseBodyItemListItemSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListResponseBodyItemListItemSkuList self = new QueryBizItemListResponseBodyItemListItemSkuList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListResponseBodyItemListItemSkuList setSku(java.util.List<QueryBizItemListResponseBodyItemListItemSkuListSku> sku) {
            this.sku = sku;
            return this;
        }
        public java.util.List<QueryBizItemListResponseBodyItemListItemSkuListSku> getSku() {
            return this.sku;
        }

    }

    public static class QueryBizItemListResponseBodyItemListItem extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanSell")
        public Boolean canSell;

        /**
         * <strong>example:</strong>
         * <p>50050579</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CustomizedItemName")
        public String customizedItemName;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ExtJson")
        public String extJson;

        /**
         * <strong>example:</strong>
         * <p>64944233****</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemTitle")
        public String itemTitle;

        /**
         * <strong>example:</strong>
         * <p>10000102-65931326****</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        /**
         * <strong>example:</strong>
         * <p>2990</p>
         */
        @NameInMap("ReservePrice")
        public Long reservePrice;

        /**
         * <strong>example:</strong>
         * <p>284324****</p>
         */
        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("SkuList")
        public QueryBizItemListResponseBodyItemListItemSkuList skuList;

        @NameInMap("TaobaoShopName")
        public String taobaoShopName;

        public static QueryBizItemListResponseBodyItemListItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListResponseBodyItemListItem self = new QueryBizItemListResponseBodyItemListItem();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListResponseBodyItemListItem setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryBizItemListResponseBodyItemListItem setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryBizItemListResponseBodyItemListItem setCustomizedItemName(String customizedItemName) {
            this.customizedItemName = customizedItemName;
            return this;
        }
        public String getCustomizedItemName() {
            return this.customizedItemName;
        }

        public QueryBizItemListResponseBodyItemListItem setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryBizItemListResponseBodyItemListItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryBizItemListResponseBodyItemListItem setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryBizItemListResponseBodyItemListItem setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryBizItemListResponseBodyItemListItem setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryBizItemListResponseBodyItemListItem setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryBizItemListResponseBodyItemListItem setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryBizItemListResponseBodyItemListItem setSkuList(QueryBizItemListResponseBodyItemListItemSkuList skuList) {
            this.skuList = skuList;
            return this;
        }
        public QueryBizItemListResponseBodyItemListItemSkuList getSkuList() {
            return this.skuList;
        }

        public QueryBizItemListResponseBodyItemListItem setTaobaoShopName(String taobaoShopName) {
            this.taobaoShopName = taobaoShopName;
            return this;
        }
        public String getTaobaoShopName() {
            return this.taobaoShopName;
        }

    }

    public static class QueryBizItemListResponseBodyItemList extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QueryBizItemListResponseBodyItemListItem> item;

        public static QueryBizItemListResponseBodyItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListResponseBodyItemList self = new QueryBizItemListResponseBodyItemList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListResponseBodyItemList setItem(java.util.List<QueryBizItemListResponseBodyItemListItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryBizItemListResponseBodyItemListItem> getItem() {
            return this.item;
        }

    }

}
