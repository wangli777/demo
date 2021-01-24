package com.leenow.demo.model.entity.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import com.leenow.demo.model.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author: LeeNow WangLi 
 * @date: 2021/1/24 16:44
 * @description:
 */

/**
 * 用户信息表
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "`user`")
public class User extends BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    @TableField(value = "username")
    private String username;

    @TableField(value = "`password`")
    private String password;

    @TableField(value = "nickname")
    private String nickname;

    @TableField(value = "email")
    private String email;
}