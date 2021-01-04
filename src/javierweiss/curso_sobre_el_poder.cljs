(ns ^:figwheel-hooks javierweiss.curso-sobre-el-poder
  (:require
   [reagent.dom :as r.dom]
   [javierweiss.views :as v]))


(defn app []
 (v/menu)) 


(defn mount []
  (r.dom/render [app] (js/document.getElementById "root")))


(defn ^:after-load re-render []
  (mount))


(defonce start-up (do (mount) true))
