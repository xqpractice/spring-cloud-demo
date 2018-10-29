# Spring Cloud Demo


## Launch demo in local

### Build docker image

```sh
$> docker-compose build
```

### Launch containers

```sh
$> docker-compose up -d
```


## Create default network

```sh
$> docker network create --driver=bridge --subnet=192.168.200.0/24 --gateway=192.168.200.1 local-network
```
