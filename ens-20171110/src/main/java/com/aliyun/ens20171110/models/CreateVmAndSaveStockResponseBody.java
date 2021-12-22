// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateVmAndSaveStockResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Msg")
    public String msg;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVmAndSaveStockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVmAndSaveStockResponseBody self = new CreateVmAndSaveStockResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVmAndSaveStockResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateVmAndSaveStockResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateVmAndSaveStockResponseBody setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateVmAndSaveStockResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CreateVmAndSaveStockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
