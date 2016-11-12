(ns Problem_10)

; The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
; Find the sum of all the primes below two million.

(defn prime
  "prime values 2..n"
  [n]
  (range 2 n))

; Result
(prime 10)
