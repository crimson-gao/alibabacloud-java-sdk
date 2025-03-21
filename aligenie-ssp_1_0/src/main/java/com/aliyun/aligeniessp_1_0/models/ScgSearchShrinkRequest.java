// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ScgSearchShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScgFilter")
    public String scgFilterShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MC201132</p>
     */
    @NameInMap("TopicId")
    public String topicId;

    public static ScgSearchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ScgSearchShrinkRequest self = new ScgSearchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ScgSearchShrinkRequest setScgFilterShrink(String scgFilterShrink) {
        this.scgFilterShrink = scgFilterShrink;
        return this;
    }
    public String getScgFilterShrink() {
        return this.scgFilterShrink;
    }

    public ScgSearchShrinkRequest setTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }
    public String getTopicId() {
        return this.topicId;
    }

}
