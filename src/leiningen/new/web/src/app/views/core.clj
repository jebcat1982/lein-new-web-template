(ns {{name}}.views.core
  (:require [{{name}}.templates :as templates])
  (:use [noir.core :only [defpage]]))

(defpage "/" []
  (templates/home))
