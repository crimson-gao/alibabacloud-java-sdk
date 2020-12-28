// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Zones")
    public java.util.List<DescribeZonesResponseBodyZones> zones;

    public static DescribeZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesResponseBody self = new DescribeZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZonesResponseBody setZones(java.util.List<DescribeZonesResponseBodyZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<DescribeZonesResponseBodyZones> getZones() {
        return this.zones;
    }

    public static class DescribeZonesResponseBodyZonesSlaveZones extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeZonesResponseBodyZonesSlaveZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesSlaveZones self = new DescribeZonesResponseBodyZonesSlaveZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesSlaveZones setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeZonesResponseBodyZonesSlaveZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeZonesResponseBodyZones extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("SlaveZones")
        public java.util.List<DescribeZonesResponseBodyZonesSlaveZones> slaveZones;

        public static DescribeZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZones self = new DescribeZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZones setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeZonesResponseBodyZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeZonesResponseBodyZones setSlaveZones(java.util.List<DescribeZonesResponseBodyZonesSlaveZones> slaveZones) {
            this.slaveZones = slaveZones;
            return this;
        }
        public java.util.List<DescribeZonesResponseBodyZonesSlaveZones> getSlaveZones() {
            return this.slaveZones;
        }

    }

}
