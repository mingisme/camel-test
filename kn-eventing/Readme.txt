kn broker list

kn service create cloudevents-player \
--image ruromero/cloudevents-player:latest \
--env BROKER_URL=http://broker-ingress.knative-eventing.svc.cluster.local/default/example-broker


web browser:
http://cloudevents-player.default.127.0.0.1.sslip.io

#trigger
kn trigger create cloudevents-trigger --sink cloudevents-player  --broker example-broker


#clear
kn service delete hello
