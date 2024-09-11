// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListHotTopicsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>下一页的token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("TopicIds")
    public String topicIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>根据热榜主题全文检索</p>
     */
    @NameInMap("TopicQuery")
    public String topicQuery;

    /**
     * <strong>example:</strong>
     * <p>热榜源筛选，支持的热榜源。热榜源详见API：ListHotSources</p>
     */
    @NameInMap("TopicSource")
    public String topicSource;

    /**
     * <strong>example:</strong>
     * <p>数据版本筛选</p>
     */
    @NameInMap("TopicVersion")
    public String topicVersion;

    @NameInMap("Topics")
    public String topicsShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithNews")
    public Boolean withNews;

    public static ListHotTopicsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotTopicsShrinkRequest self = new ListHotTopicsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListHotTopicsShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListHotTopicsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHotTopicsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHotTopicsShrinkRequest setTopicIdsShrink(String topicIdsShrink) {
        this.topicIdsShrink = topicIdsShrink;
        return this;
    }
    public String getTopicIdsShrink() {
        return this.topicIdsShrink;
    }

    public ListHotTopicsShrinkRequest setTopicQuery(String topicQuery) {
        this.topicQuery = topicQuery;
        return this;
    }
    public String getTopicQuery() {
        return this.topicQuery;
    }

    public ListHotTopicsShrinkRequest setTopicSource(String topicSource) {
        this.topicSource = topicSource;
        return this;
    }
    public String getTopicSource() {
        return this.topicSource;
    }

    public ListHotTopicsShrinkRequest setTopicVersion(String topicVersion) {
        this.topicVersion = topicVersion;
        return this;
    }
    public String getTopicVersion() {
        return this.topicVersion;
    }

    public ListHotTopicsShrinkRequest setTopicsShrink(String topicsShrink) {
        this.topicsShrink = topicsShrink;
        return this;
    }
    public String getTopicsShrink() {
        return this.topicsShrink;
    }

    public ListHotTopicsShrinkRequest setWithNews(Boolean withNews) {
        this.withNews = withNews;
        return this;
    }
    public Boolean getWithNews() {
        return this.withNews;
    }

}
