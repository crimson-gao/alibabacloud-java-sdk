// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateProductVersionPackageRequest extends TeaModel {
    // ENUM:["full","upgrade"]
    @NameInMap("packageType")
    public String packageType;

    // ENUM:["all","base"."application"]
    @NameInMap("packageContentType")
    public String packageContentType;

    @NameInMap("oldProductVersionUID")
    public String oldProductVersionUID;

    @NameInMap("platform")
    public String platform;

    public static CreateProductVersionPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductVersionPackageRequest self = new CreateProductVersionPackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductVersionPackageRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public CreateProductVersionPackageRequest setPackageContentType(String packageContentType) {
        this.packageContentType = packageContentType;
        return this;
    }
    public String getPackageContentType() {
        return this.packageContentType;
    }

    public CreateProductVersionPackageRequest setOldProductVersionUID(String oldProductVersionUID) {
        this.oldProductVersionUID = oldProductVersionUID;
        return this;
    }
    public String getOldProductVersionUID() {
        return this.oldProductVersionUID;
    }

    public CreateProductVersionPackageRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

}
