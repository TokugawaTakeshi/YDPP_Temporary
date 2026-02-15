# やまとダイワプログラミング生産性 | Yamato Daiwa Programming Productivity (YDPP)

ライブテンプレートやファイルテンプレートやプログラミング生産性向上専用の其の他の手段を含むIntelliJ IDEA専用のプラグイン。
[株式会社やまとダイワ](https://yamato-daiwa.com/)のノウハウとして、　[株式会社やまとダイワ](https://yamato-daiwa.com/)と人材育成サービスを
  購入した御客様に限って配布。


## ファイル
### 「TypeScript Entity」群

空クラス、関数等。

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


## ライブテンプレート

[ライブテンプレートとは？](https://pleiades.io/help/idea/using-live-templates.html) 


### JSDoc

TypeScript内、JSDocの利用は基本的に不要だが、記述（`@description`）や返す値の本質（`@return`）を表す為のTypeScriptには無い機能や、
  Pug内のJavaScriptに使うと良い場合が有る。

> ℹ️ 此の群のライブテンプレートは全部オートコンプリート型（省略無し）。

<dl>

  <dt><kbd>@description</kbd></dt>
  <dd>関数名・メソッド名が曖昧な時、名前の低い品質を<kbd>@description</kbd>で補うのではなく、名前を分かりやすくするのだ。</dd>

  <dt><kbd>@type</kbd></dt>
  <dd>TypeScript内には不要だが、Pug内のJavaScriptには利用必須。</dd>

</dl>


### Pug
#### アトリビュート

<dl>

  <dt><kbd>attrs</kbd></dt>
  <dd><code>&attributes(attributes)</code>を追加。</dd>

  <dt><kbd>attrsc</kbd></dt>
  <dd>
    <code>class</code>アトリビュートが長すぎる（120列を超える）時、下記通り<code>&attributes({ class: [] })</code>を使って指定すると良い。
    <pre><code>
      &attributes({
        class: [
          "ComponentWithVeryVerLongName-ElementWithVeryVerLongName__ModifierWithVeryVeryLongName1",
          "ComponentWithVeryVerLongName-ElementWithVeryVerLongName__ModifierWithVeryVeryLongName2"
        ]
      })    
    </code></pre>
  </dd>

</dl>



#### コメント系
##### コメント見出し

言語を関係無く、見出しはコードを節分けて読みやすく表すするのに大事。
但し、見出しは分かりにくいコードを分かりやすくする為の手段では*なく*、コードを読みすく為の手段なので、変数名・関数名・クラス名等を明確する事が必要なままだ。

```pug
//- ━━━ Heading 1 ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//- ┅┅┅ Heading 2 ┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅
//- ╍╍╍ Heading 3 ╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍
//- ─── Heading 4 ──────────────────────────────────────────────────────────────────────────────────────────────────────
//- ┄┄┄ Heading 5 ┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄
//- ╌╌╌ Heading 6 ╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌
```

> ⚠️ 見出し行の文字数を120文字にする推奨。但し、全角文字の幅はフォント依存、従って環境依存なので、線の長さをどちらの環境にも同じ長さにする為、見出しを英語にする推薦。

見出し１から見出し６へ行くと、ライブテンプレートは

+ <kbd>ch1</kbd> `//- ━━━ Heading 1 ━━━━━━━━━━━`
+ <kbd>ch2</kbd> `//- ┅┅┅ Heading 2 ┅┅┅┅┅┅┅┅┅┅┅`
+ <kbd>ch3</kbd> `//- ╍╍╍ Heading 3 ╍╍╍╍╍╍╍╍╍╍╍`
+ <kbd>ch4</kbd> `//- ─── Heading 4 ───────────`
+ <kbd>ch5</kbd> `//- ┄┄┄ Heading 5 ┄┄┄┄┄┄┄┄┄┄┄`
+ <kbd>ch6</kbd> `//- ╌╌╌ Heading 6 ╌╌╌╌╌╌╌╌╌╌╌`


##### TODO線 <kbd>todod</kbd>

言語を関係無く、ファイル内に上書きのコードと下書きコードが混在している事が一般的。
下書きのコードをTODO線のコメントで指示すると良い。

```pug
p 上書きコード

//- TODO < ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

p 下書きコード

//- TODO > ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

p 上書きコード
```

```pug
p 上書きコード

//- TODO ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

p 現時点では、ファイルの終わり迄下書きコードしかない。
```


#### テキストブロック内

<dl>

  <dt><kbd>nbs</kbd></dt>
  <dd>ノーブレークスペース（「&nbsp;」）を導入。日本語には余り関係なく、単語が空白で分けられている（世界の）言語に使われる。</dd>

  <dt><kbd>ti</kbd></dt>
  <dd><a href="https://pugjs.org/language/interpolation.html#tag-interpolation">タグ挿入</a>表現。</dd>

</dl>


#### 大量コード生成

<dl>

  <dt><kbd>mixin</kbd></dt>
  <dd>オートコンプリート型でがあるが、ミクスインの初期コードを生成。</dd>

  <dt><kbd>table</kbd></dt>
  <dd>
    オートコンプリート型でがあるが、HTMLのテーブルの初期コードを導入。
    <code>caption</code>、<code>thead</code>、<code>tfoot</code>含めだが、要らなければ削除すると良い。
  </dd>

</dl>
