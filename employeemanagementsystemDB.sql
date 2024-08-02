
CREATE TABLE `department` (
  `DEPARTMENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `SHORT_NAME` varchar(10) DEFAULT NULL,
  `DEPARTMENT_NAME` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`DEPARTMENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
LOCK TABLES `department` WRITE;
INSERT INTO `department` VALUES (1,'HR','Human Resources Management'),(2,'IT','Information Technology'),(3,'ENGG','Engineering'),(4,'R&D','Research and Development'),(5,'MK','Marketing'),(6,'ACNT','Accounting');
UNLOCK TABLES;
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `EMPLOYEE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `FIRST_NAME` varchar(50) DEFAULT NULL,
  `LAST_NAME` varchar(50) DEFAULT NULL,
  `department_id` int(11) NOT NULL,
  PRIMARY KEY (`EMPLOYEE_ID`),
  KEY `FKbejtwvg9bxus2mffsm3swj3u9` (`department_id`),
  CONSTRAINT `FKbejtwvg9bxus2mffsm3swj3u9` FOREIGN KEY (`department_id`) REFERENCES `department` (`DEPARTMENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
LOCK TABLES `employee` WRITE;
INSERT INTO `employee` VALUES (1,'Apoorva','Joshi',4),(2,'Tim','Cook',3);
UNLOCK TABLES;

