package com.lhrsite.gmall.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
/**
    * 会员表
    */
@ApiModel(value="com-lhrsite-gmall-entity-Member")
@Data
@Builder
public class Member implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long memberLevelId;

    /**
    * 用户名
    */
    @ApiModelProperty(value="用户名")
    private String username;

    /**
    * 密码
    */
    @ApiModelProperty(value="密码")
    private String password;

    /**
    * 昵称
    */
    @ApiModelProperty(value="昵称")
    private String nickname;

    /**
    * 手机号码
    */
    @ApiModelProperty(value="手机号码")
    private String phone;

    /**
    * 帐号启用状态:0->禁用；1->启用
    */
    @ApiModelProperty(value="帐号启用状态:0->禁用；1->启用")
    private Integer status;

    /**
    * 注册时间
    */
    @ApiModelProperty(value="注册时间")
    private Date createTime;

    /**
    * 头像
    */
    @ApiModelProperty(value="头像")
    private String icon;

    /**
    * 性别：0->未知；1->男；2->女
    */
    @ApiModelProperty(value="性别：0->未知；1->男；2->女")
    private Integer gender;

    /**
    * 生日
    */
    @ApiModelProperty(value="生日")
    private Date birthday;

    /**
    * 所做城市
    */
    @ApiModelProperty(value="所做城市")
    private String city;

    /**
    * 职业
    */
    @ApiModelProperty(value="职业")
    private String job;

    /**
    * 个性签名
    */
    @ApiModelProperty(value="个性签名")
    private String personalizedSignature;

    /**
    * 用户来源
    */
    @ApiModelProperty(value="用户来源")
    private Integer sourceType;

    /**
    * 积分
    */
    @ApiModelProperty(value="积分")
    private Integer integration;

    /**
    * 成长值
    */
    @ApiModelProperty(value="成长值")
    private Integer growth;

    /**
    * 剩余抽奖次数
    */
    @ApiModelProperty(value="剩余抽奖次数")
    private Integer luckeyCount;

    /**
    * 历史积分数量
    */
    @ApiModelProperty(value="历史积分数量")
    private Integer historyIntegration;

    private static final long serialVersionUID = 1L;
}