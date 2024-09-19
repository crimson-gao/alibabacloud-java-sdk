// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListNodesResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>2197B9C4-39CE-55EA-8EEA-FDBAE52DXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesResponseBody self = new ListNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesResponseBody setPagingInfo(ListNodesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListNodesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNodesResponseBodyPagingInfoNodesDataSource extends TeaModel {
        /**
         * <p>数据源名称</p>
         * 
         * <strong>example:</strong>
         * <p>odps_first</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>数据源类型</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListNodesResponseBodyPagingInfoNodesDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesDataSource self = new ListNodesResponseBodyPagingInfoNodesDataSource();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNodesResponseBodyPagingInfoNodesDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodesInputsNodeOutputs extends TeaModel {
        /**
         * <p>节点输出</p>
         * 
         * <strong>example:</strong>
         * <p>623731286945488XXXX</p>
         */
        @NameInMap("Data")
        public String data;

        public static ListNodesResponseBodyPagingInfoNodesInputsNodeOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesInputsNodeOutputs self = new ListNodesResponseBodyPagingInfoNodesInputsNodeOutputs();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesInputsNodeOutputs setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodesInputsTables extends TeaModel {
        /**
         * <p>表id</p>
         * 
         * <strong>example:</strong>
         * <p>odps.autotest.test_output_table_1</p>
         */
        @NameInMap("Guid")
        public String guid;

        public static ListNodesResponseBodyPagingInfoNodesInputsTables build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesInputsTables self = new ListNodesResponseBodyPagingInfoNodesInputsTables();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesInputsTables setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodesInputsVariablesNode extends TeaModel {
        /**
         * <p>节点输出</p>
         * 
         * <strong>example:</strong>
         * <p>623731286945488XXXX</p>
         */
        @NameInMap("Output")
        public String output;

        public static ListNodesResponseBodyPagingInfoNodesInputsVariablesNode build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesInputsVariablesNode self = new ListNodesResponseBodyPagingInfoNodesInputsVariablesNode();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesInputsVariablesNode setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodesInputsVariables extends TeaModel {
        /**
         * <p>制品类型</p>
         * 
         * <strong>example:</strong>
         * <p>Variable</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>变量id</p>
         * 
         * <strong>example:</strong>
         * <p>543211286945488XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>变量名</p>
         * 
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>变量所属节点</p>
         */
        @NameInMap("Node")
        public ListNodesResponseBodyPagingInfoNodesInputsVariablesNode node;

        /**
         * <p>范围</p>
         * 
         * <strong>example:</strong>
         * <p>NodeParameter</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>类型</p>
         * 
         * <strong>example:</strong>
         * <p>Constant</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>变量值</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListNodesResponseBodyPagingInfoNodesInputsVariables build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesInputsVariables self = new ListNodesResponseBodyPagingInfoNodesInputsVariables();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesInputsVariables setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public ListNodesResponseBodyPagingInfoNodesInputsVariables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesResponseBodyPagingInfoNodesInputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNodesResponseBodyPagingInfoNodesInputsVariables setNode(ListNodesResponseBodyPagingInfoNodesInputsVariablesNode node) {
            this.node = node;
            return this;
        }
        public ListNodesResponseBodyPagingInfoNodesInputsVariablesNode getNode() {
            return this.node;
        }

        public ListNodesResponseBodyPagingInfoNodesInputsVariables setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListNodesResponseBodyPagingInfoNodesInputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListNodesResponseBodyPagingInfoNodesInputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodesInputs extends TeaModel {
        /**
         * <p>节点输出列表</p>
         */
        @NameInMap("NodeOutputs")
        public java.util.List<ListNodesResponseBodyPagingInfoNodesInputsNodeOutputs> nodeOutputs;

        /**
         * <p>表列表</p>
         */
        @NameInMap("Tables")
        public java.util.List<ListNodesResponseBodyPagingInfoNodesInputsTables> tables;

        /**
         * <p>变量列表</p>
         */
        @NameInMap("Variables")
        public java.util.List<ListNodesResponseBodyPagingInfoNodesInputsVariables> variables;

        public static ListNodesResponseBodyPagingInfoNodesInputs build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesInputs self = new ListNodesResponseBodyPagingInfoNodesInputs();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesInputs setNodeOutputs(java.util.List<ListNodesResponseBodyPagingInfoNodesInputsNodeOutputs> nodeOutputs) {
            this.nodeOutputs = nodeOutputs;
            return this;
        }
        public java.util.List<ListNodesResponseBodyPagingInfoNodesInputsNodeOutputs> getNodeOutputs() {
            return this.nodeOutputs;
        }

        public ListNodesResponseBodyPagingInfoNodesInputs setTables(java.util.List<ListNodesResponseBodyPagingInfoNodesInputsTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<ListNodesResponseBodyPagingInfoNodesInputsTables> getTables() {
            return this.tables;
        }

        public ListNodesResponseBodyPagingInfoNodesInputs setVariables(java.util.List<ListNodesResponseBodyPagingInfoNodesInputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ListNodesResponseBodyPagingInfoNodesInputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodesOutputsNodeOutputs extends TeaModel {
        /**
         * <p>节点输出</p>
         * 
         * <strong>example:</strong>
         * <p>860438872620113XXXX</p>
         */
        @NameInMap("Data")
        public String data;

        public static ListNodesResponseBodyPagingInfoNodesOutputsNodeOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesOutputsNodeOutputs self = new ListNodesResponseBodyPagingInfoNodesOutputsNodeOutputs();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesOutputsNodeOutputs setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodesOutputsTables extends TeaModel {
        /**
         * <p>表id</p>
         * 
         * <strong>example:</strong>
         * <p>odps.autotest.test_output_table_1</p>
         */
        @NameInMap("Guid")
        public String guid;

        public static ListNodesResponseBodyPagingInfoNodesOutputsTables build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesOutputsTables self = new ListNodesResponseBodyPagingInfoNodesOutputsTables();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesOutputsTables setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodesOutputsVariablesNode extends TeaModel {
        /**
         * <p>节点输出</p>
         * 
         * <strong>example:</strong>
         * <p>860438872620113XXXX</p>
         */
        @NameInMap("Output")
        public String output;

        public static ListNodesResponseBodyPagingInfoNodesOutputsVariablesNode build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesOutputsVariablesNode self = new ListNodesResponseBodyPagingInfoNodesOutputsVariablesNode();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesOutputsVariablesNode setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodesOutputsVariables extends TeaModel {
        /**
         * <p>制品类型</p>
         * 
         * <strong>example:</strong>
         * <p>Variable</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>变量id</p>
         * 
         * <strong>example:</strong>
         * <p>623731286945488XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>变量名</p>
         * 
         * <strong>example:</strong>
         * <p>output</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>变量所属节点</p>
         */
        @NameInMap("Node")
        public ListNodesResponseBodyPagingInfoNodesOutputsVariablesNode node;

        /**
         * <p>范围</p>
         * 
         * <strong>example:</strong>
         * <p>NodeParameter</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>类型</p>
         * 
         * <strong>example:</strong>
         * <p>Constant</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>变量值</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListNodesResponseBodyPagingInfoNodesOutputsVariables build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesOutputsVariables self = new ListNodesResponseBodyPagingInfoNodesOutputsVariables();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesOutputsVariables setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public ListNodesResponseBodyPagingInfoNodesOutputsVariables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesResponseBodyPagingInfoNodesOutputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNodesResponseBodyPagingInfoNodesOutputsVariables setNode(ListNodesResponseBodyPagingInfoNodesOutputsVariablesNode node) {
            this.node = node;
            return this;
        }
        public ListNodesResponseBodyPagingInfoNodesOutputsVariablesNode getNode() {
            return this.node;
        }

        public ListNodesResponseBodyPagingInfoNodesOutputsVariables setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListNodesResponseBodyPagingInfoNodesOutputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListNodesResponseBodyPagingInfoNodesOutputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodesOutputs extends TeaModel {
        /**
         * <p>节点输出列表</p>
         */
        @NameInMap("NodeOutputs")
        public java.util.List<ListNodesResponseBodyPagingInfoNodesOutputsNodeOutputs> nodeOutputs;

        /**
         * <p>表列表</p>
         */
        @NameInMap("Tables")
        public java.util.List<ListNodesResponseBodyPagingInfoNodesOutputsTables> tables;

        /**
         * <p>变量列表</p>
         */
        @NameInMap("Variables")
        public java.util.List<ListNodesResponseBodyPagingInfoNodesOutputsVariables> variables;

        public static ListNodesResponseBodyPagingInfoNodesOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesOutputs self = new ListNodesResponseBodyPagingInfoNodesOutputs();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesOutputs setNodeOutputs(java.util.List<ListNodesResponseBodyPagingInfoNodesOutputsNodeOutputs> nodeOutputs) {
            this.nodeOutputs = nodeOutputs;
            return this;
        }
        public java.util.List<ListNodesResponseBodyPagingInfoNodesOutputsNodeOutputs> getNodeOutputs() {
            return this.nodeOutputs;
        }

        public ListNodesResponseBodyPagingInfoNodesOutputs setTables(java.util.List<ListNodesResponseBodyPagingInfoNodesOutputsTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<ListNodesResponseBodyPagingInfoNodesOutputsTables> getTables() {
            return this.tables;
        }

        public ListNodesResponseBodyPagingInfoNodesOutputs setVariables(java.util.List<ListNodesResponseBodyPagingInfoNodesOutputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ListNodesResponseBodyPagingInfoNodesOutputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodesRuntimeResource extends TeaModel {
        /**
         * <p>资源组id</p>
         * 
         * <strong>example:</strong>
         * <p>S_resgrop_xxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListNodesResponseBodyPagingInfoNodesRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesRuntimeResource self = new ListNodesResponseBodyPagingInfoNodesRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodesScriptRuntime extends TeaModel {
        /**
         * <p>脚本所属类型</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("Command")
        public String command;

        public static ListNodesResponseBodyPagingInfoNodesScriptRuntime build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesScriptRuntime self = new ListNodesResponseBodyPagingInfoNodesScriptRuntime();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesScriptRuntime setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodesScript extends TeaModel {
        /**
         * <p>脚本的id</p>
         * 
         * <strong>example:</strong>
         * <p>853573334108680XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>脚本路径</p>
         * 
         * <strong>example:</strong>
         * <p>root/demo</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>脚本的运行时信息</p>
         */
        @NameInMap("Runtime")
        public ListNodesResponseBodyPagingInfoNodesScriptRuntime runtime;

        public static ListNodesResponseBodyPagingInfoNodesScript build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesScript self = new ListNodesResponseBodyPagingInfoNodesScript();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesScript setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesResponseBodyPagingInfoNodesScript setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListNodesResponseBodyPagingInfoNodesScript setRuntime(ListNodesResponseBodyPagingInfoNodesScriptRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public ListNodesResponseBodyPagingInfoNodesScriptRuntime getRuntime() {
            return this.runtime;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodesStrategy extends TeaModel {
        /**
         * <p>生成实例的模式</p>
         * 
         * <strong>example:</strong>
         * <p>T+1</p>
         */
        @NameInMap("InstanceMode")
        public String instanceMode;

        /**
         * <p>重试时间间隔</p>
         * 
         * <strong>example:</strong>
         * <p>180000</p>
         */
        @NameInMap("RerunInterval")
        public Integer rerunInterval;

        /**
         * <p>允许重跑的模式</p>
         * 
         * <strong>example:</strong>
         * <p>Allowed</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>重试次数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RerunTimes")
        public Integer rerunTimes;

        /**
         * <p>超时时间</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static ListNodesResponseBodyPagingInfoNodesStrategy build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesStrategy self = new ListNodesResponseBodyPagingInfoNodesStrategy();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesStrategy setInstanceMode(String instanceMode) {
            this.instanceMode = instanceMode;
            return this;
        }
        public String getInstanceMode() {
            return this.instanceMode;
        }

        public ListNodesResponseBodyPagingInfoNodesStrategy setRerunInterval(Integer rerunInterval) {
            this.rerunInterval = rerunInterval;
            return this;
        }
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        public ListNodesResponseBodyPagingInfoNodesStrategy setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public ListNodesResponseBodyPagingInfoNodesStrategy setRerunTimes(Integer rerunTimes) {
            this.rerunTimes = rerunTimes;
            return this;
        }
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        public ListNodesResponseBodyPagingInfoNodesStrategy setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodesTags extends TeaModel {
        /**
         * <p>标签键</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>标签值</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListNodesResponseBodyPagingInfoNodesTags build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesTags self = new ListNodesResponseBodyPagingInfoNodesTags();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListNodesResponseBodyPagingInfoNodesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodesTrigger extends TeaModel {
        /**
         * <p>触发器的cron表达式</p>
         * 
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>结束时间，格式为yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>9999-01-01 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>触发器id</p>
         * 
         * <strong>example:</strong>
         * <p>543680677872062XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>开始时间，格式为yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>1970-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>时区</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <p>触发器类型</p>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListNodesResponseBodyPagingInfoNodesTrigger build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodesTrigger self = new ListNodesResponseBodyPagingInfoNodesTrigger();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodesTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public ListNodesResponseBodyPagingInfoNodesTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListNodesResponseBodyPagingInfoNodesTrigger setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesResponseBodyPagingInfoNodesTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListNodesResponseBodyPagingInfoNodesTrigger setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ListNodesResponseBodyPagingInfoNodesTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListNodesResponseBodyPagingInfoNodes extends TeaModel {
        /**
         * <p>节点的创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1722910655000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>数据源信息</p>
         */
        @NameInMap("DataSource")
        public ListNodesResponseBodyPagingInfoNodesDataSource dataSource;

        /**
         * <p>描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>860438872620113XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>节点输入</p>
         */
        @NameInMap("Inputs")
        public ListNodesResponseBodyPagingInfoNodesInputs inputs;

        /**
         * <p>属性修改时间</p>
         * 
         * <strong>example:</strong>
         * <p>1722910655000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>节点名</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>节点输出</p>
         */
        @NameInMap("Outputs")
        public ListNodesResponseBodyPagingInfoNodesOutputs outputs;

        /**
         * <p>节点的责任人</p>
         * 
         * <strong>example:</strong>
         * <p>110755000425XXXX</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>33233</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Recurrence")
        public String recurrence;

        /**
         * <p>资源组信息</p>
         */
        @NameInMap("RuntimeResource")
        public ListNodesResponseBodyPagingInfoNodesRuntimeResource runtimeResource;

        /**
         * <p>工作流的脚本信息</p>
         */
        @NameInMap("Script")
        public ListNodesResponseBodyPagingInfoNodesScript script;

        /**
         * <p>调度策略</p>
         */
        @NameInMap("Strategy")
        public ListNodesResponseBodyPagingInfoNodesStrategy strategy;

        /**
         * <p>标签信息</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListNodesResponseBodyPagingInfoNodesTags> tags;

        /**
         * <p>调度任务Id</p>
         * 
         * <strong>example:</strong>
         * <p>88888888888</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>触发器信息</p>
         */
        @NameInMap("Trigger")
        public ListNodesResponseBodyPagingInfoNodesTrigger trigger;

        public static ListNodesResponseBodyPagingInfoNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfoNodes self = new ListNodesResponseBodyPagingInfoNodes();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfoNodes setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNodesResponseBodyPagingInfoNodes setDataSource(ListNodesResponseBodyPagingInfoNodesDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ListNodesResponseBodyPagingInfoNodesDataSource getDataSource() {
            return this.dataSource;
        }

        public ListNodesResponseBodyPagingInfoNodes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNodesResponseBodyPagingInfoNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesResponseBodyPagingInfoNodes setInputs(ListNodesResponseBodyPagingInfoNodesInputs inputs) {
            this.inputs = inputs;
            return this;
        }
        public ListNodesResponseBodyPagingInfoNodesInputs getInputs() {
            return this.inputs;
        }

        public ListNodesResponseBodyPagingInfoNodes setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListNodesResponseBodyPagingInfoNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNodesResponseBodyPagingInfoNodes setOutputs(ListNodesResponseBodyPagingInfoNodesOutputs outputs) {
            this.outputs = outputs;
            return this;
        }
        public ListNodesResponseBodyPagingInfoNodesOutputs getOutputs() {
            return this.outputs;
        }

        public ListNodesResponseBodyPagingInfoNodes setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListNodesResponseBodyPagingInfoNodes setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListNodesResponseBodyPagingInfoNodes setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public ListNodesResponseBodyPagingInfoNodes setRuntimeResource(ListNodesResponseBodyPagingInfoNodesRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListNodesResponseBodyPagingInfoNodesRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ListNodesResponseBodyPagingInfoNodes setScript(ListNodesResponseBodyPagingInfoNodesScript script) {
            this.script = script;
            return this;
        }
        public ListNodesResponseBodyPagingInfoNodesScript getScript() {
            return this.script;
        }

        public ListNodesResponseBodyPagingInfoNodes setStrategy(ListNodesResponseBodyPagingInfoNodesStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public ListNodesResponseBodyPagingInfoNodesStrategy getStrategy() {
            return this.strategy;
        }

        public ListNodesResponseBodyPagingInfoNodes setTags(java.util.List<ListNodesResponseBodyPagingInfoNodesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListNodesResponseBodyPagingInfoNodesTags> getTags() {
            return this.tags;
        }

        public ListNodesResponseBodyPagingInfoNodes setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListNodesResponseBodyPagingInfoNodes setTrigger(ListNodesResponseBodyPagingInfoNodesTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public ListNodesResponseBodyPagingInfoNodesTrigger getTrigger() {
            return this.trigger;
        }

    }

    public static class ListNodesResponseBodyPagingInfo extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<ListNodesResponseBodyPagingInfoNodes> nodes;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        public static ListNodesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPagingInfo self = new ListNodesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPagingInfo setNodes(java.util.List<ListNodesResponseBodyPagingInfoNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ListNodesResponseBodyPagingInfoNodes> getNodes() {
            return this.nodes;
        }

        public ListNodesResponseBodyPagingInfo setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListNodesResponseBodyPagingInfo setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListNodesResponseBodyPagingInfo setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
