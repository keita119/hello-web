# 🌟 ユーザー管理システム

**Spring Boot + MySQL で構築したモダン Web アプリケーション**

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.12-brightgreen)
![Java](https://img.shields.io/badge/Java-21-orange)
![MySQL](https://img.shields.io/badge/MySQL-9.3-blue)
![Bootstrap](https://img.shields.io/badge/Bootstrap-5-purple)

## 📋 プロジェクト概要

30 代のプロフェッショナル向けに設計された、洗練されたユーザー管理システムです。  
モダンな UI/UX と堅牢なバックエンド技術を組み合わせ、実用的な Web アプリケーションを実現しています。

### ✨ 主な特徴

- **🎨 30 代向けプロフェッショナルデザイン** - 洗練されたモダン UI
- **📱 完全レスポンシブ対応** - モバイル・タブレット・PC 対応
- **🗄️ MySQL 統合** - 本格的なデータベース連携
- **🚀 高性能** - Spring Boot による高速動作
- **🔒 セキュア** - Spring Security ベースの安全設計

## 🛠️ 技術スタック

### バックエンド

- **Java 21** - 最新の Java LTS 版
- **Spring Boot 3.3.12** - エンタープライズフレームワーク
- **Spring Data JPA** - データアクセス層
- **MySQL 9.3** - リレーショナルデータベース

### フロントエンド

- **Thymeleaf** - サーバーサイドテンプレート
- **Bootstrap 5** - レスポンシブ UI フレームワーク
- **HTML5/CSS3** - モダン Web 標準
- **JavaScript** - インタラクティブ機能

### 開発環境

- **Maven** - プロジェクト管理
- **Git** - バージョン管理
- **VS Code/Eclipse** - 統合開発環境

## 🚀 クイックスタート

### 前提条件

- Java 21 以上
- MySQL 9.3 以上
- Maven 3.6 以上

### 1. リポジトリのクローン

```bash
git clone https://github.com/keita119/hello-web.git
cd hello-web
```

### 2. データベース設定

MySQL で新しいデータベースを作成：

```sql
CREATE DATABASE hello_web_db;
```

### 3. アプリケーション設定

`src/main/resources/application.properties` で以下を設定：

```properties
spring.datasource.username=あなたのユーザー名
spring.datasource.password=あなたのパスワード
```

### 4. アプリケーション起動

```bash
./mvnw spring-boot:run
```

### 5. ブラウザでアクセス

http://localhost:8081

## 📱 機能一覧

### 🏠 ホームページ

- プロフェッショナルなランディングページ
- 技術スタック表示
- プロジェクト概要紹介

### 👤 ユーザー管理

- **ユーザー登録** - 美しいフォームデザイン
- **ユーザー一覧** - カード形式の見やすい表示
- **データ永続化** - MySQL での確実な保存

### 🎨 UI/UX 特徴

- 30 代向けの洗練されたデザイン
- ホバーエフェクト・アニメーション
- 直感的なナビゲーション
- 統一されたブランドカラー

## 🗂️ プロジェクト構成

```
hello-web/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/keita/hello_web/
│   │   │       ├── HelloWebApplication.java    # メインクラス
│   │   │       ├── HelloController.java        # コントローラー
│   │   │       ├── User.java                   # エンティティ
│   │   │       └── repository/
│   │   │           └── UserRepository.java     # リポジトリ
│   │   └── resources/
│   │       ├── templates/                      # Thymeleafテンプレート
│   │       │   ├── index.html                  # ホームページ
│   │       │   ├── user-form.html             # 登録フォーム
│   │       │   └── user-list.html             # ユーザー一覧
│   │       └── application.properties          # 設定ファイル
├── pom.xml                                     # Maven設定
└── README.md                                   # このファイル
```

## 📸 スクリーンショット

### ホームページ

![ホームページ](./screenshots/home.png)

### ユーザー登録

![ユーザー登録](./screenshots/register.png)

### ユーザー一覧

![ユーザー一覧](./screenshots/list.png)

## 🔧 開発者向け情報

### ローカル開発

```bash
# 開発モードで起動（ホットリロード有効）
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev

# テスト実行
./mvnw test

# パッケージ作成
./mvnw clean package
```

### API エンドポイント

- `GET /` - ホームページ
- `GET /users` - ユーザー登録フォーム
- `POST /users` - ユーザー作成
- `GET /users/list` - ユーザー一覧ページ
- `GET /user/list` - ユーザー一覧 API（JSON）

## 🚦 本番環境対応

### 設定変更例

```properties
# 本番環境用設定
spring.jpa.hibernate.ddl-auto=validate
spring.jpa.show-sql=false
logging.level.org.hibernate.SQL=WARN

# 環境変数使用
spring.datasource.password=${DB_PASSWORD}
```

## 🤝 コントリビューション

1. このリポジトリをフォーク
2. 機能ブランチを作成 (`git checkout -b feature/amazing-feature`)
3. 変更をコミット (`git commit -m 'Add amazing feature'`)
4. ブランチをプッシュ (`git push origin feature/amazing-feature`)
5. プルリクエストを開く

## 📄 ライセンス

このプロジェクトは MIT ライセンスの下で公開されています。詳細は[LICENSE](LICENSE)ファイルを参照してください。

## 👨‍💻 作者

**けいた**

- GitHub: [@keita119](https://github.com/keita119)

## 🙏 謝辞

- Spring Boot チームの素晴らしいフレームワーク
- Bootstrap チームの美しい UI コンポーネント
- オープンソースコミュニティの皆様

---

⭐ このプロジェクトが役に立った場合は、スターをつけていただけると嬉しいです！
