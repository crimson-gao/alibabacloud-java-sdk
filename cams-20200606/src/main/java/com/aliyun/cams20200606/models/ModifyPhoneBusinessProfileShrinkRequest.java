// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyPhoneBusinessProfileShrinkRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Email")
    public String email;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ProfilePictureUrl")
    public String profilePictureUrl;

    @NameInMap("Vertical")
    public String vertical;

    @NameInMap("Websites")
    public String websitesShrink;

    public static ModifyPhoneBusinessProfileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhoneBusinessProfileShrinkRequest self = new ModifyPhoneBusinessProfileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPhoneBusinessProfileShrinkRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ModifyPhoneBusinessProfileShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ModifyPhoneBusinessProfileShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyPhoneBusinessProfileShrinkRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ModifyPhoneBusinessProfileShrinkRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ModifyPhoneBusinessProfileShrinkRequest setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
        return this;
    }
    public String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public ModifyPhoneBusinessProfileShrinkRequest setVertical(String vertical) {
        this.vertical = vertical;
        return this;
    }
    public String getVertical() {
        return this.vertical;
    }

    public ModifyPhoneBusinessProfileShrinkRequest setWebsitesShrink(String websitesShrink) {
        this.websitesShrink = websitesShrink;
        return this;
    }
    public String getWebsitesShrink() {
        return this.websitesShrink;
    }

}