/**
 * @(#)FunctionInfo.java, 2018年06月29日.
 */
package com.g4seek.minifc.admin.po;

import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * 函数信息
 *
 * @author hzlvzimin
 */
@Table("TB_MINIFC_FUNCTION_INFO")
public class FunctionInfo {

    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 服务名称
     */
    private String serviceName;

    /**
     * 函数名称
     */
    private String functionName;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 运行环境
     */
    private String execEnviroment;

    /**
     * 函数入口
     */
    private String functionEntrance;

    /**
     * 函数版本
     */
    private Integer functionVersion;

    /**
     * 函数源代码
     */
    private String sourceCode;

    /**
     * 上传的文件路径
     */
    private String uploadFilePath;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新时间
     */
    private Long updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExecEnviroment() {
        return execEnviroment;
    }

    public void setExecEnviroment(String execEnviroment) {
        this.execEnviroment = execEnviroment;
    }

    public String getFunctionEntrance() {
        return functionEntrance;
    }

    public void setFunctionEntrance(String functionEntrance) {
        this.functionEntrance = functionEntrance;
    }

    public Integer getFunctionVersion() {
        return functionVersion;
    }

    public void setFunctionVersion(Integer functionVersion) {
        this.functionVersion = functionVersion;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getUploadFilePath() {
        return uploadFilePath;
    }

    public void setUploadFilePath(String uploadFilePath) {
        this.uploadFilePath = uploadFilePath;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
