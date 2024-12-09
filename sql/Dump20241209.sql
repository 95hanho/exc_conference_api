-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: conference
-- ------------------------------------------------------
-- Server version	8.0.37

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
-- Table structure for table `conference_info`
--

DROP TABLE IF EXISTS `conference_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conference_info` (
  `conference_id` int NOT NULL AUTO_INCREMENT,
  `conference_addition_input_info` varchar(45) DEFAULT NULL,
  `conference_addition_input_info_value` varchar(45) DEFAULT NULL,
  `conference_addition_title` varchar(200) DEFAULT NULL,
  `conference_background_color` varchar(20) DEFAULT NULL,
  `conference_code` varchar(30) DEFAULT NULL,
  `conference_entry_fee` varchar(45) DEFAULT NULL,
  `conference_inquiry` varchar(45) DEFAULT NULL,
  `conference_max_num` int DEFAULT NULL,
  `conference_name` varchar(100) DEFAULT NULL,
  `conference_open_state` varchar(5) DEFAULT NULL,
  `conference_over_state` varchar(5) DEFAULT NULL,
  `conference_person_reserve_count` int DEFAULT NULL,
  `conference_proc_date_title` varchar(100) DEFAULT NULL,
  `conference_proc_enddate` datetime DEFAULT NULL,
  `conference_proc_startdate` datetime DEFAULT NULL,
  `conference_recv_enddate` datetime DEFAULT NULL,
  `conference_recv_startdate` datetime DEFAULT NULL,
  `conference_regdate` datetime DEFAULT NULL,
  `conference_sub_text` varchar(100) DEFAULT NULL,
  `conference_thumb_filename` varchar(100) DEFAULT NULL,
  `conference_update` datetime DEFAULT NULL,
  PRIMARY KEY (`conference_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conference_info`
--

LOCK TABLES `conference_info` WRITE;
/*!40000 ALTER TABLE `conference_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `conference_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sido`
--

DROP TABLE IF EXISTS `sido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sido` (
  `code` varchar(5) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sido`
--

LOCK TABLES `sido` WRITE;
/*!40000 ALTER TABLE `sido` DISABLE KEYS */;
/*!40000 ALTER TABLE `sido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sigu`
--

DROP TABLE IF EXISTS `sigu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sigu` (
  `code` varchar(5) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `parent_code` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`code`),
  KEY `sigu_sido_idx` (`parent_code`),
  CONSTRAINT `sigu_sido` FOREIGN KEY (`parent_code`) REFERENCES `sido` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sigu`
--

LOCK TABLES `sigu` WRITE;
/*!40000 ALTER TABLE `sigu` DISABLE KEYS */;
/*!40000 ALTER TABLE `sigu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-09 22:59:29
