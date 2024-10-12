// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDataSourcesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDBInstanceDataSourcesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>F543E6CC-6868-523D-8D28-0E92CF977ED2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceDataSourcesResponseBody self = new DescribeDBInstanceDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceDataSourcesResponseBody setData(DescribeDBInstanceDataSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBInstanceDataSourcesResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBInstanceDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceDataSourcesResponseBodyDataColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>c31</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>dbtest</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PrimaryKey")
        public String primaryKey;

        /**
         * <strong>example:</strong>
         * <p>tableTest</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>UInt64</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDBInstanceDataSourcesResponseBodyDataColumns build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceDataSourcesResponseBodyDataColumns self = new DescribeDBInstanceDataSourcesResponseBodyDataColumns();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceDataSourcesResponseBodyDataColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeDBInstanceDataSourcesResponseBodyDataColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeDBInstanceDataSourcesResponseBodyDataColumns setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeDBInstanceDataSourcesResponseBodyDataColumns setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public DescribeDBInstanceDataSourcesResponseBodyDataColumns setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeDBInstanceDataSourcesResponseBodyDataColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDBInstanceDataSourcesResponseBodyData extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<DescribeDBInstanceDataSourcesResponseBodyDataColumns> columns;

        /**
         * <strong>example:</strong>
         * <p>cc-bp100p4q1g9z3****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Schemas")
        public String schemas;

        @NameInMap("Tables")
        public java.util.List<String> tables;

        public static DescribeDBInstanceDataSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceDataSourcesResponseBodyData self = new DescribeDBInstanceDataSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceDataSourcesResponseBodyData setColumns(java.util.List<DescribeDBInstanceDataSourcesResponseBodyDataColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<DescribeDBInstanceDataSourcesResponseBodyDataColumns> getColumns() {
            return this.columns;
        }

        public DescribeDBInstanceDataSourcesResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceDataSourcesResponseBodyData setSchemas(String schemas) {
            this.schemas = schemas;
            return this;
        }
        public String getSchemas() {
            return this.schemas;
        }

        public DescribeDBInstanceDataSourcesResponseBodyData setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

    }

}
