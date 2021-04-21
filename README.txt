Datanucleus tutorial 1 with Maven
=================================

## Pre-requisites
1. Apache Maven tool must be installed and included in the binaries path of environmental variables
2. Check the required libraries are included in the pom.xml
3. Create a MySQL database in local or remote (e.g. in www.remotemysql.com), follow the conventions described in create-productsdb.sql under db folder (db schema, user and passwd)
4. Check that datanucleus properties file follows the MySQL database conventions under resources dir (inside src this time!)
5. Now you can inspect and run the code :)

## Usage
```
mvn [validate | clean | compile | datanucleus:schema-create | exec:java | datanucleus:schema-delete]
```

```mvn validate```: validate the project is correct and all necessary information is available

```mvn clean```: removes any file created out of mvn execution

```mvn compile```: Compiles and enhances the java classes. Note that class enhancing is done inside the compiling phase as it is specified in the pom.xml (build -> plugin -> execution -> enhance). You can read more about this magic [Here](http://www.datanucleus.org/products/accessplatform_4_1/jpa/enhancer.html) "... technique of byte-code manipulation to make your normal Java classes "persistable ..."

```mvn datanucleus:schema-create```: automatically forward-engineer our classes to the database, taking into account the mapping meta-annotations

```mvn exec:java```: run the project

```mvn datanucleus:schema-delete```: delete the database schema created in create-db-schema
