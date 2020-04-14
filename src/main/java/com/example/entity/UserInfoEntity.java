package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * User: Administrator
 * Date: 2020/4/7
 * Time: 16:03
 * Desc:
 */

@TableName("user_info") // mapping to the table of dbms.
public class UserInfoEntity {

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 技能
     */
    private String skill;
    /**
     * 评价
     */
    private String evaluate;
    /**
     * 分数
     */
    private Long fraction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public Long getFraction() {
        return fraction;
    }

    public void setFraction(Long fraction) {
        this.fraction = fraction;
    }

    @Override
    public String toString() {
        return "UserInfoEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", skill='" + skill + '\'' +
                ", evaluate='" + evaluate + '\'' +
                ", fraction=" + fraction +
                '}';
    }
}
