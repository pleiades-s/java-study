# install
sudo apt update
sudo apt install openjdk-8-jdk openjdk-8-jre

# check
java -version

# Access root user
sudo -i

# Setup enviroment variable
cat >> /etc/environment <<EOL
JAVA_HOME= /usr/lib/jvm/java-8-openjdk-amd64
JRE_HOME=/usr/lib/jvm/java-8-openjdk-amd64/jre
EOL

# logout root user
logout