func delete hello

kn service create hello \
--image gcr.io/knative-samples/helloworld-go \
--port 8080 \
--env TARGET=World

kn service list

curl "$(kn service describe hello -o url)"

#autoscaling
kubectl get pod -l serving.knative.dev/service=hello -w

curl "$(kn service describe hello -o url)"

#traffic splitting
kn service update hello \
--env TARGET=Knative

curl "$(kn service describe hello -o url)"

kn revisions list

kn service update hello \
--traffic hello-00001=50 \
--traffic @latest=50

kn revisions list


