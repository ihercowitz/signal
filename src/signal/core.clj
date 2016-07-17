(ns signal.core
  (:gen-class)
  (:require [signal.numbers :as n]))

(defn -main [& args]
  (println "Numbers to word")
  (println "Type a number between 0 and 1000:")
  (try
    (let [number (Integer/parseInt (read-line))]
      (if (<= number 1000)
        (println (n/extense (int number)))
        (println "You should enter a number between 0 and 1000 ")))
    (catch ClassCastException c
      (println "You should write a number"))))
