package com.keita.hello_web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import com.keita.hello_web.repository.UserRepository;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

/**
 * メインコントローラークラス
 * Webアプリケーションのリクエスト処理を担当
 * 
 * 主な機能:
 * - トップページ表示
 * - ユーザー登録・一覧表示
 * - API エンドポイント提供
 * - CRUD操作のWebインターフェース
 * 
 * @author けいた
 * @version 1.0
 * @since 2025-07
 */
@Controller
public class HelloController {

    /**
     * ユーザーデータのリポジトリ
     * データベース操作を担当
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * トップページ表示
     * 30代向けプロフェッショナルデザインのホームページ
     * 
     * @return index.html テンプレート
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }

    /**
     * シンプル版テストページ
     * 開発初期のテスト用エンドポイント
     * 
     * @return シンプルなテキストメッセージ
     */
    @GetMapping("/simple")
    public String simple() {
        return "Hello けいた君〜♪ シンプル版";
    }

    /**
     * ユーザー作成テスト用API
     * 開発・デバッグ用のテストエンドポイント
     * 
     * @return 保存完了メッセージ
     */
    @GetMapping("/user/test")
    @ResponseBody
    public String userTest() {
        User user = new User();
        user.setName("けいた君");
        user.setAge(34);

        userRepository.save(user);

        return "ユーザーを保存完了！";
    }

    /**
     * ユーザー一覧取得API
     * JSON形式でユーザー一覧を返す
     * 
     * @return 全ユーザーのリスト（JSON）
     */
    @GetMapping("/user/list")
    @ResponseBody
    public List<User> userList() {
        return userRepository.findAll();
    }

    /**
     * ユーザー更新テスト用API
     * ID=1のユーザーを更新する
     * 
     * @return 更新完了メッセージ
     */
    @GetMapping("/user/update")
    @ResponseBody
    public String userUpdate() {
        // ID=1のユーザーを検索
        User user = userRepository.findById(1L).orElse(null);

        if (user != null) {
            user.setName("けいた君(更新済み)");
            user.setAge(35);

            // 保存
            userRepository.save(user);

            return "ユーザーを更新完了！";
        } else {
            return "ユーザーが見つかりません";
        }
    }

    /**
     * ユーザー削除テスト用API
     * ID=1のユーザーを削除する
     * 
     * @return 削除完了メッセージ
     */
    @GetMapping("/user/delete")
    @ResponseBody
    public String userDelete() {
        User user = userRepository.findById(1L).orElse(null);

        if (user != null) {
            userRepository.delete(user);

            return "ユーザーを削除完了！";
        } else {
            return "削除対象のユーザーが見つかりません";
        }
    }

    /**
     * ユーザー登録フォーム表示
     * 30代向けモダンデザインの登録ページ
     * 
     * @return user-form.html テンプレート
     */
    @GetMapping("/users")
    public String userForm() {
        return "user-form";
    }

    /**
     * ユーザー登録処理
     * フォームから送信されたデータでユーザーを作成
     * 
     * @param name ユーザー名
     * @param age  年齢
     * @return ユーザー一覧ページへリダイレクト
     */
    @PostMapping("/users")
    public String createUser(@RequestParam String name, @RequestParam Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);

        userRepository.save(user);

        return "redirect:/users/list";
    }

    /**
     * ユーザー一覧ページ表示
     * 30代向けモダンデザインの一覧ページ
     * カード形式でユーザーを表示
     * 
     * @param model テンプレートにデータを渡すためのModel
     * @return user-list.html テンプレート
     */
    @GetMapping("/users/list")
    public String userListPage(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }
}