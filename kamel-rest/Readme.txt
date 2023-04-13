
kamel run RestDSL.java

kamel get

kamel logs rest-dsl

-------
#kubectl get svc
#kubectl port-forward svc/rest-dsl 8000:80

kubectl get pods
kubectl port-forward rest-dsl-00001-deployment-786fdd87b7-hgdw2  8000:8080

curl 127.0.0.1:8000/hello
--------

or

--------
kn service list
curl "$(kn service describe rest-dsl -o url)"/hello
--------


