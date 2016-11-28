(ns clojureexample.problem_10)
; The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
; Find the sum of all the primes below two million.

(->> (range 1 2000000)
     (take-nth 2)
     (filter #(.isProbablePrime (BigInteger/valueOf %) 10))
     (reduce +)
     (+ 2))