# JAVA study
## How to install JAVA on Ubuntu

1. Install Java 8
```
sudo apt update
sudo apt install openjdk-8-jdk openjdk-8-jre
```

2. Check the installation
```
java -version

openjdk version "1.8.0_222"
OpenJDK Runtime Environment (build 1.8.0_222-8u222-b10-1ubuntu1~18.04.1-b10)
OpenJDK 64-Bit Server VM (build 25.222-b10, mixed mode)
```

3. Setup Enviroment variables
```
cat >> /etc/environment <<EOL
JAVA_HOME= /usr/lib/jvm/java-8-openjdk-amd64
JRE_HOME=/usr/lib/jvm/java-8-openjdk-amd64/jre
EOL
```

* [Reference](https://tecadmin.net/install-oracle-java-8-ubuntu-via-ppa/)
