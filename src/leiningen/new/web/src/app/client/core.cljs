(ns {{name}}.client.core
  (:require [noir.cljs.client.watcher :as watcher]
            [clojure.browser.repl :as repl]
            [crate.core :as crate])
  (:use [jayq.core :only [$ append]])
  (:use-macros [crate.macros :only [defpartial]]))


; Development -----------------------------------------------------------------
(watcher/init)
;;(repl/connect "http://localhost:9000/repl")

; Main ------------------------------------------------------------------------
(def $content ($ :#container))

(defpartial up-and-running []
  [:div#clojurescript-status.alert.alert-success "✔ CLJS"])

(append $content (up-and-running))
