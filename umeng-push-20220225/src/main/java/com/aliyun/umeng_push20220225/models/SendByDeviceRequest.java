// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByDeviceRequest extends TeaModel {
    @NameInMap("AndroidPayload")
    public AndroidPayload androidPayload;

    @NameInMap("AndroidShortPayload")
    public AndroidShortPayload androidShortPayload;

    @NameInMap("ChannelProperties")
    public ChannelProperties channelProperties;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ArdNyIzFCH2K3szXA8arpu0Y7ywOdA67mCSumtpnMnmf</p>
     */
    @NameInMap("DeviceTokens")
    public String deviceTokens;

    @NameInMap("HarmonyPayload")
    public HarmonyPayload harmonyPayload;

    @NameInMap("IosPayload")
    public IosPayload iosPayload;

    @NameInMap("Policy")
    public Policy policy;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ProductionMode")
    public Boolean productionMode;

    @NameInMap("ReceiptType")
    public Integer receiptType;

    /**
     * <strong>example:</strong>
     * <p><a href="https://msg.umeng.com/upush/receipt">https://msg.umeng.com/upush/receipt</a></p>
     */
    @NameInMap("ReceiptUrl")
    public String receiptUrl;

    @NameInMap("ThirdPartyId")
    public String thirdPartyId;

    @NameInMap("callbackParams")
    public String callbackParams;

    public static SendByDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        SendByDeviceRequest self = new SendByDeviceRequest();
        return TeaModel.build(map, self);
    }

    public SendByDeviceRequest setAndroidPayload(AndroidPayload androidPayload) {
        this.androidPayload = androidPayload;
        return this;
    }
    public AndroidPayload getAndroidPayload() {
        return this.androidPayload;
    }

    public SendByDeviceRequest setAndroidShortPayload(AndroidShortPayload androidShortPayload) {
        this.androidShortPayload = androidShortPayload;
        return this;
    }
    public AndroidShortPayload getAndroidShortPayload() {
        return this.androidShortPayload;
    }

    public SendByDeviceRequest setChannelProperties(ChannelProperties channelProperties) {
        this.channelProperties = channelProperties;
        return this;
    }
    public ChannelProperties getChannelProperties() {
        return this.channelProperties;
    }

    public SendByDeviceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SendByDeviceRequest setDeviceTokens(String deviceTokens) {
        this.deviceTokens = deviceTokens;
        return this;
    }
    public String getDeviceTokens() {
        return this.deviceTokens;
    }

    public SendByDeviceRequest setHarmonyPayload(HarmonyPayload harmonyPayload) {
        this.harmonyPayload = harmonyPayload;
        return this;
    }
    public HarmonyPayload getHarmonyPayload() {
        return this.harmonyPayload;
    }

    public SendByDeviceRequest setIosPayload(IosPayload iosPayload) {
        this.iosPayload = iosPayload;
        return this;
    }
    public IosPayload getIosPayload() {
        return this.iosPayload;
    }

    public SendByDeviceRequest setPolicy(Policy policy) {
        this.policy = policy;
        return this;
    }
    public Policy getPolicy() {
        return this.policy;
    }

    public SendByDeviceRequest setProductionMode(Boolean productionMode) {
        this.productionMode = productionMode;
        return this;
    }
    public Boolean getProductionMode() {
        return this.productionMode;
    }

    public SendByDeviceRequest setReceiptType(Integer receiptType) {
        this.receiptType = receiptType;
        return this;
    }
    public Integer getReceiptType() {
        return this.receiptType;
    }

    public SendByDeviceRequest setReceiptUrl(String receiptUrl) {
        this.receiptUrl = receiptUrl;
        return this;
    }
    public String getReceiptUrl() {
        return this.receiptUrl;
    }

    public SendByDeviceRequest setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
        return this;
    }
    public String getThirdPartyId() {
        return this.thirdPartyId;
    }

    public SendByDeviceRequest setCallbackParams(String callbackParams) {
        this.callbackParams = callbackParams;
        return this;
    }
    public String getCallbackParams() {
        return this.callbackParams;
    }

}
