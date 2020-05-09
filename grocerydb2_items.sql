-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: grocerydb2
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `items` (
  `id` int NOT NULL AUTO_INCREMENT,
  `calorie_value` float DEFAULT NULL,
  `consumption_date` varchar(150) DEFAULT NULL,
  `expiration_date` varchar(150) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `purchase_date` varchar(150) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `list` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9m42i61e1lvw12232b1l2q8sn` (`list`),
  CONSTRAINT `FK9m42i61e1lvw12232b1l2q8sn` FOREIGN KEY (`list`) REFERENCES `lists` (`list_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items` DISABLE KEYS */;
INSERT INTO `items` VALUES (2,300,'04/05/2020','06/05/2020','butter','01/05/2020',1,1),(3,500,'02/02/2025','11/05/2020','Bread','07/05/2020',2,8),(4,50,'02/02/2025','12/05/2020','Cookie','05/05/2020',8,10),(6,150,'02/02/2025','19/05/2020','Pringles','08/05/2020',5,11),(7,150,'02/02/2025','12/05/2020','Milk','08/05/2020',2,11),(8,500,'02/02/2025','10/05/2020','Bread','07/05/2020',5,12),(9,200,'02/02/2025','11/05/2020','Greek Yoghurt','07/05/2020',5,12),(10,250,'02/02/2025','11/05/2020','Chips','08/05/2020',3,13),(11,350,'02/02/2025','11/05/2020','Pepsi','06/05/2020',7,14),(13,50,'02/02/2025','08/05/2020','Oranges','06/05/2020',10,15);
/*!40000 ALTER TABLE `items` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-09 19:41:48
