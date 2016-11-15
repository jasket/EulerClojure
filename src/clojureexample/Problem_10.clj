(ns Problem_10)
; The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
; Find the sum of all the primes below two million.

(defn trans
  [n arr]
  (filter #(not= % 0) (map #(if (= (mod % n) 0) 0 %) arr)))

(defn eratosfen
  [lim]
  (loop [n 2, arr (range 2 lim), acc 0]
    (let [lim' (trans n arr)]
      (recur (first lim') lim' (+ n acc)))))