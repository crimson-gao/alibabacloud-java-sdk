// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class UpdateRegistryRequest extends TeaModel {
    // address
    @NameInMap("address")
    public String address;

    // description
    @NameInMap("description")
    public String description;

    // gatewayId
    @NameInMap("gatewayId")
    public Long gatewayId;

    // id
    @NameInMap("id")
    public String id;

    // name
    @NameInMap("name")
    public String name;

    // type
    @NameInMap("type")
    public Long type;

    public static UpdateRegistryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRegistryRequest self = new UpdateRegistryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRegistryRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateRegistryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateRegistryRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateRegistryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateRegistryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateRegistryRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
