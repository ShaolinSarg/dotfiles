{:user {:plugins [[lein-bikeshed "0.5.1"]
                  [lein-kibit "0.1.6"]
                  [jonase/eastwood "0.2.7"]
                  [venantius/yagni "0.1.4"]
                  [lein-auto "0.1.3"]
                  [lein-cloverage "1.0.13"]
                  [lein-eftest "0.5.4"]]

        :aliases {"all" ["do" "cloverage" "yagni" "kibit" "eastwood" "bikeshed"]}}

 :repl {:plugins [[cider/cider-nrepl "0.19.0"]]}}

