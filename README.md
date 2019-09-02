mvn -e -X -U clean install -Dmaven.test.skip=true -pl eureka,gateway,svcdemo -am


mvn docker:build

docker push registry.cn-beijing.aliyuncs.com/gateway-demo/suke-svcdemo-image:1.0-SNAPSHOT && \
docker push registry.cn-beijing.aliyuncs.com/gateway-demo/suke-gateway-image:1.0-SNAPSHOT && \
docker push registry.cn-beijing.aliyuncs.com/gateway-demo/suke-eureka-image:1.0-SNAPSHOT