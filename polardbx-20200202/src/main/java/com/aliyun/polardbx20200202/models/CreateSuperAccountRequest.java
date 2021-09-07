// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateSuperAccountRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AccountPassword")
    public String accountPassword;

    @NameInMap("AccountDescription")
    public String accountDescription;

    public static CreateSuperAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSuperAccountRequest self = new CreateSuperAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateSuperAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSuperAccountRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateSuperAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateSuperAccountRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateSuperAccountRequest setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }
    public String getAccountDescription() {
        return this.accountDescription;
    }

}
