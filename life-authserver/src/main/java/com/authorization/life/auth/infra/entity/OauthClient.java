package com.authorization.life.auth.infra.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * oauth客户端表
 *
 * @author code@code.com
 * @date 2022-02-21 20:21:01
 */
@Setter
@Getter
@NoArgsConstructor
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@TableName("lifetime_oauth_client")
public class OauthClient implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * oauth客户端表主键
     */
    @TableId
    private Long oauthClientId;
    /**
     * 客户端域名
     */
    private String domainName;
    /**
     * 客户端ID
     */
    private String clientId;
    /**
     * 客户端密钥
     */
    private String clientSecret;
    /**
     * 授权类型
     */
    private String grantTypes;
    /**
     * 授权域
     */
    private String scopes;
    /**
     * 重定向地址
     */
    private String redirectUri;
    /**
     * 访问授权超时时间
     */
    private Integer accessTokenTimeout;
    /**
     * 刷新授权超时时间
     */
    private Integer refreshTokenTimeout;
    /**
     * 附加信息
     */
    private String additionalInformation;
    /**
     * 租户ID
     */
    private Long tenantId;
    /**
     * 创建用户
     */
    private Long createdByUser;
    /**
     * 创建员工
     */
    private Long createdByEmp;
    /**
     * 创建时间
     */
    private LocalDateTime createdTime;
    /**
     * 最后更新用户
     */
    private Long updatedByUser;
    /**
     * 最后更新员工
     */
    private Long updatedByEmp;
    /**
     * 最后更新时间
     */
    private LocalDateTime updatedTime;

}
