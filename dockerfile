# Usa la imagen oficial
FROM mysql/mysql-server:latest

# Define las variables de entorno (credenciales)
ENV MYSQL_ROOT_PASSWORD=rootpassword
ENV MYSQL_DATABASE=midatabase
ENV MYSQL_USER=miusuario
ENV MYSQL_PASSWORD=mipassword

# Expone el puerto 3306
EXPOSE 3306
