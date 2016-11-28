(ns clojureexample.problem_10)
; The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
; Find the sum of all the primes below two million.

(defn prime? [n]
  (.isProbablePrime (BigInteger/valueOf n) 5))

(+ 2 (reduce #(+ %1 %2) (filter prime? (take-nth 2 (range 1 2000000)))))