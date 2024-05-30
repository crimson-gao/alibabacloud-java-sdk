// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMassMessageRequest extends TeaModel {
    /**
     * <p>The channel type. Valid values: whatsapp, viber, and line.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The space ID of the user.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The ID of the WhatsApp Business account under the ISV account.</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The fallback content.</p>
     */
    @NameInMap("FallBackContent")
    public String fallBackContent;

    @NameInMap("FallBackDuration")
    public Integer fallBackDuration;

    /**
     * <p>The ID of the fallback strategy.</p>
     */
    @NameInMap("FallBackId")
    public String fallBackId;

    /**
     * <p>The fallback rule.</p>
     * <br>
     * <p>>  Valid values:</p>
     * <br>
     * <p>*   undelivered: A fallback is triggered if the WhatsApp message is not delivered to clients. When the WhatsApp message is being sent, the template parameters are verified. If the parameters fail to pass the verification, the message fails to be sent. Whether the template and phone number are prohibited is not verified. By default, this value is used when FallBackRule is left empty.</p>
     * <br>
     * <p>*   sentfailed: A fallback is triggered even if the template parameters including variables fail to pass the verification. If the channelType, type, messageType, to, and from parameters fail to pass the verification, a fallback is not triggered.</p>
     */
    @NameInMap("FallBackRule")
    public String fallBackRule;

    /**
     * <p>The phone number of the message sender.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ISV verification code, which is used to verify whether the user is authorized by the ISV account.</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The message type when the ChannelType parameter is set to viber. Valid values: promotion and transaction.</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The language. For more information about language codes, see [Language codes](https://help.aliyun.com/document_detail/463420.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The phone numbers to which the message is sent.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SenderList")
    public java.util.List<SendChatappMassMessageRequestSenderList> senderList;

    /**
     * <p>The tag information when the ChannelType parameter is set to viber.</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The encoding of the message template.</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The timeout period for sending messages when the ChannelType parameter is set to viber. Valid values: 30 to 1209600. Unit: seconds.</p>
     */
    @NameInMap("Ttl")
    public Long ttl;

    public static SendChatappMassMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChatappMassMessageRequest self = new SendChatappMassMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendChatappMassMessageRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public SendChatappMassMessageRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public SendChatappMassMessageRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public SendChatappMassMessageRequest setFallBackContent(String fallBackContent) {
        this.fallBackContent = fallBackContent;
        return this;
    }
    public String getFallBackContent() {
        return this.fallBackContent;
    }

    public SendChatappMassMessageRequest setFallBackDuration(Integer fallBackDuration) {
        this.fallBackDuration = fallBackDuration;
        return this;
    }
    public Integer getFallBackDuration() {
        return this.fallBackDuration;
    }

    public SendChatappMassMessageRequest setFallBackId(String fallBackId) {
        this.fallBackId = fallBackId;
        return this;
    }
    public String getFallBackId() {
        return this.fallBackId;
    }

    public SendChatappMassMessageRequest setFallBackRule(String fallBackRule) {
        this.fallBackRule = fallBackRule;
        return this;
    }
    public String getFallBackRule() {
        return this.fallBackRule;
    }

    public SendChatappMassMessageRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public SendChatappMassMessageRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public SendChatappMassMessageRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public SendChatappMassMessageRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SendChatappMassMessageRequest setSenderList(java.util.List<SendChatappMassMessageRequestSenderList> senderList) {
        this.senderList = senderList;
        return this;
    }
    public java.util.List<SendChatappMassMessageRequestSenderList> getSenderList() {
        return this.senderList;
    }

    public SendChatappMassMessageRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SendChatappMassMessageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SendChatappMassMessageRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendChatappMassMessageRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public SendChatappMassMessageRequest setTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }
    public Long getTtl() {
        return this.ttl;
    }

    public static class SendChatappMassMessageRequestSenderListFlowAction extends TeaModel {
        @NameInMap("FlowActionData")
        public java.util.Map<String, String> flowActionData;

        @NameInMap("FlowToken")
        public String flowToken;

        public static SendChatappMassMessageRequestSenderListFlowAction build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMassMessageRequestSenderListFlowAction self = new SendChatappMassMessageRequestSenderListFlowAction();
            return TeaModel.build(map, self);
        }

        public SendChatappMassMessageRequestSenderListFlowAction setFlowActionData(java.util.Map<String, String> flowActionData) {
            this.flowActionData = flowActionData;
            return this;
        }
        public java.util.Map<String, String> getFlowActionData() {
            return this.flowActionData;
        }

        public SendChatappMassMessageRequestSenderListFlowAction setFlowToken(String flowToken) {
            this.flowToken = flowToken;
            return this;
        }
        public String getFlowToken() {
            return this.flowToken;
        }

    }

    public static class SendChatappMassMessageRequestSenderListProductActionSectionsProductItems extends TeaModel {
        /**
         * <p>The retailer ID of the product.</p>
         */
        @NameInMap("ProductRetailerId")
        public String productRetailerId;

        public static SendChatappMassMessageRequestSenderListProductActionSectionsProductItems build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMassMessageRequestSenderListProductActionSectionsProductItems self = new SendChatappMassMessageRequestSenderListProductActionSectionsProductItems();
            return TeaModel.build(map, self);
        }

        public SendChatappMassMessageRequestSenderListProductActionSectionsProductItems setProductRetailerId(String productRetailerId) {
            this.productRetailerId = productRetailerId;
            return this;
        }
        public String getProductRetailerId() {
            return this.productRetailerId;
        }

    }

    public static class SendChatappMassMessageRequestSenderListProductActionSections extends TeaModel {
        /**
         * <p>The products.</p>
         */
        @NameInMap("ProductItems")
        public java.util.List<SendChatappMassMessageRequestSenderListProductActionSectionsProductItems> productItems;

        /**
         * <p>The name of the category.</p>
         */
        @NameInMap("Title")
        public String title;

        public static SendChatappMassMessageRequestSenderListProductActionSections build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMassMessageRequestSenderListProductActionSections self = new SendChatappMassMessageRequestSenderListProductActionSections();
            return TeaModel.build(map, self);
        }

        public SendChatappMassMessageRequestSenderListProductActionSections setProductItems(java.util.List<SendChatappMassMessageRequestSenderListProductActionSectionsProductItems> productItems) {
            this.productItems = productItems;
            return this;
        }
        public java.util.List<SendChatappMassMessageRequestSenderListProductActionSectionsProductItems> getProductItems() {
            return this.productItems;
        }

        public SendChatappMassMessageRequestSenderListProductActionSections setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class SendChatappMassMessageRequestSenderListProductAction extends TeaModel {
        /**
         * <p>The products. Up to 30 products and 10 categories can be added.</p>
         */
        @NameInMap("Sections")
        public java.util.List<SendChatappMassMessageRequestSenderListProductActionSections> sections;

        /**
         * <p>The retailer ID of the product.</p>
         */
        @NameInMap("ThumbnailProductRetailerId")
        public String thumbnailProductRetailerId;

        public static SendChatappMassMessageRequestSenderListProductAction build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMassMessageRequestSenderListProductAction self = new SendChatappMassMessageRequestSenderListProductAction();
            return TeaModel.build(map, self);
        }

        public SendChatappMassMessageRequestSenderListProductAction setSections(java.util.List<SendChatappMassMessageRequestSenderListProductActionSections> sections) {
            this.sections = sections;
            return this;
        }
        public java.util.List<SendChatappMassMessageRequestSenderListProductActionSections> getSections() {
            return this.sections;
        }

        public SendChatappMassMessageRequestSenderListProductAction setThumbnailProductRetailerId(String thumbnailProductRetailerId) {
            this.thumbnailProductRetailerId = thumbnailProductRetailerId;
            return this;
        }
        public String getThumbnailProductRetailerId() {
            return this.thumbnailProductRetailerId;
        }

    }

    public static class SendChatappMassMessageRequestSenderList extends TeaModel {
        @NameInMap("FlowAction")
        public SendChatappMassMessageRequestSenderListFlowAction flowAction;

        /**
         * <p>The payload.</p>
         */
        @NameInMap("Payload")
        public java.util.List<String> payload;

        /**
         * <p>The information about the product.</p>
         */
        @NameInMap("ProductAction")
        public SendChatappMassMessageRequestSenderListProductAction productAction;

        /**
         * <p>The parameters of the template.</p>
         */
        @NameInMap("TemplateParams")
        public java.util.Map<String, String> templateParams;

        /**
         * <p>The phone number to which the message is sent.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("To")
        public String to;

        public static SendChatappMassMessageRequestSenderList build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMassMessageRequestSenderList self = new SendChatappMassMessageRequestSenderList();
            return TeaModel.build(map, self);
        }

        public SendChatappMassMessageRequestSenderList setFlowAction(SendChatappMassMessageRequestSenderListFlowAction flowAction) {
            this.flowAction = flowAction;
            return this;
        }
        public SendChatappMassMessageRequestSenderListFlowAction getFlowAction() {
            return this.flowAction;
        }

        public SendChatappMassMessageRequestSenderList setPayload(java.util.List<String> payload) {
            this.payload = payload;
            return this;
        }
        public java.util.List<String> getPayload() {
            return this.payload;
        }

        public SendChatappMassMessageRequestSenderList setProductAction(SendChatappMassMessageRequestSenderListProductAction productAction) {
            this.productAction = productAction;
            return this;
        }
        public SendChatappMassMessageRequestSenderListProductAction getProductAction() {
            return this.productAction;
        }

        public SendChatappMassMessageRequestSenderList setTemplateParams(java.util.Map<String, String> templateParams) {
            this.templateParams = templateParams;
            return this;
        }
        public java.util.Map<String, String> getTemplateParams() {
            return this.templateParams;
        }

        public SendChatappMassMessageRequestSenderList setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

}
