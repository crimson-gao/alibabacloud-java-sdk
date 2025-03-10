// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieSeatsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20******004</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtJson")
    public String extJson;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9******5</p>
     */
    @NameInMap("ScheduleId")
    public Long scheduleId;

    public static QueryMovieSeatsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieSeatsRequest self = new QueryMovieSeatsRequest();
        return TeaModel.build(map, self);
    }

    public QueryMovieSeatsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryMovieSeatsRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

    public QueryMovieSeatsRequest setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public Long getScheduleId() {
        return this.scheduleId;
    }

}
