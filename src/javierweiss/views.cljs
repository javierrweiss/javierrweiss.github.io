(ns javierweiss.views
  (:require [javierweiss.sobremi]))

(defn menu
  []
  [:div#menu
   [:section#titulo
   [:h1.site__title
    [:span.site__title-text "Poder: evolución semántica y socioestructural"]]] 
;;footer
  [:footer#f
   [:ul
    [:li
     [:a {:href "programa.html"} "Programa del curso"]]
    [:li
     [:a {:href "cv.html"} "Sobre mí"]]
    [:li
     [:a {:href "https://www.tusclases.com.ar/profesores-ciencias-politicas-online/profesor-ciencias-politicas-curso-sobre-concepto-poder-ideal-estudiantes-grado-posgrado-deseen-profundizar-sus-conocimientos-tema-buenos-air-834242.aspx "} "Unirse"]]]
    ]
  ;;article
   [:article#descripcion
    [:p "¡Hola! Me llamo José Javier. Tengo más de 10 años de experiencia docente a nivel universitario. Estoy ofreciendo un pequeño seminario donde profundizarás tus conocimientos sobre el poder, ¿qué es?, ¿cómo se comporta?, ¿cómo podemos estudiarlo? y ¿cómo inciden las formas en que teorizamos el poder sobre su propia evolución socioestructural? Si he llamado tu atención, te invito a unirte a este curso online. Será mucho lo que aprenderemos juntos."]]])


