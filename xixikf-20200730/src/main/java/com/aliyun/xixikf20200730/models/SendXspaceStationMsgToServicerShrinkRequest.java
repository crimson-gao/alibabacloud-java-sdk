// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class SendXspaceStationMsgToServicerShrinkRequest extends TeaModel {
    // 内容
    @NameInMap("Content")
    public String content;

    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 是否需要回执确认 
    @NameInMap("NeedReceiptConfirm")
    public Boolean needReceiptConfirm;

    // 是否需要声音提示 
    @NameInMap("NeedRingNotify")
    public Boolean needRingNotify;

    // 接收者ID
    @NameInMap("ReceiverIds")
    public String receiverIdsShrink;

    // 消息场景 
    @NameInMap("Scene")
    public String scene;

    // 发送者id
    @NameInMap("SenderId")
    public Long senderId;

    // 来源ID
    @NameInMap("SourceId")
    public Long sourceId;

    // 标题
    @NameInMap("Title")
    public String title;

    public static SendXspaceStationMsgToServicerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendXspaceStationMsgToServicerShrinkRequest self = new SendXspaceStationMsgToServicerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendXspaceStationMsgToServicerShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendXspaceStationMsgToServicerShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendXspaceStationMsgToServicerShrinkRequest setNeedReceiptConfirm(Boolean needReceiptConfirm) {
        this.needReceiptConfirm = needReceiptConfirm;
        return this;
    }
    public Boolean getNeedReceiptConfirm() {
        return this.needReceiptConfirm;
    }

    public SendXspaceStationMsgToServicerShrinkRequest setNeedRingNotify(Boolean needRingNotify) {
        this.needRingNotify = needRingNotify;
        return this;
    }
    public Boolean getNeedRingNotify() {
        return this.needRingNotify;
    }

    public SendXspaceStationMsgToServicerShrinkRequest setReceiverIdsShrink(String receiverIdsShrink) {
        this.receiverIdsShrink = receiverIdsShrink;
        return this;
    }
    public String getReceiverIdsShrink() {
        return this.receiverIdsShrink;
    }

    public SendXspaceStationMsgToServicerShrinkRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SendXspaceStationMsgToServicerShrinkRequest setSenderId(Long senderId) {
        this.senderId = senderId;
        return this;
    }
    public Long getSenderId() {
        return this.senderId;
    }

    public SendXspaceStationMsgToServicerShrinkRequest setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public Long getSourceId() {
        return this.sourceId;
    }

    public SendXspaceStationMsgToServicerShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
