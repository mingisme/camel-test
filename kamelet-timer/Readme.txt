
kubectl apply -f my-timer-source.kamelet.yaml

kubectl get kamelets | grep my-timer

kamel run my-timer-source-log.groovy

kamel get

kamel logs my-timer-source-log
