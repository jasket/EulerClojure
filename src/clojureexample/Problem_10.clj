(ns Problem_10)

; The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
; Find the sum of all the primes below two million.

(defn eratosfen
  "Решето Эратосфена"
  [n]
  ())

(defn modif
  [a b]
  (if (zero? b)
     0
     (if (zero? (mod a b)) 0 a)))

(defn cut-el
  [c acc]
  (drop c acc))

(defn prime1 [n acc res]
  (if (= 1 (count acc)) res
      (if (zero? n)
        (if (= 2 (count acc)) res
          (prime1 (second acc) (cut-el 1 acc) res))
        (prime1 (first (cut-el 1 acc)) (map #(modif % n) (cut-el 1 acc)) (conj res n)))))

(reduce + (prime1 2 (range 2 10) []))
