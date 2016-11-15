(ns clojureexample.problem_10
  (:require
    [clojure.test :refer :all]))
; The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
; Find the sum of all the primes below two million.

(defn is-prime
  [n]
  (loop [n' n, i 2]
    (if (>= i n')
      true
      (if (= 0 (mod n' i))
        false
        (recur n' (inc i))))))

(deftest is-prime-test
  (is (true? (is-prime 3)))
  (is (true? (is-prime 7)))
  (is (true? (is-prime 11)))
  (is (false? (is-prime 4)))
  (is (false? (is-prime 8))))

(defn prime-sum
  [n]
  (loop [n' n, acc 0]
    (if (= 1 n')
      acc
      (if (is-prime n')
        (recur (dec n') (+ n' acc))
        (recur (dec n') acc)))))

(deftest prime-sum-test
   (is (= (prime-sum 10) 17))
   (is (= (prime-sum 200000) 17))
   )