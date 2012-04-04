(ns {{name}}.templates
  (:require [noir.cljs.core :as cljs])
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css include-js html5 link-to]]))


; Layout ----------------------------------------------------------------------
(defpartial base [title body-id & content]
  (html5
    [:head
     [:title title " / {{name}}"]
     (include-css "/bootstrap/styles/bootstrap.css")
     (include-css "/bootstrap/styles/bootstrap-responsive.css")
     (include-css "/styles/style.less" {:rel "stylesheet/less"})
     (include-js "/bootstrap/scripts/bootstrap.js")
     (include-js "/scripts/less.js")]
    [:body {:id (name body-id)}
     [:div#container content]
     (cljs/include-scripts :with-jquery)]))


; Pages -----------------------------------------------------------------------
(defn home []
  (base "Home" :home))
