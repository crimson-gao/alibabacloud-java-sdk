// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableThemeRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ThemeId")
    public Long themeId;

    public static DeleteTableThemeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableThemeRequest self = new DeleteTableThemeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTableThemeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteTableThemeRequest setThemeId(Long themeId) {
        this.themeId = themeId;
        return this;
    }
    public Long getThemeId() {
        return this.themeId;
    }

}
