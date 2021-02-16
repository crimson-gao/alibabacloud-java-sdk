// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBLinksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBLinkInfos")
    public java.util.List<DescribeDBLinksResponseBodyDBLinkInfos> DBLinkInfos;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    public static DescribeDBLinksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBLinksResponseBody self = new DescribeDBLinksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBLinksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBLinksResponseBody setDBLinkInfos(java.util.List<DescribeDBLinksResponseBodyDBLinkInfos> DBLinkInfos) {
        this.DBLinkInfos = DBLinkInfos;
        return this;
    }
    public java.util.List<DescribeDBLinksResponseBodyDBLinkInfos> getDBLinkInfos() {
        return this.DBLinkInfos;
    }

    public DescribeDBLinksResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public static class DescribeDBLinksResponseBodyDBLinkInfos extends TeaModel {
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("DBLinkName")
        public String DBLinkName;

        @NameInMap("SourceDBName")
        public String sourceDBName;

        @NameInMap("TargetDBName")
        public String targetDBName;

        @NameInMap("TargetDBInstanceName")
        public String targetDBInstanceName;

        @NameInMap("TargetAccount")
        public String targetAccount;

        public static DescribeDBLinksResponseBodyDBLinkInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBLinksResponseBodyDBLinkInfos self = new DescribeDBLinksResponseBodyDBLinkInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDBLinksResponseBodyDBLinkInfos setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeDBLinksResponseBodyDBLinkInfos setDBLinkName(String DBLinkName) {
            this.DBLinkName = DBLinkName;
            return this;
        }
        public String getDBLinkName() {
            return this.DBLinkName;
        }

        public DescribeDBLinksResponseBodyDBLinkInfos setSourceDBName(String sourceDBName) {
            this.sourceDBName = sourceDBName;
            return this;
        }
        public String getSourceDBName() {
            return this.sourceDBName;
        }

        public DescribeDBLinksResponseBodyDBLinkInfos setTargetDBName(String targetDBName) {
            this.targetDBName = targetDBName;
            return this;
        }
        public String getTargetDBName() {
            return this.targetDBName;
        }

        public DescribeDBLinksResponseBodyDBLinkInfos setTargetDBInstanceName(String targetDBInstanceName) {
            this.targetDBInstanceName = targetDBInstanceName;
            return this;
        }
        public String getTargetDBInstanceName() {
            return this.targetDBInstanceName;
        }

        public DescribeDBLinksResponseBodyDBLinkInfos setTargetAccount(String targetAccount) {
            this.targetAccount = targetAccount;
            return this;
        }
        public String getTargetAccount() {
            return this.targetAccount;
        }

    }

}
