### [Gestion de Formation](https://github.com/Abdelhamidlamtioui/S3_b2)

Ce projet est une API RESTful pour la gestion des formations, des apprenants, des formateurs, et des classes. Il permet d'effectuer des opérations CRUD (Créer, Lire, Mettre à jour, Supprimer) sur les entités tout en intégrant la pagination et la gestion des relations entre apprenants, formateurs, classes et formations.

---

#### Table des Matières
1. Technologies Utilisées  
2. Structure du Projet  
3. Installation  
4. Endpoints de l'API  
5. Exemples de Requêtes avec Postman  
6. Contributions  
7. Lien JIRA  

---

### Technologies Utilisées
- Java 8  
- Spring Boot 3.x (Spring MVC, Spring Data JPA, Spring Validation)  
- Hibernate pour l'ORM  
- Base de données PostgreSQL  
- Lombok pour la réduction du code boilerplate  
- Postman pour le test des endpoints  
- Maven pour la gestion des dépendances  

---

### Structure du Projet
Le projet suit une architecture en couches pour une séparation claire des responsabilités.

📂 src  
└── 📂 main  
&nbsp;&nbsp;&nbsp;&nbsp;├── 📂 java  
&nbsp;&nbsp;&nbsp;&nbsp;│   └── 📂 com.abdelhamidlamtioui.gestion_formation  
&nbsp;&nbsp;&nbsp;&nbsp;│       ├── 📂 controller        # Contrôleurs REST pour chaque ressource  
&nbsp;&nbsp;&nbsp;&nbsp;│       ├── 📂 service           # Services contenant la logique métier  
&nbsp;&nbsp;&nbsp;&nbsp;│       ├── 📂 repository        # Accès aux données, avec JPA Repositories  
&nbsp;&nbsp;&nbsp;&nbsp;│       ├── 📂 model             # Entités JPA représentant les tables de la base  
&nbsp;&nbsp;&nbsp;&nbsp;│       └── 📂 exception         # Gestion des erreurs personnalisées  
└── 📂 resources               # Fichiers de configuration  

---

### Installation
1. Clonez le repository :  

   ```bash
   git clone https://github.com/Abdelhamidlamtioui/S3_b2.git
   cd S3_b2
   ```

2. Configurez la base de données PostgreSQL :  

   Assurez-vous que PostgreSQL est installé et créez une base de données :  

   ```sql
   CREATE DATABASE formation_db;
   ```

3. Modifiez les informations de connexion dans `application.properties` :  

   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/formation_db
   spring.datasource.username=yourUsername
   spring.datasource.password=yourPassword
   ```

4. Compilez et exécutez l'application :  

   - Installer les dépendances :  
     ```bash
     mvn clean install
     ```
   - Lancer l'application :  
     ```bash
     mvn spring-boot:run
     ```

5. La documentation Swagger est disponible sur :  
   [http://localhost:8080/swagger-ui/index.html#/](http://localhost:8080/swagger-ui/index.html#/)

---

### Contributions
Les contributions sont les bienvenues ! Voici comment contribuer :  
1. Forkez le projet.  
2. Créez une branche pour votre fonctionnalité :  
   ```bash
   git checkout -b nouvelle-fonctionnalite
   ```
3. Commitez vos modifications :  
   ```bash
   git commit -am 'Ajouter une nouvelle fonctionnalité'
   ```
4. Poussez sur la branche :  
   ```bash
   git push origin nouvelle-fonctionnalite
   ```
5. Créez une Pull Request.

---

### Lien JIRA
Vous pouvez consulter et gérer les tâches associées à ce projet via JIRA :  
[Projet JIRA Gestion de Formation](https://oneno9847.atlassian.net/jira/software/projects/TOUR/boards/2/backlog?atlOrigin=eyJpIjoiYWU1ZTYyZTEwMzg4NDg3N2IyMzNlYzI2OGY5ODhkMGUiLCJwIjoiaiJ9)

---

### Auteur
**Abdelhamid Lamtioui**

GitHub : [Abdelhamidlamtioui](https://github.com/Abdelhamidlamtioui)