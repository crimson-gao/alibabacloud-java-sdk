// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleMetaVerifyV2Request extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4****************1</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("VehicleNum")
    public String vehicleNum;

    /**
     * <strong>example:</strong>
     * <p>02</p>
     */
    @NameInMap("VehicleType")
    public String vehicleType;

    /**
     * <strong>example:</strong>
     * <p>VEHICLE_3_META</p>
     */
    @NameInMap("VerifyMetaType")
    public String verifyMetaType;

    public static VehicleMetaVerifyV2Request build(java.util.Map<String, ?> map) throws Exception {
        VehicleMetaVerifyV2Request self = new VehicleMetaVerifyV2Request();
        return TeaModel.build(map, self);
    }

    public VehicleMetaVerifyV2Request setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public VehicleMetaVerifyV2Request setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public VehicleMetaVerifyV2Request setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public VehicleMetaVerifyV2Request setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
        return this;
    }
    public String getVehicleNum() {
        return this.vehicleNum;
    }

    public VehicleMetaVerifyV2Request setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }
    public String getVehicleType() {
        return this.vehicleType;
    }

    public VehicleMetaVerifyV2Request setVerifyMetaType(String verifyMetaType) {
        this.verifyMetaType = verifyMetaType;
        return this;
    }
    public String getVerifyMetaType() {
        return this.verifyMetaType;
    }

}
