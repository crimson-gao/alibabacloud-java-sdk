// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>75C127E6-76CD-59A7-B6E4-1CBBDC98F2EB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the baseline check policies.</p>
     */
    @NameInMap("Strategies")
    public java.util.List<DescribeStrategyResponseBodyStrategies> strategies;

    public static DescribeStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyResponseBody self = new DescribeStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStrategyResponseBody setStrategies(java.util.List<DescribeStrategyResponseBodyStrategies> strategies) {
        this.strategies = strategies;
        return this;
    }
    public java.util.List<DescribeStrategyResponseBodyStrategies> getStrategies() {
        return this.strategies;
    }

    public static class DescribeStrategyResponseBodyStrategiesConfigTargets extends TeaModel {
        /**
         * <p>Indicates whether the baseline check policy is applied to the asset group. Valid values:</p>
         * <ul>
         * <li><strong>add</strong>: The baseline check policy is applied to the asset group.</li>
         * <li><strong>del</strong>: the baseline check policy is not applied to the asset group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Flag")
        public String flag;

        /**
         * <p>The asset group ID or UUID of the asset to which the baseline check policy is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>10099713</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The condition by which the baseline check policy is applied to the asset. Valid values:</p>
         * <ul>
         * <li><strong>groupId</strong>: the ID of the asset group</li>
         * <li><strong>uuid</strong>: the UUID of the asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>groupId</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static DescribeStrategyResponseBodyStrategiesConfigTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeStrategyResponseBodyStrategiesConfigTargets self = new DescribeStrategyResponseBodyStrategiesConfigTargets();
            return TeaModel.build(map, self);
        }

        public DescribeStrategyResponseBodyStrategiesConfigTargets setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeStrategyResponseBodyStrategiesConfigTargets setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeStrategyResponseBodyStrategiesConfigTargets setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class DescribeStrategyResponseBodyStrategies extends TeaModel {
        /**
         * <p>The details of the assets to which the baseline check policy is applied.</p>
         */
        @NameInMap("ConfigTargets")
        public java.util.List<DescribeStrategyResponseBodyStrategiesConfigTargets> configTargets;

        /**
         * <p>The type of the baseline check policy. Valid values:</p>
         * <ul>
         * <li><strong>common</strong></li>
         * <li><strong>custom</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("CustomType")
        public String customType;

        /**
         * <p>The cycle of the baseline check. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: every 2 days</li>
         * <li><strong>3</strong>: every 4 days</li>
         * <li><strong>7</strong>: every 8 days</li>
         * <li>30: every 31 days</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CycleDays")
        public Integer cycleDays;

        /**
         * <p>The time when the baseline check starts. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The baseline check starts within the time range from 00:00 to 06:00.</li>
         * <li><strong>6</strong>: The baseline check starts within the time range from 06:00 to 12:00.</li>
         * <li><strong>12</strong>: The baseline check starts within the time range from 12:00 to 18:00.</li>
         * <li><strong>18</strong>: The baseline check starts within the time range from 18:00 to 24:00.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CycleStartTime")
        public Integer cycleStartTime;

        /**
         * <p>The number of the assets to which the baseline check policy is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("EcsCount")
        public Integer ecsCount;

        /**
         * <p>The end time of the baseline check policy.</p>
         * 
         * <strong>example:</strong>
         * <p>03:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The status of the baseline check policy. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: not executed</li>
         * <li><strong>2</strong>: executing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecStatus")
        public Integer execStatus;

        /**
         * <p>The ID of the baseline check policy.</p>
         * 
         * <strong>example:</strong>
         * <p>8164248</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The name of the baseline check policy.</p>
         * 
         * <strong>example:</strong>
         * <p>text2</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The proportion of risky baselines in the baseline check result.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PassRate")
        public Integer passRate;

        /**
         * <p>The progress of the baseline check by using the baseline. This parameter is returned only if the value of the ExecStatus parameter is 2.</p>
         * 
         * <strong>example:</strong>
         * <p>50%</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of the assets on which the baseline check is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ProcessRate")
        public Integer processRate;

        /**
         * <p>The number of baseline check items in the baseline check policy.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("RiskCount")
        public Integer riskCount;

        /**
         * <p>The start time of the baseline check policy.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The source type of the baseline check policy. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: indicates a built-in policy provided and performed by Security Center by default.</li>
         * <li><strong>2</strong>: indicates a user-defined policy. It can be a standard or custom baseline check policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The time when the baseline check policy was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-07 10:46:43</p>
         */
        @NameInMap("UserModifyTime")
        public Long userModifyTime;

        public static DescribeStrategyResponseBodyStrategies build(java.util.Map<String, ?> map) throws Exception {
            DescribeStrategyResponseBodyStrategies self = new DescribeStrategyResponseBodyStrategies();
            return TeaModel.build(map, self);
        }

        public DescribeStrategyResponseBodyStrategies setConfigTargets(java.util.List<DescribeStrategyResponseBodyStrategiesConfigTargets> configTargets) {
            this.configTargets = configTargets;
            return this;
        }
        public java.util.List<DescribeStrategyResponseBodyStrategiesConfigTargets> getConfigTargets() {
            return this.configTargets;
        }

        public DescribeStrategyResponseBodyStrategies setCustomType(String customType) {
            this.customType = customType;
            return this;
        }
        public String getCustomType() {
            return this.customType;
        }

        public DescribeStrategyResponseBodyStrategies setCycleDays(Integer cycleDays) {
            this.cycleDays = cycleDays;
            return this;
        }
        public Integer getCycleDays() {
            return this.cycleDays;
        }

        public DescribeStrategyResponseBodyStrategies setCycleStartTime(Integer cycleStartTime) {
            this.cycleStartTime = cycleStartTime;
            return this;
        }
        public Integer getCycleStartTime() {
            return this.cycleStartTime;
        }

        public DescribeStrategyResponseBodyStrategies setEcsCount(Integer ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        public DescribeStrategyResponseBodyStrategies setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeStrategyResponseBodyStrategies setExecStatus(Integer execStatus) {
            this.execStatus = execStatus;
            return this;
        }
        public Integer getExecStatus() {
            return this.execStatus;
        }

        public DescribeStrategyResponseBodyStrategies setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeStrategyResponseBodyStrategies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeStrategyResponseBodyStrategies setPassRate(Integer passRate) {
            this.passRate = passRate;
            return this;
        }
        public Integer getPassRate() {
            return this.passRate;
        }

        public DescribeStrategyResponseBodyStrategies setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeStrategyResponseBodyStrategies setProcessRate(Integer processRate) {
            this.processRate = processRate;
            return this;
        }
        public Integer getProcessRate() {
            return this.processRate;
        }

        public DescribeStrategyResponseBodyStrategies setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public DescribeStrategyResponseBodyStrategies setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeStrategyResponseBodyStrategies setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeStrategyResponseBodyStrategies setUserModifyTime(Long userModifyTime) {
            this.userModifyTime = userModifyTime;
            return this;
        }
        public Long getUserModifyTime() {
            return this.userModifyTime;
        }

    }

}
