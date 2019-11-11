(ns main)
(def Marks {"Inese" 10 "Vasja" 8 "Petja" 4 "Natasha" 7 "Anja" 10 "Lauris" 6 "Sandra" 8 "Krisjanis" 9})
(def listOfValues (vals (select-keys Marks (for [[k v] Marks :when (.endsWith k "a")] k))))
(float (/ (reduce + listOfValues) (count listOfValues)))
