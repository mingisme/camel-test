
kubectl apply -f my-log-sink.kamelet.yaml

kubectl get kamelets | grep my-

# prerequisite knative is installed and open minikube tunnel
minikube tunnel --profile knative
minikube profile list

kubectl apply -f timer-events.yaml
kubectl get channel

kubectl apply -f my-timer-source.binding.yaml
kubectl apply -f my-log-sink.binding.yaml
kubectl get KameletBinding

kamel log my-log-event-sink

--------
kubectl delete -f my-timer-source.binding.yaml
kubectl delete -f my-log-sink.binding.yaml