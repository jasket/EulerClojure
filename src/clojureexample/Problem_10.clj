(ns Problem_10)
; The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
; Find the sum of all the primes below two million.

(defn modif
  [a b]
  (if (zero? b)
     0
     (if (zero? (mod a b)) 0 a)))

(defn crop
  [c acc]
  (drop c acc))

(defn rerange
  [n range]
  (let [r (map #(modif % n) range)]
    (filter #(not= % 0) (crop 1 r))))

(defn first'
  [range]
  (let [f (first range)]
    (if (nil? f) 0 f)))

(defn prime'
  [n range res]
  ((println n range res)
    (if (empty? range)
      res
      (prime' (first' range) (rerange n range) (+ res (first' range))))))

(defn prime [n]
  (prime' 2 (range 2 n) 0))

(prime 10)

(rerange 5 (7))
(map #(modif % 5) (7))
(crop 1 (map #(< % 99) (range 7 8)))