(defproject lein-scrooge "0.1.3-SNAPSHOT"
  :description "Leiningen plugin to run Twitter Scrooge compiler on Thrift IDL files"
  :url "http://github.com/jcrean/lein-scrooge"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories [["twitter" {:url "http://maven.twttr.com/"}]]
  :dev-dependencies [[swank-clojure "1.4.2"]]
  :dependencies [[com.twitter/finagle-core_2.10 "6.22.0"]
                 [com.twitter/finagle-thrift_2.10 "6.22.0"
                   :exclusions [org.apache.thrift/libthrift]]
 
                 [com.twitter/scrooge-core_2.10 "3.17.0"]
                 [com.twitter/scrooge-generator_2.10 "3.17.0"]
                 [com.twitter/scrooge-runtime_2.10 "3.17.0"
                   :exclusions [org.apache.thrift/libthrift]]
                ]
  :eval-in-leiningen true)
