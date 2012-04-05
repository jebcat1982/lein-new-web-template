(ns {{name}}.templates
  (:require [noir.cljs.core :as cljs])
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css include-js html5]]
        [hiccup.element :only [link-to]]))


; Utils -----------------------------------------------------------------------
(defn include-less [path]
  [:link {:rel "stylesheet/less" :type "text/css" :href path}])


; Layout ----------------------------------------------------------------------
(defpartial base [title body-id & content]
  (html5
    [:head
     [:title title " / {{name}}"]
     (include-css "/bootstrap/styles/bootstrap.css")
     (include-css "/bootstrap/styles/bootstrap_responsive.css")
     (include-less "/styles/style.less")
     (include-js "/bootstrap/scripts/bootstrap.js")
     (include-js "/scripts/less.js")]
    [:body {:id (name body-id)}
     [:div#container content]
     (cljs/include-scripts :with-jquery)]))


; Pages -----------------------------------------------------------------------
(defn home []
  (base "Home" :home))
