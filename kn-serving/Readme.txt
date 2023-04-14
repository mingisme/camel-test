func delete hello

kn service create hello2 \
--image gcr.io/knative-samples/helloworld-go \
--port 8080 \
--env TARGET=World

kn service list

curl "$(kn service describe hello2 -o url)"

#autoscaling
kubectl get pod -l serving.knative.dev/service=hello2 -w

curl "$(kn service describe hello2 -o url)"

#traffic splitting
kn service update hello2 \
--env TARGET=Knative

curl "$(kn service describe hello2 -o url)"

kn revisions list

kn service update hello2 \
--traffic hello2-00001=50 \
--traffic @latest=50

kn revisions list

kn service update hello2 \
--traffic hello2-00001=0 \
--traffic @latest=100

