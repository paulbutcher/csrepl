(ns csrepl.core
  (:require [clojure.browser.repl :as repl]))

(enable-console-print!)

(def app-state (atom {:text "hello world"}))

(println (:text @app-state))

(repl/connect "http://localhost:9000/repl")
