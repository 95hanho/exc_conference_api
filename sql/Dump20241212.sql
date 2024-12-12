-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: conference
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `application`
--

DROP TABLE IF EXISTS `application`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `application` (
  `appli_id` int NOT NULL AUTO_INCREMENT,
  `conference_id` int DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `c2gi_address` varchar(200) DEFAULT NULL,
  `c2gi_address_detail` varchar(45) DEFAULT NULL,
  `c2gi_company` varchar(45) DEFAULT NULL,
  `c2gi_post` varchar(45) DEFAULT NULL,
  `c2pi_cellphone1` varchar(45) DEFAULT NULL,
  `c2pi_email1` varchar(200) DEFAULT NULL,
  `c2pi_name1` varchar(45) DEFAULT NULL,
  `c2pi_position1` varchar(100) DEFAULT NULL,
  `privacy_check` tinyint(1) DEFAULT NULL,
  `c2pi_cashphone1` varchar(45) DEFAULT NULL,
  `c2pi_paydate1` datetime DEFAULT NULL,
  `c2pi_paymethod1` int DEFAULT NULL,
  `c2pi_payname1` varchar(45) DEFAULT NULL,
  `c2pi_proof1` int DEFAULT NULL,
  `c2pi_proof2` int DEFAULT NULL,
  PRIMARY KEY (`appli_id`),
  KEY `application_conference_idx` (`conference_id`),
  CONSTRAINT `application_conference` FOREIGN KEY (`conference_id`) REFERENCES `conference_info` (`conference_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `application`
--

LOCK TABLES `application` WRITE;
/*!40000 ALTER TABLE `application` DISABLE KEYS */;
/*!40000 ALTER TABLE `application` ENABLE KEYS */;
UNLOCK TABLES;

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conference_info`
--

LOCK TABLES `conference_info` WRITE;
/*!40000 ALTER TABLE `conference_info` DISABLE KEYS */;
INSERT INTO `conference_info` VALUES (1,NULL,NULL,'2025년 교육계획수립 관련 상담 신청','#71deff','CCF-CBH92024100710300094PV','무료','02-2152-3978',1000,'2025 교육계획수립 [찾아가는 설명회]','Y','N','10~12월 상시진행','2024-12-31 00:00:00','2024-10-07 00:00:00','2024-12-31 00:00:00','2024-10-07 00:00:00','2024-10-07 10:30:01','[2025년 교육계획수립] 전문가가 직접 방문하여 가이드 해드립니다','CCF-JK5V20241014102806GDDH.jpg','2024-11-06 18:10:56');
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
INSERT INTO `sido` VALUES ('100','강원도'),('110','경기도'),('120','경상남도'),('130','경상북도'),('140','광주광역시'),('150','대구광역시'),('160','대전광역시'),('170','부산광역시'),('180','서울특별시'),('190','세종특별자치시'),('200','울산광역시'),('210','인천광역시'),('220','전라남도'),('230','전라북도'),('240','제주특별차지도'),('250','충청남도'),('260','충청북도');
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
INSERT INTO `sigu` VALUES ('1','성북구','180'),('10','중구','180'),('101','강남구','180'),('104','고양시','110'),('11','도봉구','180'),('115','포천시','110'),('117','안성시','110'),('12','은평구','180'),('13','서초구','180'),('14','노원구','180'),('144','광명시','110'),('149','군포시','110'),('15','서대문구','180'),('151','파주시','110'),('16','중라구','180'),('161','양주시','110'),('167','평택시','110'),('17','용산구','180'),('173','광주시','110'),('18','강북구','180'),('187','성남시','110'),('189','이천시','110'),('19','성동구','180'),('198','연천군','110'),('2','송파구','180'),('20','종로구','180'),('21','금천구','180'),('213','용인시','110'),('215','의정부시','110'),('22','광진구','180'),('225','시흥시','110'),('226','하남시','110'),('23','구로구','180'),('232','안양시','110'),('237','가평군','110'),('239','수원시','110'),('24','동작구','180'),('243','양평군','110'),('245','화성시','110'),('262','동두천시','110'),('281','구리시','110'),('296','의왕시','110'),('3','마포구','180'),('301','오산시','110'),('305','여주시','110'),('324','과천시','110'),('340','안산시','110'),('345','남양주시','110'),('347','부천시','110'),('349','김포시','110'),('4','동대문구','180'),('5','영등포구','180'),('6','양천구','180'),('7','관악구','180'),('8','강동구','180'),('9','강서구','180');
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

-- Dump completed on 2024-12-12 20:32:43
