// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyPrepayNamespaceSpecRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f-cn-wwo36qj4g06</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>di-593440219799842</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceSpec")
    public ModifyPrepayNamespaceSpecRequestResourceSpec resourceSpec;

    public static ModifyPrepayNamespaceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayNamespaceSpecRequest self = new ModifyPrepayNamespaceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayNamespaceSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPrepayNamespaceSpecRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ModifyPrepayNamespaceSpecRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ModifyPrepayNamespaceSpecRequest setResourceSpec(ModifyPrepayNamespaceSpecRequestResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public ModifyPrepayNamespaceSpecRequestResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    public static class ModifyPrepayNamespaceSpecRequestResourceSpec extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static ModifyPrepayNamespaceSpecRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            ModifyPrepayNamespaceSpecRequestResourceSpec self = new ModifyPrepayNamespaceSpecRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public ModifyPrepayNamespaceSpecRequestResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ModifyPrepayNamespaceSpecRequestResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

}
