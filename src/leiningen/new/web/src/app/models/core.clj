(ns {{name}}.models.core
  (:require [lobos.migrations :as migrations])
  (:use [korma.db]))


(defdb db migrations/db)

