# Projet Récapitulation Docker et Jenkins
Sébastien Baumann | Francesco Amoroso

### Commande pour builder l'image:

 ```bash 
 docker build -t myjenkins .\docker
 ```
 ### Pour lancer le container docker 
 
  ```bash 
 run -p 8080:8080 -p 50000:50000 -v jenkins_home:/var/jenkins_home myjenkins
  ```

 ### Pour se rendre dans le pipeline jenkins entrer l'url suivant dans le naviagateur
 
 #### Docker
 ```bash 
  localhost:8080
 ```
 #### Docker Toolbox
 
 ```bash 
 http://192.168.99.100:8080
 ```
 
