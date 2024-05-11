(ns hello-time
  (:require [java-time.api :as t]))

(defn time-str
  "Returns a string representation of a datetime in the local time format"
  [instant]
  (t/format (t/with-zone (t/formatter "hh:mm a") (t/zone-id))
            instant))

(defn now
  "Retunrs the current datetime"
  []
  (t/instant))