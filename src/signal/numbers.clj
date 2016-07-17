(ns signal.numbers)

(def numbers [["zero" "one" "two" "three" "four" "five" "six" "seven" "eight" "nine" "ten" "eleven" "twelve" "thirteen" "fourteen" "fifteen" "sixteen" "seventeen" "eighteen" "nineteen"]
              ["" "" "twenty" "thirty" "fourty" "fifty" "sixty" "seventy" "eighty" "ninety"]])

(defn extense [number]
  (if (= number 1000) "one thousand"
      (if (< number 20)
        (get-in numbers [0 number])
        (let [nsize (count (str number))
              factor (int (Math/pow 10 (dec nsize)))
              n (quot number factor)
              r (mod number factor)
              position (if (< number 100) 1 0)]
          (str (get-in numbers [position n])
               (if (= nsize 3) " hundred" "")
               (when-not (zero? r)
                 (str (if (= nsize 2) "-" " and ") (extense r))))))))
