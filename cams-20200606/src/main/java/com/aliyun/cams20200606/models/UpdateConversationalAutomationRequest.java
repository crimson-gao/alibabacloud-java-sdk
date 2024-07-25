// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateConversationalAutomationRequest extends TeaModel {
    @NameInMap("Commands")
    public java.util.List<UpdateConversationalAutomationRequestCommands> commands;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableWelcomeMessage")
    public Boolean enableWelcomeMessage;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86130000***</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("Prompts")
    public java.util.List<String> prompts;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateConversationalAutomationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConversationalAutomationRequest self = new UpdateConversationalAutomationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConversationalAutomationRequest setCommands(java.util.List<UpdateConversationalAutomationRequestCommands> commands) {
        this.commands = commands;
        return this;
    }
    public java.util.List<UpdateConversationalAutomationRequestCommands> getCommands() {
        return this.commands;
    }

    public UpdateConversationalAutomationRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public UpdateConversationalAutomationRequest setEnableWelcomeMessage(Boolean enableWelcomeMessage) {
        this.enableWelcomeMessage = enableWelcomeMessage;
        return this;
    }
    public Boolean getEnableWelcomeMessage() {
        return this.enableWelcomeMessage;
    }

    public UpdateConversationalAutomationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateConversationalAutomationRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UpdateConversationalAutomationRequest setPrompts(java.util.List<String> prompts) {
        this.prompts = prompts;
        return this;
    }
    public java.util.List<String> getPrompts() {
        return this.prompts;
    }

    public UpdateConversationalAutomationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateConversationalAutomationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class UpdateConversationalAutomationRequestCommands extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>命令1</p>
         */
        @NameInMap("CommandDescription")
        public String commandDescription;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CommandName")
        public String commandName;

        public static UpdateConversationalAutomationRequestCommands build(java.util.Map<String, ?> map) throws Exception {
            UpdateConversationalAutomationRequestCommands self = new UpdateConversationalAutomationRequestCommands();
            return TeaModel.build(map, self);
        }

        public UpdateConversationalAutomationRequestCommands setCommandDescription(String commandDescription) {
            this.commandDescription = commandDescription;
            return this;
        }
        public String getCommandDescription() {
            return this.commandDescription;
        }

        public UpdateConversationalAutomationRequestCommands setCommandName(String commandName) {
            this.commandName = commandName;
            return this;
        }
        public String getCommandName() {
            return this.commandName;
        }

    }

}
