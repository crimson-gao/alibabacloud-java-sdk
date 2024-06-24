// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>17400</p>
     */
    @NameInMap("floor_price")
    public Integer floorPrice;

    /**
     * <strong>example:</strong>
     * <p>121000</p>
     */
    @NameInMap("ticket_price")
    public Integer ticketPrice;

    /**
     * <strong>example:</strong>
     * <p>17400</p>
     */
    @NameInMap("sell_price")
    public Integer sellPrice;

    /**
     * <strong>example:</strong>
     * <p>17400</p>
     */
    @NameInMap("original_sell_price")
    public Integer originalSellPrice;

    @NameInMap("base_total_price")
    public Integer baseTotalPrice;

    /**
     * <strong>example:</strong>
     * <p>17400</p>
     */
    @NameInMap("before_control_price")
    public Integer beforeControlPrice;

    /**
     * <strong>example:</strong>
     * <p>11000</p>
     */
    @NameInMap("tax")
    public Integer tax;

    @NameInMap("supply_price")
    public Integer supplyPrice;

    /**
     * <strong>example:</strong>
     * <p>242000</p>
     */
    @NameInMap("basic_cabin_price")
    public Integer basicCabinPrice;

    /**
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("build_price")
    public Integer buildPrice;

    /**
     * <strong>example:</strong>
     * <p>6000</p>
     */
    @NameInMap("oil_price")
    public Integer oilPrice;

    @NameInMap("first_standard_price")
    public Integer firstStandardPrice;

    @NameInMap("business_standard_price")
    public Integer businessStandardPrice;

    /**
     * <strong>example:</strong>
     * <p>242000</p>
     */
    @NameInMap("common_standard_price")
    public Integer commonStandardPrice;

    /**
     * <p>fdPrice</p>
     * 
     * <strong>example:</strong>
     * <p>fdPrice</p>
     */
    @NameInMap("inter_ticket_price")
    public Integer interTicketPrice;

    @NameInMap("subtracted_price")
    public Integer subtractedPrice;

    @NameInMap("origin_common_price")
    public Integer originCommonPrice;

    @NameInMap("dynamic_promotion_price")
    public Integer dynamicPromotionPrice;

    @NameInMap("installment_num")
    public Integer installmentNum;

    @NameInMap("installment_price")
    public Double installmentPrice;

    @NameInMap("competition_dynamic_price")
    public Integer competitionDynamicPrice;

    @NameInMap("competition_promotion_price")
    public Integer competitionPromotionPrice;

    @NameInMap("min_before_control_price_of_normal")
    public Integer minBeforeControlPriceOfNormal;

    @NameInMap("price_show_info")
    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValuePriceShowInfo priceShowInfo;

    public static ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue self = new ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue();
        return TeaModel.build(map, self);
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setFloorPrice(Integer floorPrice) {
        this.floorPrice = floorPrice;
        return this;
    }
    public Integer getFloorPrice() {
        return this.floorPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
        return this;
    }
    public Integer getTicketPrice() {
        return this.ticketPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
        return this;
    }
    public Integer getSellPrice() {
        return this.sellPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setOriginalSellPrice(Integer originalSellPrice) {
        this.originalSellPrice = originalSellPrice;
        return this;
    }
    public Integer getOriginalSellPrice() {
        return this.originalSellPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setBaseTotalPrice(Integer baseTotalPrice) {
        this.baseTotalPrice = baseTotalPrice;
        return this;
    }
    public Integer getBaseTotalPrice() {
        return this.baseTotalPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setBeforeControlPrice(Integer beforeControlPrice) {
        this.beforeControlPrice = beforeControlPrice;
        return this;
    }
    public Integer getBeforeControlPrice() {
        return this.beforeControlPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setTax(Integer tax) {
        this.tax = tax;
        return this;
    }
    public Integer getTax() {
        return this.tax;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setSupplyPrice(Integer supplyPrice) {
        this.supplyPrice = supplyPrice;
        return this;
    }
    public Integer getSupplyPrice() {
        return this.supplyPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setBasicCabinPrice(Integer basicCabinPrice) {
        this.basicCabinPrice = basicCabinPrice;
        return this;
    }
    public Integer getBasicCabinPrice() {
        return this.basicCabinPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setBuildPrice(Integer buildPrice) {
        this.buildPrice = buildPrice;
        return this;
    }
    public Integer getBuildPrice() {
        return this.buildPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setOilPrice(Integer oilPrice) {
        this.oilPrice = oilPrice;
        return this;
    }
    public Integer getOilPrice() {
        return this.oilPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setFirstStandardPrice(Integer firstStandardPrice) {
        this.firstStandardPrice = firstStandardPrice;
        return this;
    }
    public Integer getFirstStandardPrice() {
        return this.firstStandardPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setBusinessStandardPrice(Integer businessStandardPrice) {
        this.businessStandardPrice = businessStandardPrice;
        return this;
    }
    public Integer getBusinessStandardPrice() {
        return this.businessStandardPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setCommonStandardPrice(Integer commonStandardPrice) {
        this.commonStandardPrice = commonStandardPrice;
        return this;
    }
    public Integer getCommonStandardPrice() {
        return this.commonStandardPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setInterTicketPrice(Integer interTicketPrice) {
        this.interTicketPrice = interTicketPrice;
        return this;
    }
    public Integer getInterTicketPrice() {
        return this.interTicketPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setSubtractedPrice(Integer subtractedPrice) {
        this.subtractedPrice = subtractedPrice;
        return this;
    }
    public Integer getSubtractedPrice() {
        return this.subtractedPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setOriginCommonPrice(Integer originCommonPrice) {
        this.originCommonPrice = originCommonPrice;
        return this;
    }
    public Integer getOriginCommonPrice() {
        return this.originCommonPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setDynamicPromotionPrice(Integer dynamicPromotionPrice) {
        this.dynamicPromotionPrice = dynamicPromotionPrice;
        return this;
    }
    public Integer getDynamicPromotionPrice() {
        return this.dynamicPromotionPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setInstallmentNum(Integer installmentNum) {
        this.installmentNum = installmentNum;
        return this;
    }
    public Integer getInstallmentNum() {
        return this.installmentNum;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setInstallmentPrice(Double installmentPrice) {
        this.installmentPrice = installmentPrice;
        return this;
    }
    public Double getInstallmentPrice() {
        return this.installmentPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setCompetitionDynamicPrice(Integer competitionDynamicPrice) {
        this.competitionDynamicPrice = competitionDynamicPrice;
        return this;
    }
    public Integer getCompetitionDynamicPrice() {
        return this.competitionDynamicPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setCompetitionPromotionPrice(Integer competitionPromotionPrice) {
        this.competitionPromotionPrice = competitionPromotionPrice;
        return this;
    }
    public Integer getCompetitionPromotionPrice() {
        return this.competitionPromotionPrice;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setMinBeforeControlPriceOfNormal(Integer minBeforeControlPriceOfNormal) {
        this.minBeforeControlPriceOfNormal = minBeforeControlPriceOfNormal;
        return this;
    }
    public Integer getMinBeforeControlPriceOfNormal() {
        return this.minBeforeControlPriceOfNormal;
    }

    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValue setPriceShowInfo(ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValuePriceShowInfo priceShowInfo) {
        this.priceShowInfo = priceShowInfo;
        return this;
    }
    public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValuePriceShowInfo getPriceShowInfo() {
        return this.priceShowInfo;
    }

    public static class ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValuePriceShowInfo extends TeaModel {
        @NameInMap("discount_info")
        public String discountInfo;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("discount_num")
        public Double discountNum;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("show_ticket_price")
        public Boolean showTicketPrice;

        public static ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValuePriceShowInfo build(java.util.Map<String, ?> map) throws Exception {
            ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValuePriceShowInfo self = new ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValuePriceShowInfo();
            return TeaModel.build(map, self);
        }

        public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValuePriceShowInfo setDiscountInfo(String discountInfo) {
            this.discountInfo = discountInfo;
            return this;
        }
        public String getDiscountInfo() {
            return this.discountInfo;
        }

        public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValuePriceShowInfo setDiscountNum(Double discountNum) {
            this.discountNum = discountNum;
            return this;
        }
        public Double getDiscountNum() {
            return this.discountNum;
        }

        public ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceValuePriceShowInfo setShowTicketPrice(Boolean showTicketPrice) {
            this.showTicketPrice = showTicketPrice;
            return this;
        }
        public Boolean getShowTicketPrice() {
            return this.showTicketPrice;
        }

    }

}
