func create -l go hello

cd hello

func run --registry shsamuelwang -v

func deploy --registry shsamuelwang -v

func invoke

curl http://hello.default.127.0.0.1.sslip.io

curl -X POST http://hello.default.127.0.0.1.sslip.io -d 'a=1&b=2'


