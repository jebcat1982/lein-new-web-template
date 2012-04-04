(ns lobos.migrations
  (:refer-clojure :exclude [alter drop bigint boolean char double float time])
  (:use (lobos [migration :only [defmigration]]
               core
               schema)))


(def db
  {:classname "org.sqlite.JDBC"
   :subprotocol "sqlite"
   :subname "./db.sqlite3"})


; (defmigration create-some-table
;   (up [] (create
;            (table :test
;                   (integer :id :primary-key)
;                   (varchar :name 255 :not-null)
;                   )))
;   (down [] (drop (table :test))))

