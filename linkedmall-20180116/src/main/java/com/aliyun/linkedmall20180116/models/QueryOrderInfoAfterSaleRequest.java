// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderInfoAfterSaleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ANONY</p>
     */
    @NameInMap("AccountType")
    public String accountType;

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
     * <p>22******323</p>
     */
    @NameInMap("ChannelUserId")
    public String channelUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40******84</p>
     */
    @NameInMap("LmOrderId")
    public String lmOrderId;

    /**
     * <strong>example:</strong>
     * <p>22******323</p>
     */
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static QueryOrderInfoAfterSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderInfoAfterSaleRequest self = new QueryOrderInfoAfterSaleRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderInfoAfterSaleRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public QueryOrderInfoAfterSaleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryOrderInfoAfterSaleRequest setChannelUserId(String channelUserId) {
        this.channelUserId = channelUserId;
        return this;
    }
    public String getChannelUserId() {
        return this.channelUserId;
    }

    public QueryOrderInfoAfterSaleRequest setLmOrderId(String lmOrderId) {
        this.lmOrderId = lmOrderId;
        return this;
    }
    public String getLmOrderId() {
        return this.lmOrderId;
    }

    public QueryOrderInfoAfterSaleRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public QueryOrderInfoAfterSaleRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

}
