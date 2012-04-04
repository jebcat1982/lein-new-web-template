(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "TODO"
  :url "http://example.com/TODO"
  :dependencies [[org.clojure/clojure "1.3.0"]

                 ; Noir stuff
                 [noir "1.3.0-beta2"]
                 [noir-cljs "0.3.0"]
                 [jayq "0.1.0-alpha1"]
                 [fetch "0.1.0-alpha2"]
                 [crate "0.1.0-alpha3"]

                 ; Database
                 [lobos "1.0.0-SNAPSHOT"]
                 [org.xerial/sqlite-jdbc "3.7.2"]
                 [korma "0.3.0-beta9"]
                 [korma-admin "1.0.0-SNAPSHOT"]

                 ; Metrics
                 [metrics-clojure "0.8.0"]
                 [metrics-clojure-ring "0.8.0"]
                 ]
  :cljsbuild {:builds [{}]}
  :main ^{:skip-aot true} {{name}}.server)
