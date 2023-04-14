# install kamel 

minikube addons enable registry

kamel install

kubectl get integrationplatform

kubectl get pod


# install kn
kn quickstart minikube

minikube tunnel --profile knative

minikube profile list

# check knative

kubectl get namespaces | grep knative

kubectl api-resources --api-group  serving.knative.dev

kubectl api-resources --api-group eventing.knative.dev



