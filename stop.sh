docker stop app
docker kill app
docker rm app
docker rmi -f ricardojob/app

docker stop banco
docker kill banco
docker rm banco
docker rmi -f ricardojob/banco
# docker-compose down
# mvn clean