package com.authorization.utils.security;

import com.authorization.utils.json.JsonDateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Set;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDetail implements Serializable {

    /**
     * 匿名用户
     *
     * @return UserDetail
     */
    public static UserDetail anonymous() {
        UserDetail userDetail = new UserDetail();
        userDetail.setUserId("0");
        userDetail.setEmpId("0");
        userDetail.setTenantId("0");
        userDetail.setLocale(Locale.CHINA);
        userDetail.setAnonymousFlag(true);
        return userDetail;
    }

    /**
     * 系统用户
     *
     * @return UserDetail
     */
    public static UserDetail systemUser() {
        UserDetail userDetail = new UserDetail();
        userDetail.setUserId("-1");
        userDetail.setEmpId("-1");
        userDetail.setTenantId("0");
        userDetail.setLocale(Locale.CHINA);
        return userDetail;
    }

    /**
     * 匿名用户登录标识
     */
    private Boolean anonymousFlag = false;
    /**
     * 用户Id
     */
    private String userId;
    /**
     * 用户编码(登录名称)
     */
    private String username;
    /**
     * 用户姓名(显示名称)
     */
    private String realName;
    /**
     * 性别:1:男 2:女 3:未知
     */
    private Integer userGender;
    /**
     * 用户手机
     */
    private String userPhone;
    /**
     * 用户邮箱
     */
    private String userEmail;
    /**
     * 用户组, 目前包括TENANT_USER和OPS_USER
     */
    private Set<String> userGroups;
    /**
     * 生效开始日期
     */
    @JsonFormat(pattern = JsonDateUtil.DATETIME)
    @DateTimeFormat(pattern = JsonDateUtil.DATETIME)
    private LocalDateTime effectiveStartDate;
    /**
     * 生效截至日期
     */
    @JsonFormat(pattern = JsonDateUtil.DATETIME)
    @DateTimeFormat(pattern = JsonDateUtil.DATETIME)
    private LocalDateTime effectiveEndDate;
    /**
     * 用户是否启用
     */
    private boolean userEnabledFlag;
    /**
     * 用户是否锁定
     */
    private boolean userLockedFlag;
    /**
     * 用户是否激活
     */
    private boolean userActivedFlag;
    /**
     * 员工ID
     */
    private String empId;
    /**
     * 员工租户ID
     */
    private String tenantId;
    /**
     * 员工编码
     */
    private String empNum;
    /**
     * 员工姓名
     */
    private String empName;
    /**
     * 员工邮箱
     */
    private String empEmail;
    /**
     * 员工手机
     */
    private String empPhone;
    /**
     * 性别:1:男 2:女 3:未知
     */
    private Integer empGender;
    /**
     * 员工是否启用
     */
    private boolean empEnabledFlag;
    /**
     * 当前角色
     */
    private String currentRole;
    /**
     * 当前角色名称
     */
    private String currentRoleName;
    /**
     * 当前拥有角色集合
     */
    private Set<String> roles;
    /**
     * 语言
     */
    private String language;
    /**
     * 地区
     */
    private Locale locale;
    /**
     * 租户编码
     */
    private String tenantCode;
    /**
     * 租户名称
     */
    private String tenantName;
    /**
     * 当前用户使用token
     */
    private String token;
    /**
     * 用于从redis中获取相应的Jwt形式的accessToken
     */
    private String accessTokenId;
}
