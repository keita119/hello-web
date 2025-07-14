/**
 * けいた君のユーザー管理システム
 * Spring Boot + MySQL を使用したモダンWebアプリケーション
 * 
 * 主な機能:
 * - ユーザー登録・一覧表示
 * - レスポンシブWebデザイン
 * - 30代向けプロフェッショナルデザイン
 * 
 * 技術スタック:
 * - Java 21
 * - Spring Boot 3.3.12
 * - MySQL 9.3
 * - Bootstrap 5
 * - Thymeleaf
 * - HTML/CSS/JavaScript
 * 
 * @author けいた
 * @version 1.0
 * @since 2025-07
 */
package com.keita.hello_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Bootアプリケーションのメインクラス
 * アプリケーションのエントリーポイント
 */
@SpringBootApplication
public class HelloWebApplication {

	/**
	 * アプリケーションの開始メソッド
	 * 
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args) {
		SpringApplication.run(HelloWebApplication.class, args);
	}
}