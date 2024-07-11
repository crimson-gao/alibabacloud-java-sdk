// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListQueueUpStreamBindingsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListQueueUpStreamBindingsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8BFB1C9D-08A2-4859-A47C-403C9EFA2***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListQueueUpStreamBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueueUpStreamBindingsResponseBody self = new ListQueueUpStreamBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueueUpStreamBindingsResponseBody setData(ListQueueUpStreamBindingsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQueueUpStreamBindingsResponseBodyData getData() {
        return this.data;
    }

    public ListQueueUpStreamBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListQueueUpStreamBindingsResponseBodyDataBindings extends TeaModel {
        /**
         * <p>The x-match attribute. Valid values:</p>
         * <ul>
         * <li><strong>all:</strong> A headers exchange routes a message to a queue only if all binding attributes of the queue except for x-match match the headers attributes of the message. This value is the default value.</li>
         * <li><strong>any:</strong> A headers exchange routes a message to a queue if one or more binding attributes of the queue except for x-match match the headers attributes of the message.</li>
         * </ul>
         * <p>This parameter is available for only headers exchanges.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("Argument")
        public String argument;

        /**
         * <p>The binding key.</p>
         * <ul>
         * <li><p>If the source exchange is not a topic exchange, the binding key must meet the following conventions:</p>
         * <ul>
         * <li>The binding key can contain only letters, digits, hyphens (-), underscores (_), periods (.), forward slashes (/), and at signs (@).</li>
         * <li>The binding key must be 1 to 255 characters in length.</li>
         * </ul>
         * </li>
         * <li><p>If the source exchange is a topic exchange, the binding key must meet the following conventions:</p>
         * <ul>
         * <li>The binding key can contain letters, digits, hyphens (-), underscores (_), periods (.), number signs (#), forward slashes (/), and at signs (@).</li>
         * <li>The binding key cannot start or end with a period (.). If a binding key starts with a number sign (#) or an asterisk (\<em>), the number sign (#) or asterisk (\</em>) must be followed by a period (.). If the binding key ends with a number sign (#) or an asterisk (\<em>), the number sign (#) or asterisk (\</em>) must be preceded by a period (.). If a number sign (#) or an asterisk (\<em>) is used in the middle of a binding key, the number sign (#) or asterisk (\</em>) must be preceded and followed by a period (.).</li>
         * <li>The binding key must be 1 to 255 characters in length.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>amq.test</p>
         */
        @NameInMap("BindingKey")
        public String bindingKey;

        /**
         * <p>The type of the object to which the source exchange is bound. Valid values:</p>
         * <ul>
         * <li><strong>QUEUE</strong></li>
         * <li><strong>EXCHANGE</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>QUEUE</p>
         */
        @NameInMap("BindingType")
        public String bindingType;

        /**
         * <p>The name of the object to which the source exchange is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>QueueTest</p>
         */
        @NameInMap("DestinationName")
        public String destinationName;

        /**
         * <p>The name of the source exchange.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SourceExchange")
        public String sourceExchange;

        public static ListQueueUpStreamBindingsResponseBodyDataBindings build(java.util.Map<String, ?> map) throws Exception {
            ListQueueUpStreamBindingsResponseBodyDataBindings self = new ListQueueUpStreamBindingsResponseBodyDataBindings();
            return TeaModel.build(map, self);
        }

        public ListQueueUpStreamBindingsResponseBodyDataBindings setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
        }

        public ListQueueUpStreamBindingsResponseBodyDataBindings setBindingKey(String bindingKey) {
            this.bindingKey = bindingKey;
            return this;
        }
        public String getBindingKey() {
            return this.bindingKey;
        }

        public ListQueueUpStreamBindingsResponseBodyDataBindings setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public ListQueueUpStreamBindingsResponseBodyDataBindings setDestinationName(String destinationName) {
            this.destinationName = destinationName;
            return this;
        }
        public String getDestinationName() {
            return this.destinationName;
        }

        public ListQueueUpStreamBindingsResponseBodyDataBindings setSourceExchange(String sourceExchange) {
            this.sourceExchange = sourceExchange;
            return this;
        }
        public String getSourceExchange() {
            return this.sourceExchange;
        }

    }

    public static class ListQueueUpStreamBindingsResponseBodyData extends TeaModel {
        /**
         * <p>The bindings.</p>
         */
        @NameInMap("Bindings")
        public java.util.List<ListQueueUpStreamBindingsResponseBodyDataBindings> bindings;

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxResults")
        public String maxResults;

        /**
         * <p>The token that marks the end of the current returned page. If this parameter is empty, all data is retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>caebacccb2be03f84eb48b699f0a****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListQueueUpStreamBindingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQueueUpStreamBindingsResponseBodyData self = new ListQueueUpStreamBindingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQueueUpStreamBindingsResponseBodyData setBindings(java.util.List<ListQueueUpStreamBindingsResponseBodyDataBindings> bindings) {
            this.bindings = bindings;
            return this;
        }
        public java.util.List<ListQueueUpStreamBindingsResponseBodyDataBindings> getBindings() {
            return this.bindings;
        }

        public ListQueueUpStreamBindingsResponseBodyData setMaxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public String getMaxResults() {
            return this.maxResults;
        }

        public ListQueueUpStreamBindingsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
