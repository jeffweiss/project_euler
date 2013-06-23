(def fib-seq
((fn rfib [a b]
(lazy-seq (cons a (rfib b (+ a b)))))
0 1))
(reduce + ((group-by (fn [x] (rem x 2)) (take-while (fn [x] (< x 4000000)) fib-seq)) 0))
