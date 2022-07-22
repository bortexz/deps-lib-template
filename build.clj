(ns build 
  (:require [clojure.tools.build.api :as b]
            [clojure.edn :as edn]))

(def release (edn/read-string (slurp "release.edn")))
(def version (:version release))

(defn tag-version
  "Creates a new git lightweight tag with the current version."
  [_]
  (b/git-process {:git-args ["tag" (str "v" version)]}))