Use powershell

use `minikube start --driver=docker`
use `docker images` , `docker ps` to check if your docker image or container is showing up in minikube
if not, use `& minikube -p minikube docker-env --shell powershell | Invoke-Expression` in powershell
use docker commands to build and run image `docker build -t my-springboot-app .`

tag image to docker hub username 'docker tag my-springboot-app:latest <username-of-dockerhub>/my-springboot-app:latest'

use `docker push <username-of-dockerhub>/my-springboot-app:latest`

use `kubectl apply -f deployment.yaml`
use `kubectl apply -f service.yaml`

to check deployments and pods:
`kubectl get deployments`
`kubectl get pods`
`kubectl describe pod <pod-name>`

use `minikube service my-springboot-app-service`

use `minikube dashboard`
