package com.keita.hello_web;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

/**
 * ユーザーエンティティクラス
 * MySQLデータベースのusersテーブルにマッピング
 * 
 * テーブル構造:
 * - id: 主キー（自動生成）
 * - name: ユーザー名（必須）
 * - age: 年齢（必須）
 * 
 * @author けいた
 * @version 1.0
 * @since 2025-07
 */
@Entity
@Table(name = "users")
public class User {

    /**
     * ユーザーID（主キー）
     * データベースで自動生成される
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ユーザー名
     * 必須項目
     */
    @Column(nullable = false)
    private String name;

    /**
     * ユーザーの年齢
     * 必須項目
     */
    @Column(nullable = false)
    private Integer age;

    /**
     * デフォルトコンストラクタ
     * JPAで必要
     */
    public User() {
    }

    /**
     * ユーザー作成用コンストラクタ
     * 
     * @param name ユーザー名
     * @param age  年齢
     */
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * ユーザーIDを取得
     * 
     * @return ユーザーID
     */
    public Long getId() {
        return id;
    }

    /**
     * ユーザーIDを設定
     * 
     * @param id ユーザーID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ユーザー名を取得
     * 
     * @return ユーザー名
     */
    public String getName() {
        return name;
    }

    /**
     * ユーザー名を設定
     * 
     * @param name ユーザー名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 年齢を取得
     * 
     * @return 年齢
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 年齢を設定
     * 
     * @param age 年齢
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * オブジェクトの文字列表現
     * 
     * @return ユーザー情報の文字列
     */
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}