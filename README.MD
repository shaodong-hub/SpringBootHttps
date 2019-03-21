

证书生成

keytool -genkey -alias tomcat  -storetype PKCS12 -keyalg RSA -keysize 2048  -keystore keystore.p12 -validity 3650

在application.properties中添加如下代码：

server.ssl.key-store=keystore.p12

server.ssl.key-store-password=111111

server.ssl.keyStoreType=PKCS12

server.ssl.keyAlias:tomcat

