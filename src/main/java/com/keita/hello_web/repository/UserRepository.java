package com.keita.hello_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.keita.hello_web.User;

/**
 * ユーザーデータアクセスリポジトリ
 * Spring Data JPAを使用してデータベース操作を簡素化
 * 
 * 主な機能:
 * - ユーザーの作成・読み取り・更新・削除（CRUD操作）
 * - JpaRepositoryから継承した豊富なメソッド
 * - 自動的なクエリ生成機能
 * 
 * 利用可能なメソッド例:
 * - save(): ユーザー保存・更新
 * - findAll(): 全ユーザー取得
 * - findById(): ID検索
 * - delete(): ユーザー削除
 * - count(): ユーザー数カウント
 * 
 * @author けいた
 * @version 1.0
 * @since 2025-07
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // JpaRepositoryから豊富なメソッドを継承
    // カスタムクエリが必要な場合はここに追加

    /**
     * 将来的な拡張例:
     * 
     * // 名前で検索
     * List<User> findByName(String name);
     * 
     * // 年齢範囲で検索
     * List<User> findByAgeBetween(Integer minAge, Integer maxAge);
     * 
     * // 名前の部分一致検索
     * List<User> findByNameContaining(String keyword);
     */
}