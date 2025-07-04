// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class BindMFADeviceRequest extends TeaModel {
    /**
     * <p>The first authentication code.</p>
     * 
     * <strong>example:</strong>
     * <p>11****</p>
     */
    @NameInMap("AuthenticationCode1")
    public String authenticationCode1;

    /**
     * <p>The second authentication code.</p>
     * 
     * <strong>example:</strong>
     * <p>33****</p>
     */
    @NameInMap("AuthenticationCode2")
    public String authenticationCode2;

    /**
     * <p>The serial number of the MFA device.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:mfa/device002</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    /**
     * <p>The name of the RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>zhangq****</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static BindMFADeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindMFADeviceRequest self = new BindMFADeviceRequest();
        return TeaModel.build(map, self);
    }

    public BindMFADeviceRequest setAuthenticationCode1(String authenticationCode1) {
        this.authenticationCode1 = authenticationCode1;
        return this;
    }
    public String getAuthenticationCode1() {
        return this.authenticationCode1;
    }

    public BindMFADeviceRequest setAuthenticationCode2(String authenticationCode2) {
        this.authenticationCode2 = authenticationCode2;
        return this;
    }
    public String getAuthenticationCode2() {
        return this.authenticationCode2;
    }

    public BindMFADeviceRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public BindMFADeviceRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
