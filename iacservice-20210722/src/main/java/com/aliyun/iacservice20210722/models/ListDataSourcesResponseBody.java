// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ListDataSourcesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("dataSources")
    public java.util.List<ListDataSourcesResponseBodyDataSources> dataSources;

    public static ListDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesResponseBody self = new ListDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSourcesResponseBody setDataSources(java.util.List<ListDataSourcesResponseBodyDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<ListDataSourcesResponseBodyDataSources> getDataSources() {
        return this.dataSources;
    }

    public static class ListDataSourcesResponseBodyDataSources extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("dataSourceAttributes")
        public String dataSourceAttributes;

        public static ListDataSourcesResponseBodyDataSources build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyDataSources self = new ListDataSourcesResponseBodyDataSources();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyDataSources setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDataSourcesResponseBodyDataSources setDataSourceAttributes(String dataSourceAttributes) {
            this.dataSourceAttributes = dataSourceAttributes;
            return this;
        }
        public String getDataSourceAttributes() {
            return this.dataSourceAttributes;
        }

    }

}
