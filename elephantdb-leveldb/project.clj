(defproject elephantdb/elephantdb-leveldb "0.4.0-SNAPSHOT"
  :min-lein-version "2.0.0"
  :java-source-paths ["src/jvm"]
  :javac-options ["-source" "1.6" "-target" "1.6"]
  :repositories {"fusesource.nexus.snapshot" "http://repo.fusesource.com/nexus/content/groups/public-snapshots"}
  :dependencies [[elephantdb/elephantdb-core "0.4.0-SNAPSHOT"]
                 [org.fusesource.leveldbjni/leveldbjni-all "1.4"]]
  :profiles {:dev
             {:dependencies
              [[org.clojure/clojure "1.4.0"]
               [midje "1.5-alpha9"]]
              :plugins [[lein-midje "3.0-alpha4"]]}})
