(ns migrations.txes
  (:require [datomic.api :as d]))

(defn attr
  [prefix ident]
  [{:db/id (d/tempid :db.part/db)
    :db/ident (keyword prefix ident)
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one
    :db.install/_attribute :db.part/db}])

(defn tx-foo [conn]
  (vec
   (mapcat (partial attr "tx-fn")
           ["foo-1" "foo-2"])))

(defn tx-bar [conn]
  (vec
   (mapcat (partial attr "tx-fn")
           ["bar-1" "bar-2"])) )
