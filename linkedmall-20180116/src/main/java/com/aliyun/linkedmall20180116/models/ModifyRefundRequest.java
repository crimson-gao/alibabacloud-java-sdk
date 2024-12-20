// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyRefundRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ANONY</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <strong>example:</strong>
     * <p>500325</p>
     */
    @NameInMap("ApplyReasonTextId")
    public Long applyReasonTextId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ApplyRefundCount")
    public Integer applyRefundCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>790</p>
     */
    @NameInMap("ApplyRefundFee")
    public Long applyRefundFee;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizClaimType")
    public Integer bizClaimType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20******001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>220635******232</p>
     */
    @NameInMap("BizUid")
    public String bizUid;

    /**
     * <strong>example:</strong>
     * <p>14244******33071</p>
     */
    @NameInMap("DisputeId")
    public Long disputeId;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("GoodsStatus")
    public Integer goodsStatus;

    @NameInMap("LeaveMessage")
    public String leaveMessage;

    @NameInMap("LeavePictureList")
    public java.util.List<ModifyRefundRequestLeavePictureList> leavePictureList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>38******75</p>
     */
    @NameInMap("SubLmOrderId")
    public String subLmOrderId;

    /**
     * <strong>example:</strong>
     * <p>220635******232</p>
     */
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static ModifyRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRefundRequest self = new ModifyRefundRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRefundRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public ModifyRefundRequest setApplyReasonTextId(Long applyReasonTextId) {
        this.applyReasonTextId = applyReasonTextId;
        return this;
    }
    public Long getApplyReasonTextId() {
        return this.applyReasonTextId;
    }

    public ModifyRefundRequest setApplyRefundCount(Integer applyRefundCount) {
        this.applyRefundCount = applyRefundCount;
        return this;
    }
    public Integer getApplyRefundCount() {
        return this.applyRefundCount;
    }

    public ModifyRefundRequest setApplyRefundFee(Long applyRefundFee) {
        this.applyRefundFee = applyRefundFee;
        return this;
    }
    public Long getApplyRefundFee() {
        return this.applyRefundFee;
    }

    public ModifyRefundRequest setBizClaimType(Integer bizClaimType) {
        this.bizClaimType = bizClaimType;
        return this;
    }
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    public ModifyRefundRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifyRefundRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public ModifyRefundRequest setDisputeId(Long disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public Long getDisputeId() {
        return this.disputeId;
    }

    public ModifyRefundRequest setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
        return this;
    }
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    public ModifyRefundRequest setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage;
        return this;
    }
    public String getLeaveMessage() {
        return this.leaveMessage;
    }

    public ModifyRefundRequest setLeavePictureList(java.util.List<ModifyRefundRequestLeavePictureList> leavePictureList) {
        this.leavePictureList = leavePictureList;
        return this;
    }
    public java.util.List<ModifyRefundRequestLeavePictureList> getLeavePictureList() {
        return this.leavePictureList;
    }

    public ModifyRefundRequest setSubLmOrderId(String subLmOrderId) {
        this.subLmOrderId = subLmOrderId;
        return this;
    }
    public String getSubLmOrderId() {
        return this.subLmOrderId;
    }

    public ModifyRefundRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public ModifyRefundRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public static class ModifyRefundRequestLeavePictureList extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p><a href="https://lm-dk.oss-cn-hangzhou.aliyuncs.com/1635738731345.png">https://lm-dk.oss-cn-hangzhou.aliyuncs.com/1635738731345.png</a></p>
         */
        @NameInMap("Picture")
        public String picture;

        public static ModifyRefundRequestLeavePictureList build(java.util.Map<String, ?> map) throws Exception {
            ModifyRefundRequestLeavePictureList self = new ModifyRefundRequestLeavePictureList();
            return TeaModel.build(map, self);
        }

        public ModifyRefundRequestLeavePictureList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ModifyRefundRequestLeavePictureList setPicture(String picture) {
            this.picture = picture;
            return this;
        }
        public String getPicture() {
            return this.picture;
        }

    }

}
