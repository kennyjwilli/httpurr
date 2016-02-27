(defproject funcool/httpurr "0.4.0"
  :description "A ring-inspired, promise-returning, simple ClojureScript HTTP client."
  :url "http://funcool.github.io/httpurr"
  :license {:name "Public Domain" :url "http://unlicense.org"}
  :source-paths ["src"]
  :dependencies [[org.clojure/clojure "1.8.0" :scope "provided"]
                 [org.clojure/clojurescript "1.7.228" :scope "provided"]
                 [org.clojure/test.check "0.9.0" :scope "test"]
                 [funcool/promesa "0.8.1"]]

  :profiles
  {:dev
   {:plugins [[lein-ancient "0.6.7"]]}})
