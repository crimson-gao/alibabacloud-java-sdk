// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExpressionVariableFunctionListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeExpressionVariableFunctionListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressionVariableFunctionListRequest self = new DescribeExpressionVariableFunctionListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExpressionVariableFunctionListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeExpressionVariableFunctionListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
