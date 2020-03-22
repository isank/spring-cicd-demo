# spring-cicd-demo

## Build Dockerfile
`$ docker build -t app`

## Run (Deploy Container)
`$ docker run -p 6666:6666 -e "JAVA_OPTS=-Ddebug -Xmx128m"  app --server.port=6666`
