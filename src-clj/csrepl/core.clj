(ns csrepl.core
  (:require [compojure.core :refer :all]
            [compojure.handler :refer [site]]
            [compojure.route :refer [resources not-found]]
            [ring.util.response :refer [redirect]]))

(defroutes app-routes
  (GET "/" [] (redirect "/index.html"))
  (resources "/")
  (not-found "Page not found"))

(def handler (site app-routes))
