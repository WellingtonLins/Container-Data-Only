# docker stop app
# docker kill app
# docker rm app
# docker rmi -f ricardojob/app

# docker stop banco
# docker kill banco
# docker rm banco
# docker rmi -f ricardojob/banco
# docker network rm rede-docker

docker-compose down
docker network rm rede-docker
mvn clean