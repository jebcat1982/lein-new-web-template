(ns leiningen.new.web
    (:require [clojure.java.io :as io])
    (:use leiningen.new.templates))

(def render (renderer "web"))

(defn web
  "A webapp, the way I like it."
  [name]
  (let [data {:name name
              :sanitized (sanitize name)}]
    (->files data
             ; Version control files
             [".gitignore" (render "gitignore" data)]
             [".hgignore" (render "hgignore" data)]

             ; Boilerplate
             ["project.clj" (render "project.clj" data)]
             ["README.markdown" (render "README.markdown" data)]
             ["src/{{sanitized}}/server.clj" (render "src/app/server.clj" data)]

             ; LessCSS stub
             ["resources/public/styles/style.less" (render "resources/public/style.less")]
             ["resources/public/scripts/less.js" (render "resources/public/less.js")]

             ; Twitter Bootstrap
             ["resources/public/bootstrap/img/glyphicons_halflings_white.png" (render "resources/public/bootstrap/img/glyphicons_halflings_white.png")]
             ["resources/public/bootstrap/img/glyphicons_halflings.png" (render "resources/public/bootstrap/img/glyphicons_halflings.png")]
             ["resources/public/bootstrap/scripts/bootstrap.js" (render "resources/public/bootstrap/scripts/bootstrap.js")]
             ["resources/public/bootstrap/styles/bootstrap.css" (render "resources/public/bootstrap/styles/bootstrap.css")]
             ["resources/public/bootstrap/styles/bootstrap_responsive.css" (render "resources/public/bootstrap/styles/bootstrap_responsive.css")]

             ; Clojurescript stub
             ["src/{{sanitized}}/client/core.cljs" (render "src/app/client/core.cljs" data)]

             ; Views
             ["src/{{sanitized}}/views/core.clj" (render "src/app/views/core.clj" data)]

             ; Templates
             ["src/{{sanitized}}/templates.clj" (render "src/app/templates.clj" data)]

             ; Lobos and Korma
             ["src/lobos/migrations.clj" (render "src/lobos/migrations.clj" data)]
             ["src/{{sanitized}}/models/core.clj" (render "src/app/models/core.clj" data)]
             )))
