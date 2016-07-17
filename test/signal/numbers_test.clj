(ns signal.numbers-test
  (:require [clojure.test :refer :all]
            [signal.numbers :refer :all]))

(deftest numbers-less-than-20
  (is (= (extense 1) "one"))
  (is (= (extense 12) "twelve"))
  (is (= (extense 19) "nineteen"))
  (is (= (extense 0) "zero")))

(deftest numbers-less-than-100
  (is (= (extense 20) "twenty"))
  (is (= (extense 21) "twenty-one"))
  (is (= (extense 55) "fifty-five"))
  (is (= (extense 70) "seventy"))
  (is (= (extense 99) "ninety-nine")))

(deftest numbers-less-than-1000
  (is (= (extense 100) "one hundred"))
  (is (= (extense 145) "one hundred and fourty-five"))
  (is (= (extense 307) "three hundred and seven"))
  (is (= (extense 999) "nine hundred and ninety-nine")))

(deftest number-is-equal-1000
  (is (= (extense 1000) "one thousand")))
