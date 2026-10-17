# やまとダイワプログラミング生産性 | Yamato Daiwa Programming Productivity (YDPP)

[ライブテンプレート](https://www.jetbrains.com/ja-jp/help/idea/using-live-templates.html)や
  [ファイルテンプレート](https://www.jetbrains.com/ja-jp/help/idea/using-file-and-code-templates.html)や其の他のプログラミング生産性向
  上専用専用手段を含む[IntelliJ IDEAファミリー統合開発環境](https://www.jetbrains.com/ides/)専用のプラグイン。
[株式会社やまとダイワ](https://yamato-daiwa.com/)のノウハウとして、一般的に公開されず、当社の御客様に限って配布。


<dl>

  <dt>バージョン</dt>
  <dd>0.1.0</dd>

  <dt>対象IntelliJ IDEAファミリー統合開発環境のバージョン</dt>
  <dd>2026.1</dd>

  <dt>ダウンロードリンク</dt>
  <dd><a href="https://1drv.ms/u/c/eacdd3a9d89383af/IQAej4PaZ8mdSqVp0MrJCbhRAaDuFHnji6fdoGz4DZtnX5o?e=Qq91y3">(One Drive)</a></dd>

</dl>


## 目次

+ [ファイル](#ファイル)
  + [「General」群](#general群)
  + [「TypeScript Business Rules」群](#typescript-business-rules群)
+ [ライブテンプレート](#ライブテンプレート)
  + [TypeScript](#typescript)
    + [ビジネスルール TypeScript - Entities Properties Specification [YDPP]](#ビジネスルール-typescript---entities-properties-specification-ydpp) 


## ファイル
### 「General」群

空クラス、関数等の様な未実装で一般的ものを含むファイル。

<dl>

  <dt>Class</dt>
  <dd>空クラス</dd>

  <dt>Class and namespace</dt>
  <dd>クラス及び同名の名スペース</dd>

  <dt>Function<dt>
  <dd>空関数</dd>

  <dt>Type<dt>
  <dd>型エリアス（<code>type</code>キーワード）</dd>

  <dt>Interface<dt>
  <dd>インターフェース</dd>

  <dt>Enum<dt>
  <dd>列挙</dd> 

</dl>


### 「Business Rules」群

<dl>

  <dt>Entity</dt>
  <dd>クリーンアーキテクチャに於ける<a href="https://qiita.com/nozomi2025/items/f0803c9f3f15f1f4824b">エンティティ</a>に該当。</dd>

  <dt>Gateway</dt>
  <dd>クリーンアーキテクチャに於ける<a href="https://qiita.com/Sicut_study/items/d59a362176a8412458fb#%E3%82%B2%E3%83%BC%E3%83%88%E3%82%A6%E3%82%A7%E3%82%A4%E5%B1%A4">ゲートウェイ</a>に該当。</dd>

</dl>


## ライブテンプレート

### TypeScript
#### 一般
##### コンソール
###### 汎用

<dl>

  <dt><kbd>cl</kbd></dt>
  <dd>一般<code>console.log()</code></dd>

  <dt><kbd>ce</kbd></dt>
  <dd>一般<code>console.error()</code></dd>

</dl>

###### デバッグ・フィードバック

<dl>

  <dt><kbd>cp</kbd><dt>
  <dd>
    <code>console.log("CHECKPOINT ")</code>を導入。
    その後、手動で番号か、其の他の文字を入力する事。
    デバッグのに使われている。
  </dd>

  <dt><kbd>fb</kbd><dt>
  <dd>
    <code>console.log("FEEDBACK ")</code>を導入。
    その後、手動で番号を入力する事。
    プロジェクトが再構成されたか、確認したい時に使えば良い。
  </dd>

</dl>


##### アロー関数

<dl>

  <dt><kbd>af</kbd></dt>
  <dd>
    <dl>
      <dt>記憶術</dt>
      <dd><b>a</b>rrow <b>f</b>unction</dd>
      <dt>記述</dt>
      <dd>
        同期アロー変数（非同期の場合、代わりに<kbd>aaf</kbd>を利用）。
        引数を入力した後で、<kbd>Tab</kbd>を押す前に、型を指定する事。
      </dd>
    </dl>
  </dd>

  <dt><kbd>aff</kbd></dt>
  <dd>
    <dl>
      <dt>記憶術</dt>
      <dd><b>a</b>sync <b>a</b>rrow <b>f</b>unction</dd>
      <dt>記述</dt>
      <dd>
        非同期アロー変数。
        引数を入力した後で、<kbd>Tab</kbd>を押す前に、型を指定する事。
      </dd>
    </dl>
  </dd>

</dl>


#### エクスポート

<dl>

  <dt><kbd>edc</kbd></dt>
  <dd><code>export default class {}</code></dd>

  <dt><kbd>edf</kbd></dt>
  <dd><code>export default function () {}</code></dd>

  <dt><kbd>ei</kbd></dt>
  <dd><code>export interface</code></dd>

  <dt><kbd>en</kbd></dt>
  <dd><code>export namespace</code></dd>

  <dt><kbd>et</kbd></dt>
  <dd><code>export type</code></dd>

</dl>


#### クラス
##### フィルド

<dl>

  <dt><kbd>if</kbd></dt>
  <dd>
    <dl>
      <dt>記憶術</dt>
      <dd><b>i</b>nstance <b>f</b>ield</dd>
      <dt>記述</dt>
      <dd>インスタンス・フィルド</dd>
    </dl>
  </dd>

  <dt><kbd>sf</kbd></dt>
  <dd>
    <dl>
      <dt>記憶術</dt>
      <dd><b>s</b>tatic <b>f</b>ield</dd>
      <dt>記述</dt>
      <dd>静的フィルド</dd>
    </dl>
  </dd>

</dl>


##### メソッド

<dl>

  <dt><kbd>im</kbd></dt>
  <dd>
    <dl>
      <dt>記憶術</dt>
      <dd><b>i</b>nstance <b>m</b>ethod</dd>
      <dt>記述</dt>
      <dd>インスタンス・メソッド</dd>
    </dl>
  </dd>

  <dt><kbd>iam</kbd></dt>
  <dd>
    <dl>
      <dt>記憶術</dt>
      <dd><b>i</b>nstance <b>a</b>sync <b>m</b>ethod</dd>
      <dt>記述</dt>
      <dd>インスタンス非同期メソッド</dd>
    </dl>
  </dd>

  <dt><kbd>sm</kbd></dt>
  <dd>
    <dl>
      <dt>記憶術</dt>
      <dd><b>s</b>tatic <b>m</b>ethod</dd>
      <dt>記述</dt>
      <dd>静的メソッド</dd>
    </dl>
  </dd>

  <dt><kbd>sam</kbd></dt>
  <dd>
    <dl>
      <dt>記憶術</dt>
      <dd><b>s</b>tatic <b>a</b>sync <b>m</b>ethod</dd>
      <dt>記述</dt>
      <dd>静的非同期メソッド</dd>
    </dl>
  </dd>

</dl>


##### コメント系
###### コメント見出し

言語を関係無く、見出しはコードを節毎に分けて読みやすく表すするのに効率的。
但し、見出しは分かりにくいコードを分かりやすくする為の手段では*なく*、コードを読みすく為の手段なので、変数名・関数名・クラス名等を明確する事が必要な儘。

```typescript
/* ━━━ Heading 1 ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ */
/* ┅┅┅ Heading 2 ┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅ */
/* ╍╍╍ Heading 3 ╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍ */
/* ─── Heading 4 ──────────────────────────────────────────────────────────────────────────────────────────────────── */
/* ┄┄┄ Heading 5 ┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄ */
/* ╌╌╌ Heading 6 ╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌ */
```

> ⚠️ 見出し行の文字数を120文字にする推奨。但し、全角文字の幅はフォント依存、従って環境依存なので、線の長さを何方の環境にも同じ長さにする為、見出しをラテン文字にする推薦。

見出し１から見出し６へ行くと、ライブテンプレートは

+ <kbd>ch1</kbd> `/* ━━━ Heading 1 ━━━━━━━━━━━ */`
+ <kbd>ch2</kbd> `/* ┅┅┅ Heading 2 ┅┅┅┅┅┅┅┅┅┅┅ */`
+ <kbd>ch3</kbd> `/* ╍╍╍ Heading 3 ╍╍╍╍╍╍╍╍╍╍╍ */`
+ <kbd>ch4</kbd> `/* ─── Heading 4 ─────────── */`
+ <kbd>ch5</kbd> `/* ┄┄┄ Heading 5 ┄┄┄┄┄┄┄┄┄┄┄ */`
+ <kbd>ch6</kbd> `/* ╌╌╌ Heading 6 ╌╌╌╌╌╌╌╌╌╌╌ */`


#### ビジネスルール TypeScript - Entities Properties Specification [YDPP]

新しい[ビジネスルール](https://qiita.com/nozomi2025/items/b82992914ab14ddc250a)の
  [エンティティ](https://qiita.com/nozomi2025/items/f0803c9f3f15f1f4824b)を定義するファイルを作りたい時、先ず
  [専用のファイルテンプレート](#typescript-business-rules群)を使うと良い。
其の後、新規プロパティーの定義の際、下記のライブテンプレートを使えば良い。

当群のライブテンプレートは「eps」（「Entity Property Specification」）から始まる。

<dl>

  <dt>eps-b</dt>
  <dd>真偽型のプロパティー</dd>

  <dt>eps-s</dt>
  <dd>文字列型のプロパティー</dd>

  <dt>eps-n</dt>
  <dd>数型のプロパティー</dd>

  <dt>eps-o</dt>
  <dd>数型のプロパティー</dd>

</dl>


### JSDoc

TypeScript内、JSDocの利用は基本的に不要だが、記述（`@description`）や返す値の本質（`@return`）を表す為のTypeScriptには無い機能や、
  Pug内のJavaScriptに使うと良い場合が有る。

> ℹ️ 此の群のライブテンプレートは全部オートコンプリート型（省略無し）。


#### `@description`

関数名・メソッド名が曖昧な時、名前の低い品質を<kbd>@description</kbd>で補うのではなく、名前を分かりやすくするのだ。
高品質のコードに於いては下記の場合に限って利用しても良い。

+ コード全体的に分かりやすいが、複雑な仕様の為、全体的に何をしているか、明確になっていない。
+ オンライン辞書があっても英語を~~話す~~読むのは苦手な人向けの変数名・クラス名・関数名・メソッド名の和訳。此の場合、`@description 【日本語名】 〇〇`
  原形にしたがって記載する。面倒ではあるが、「 【日本語名】」の記載に依り、低い品質の名前<kbd>@description</kbd>で補うのではなく、英語が苦手な人向けの記載
　　という意図を共有。

資料なので、です・ます調が此処には不要。
可能な限り簡潔で、分かりやすく書く事。

<dl>

  <dt>悪い例</dt>
  <dd>
    <pre><code>
      /** @description 新しい製品データを送信します。 */
      async submitNewProductData(): Promise&lt;void&gt; { /* */ }
    </code></pre>
    <ul>
      <li>説明文を書かなくても、関数が何をしているか、直訳で明確になっていなければいけない。</li>
      <li>上記通り、です・ます調は不要。</li>
    </ul>
  </dd>

  <dt>より良い例</dt>
  <dd>
    <pre><code>
      /** @description 【日本語名】 新規製品データを送信する */
      async submitNewProductData(): Promise&lt;void&gt; { /* */ }
    </code></pre>
    <ul>
      <li>
        理想に於いては、説明文を書かなくても、関数が何をしているか、直訳で明確になっている事。
        然し、オンライン辞書を使っても英語が読めない方がいらっしゃったら、其の方専用<code>【日本語名】</code>と記載
      </li>
      <li>
        簡潔になっている。
        「新規製品データ送信」迄短縮しても良いかも知れないが、関数・メソッドにとって命令形の方が良い。</li>
    </ul>
  </dd>

</dl>


#### `@type`

TypeScript内には不要だが、Pug内のJavaScriptには利用必須。


### Pug
#### アトリビュート

<dl>

  <dt><kbd>attributes</kbd></dt>
  <dt><kbd>attrs</kbd></dt>
  <dd>
    <code>&attributes(attributes)</code>を追加。
    ミクスインの根要素が１個の時、よく根要素に付けられる。
  </dd>

  <dt><kbd>attribute-class</kbd></dt>
  <dt><kbd>attrc</kbd></dt>
  <dd>
    <code>class</code>アトリビュートが長すぎる（120列を超える）時、下記通り<code>&attributes({ class: [] })</code>を使って指定すると良い。
    <pre><code>
      &attributes({
        class: [
          "ComponentWithVeryVeryLongName-ElementWithVeryVeryLongName__ModifierWithVeryVeryLongName1",
          "ComponentWithVeryVeryLongName-ElementWithVeryVeryLongName__ModifierWithVeryVeryLongName2"
        ]
      })    
    </code></pre>
  </dd>

  <dt><kbd>attribute-dynamic</kbd></dt>
  <dt><kbd>attrd</kbd></dt>
  <dd>
    アトリビュート名は変数になっている時用いると良い。
    <pre><code>
      &attributes({
        [PageDOM_AccessResources.buttons.submitting.DATA_ATTRIBUTE_VALUE]: ""
      })
    </code></pre>
  </dd>

  <dt><kbd>attribute-object-assign</kbd></dt>
  <dt><kbd>attroo</kbd></dt>
  <dd>
    アトリビュートを明示的にしていする時、`attributes`というPugに注射される変数も保ちたい時が有る。
    スプレッド構文がPug3に対応されてはいるが、`pug-lint`に怒られるので`Object.assign`を使わざる得ない。
    <pre><code>
      &attributes(
        Object.assign({
          {},
          attributes,
          {
            // ...
          }
        })
      )
    </code></pre>
  </dd>

</dl>


#### コメント系
##### コメント見出し

言語を関係無く、見出しはコードを節毎に分けて読みやすく表すするのに効率的。
但し、見出しは分かりにくいコードを分かりやすくする為の手段では*なく*、コードを読みすく為の手段なので、変数名・関数名・クラス名等を明確する事が必要な儘。

```pug
//- ━━━ Heading 1 ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//- ┅┅┅ Heading 2 ┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅
//- ╍╍╍ Heading 3 ╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍
//- ─── Heading 4 ──────────────────────────────────────────────────────────────────────────────────────────────────────
//- ┄┄┄ Heading 5 ┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄
//- ╌╌╌ Heading 6 ╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌
```

> ⚠️ 見出し行の文字数を120文字にする推奨。但し、全角文字の幅はフォント依存、従って環境依存なので、線の長さを何方の環境にも同じ長さにする為、見出しをラテン文字にする推薦。

見出し１から見出し６へ行くと、ライブテンプレートは

+ <kbd>ch1</kbd> `//- ━━━ Heading 1 ━━━━━━━━━━━`
+ <kbd>ch2</kbd> `//- ┅┅┅ Heading 2 ┅┅┅┅┅┅┅┅┅┅┅`
+ <kbd>ch3</kbd> `//- ╍╍╍ Heading 3 ╍╍╍╍╍╍╍╍╍╍╍`
+ <kbd>ch4</kbd> `//- ─── Heading 4 ───────────`
+ <kbd>ch5</kbd> `//- ┄┄┄ Heading 5 ┄┄┄┄┄┄┄┄┄┄┄`
+ <kbd>ch6</kbd> `//- ╌╌╌ Heading 6 ╌╌╌╌╌╌╌╌╌╌╌`


##### TODO線 <kbd>todod</kbd>

言語を関係無く、開発中にはファイル内に上書きのコードと下書きコードが混在している事が一般的。
下書きのコードをTODO線のコメントで指示すると良い。

###### 【パターン１】 下書きコードの上にも、下にも上書きのコードが在る

```pug
p 上書きコード

//- TODO < ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
p 下書きコード
//- TODO > ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

p 上書きコード
```

###### 【パターン１】 下書きコードと上書きのコードを一線だけで区切られる

```pug
p 上書きコード

//- TODO ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
p 現時点では、ファイルの終わり迄下書きコードしかない。
```


#### テキストブロック内

<dl>

  <dt><kbd>non_breaking_space</kbd></dt>
  <dt><kbd>nbs</kbd></dt>
  <dd>ノーブレークスペース（「&nbsp;」）を導入。日本語には余り関係なく、単語が空白で分けられている（世界の）言語に使われる。</dd>

  <dt><kbd>tag_interpolation</kbd></dt>
  <dt><kbd>ti</kbd></dt>
  <dd><a href="https://pugjs.org/language/interpolation.html#tag-interpolation">タグ挿入</a>表現。</dd>

</dl>


#### 大量コード生成

<dl>

  <dt><kbd>mixin</kbd></dt>
  <dt><kbd>mxn</kbd></dt>
  <dd>ミクスインの初期コードを生成。</dd>

  <dt><kbd>table</kbd></dt>
  <dt><kbd>tbl</kbd></dt>
  <dd>
    HTMLのテーブルの初期コードを生成。
    <code>caption</code>、<code>thead</code>、<code>tfoot</code>含めだが、不要な部分を削除すると良い。
  </dd>

</dl>


### Stylus
#### 全体

<dl>

  <dt><kbd>geometry</kbd></dt>
  <dd>
    <p>一般的幾何学的プロパティー、推薦的順番</p>
    <ul>
      <li>min-width</li>
      <li>max-width</li>
      <li>width</li>
      <li>height</li>
      <li>border-width</li>
      <li>border-radius</li>
      <li>padding</li>
      <li>padding-block</li>
      <li>padding-inline</li>
      <li>font-size</li>
      <li>line-height</li>
    </ul>
    
  </dd>

  <dt><kbd>decoration</kbd></dt>
  <dd>
    <p>一般的修飾的プロパティー、推薦的順番</p>
    <ul>
      <li>border-style</li>
      <li>border-color</li>
      <li>color</li>
      <li>box-shadow</li>
    </ul>
  </dd>

</dl>


#### レイアウト

<dl>

  <dt><kbd>flex</kbd></dt>
  <dd>
    <p>flexコンテナの一般的プロパティー、推薦的順番</p>
    <ul>
      <li>display</li>
      <li>flex-direction</li>
      <li>flex-wrap</li>
      <li>justify-content</li>
      <li>align-items</li>
      <li>column-gap</li>
      <li>row-gap</li>
    </ul>
  </dd>

  <dt><kbd>grid</kbd></dt>
  <dd>
    <p>gridコンテナ一の般プロパティー、推薦的順番</p>
    <ul>
      <li>display</li>
      <li>grid-template-areas</li>
      <li>grid-template-rows</li>
      <li>grid-template-columns</li>
      <li>column-gap</li>
      <li>row-gap</li>
    </ul>
  </dd>

  <dt><kbd>absolute-positioning</kbd></dt>
  <dd>
    <p>絶対配置関連一般プロパティー、推薦的順番</p>
    <ul>
      <li>position</li>
      <li>top</li>
      <li>bottom</li>
      <li>left</li>
      <li>right</li>
      <li>z-index</li>
    </ul>
  </dd>

</dl>


##### アダプティブデザイン

<dl>

  <dt><kbd>ad2p</kbd></dt>
  <dd><b>広ビューポート様式</b>・<b>狭ビューポート様式</b>専用変数・ミクスト宣言。</dd>

  <dt><kbd>ad3p</kbd></dt>
  <dd><b>広ビューポート様式</b>・<b>中ビューポート様式</b>・<b>狭ビューポート様式</b>専用変数・ミクスト宣言。</dd>

  <dt><kbd>ad4p</kbd></dt>
  <dd>
    <b>超広ビューポート様式</b>・<b>広ビューポート様式</b>・<b>中ビューポート様式</b>・<b>狭ビューポート様式</b>・<b>超狭ビューポート様式</b>専用変数・ミクスト宣言。
    合計で５件ではあるが、<b>超広ビューポート様式</b>か、<b>中ビューポート様式</b>か、<b>超狭ビューポート様式</b>を削除する前提。
  </dd>

  <dt><kbd>ad5p</kbd></dt>
  <dd><b>超広ビューポート様式</b>・<b>広ビューポート様式</b>・<b>中ビューポート</b>・<b>狭ビューポート様式</b>・<b>超狭ビューポート</b>様式専用変数・ミクスト宣言。</dd>

  <dt><kbd>adp</kbd></dt>
  <dd>上記の様式ミクスインの中から何方かの呼び出し。</dd>

</dl>


#### 枠

<dl>

  <dt><kbd>border-geometry</kbd></dt>
  <dd>
    <p>枠の幾何学的プロパティー</p>
    <ul>
      <li><code>border-width</code></li>
      <li><code>border-radius</code></li>
    </ul>
  </dd>

  <dt><kbd>border-decoration</kbd></dt>
  <dd>
    <p>枠の修飾的プロパティー</p>
    <ol>
      <li><code>border-style</code></li>
      <li><code>border-color</code></li>
    </ol>
  </dd>

</dl>


##### 辺毎
###### 幾何学

<dl>

  <dt><kbd>left-border-geometry</kbd></dt>
  <dd>
    <p>左辺。具体的には、</p>
    <ol>
      <li><code>border-left-width</code></li>
      <li><code>border-top-left-radius</code></li>
      <li><code>border-bottom-left-radius</code></li>
    </ol>
  </dd>

  <dt><kbd>right-border-geometry</kbd></dt>
  <dd>
    <p>右辺。具体的には、</p>
    <ol>
      <li><code>border-right-width</code></li>
      <li><code>border-top-right-radius</code></li>
      <li><code>border-bottom-right-radius</code></li>
    </ol>
  </dd>

  <dt><kbd>top-border-geometry</kbd></dt>
  <dd>
    <p>上辺。具体的には、</p>
    <ol>
      <li><code>border-top-width</code></li>
      <li><code>border-top-left-radius</code></li>
      <li><code>border-top-right-radius</code></li>
    </ol>
  </dd>

  <dt><kbd>bottom-border-geometry</kbd></dt>
  <dd>
    <p>下辺。具体的には、</p>
    <ol>
      <li><code>border-bottom-width</code></li>
      <li><code>border-bottom-left-radius</code></li>
      <li><code>border-bottom-right-radius</code></li>
    </ol>
  </dd>

</dl>


###### 修飾

<dl>

  <dt><kbd>left-border-decoration</kbd></dt>
  <dd>
    <p>左辺。具体的には、</p>
    <ol>
      <li><code>border-left-style</code></li>
      <li><code>border-left-color</code></li>
    </ol>
  </dd>

  <dt><kbd>right-border-decoration</kbd></dt>
  <dd>
    <p>右辺。具体的には、</p>
    <ol>
      <li><code>border-right-style</code></li>
      <li><code>border-right-color</code></li>
    </ol>
  </dd>

  <dt><kbd>top-border-decoration</kbd></dt>
  <dd>
    <p>上辺。具体的には、</p>
    <ol>
      <li><code>border-top-style</code></li>
      <li><code>border-top-color</code></li>
    </ol>
  </dd>

  <dt><kbd>bottom-border-decoration</kbd></dt>
  <dd>
    <p>下辺。具体的には、</p>
    <ol>
      <li><code>border-bottom-style</code></li>
      <li><code>border-bottom-color</code></li>
    </ol>
  </dd>

</dl>


#### コメント系
##### コメント見出し

言語を関係無く、見出しはコードを節毎に分けて読みやすく表すするのに効率的。
但し、見出しは分かりにくいコードを分かりやすくする為の手段では*なく*、コードを読みすく為の手段なので、変数名・関数名・クラス名等を明確する事が必要な儘。

```stylus
// ━━━ Heading 1 ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
// ┅┅┅ Heading 2 ┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅
// ╍╍╍ Heading 3 ╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍
// ─── Heading 4 ───────────────────────────────────────────────────────────────────────────────────────────────────────
// ┄┄┄ Heading 5 ┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄
// ╌╌╌ Heading 6 ╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌
```

> ⚠️ 見出し行の文字数を120文字にする推奨。但し、全角文字の幅はフォント依存、従って環境依存なので、線の長さを何方の環境にも同じ長さにする為、見出しをラテン文字にする推薦。

見出し１から見出し６へ行くと、ライブテンプレートは

+ <kbd>ch1</kbd> `// ━━━ Heading 1 ━━━━━━━━━━━`
+ <kbd>ch2</kbd> `// ┅┅┅ Heading 2 ┅┅┅┅┅┅┅┅┅┅┅`
+ <kbd>ch3</kbd> `// ╍╍╍ Heading 3 ╍╍╍╍╍╍╍╍╍╍╍`
+ <kbd>ch4</kbd> `// ─── Heading 4 ───────────`
+ <kbd>ch5</kbd> `// ┄┄┄ Heading 5 ┄┄┄┄┄┄┄┄┄┄┄`
+ <kbd>ch6</kbd> `// ╌╌╌ Heading 6 ╌╌╌╌╌╌╌╌╌╌╌`


##### TODO線 <kbd>todod</kbd>

言語を関係無く、開発中にはファイル内に上書きのコードと下書きコードが混在している事が一般的。
下書きのコードをTODO線のコメントで指示すると良い。


###### 【パターン１】 下書きコードの上にも、下にも上書きのコードが在る

```stylus
display flex

//- TODO < ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
flex-direction column
//- TODO > ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

background-color aliceblue
```

###### 【パターン１】 下書きコードと上書きのコードを一線だけで区切られる

```stylus
display flex
flex-direction column
//- TODO ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
background-color aliceblue
```

#### その他

<dl>

  <dt><kbd>mm01fr</kbd></dt>
  <dd><code>minmax(0, 1fr)</code></dd>

</dl>
