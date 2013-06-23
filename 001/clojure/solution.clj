(defn shouldkeep [x] (or (= (rem x 3) 0) (= (rem x 5) 0)))
(reduce + ((group-by shouldkeep (range 1000)) true))
