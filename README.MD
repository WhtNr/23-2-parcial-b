docker build -t myorg/myapp: 0.0.1 .
docker run -p 8090:8090 myorg/myapp
docker run -d -p 8090:3306 -e MYSQL_ROOT_PASSWORD=clave mysql --name database -e MYSQL_USER=yms_user -e MYSQL_PASSWORD=yms_clave -e MYSQL_DATABASE=yms