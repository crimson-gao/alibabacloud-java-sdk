// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ModifyCopilotEmbedConfigRequest extends TeaModel {
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccd3428c-dd2xxxxxxxxxxxxdffee</p>
     */
    @NameInMap("CopilotId")
    public String copilotId;

    /**
     * <strong>example:</strong>
     * <p>Map&lt;String,Object&gt; data=new HashMap&lt;&gt;();
     *         data.put(&quot;allTheme&quot;,true);
     *         //data.put(&quot;allCube&quot;,true);
     *         //data.put(&quot;themes&quot;,Lists.newArrayList(&quot;1111&quot;,&quot;22222&quot;));
     *         //data.put(&quot;llmCubes&quot;,Lists.newArrayList(&quot;33333&quot;,&quot;44444&quot;));
     *         request.setDataRange(JSON.toJSONString(data));</p>
     */
    @NameInMap("DataRange")
    public String dataRange;

    @NameInMap("ModuleName")
    public String moduleName;

    public static ModifyCopilotEmbedConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCopilotEmbedConfigRequest self = new ModifyCopilotEmbedConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCopilotEmbedConfigRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public ModifyCopilotEmbedConfigRequest setCopilotId(String copilotId) {
        this.copilotId = copilotId;
        return this;
    }
    public String getCopilotId() {
        return this.copilotId;
    }

    public ModifyCopilotEmbedConfigRequest setDataRange(String dataRange) {
        this.dataRange = dataRange;
        return this;
    }
    public String getDataRange() {
        return this.dataRange;
    }

    public ModifyCopilotEmbedConfigRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
