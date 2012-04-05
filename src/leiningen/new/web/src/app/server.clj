(ns {{name}}.server
  (:require [noir.server :as server]
            [noir.cljs.core :as cljs])
  (:use [metrics.ring.instrument :only (instrument)]))


(server/load-views-ns '{{name}}.views)
(server/add-middleware instrument)

(def cljs-options {:advanced {:externs ["externs/jquery.js"]}})

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8090"))]
    (cljs/start mode cljs-options)
    (server/start port {:mode mode
                        :ns '{{name}}})))
