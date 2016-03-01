CREATE DATABASE struts_tutorial;
use struts_tutorial;

CREATE TABLE login(
  user VARCHAR(20) NOT NULL,
  password VARCHAR(20) NOT NULL,
  name VARCHAR(20) NOT NULL,
  PRIMARY KEY(user)  
  )ENGINE=InnoDB;

INSERT INTO login (user,password,name)values('scott', 'navy', 'Scott Burgemott');

SELECT l.* 
FROM login l ;