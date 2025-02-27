// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenRouteMapsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>24CE1987-D1D1-5324-9BAD-2750B60E6ABB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the routing policy.</p>
     */
    @NameInMap("RouteMaps")
    public DescribeCenRouteMapsResponseBodyRouteMaps routeMaps;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCenRouteMapsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenRouteMapsResponseBody self = new DescribeCenRouteMapsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenRouteMapsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenRouteMapsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenRouteMapsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenRouteMapsResponseBody setRouteMaps(DescribeCenRouteMapsResponseBodyRouteMaps routeMaps) {
        this.routeMaps = routeMaps;
        return this;
    }
    public DescribeCenRouteMapsResponseBodyRouteMaps getRouteMaps() {
        return this.routeMaps;
    }

    public DescribeCenRouteMapsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes extends TeaModel {
        @NameInMap("DestinationChildInstanceType")
        public java.util.List<String> destinationChildInstanceType;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes setDestinationChildInstanceType(java.util.List<String> destinationChildInstanceType) {
            this.destinationChildInstanceType = destinationChildInstanceType;
            return this;
        }
        public java.util.List<String> getDestinationChildInstanceType() {
            return this.destinationChildInstanceType;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks extends TeaModel {
        @NameInMap("DestinationCidrBlock")
        public java.util.List<String> destinationCidrBlock;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks setDestinationCidrBlock(java.util.List<String> destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public java.util.List<String> getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds extends TeaModel {
        @NameInMap("DestinationInstanceId")
        public java.util.List<String> destinationInstanceId;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds setDestinationInstanceId(java.util.List<String> destinationInstanceId) {
            this.destinationInstanceId = destinationInstanceId;
            return this;
        }
        public java.util.List<String> getDestinationInstanceId() {
            return this.destinationInstanceId;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRegionIds extends TeaModel {
        @NameInMap("DestinationRegionId")
        public java.util.List<String> destinationRegionId;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRegionIds self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRegionIds setDestinationRegionId(java.util.List<String> destinationRegionId) {
            this.destinationRegionId = destinationRegionId;
            return this;
        }
        public java.util.List<String> getDestinationRegionId() {
            return this.destinationRegionId;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds extends TeaModel {
        @NameInMap("DestinationRouteTableId")
        public java.util.List<String> destinationRouteTableId;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds setDestinationRouteTableId(java.util.List<String> destinationRouteTableId) {
            this.destinationRouteTableId = destinationRouteTableId;
            return this;
        }
        public java.util.List<String> getDestinationRouteTableId() {
            return this.destinationRouteTableId;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns extends TeaModel {
        @NameInMap("MatchAsn")
        public java.util.List<String> matchAsn;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns setMatchAsn(java.util.List<String> matchAsn) {
            this.matchAsn = matchAsn;
            return this;
        }
        public java.util.List<String> getMatchAsn() {
            return this.matchAsn;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet extends TeaModel {
        @NameInMap("MatchCommunity")
        public java.util.List<String> matchCommunity;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet setMatchCommunity(java.util.List<String> matchCommunity) {
            this.matchCommunity = matchCommunity;
            return this;
        }
        public java.util.List<String> getMatchCommunity() {
            return this.matchCommunity;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet extends TeaModel {
        @NameInMap("OperateCommunity")
        public java.util.List<String> operateCommunity;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet setOperateCommunity(java.util.List<String> operateCommunity) {
            this.operateCommunity = operateCommunity;
            return this;
        }
        public java.util.List<String> getOperateCommunity() {
            return this.operateCommunity;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath extends TeaModel {
        @NameInMap("AsPath")
        public java.util.List<String> asPath;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath setAsPath(java.util.List<String> asPath) {
            this.asPath = asPath;
            return this;
        }
        public java.util.List<String> getAsPath() {
            return this.asPath;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes extends TeaModel {
        @NameInMap("RouteType")
        public java.util.List<String> routeType;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes setRouteType(java.util.List<String> routeType) {
            this.routeType = routeType;
            return this;
        }
        public java.util.List<String> getRouteType() {
            return this.routeType;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes extends TeaModel {
        @NameInMap("SourceChildInstanceType")
        public java.util.List<String> sourceChildInstanceType;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes setSourceChildInstanceType(java.util.List<String> sourceChildInstanceType) {
            this.sourceChildInstanceType = sourceChildInstanceType;
            return this;
        }
        public java.util.List<String> getSourceChildInstanceType() {
            return this.sourceChildInstanceType;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds extends TeaModel {
        @NameInMap("SourceInstanceId")
        public java.util.List<String> sourceInstanceId;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds setSourceInstanceId(java.util.List<String> sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public java.util.List<String> getSourceInstanceId() {
            return this.sourceInstanceId;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds extends TeaModel {
        @NameInMap("SourceRegionId")
        public java.util.List<String> sourceRegionId;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds setSourceRegionId(java.util.List<String> sourceRegionId) {
            this.sourceRegionId = sourceRegionId;
            return this;
        }
        public java.util.List<String> getSourceRegionId() {
            return this.sourceRegionId;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds extends TeaModel {
        @NameInMap("SourceRouteTableId")
        public java.util.List<String> sourceRouteTableId;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds setSourceRouteTableId(java.util.List<String> sourceRouteTableId) {
            this.sourceRouteTableId = sourceRouteTableId;
            return this;
        }
        public java.util.List<String> getSourceRouteTableId() {
            return this.sourceRouteTableId;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMap extends TeaModel {
        /**
         * <p>The match method that is used to match routes based on the AS path.</p>
         * <ul>
         * <li><strong>Include</strong>: fuzzy match. A route is a match if the AS path of the route overlaps with the AS path specified in the match condition.</li>
         * <li><strong>Complete</strong>: exact match. A route is a match only if the AS path of the route is the same as an AS path specified in the match condition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Include</p>
         */
        @NameInMap("AsPathMatchMode")
        public String asPathMatchMode;

        /**
         * <p>The CEN instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-wx12mmlt17ld82****</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The region ID of the routing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("CenRegionId")
        public String cenRegionId;

        /**
         * <p>The match method that is used to evaluate routes based on the prefix. Valid values:</p>
         * <ul>
         * <li><strong>Include</strong>: fuzzy match. A route is a match if the route prefix is included in the match conditions.</li>
         * </ul>
         * <p>For example, if you set the match condition to 10.10.0.0/16 and fuzzy match is applied, the route whose prefix is 10.10.1.0/24 meets the match condition.</p>
         * <ul>
         * <li><strong>Complete</strong>: exact match. A route is a match only if the route prefix is the same as the prefix specified in the match condition.</li>
         * </ul>
         * <p>For example, if you set the match condition to 10.10.0.0/16 and exact match is enabled, a route is a match only if the prefix is 10.10.0.0/16.</p>
         * 
         * <strong>example:</strong>
         * <p>Include</p>
         */
        @NameInMap("CidrMatchMode")
        public String cidrMatchMode;

        /**
         * <p>The match method that is used to match routes against the community.</p>
         * <ul>
         * <li><strong>Include</strong>: fuzzy match. A route is a match if the community of the route overlaps with the community specified in the match condition.</li>
         * <li><strong>Complete</strong>: exact match. A route meets the match condition only if the community of the route is the same as the community specified in the match condition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Include</p>
         */
        @NameInMap("CommunityMatchMode")
        public String communityMatchMode;

        /**
         * <p>The action that is performed on the community of the route.</p>
         * <ul>
         * <li><strong>Additive</strong>: adds the community to the route.</li>
         * <li><strong>Replace</strong>: replaces the original community of the route.</li>
         * </ul>
         * <p>This parameter specifies the action to be performed when a route meets the match condition.</p>
         * 
         * <strong>example:</strong>
         * <p>Additive</p>
         */
        @NameInMap("CommunityOperateMode")
        public String communityOperateMode;

        /**
         * <p>The description of the routing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The types of destination network instances to which the routes belong.</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>VBR</strong></li>
         * <li><strong>CCN</strong></li>
         * <li><strong>VPN</strong></li>
         * </ul>
         * <blockquote>
         * <p> The destination route tables take effect only if the routing policy is applied to the egress gateway direction, and the type of the destination route tables is the same as that of the network instance in the current region.</p>
         * </blockquote>
         */
        @NameInMap("DestinationChildInstanceTypes")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes destinationChildInstanceTypes;

        /**
         * <p>The prefix list against which routes are matched.</p>
         * <p>IPv4 and IPv6 addresses are supported.</p>
         */
        @NameInMap("DestinationCidrBlocks")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks destinationCidrBlocks;

        /**
         * <p>The IDs of the destination network instances to which the routes point.</p>
         * <blockquote>
         * <p> The destination route tables take effect only if the routing policy is applied to the egress gateway direction, and the ID the destination instance is the same as that of the network instance in the current region.</p>
         * </blockquote>
         */
        @NameInMap("DestinationInstanceIds")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds destinationInstanceIds;

        /**
         * <p>Indicates whether the destination network instance IDs are excluded.</p>
         * <ul>
         * <li><strong>false</strong> (default): A route is a match if its destination network instance ID is in the list specified by <strong>DestinationInstanceIds.N</strong>.</li>
         * <li><strong>true</strong>: A route is a match if its destination network instance ID is not in the list specified by <strong>DestinationInstanceIds.N</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DestinationInstanceIdsReverseMatch")
        public Boolean destinationInstanceIdsReverseMatch;

        /**
         * <p>The IDs of the destination regions for the routing policy.</p>
         */
        @NameInMap("DestinationRegionIds")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRegionIds destinationRegionIds;

        /**
         * <p>The IDs of the destination route tables to which the routes belong. You can enter at most 32 route table IDs.</p>
         * <blockquote>
         * <p> The destination route tables take effect only if the routing policy is applied to the egress gateway direction, and the destination route table IDs are in the current region.</p>
         * </blockquote>
         */
        @NameInMap("DestinationRouteTableIds")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds destinationRouteTableIds;

        /**
         * <p>The action performed on a route that meets the match conditions.</p>
         * <ul>
         * <li><strong>Permit</strong>: the route is permitted.</li>
         * <li><strong>Deny</strong>: the route is denied.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deny</p>
         */
        @NameInMap("MapResult")
        public String mapResult;

        /**
         * <p>The type of IP address to be matched against the match condition. Valid values:</p>
         * <ul>
         * <li><strong>IPv4</strong>: IPv4 addresses</li>
         * <li><strong>IPv6</strong>: IPv6 addresses</li>
         * <li>If no value is returned, both IPv4 and IPv6 addresses are matched against the match condition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("MatchAddressType")
        public String matchAddressType;

        /**
         * <p>The AS paths against which routes are matched.</p>
         */
        @NameInMap("MatchAsns")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns matchAsns;

        /**
         * <p>The community set against which routes are matched.</p>
         */
        @NameInMap("MatchCommunitySet")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet matchCommunitySet;

        /**
         * <p>The priority of the routing policy that you want to associate with the current one.</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("NextPriority")
        public Integer nextPriority;

        /**
         * <p>The community set on which actions are performed.</p>
         */
        @NameInMap("OperateCommunitySet")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet operateCommunitySet;

        /**
         * <p>The new priority of the route.</p>
         * <p>A smaller value indicates a higher priority.</p>
         * <p>This parameter indicates the action to be performed when a route meets the match condition.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Preference")
        public Integer preference;

        /**
         * <p>The AS paths that are prepended by using an action statement when regional gateways receive or advertise routes.</p>
         * <p>This parameter indicates the action to be performed when a route meets the match condition.</p>
         */
        @NameInMap("PrependAsPath")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath prependAsPath;

        /**
         * <p>The priority of the routing policy. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The routing policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cenrmap-y40mxdvf7joc12****</p>
         */
        @NameInMap("RouteMapId")
        public String routeMapId;

        /**
         * <p>The type of route that is compared. Valid values:</p>
         * <ul>
         * <li><strong>System</strong>: system routes that are automatically generated by the system.</li>
         * <li><strong>Custom</strong>: custom routes that are manually added.</li>
         * <li><strong>BGP</strong>: routes that are advertised over BGP.</li>
         * </ul>
         */
        @NameInMap("RouteTypes")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes routeTypes;

        /**
         * <p>The types of source network instances to which the routes belong.</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>VBR</strong></li>
         * <li><strong>CCN</strong></li>
         * <li><strong>VPN</strong></li>
         * </ul>
         */
        @NameInMap("SourceChildInstanceTypes")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes sourceChildInstanceTypes;

        /**
         * <p>The IDs of the source network instances to which the routes belong.</p>
         */
        @NameInMap("SourceInstanceIds")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds sourceInstanceIds;

        /**
         * <p>Indicates whether the source network instance IDs are excluded.</p>
         * <ul>
         * <li><strong>false</strong> (default): A route is a match if its source network instance ID is in the list specified by <strong>SourceInstanceIds.N</strong>.</li>
         * <li><strong>true</strong>: A route is match if its source network instance ID is not in the list specified by <strong>SourceInstanceIds.N</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SourceInstanceIdsReverseMatch")
        public Boolean sourceInstanceIdsReverseMatch;

        /**
         * <p>The IDs of the source regions to which the routes belong.</p>
         */
        @NameInMap("SourceRegionIds")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds sourceRegionIds;

        /**
         * <p>The IDs of the source route tables to which the routes belong.</p>
         */
        @NameInMap("SourceRouteTableIds")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds sourceRouteTableIds;

        /**
         * <p>The status of the routing policy. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Active</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The route table ID of the transit router with which the routing policy is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-gw8nx3515m1mbd1z1****</p>
         */
        @NameInMap("TransitRouterRouteTableId")
        public String transitRouterRouteTableId;

        /**
         * <p>The direction in which the routing policy is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionOut</p>
         */
        @NameInMap("TransmitDirection")
        public String transmitDirection;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMap build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMap self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMap();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setAsPathMatchMode(String asPathMatchMode) {
            this.asPathMatchMode = asPathMatchMode;
            return this;
        }
        public String getAsPathMatchMode() {
            return this.asPathMatchMode;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setCenRegionId(String cenRegionId) {
            this.cenRegionId = cenRegionId;
            return this;
        }
        public String getCenRegionId() {
            return this.cenRegionId;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setCidrMatchMode(String cidrMatchMode) {
            this.cidrMatchMode = cidrMatchMode;
            return this;
        }
        public String getCidrMatchMode() {
            return this.cidrMatchMode;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setCommunityMatchMode(String communityMatchMode) {
            this.communityMatchMode = communityMatchMode;
            return this;
        }
        public String getCommunityMatchMode() {
            return this.communityMatchMode;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setCommunityOperateMode(String communityOperateMode) {
            this.communityOperateMode = communityOperateMode;
            return this;
        }
        public String getCommunityOperateMode() {
            return this.communityOperateMode;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDestinationChildInstanceTypes(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes destinationChildInstanceTypes) {
            this.destinationChildInstanceTypes = destinationChildInstanceTypes;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes getDestinationChildInstanceTypes() {
            return this.destinationChildInstanceTypes;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDestinationCidrBlocks(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks destinationCidrBlocks) {
            this.destinationCidrBlocks = destinationCidrBlocks;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks getDestinationCidrBlocks() {
            return this.destinationCidrBlocks;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDestinationInstanceIds(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds destinationInstanceIds) {
            this.destinationInstanceIds = destinationInstanceIds;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds getDestinationInstanceIds() {
            return this.destinationInstanceIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDestinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
            this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
            return this;
        }
        public Boolean getDestinationInstanceIdsReverseMatch() {
            return this.destinationInstanceIdsReverseMatch;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDestinationRegionIds(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRegionIds destinationRegionIds) {
            this.destinationRegionIds = destinationRegionIds;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRegionIds getDestinationRegionIds() {
            return this.destinationRegionIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDestinationRouteTableIds(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds destinationRouteTableIds) {
            this.destinationRouteTableIds = destinationRouteTableIds;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds getDestinationRouteTableIds() {
            return this.destinationRouteTableIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setMapResult(String mapResult) {
            this.mapResult = mapResult;
            return this;
        }
        public String getMapResult() {
            return this.mapResult;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setMatchAddressType(String matchAddressType) {
            this.matchAddressType = matchAddressType;
            return this;
        }
        public String getMatchAddressType() {
            return this.matchAddressType;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setMatchAsns(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns matchAsns) {
            this.matchAsns = matchAsns;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns getMatchAsns() {
            return this.matchAsns;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setMatchCommunitySet(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet matchCommunitySet) {
            this.matchCommunitySet = matchCommunitySet;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet getMatchCommunitySet() {
            return this.matchCommunitySet;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setNextPriority(Integer nextPriority) {
            this.nextPriority = nextPriority;
            return this;
        }
        public Integer getNextPriority() {
            return this.nextPriority;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setOperateCommunitySet(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet operateCommunitySet) {
            this.operateCommunitySet = operateCommunitySet;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet getOperateCommunitySet() {
            return this.operateCommunitySet;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setPreference(Integer preference) {
            this.preference = preference;
            return this;
        }
        public Integer getPreference() {
            return this.preference;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setPrependAsPath(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath prependAsPath) {
            this.prependAsPath = prependAsPath;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath getPrependAsPath() {
            return this.prependAsPath;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setRouteMapId(String routeMapId) {
            this.routeMapId = routeMapId;
            return this;
        }
        public String getRouteMapId() {
            return this.routeMapId;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setRouteTypes(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes routeTypes) {
            this.routeTypes = routeTypes;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes getRouteTypes() {
            return this.routeTypes;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setSourceChildInstanceTypes(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes sourceChildInstanceTypes) {
            this.sourceChildInstanceTypes = sourceChildInstanceTypes;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes getSourceChildInstanceTypes() {
            return this.sourceChildInstanceTypes;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setSourceInstanceIds(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds sourceInstanceIds) {
            this.sourceInstanceIds = sourceInstanceIds;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds getSourceInstanceIds() {
            return this.sourceInstanceIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setSourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
            this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
            return this;
        }
        public Boolean getSourceInstanceIdsReverseMatch() {
            return this.sourceInstanceIdsReverseMatch;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setSourceRegionIds(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds sourceRegionIds) {
            this.sourceRegionIds = sourceRegionIds;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds getSourceRegionIds() {
            return this.sourceRegionIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setSourceRouteTableIds(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds sourceRouteTableIds) {
            this.sourceRouteTableIds = sourceRouteTableIds;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds getSourceRouteTableIds() {
            return this.sourceRouteTableIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setTransitRouterRouteTableId(String transitRouterRouteTableId) {
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }
        public String getTransitRouterRouteTableId() {
            return this.transitRouterRouteTableId;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setTransmitDirection(String transmitDirection) {
            this.transmitDirection = transmitDirection;
            return this;
        }
        public String getTransmitDirection() {
            return this.transmitDirection;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMaps extends TeaModel {
        @NameInMap("RouteMap")
        public java.util.List<DescribeCenRouteMapsResponseBodyRouteMapsRouteMap> routeMap;

        public static DescribeCenRouteMapsResponseBodyRouteMaps build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMaps self = new DescribeCenRouteMapsResponseBodyRouteMaps();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setRouteMap(java.util.List<DescribeCenRouteMapsResponseBodyRouteMapsRouteMap> routeMap) {
            this.routeMap = routeMap;
            return this;
        }
        public java.util.List<DescribeCenRouteMapsResponseBodyRouteMapsRouteMap> getRouteMap() {
            return this.routeMap;
        }

    }

}
