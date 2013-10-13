(ns clj-playground.core
    (:require  [clj-http.client :as client])
    (:require  [cheshire.core :refer :all]))

(defn pug
    "Return random pug"
    []
    (:pug  (parse-string
                       (:body  (client/get "https://pugme.herokuapp.com/random"))
                       true)))

(defn main  []
    (println  (pug)))
