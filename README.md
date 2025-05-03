# valesolution-core


#### Deploy GCP Cloud run

gcloud builds submit --tag gcr.io/store-valesolution/rep-valesolution-images/valesolution-core:latest

gcloud run deploy  --image=gcr.io/store-valesolution/rep-valesolution-images/valesolution-core:latest --platform managed --region=southamerica-east1 --memory=1Gi --cpu=2 --timeout=700 --concurrency=80 --min-instances=0 --max-instances=5 --add-cloudsql-instances store-valesolution:southamerica-east1:valesolution-bd --network default --subnet default --vpc-egress private-ranges-only --allow-unauthenticated  --port=9091 --session-affinity --execution-environment=gen2 --ingress=all --update-labels component-id=ms-valesolution-core,environment=prod,resource=cloud-run,operational-state=active,service=valesolution-core
