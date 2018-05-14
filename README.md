# Projet Récapitulation Docker et Jenkins
Sébastien Baumann | Francesco Amoroso

### commande pour builder l'image:

 ```bash 
 docker build -t myjenkins .\docker
 ```
 ### Pour lancer le container docker 
 
  ```bash 
 run -p 8080:8080 -p 50000:50000 -v jenkins_home:/var/jenkins_home myjenkins
  ```

 ### Pour se rendre dans le pipeline jenkins entrer l'url suivant dans le naviagateur
 
 ```bash 
  localhost:8080
 ```
 
 
