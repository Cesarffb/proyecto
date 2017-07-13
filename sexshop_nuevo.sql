-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: localhost    Database: cesar
-- ------------------------------------------------------
-- Server version	5.6.35-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `articulo`
--

DROP TABLE IF EXISTS `articulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `articulo` (
  `idproducto` int(11) NOT NULL AUTO_INCREMENT,
  `imagenproducto` blob,
  `Nombre Producto` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `descripcion` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `precio_compra` float unsigned DEFAULT NULL,
  `precio_venta` float unsigned DEFAULT NULL,
  `cantidad_disponible` int(10) unsigned DEFAULT NULL,
  `categoria` varchar(45) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`idproducto`),
  UNIQUE KEY `idproducto_UNIQUE` (`idproducto`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci COMMENT='almacenamiento de objetos\n';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `cedula` int(10) unsigned NOT NULL,
  `Nombre_RazonSocial` varchar(45) DEFAULT NULL,
  `Direccion` varchar(45) DEFAULT NULL,
  `Ruc` varchar(45) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  `Correo electronico` varchar(45) DEFAULT NULL,
  `idCliente` int(11) NOT NULL,
  PRIMARY KEY (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `detalledecompra`
--

DROP TABLE IF EXISTS `detalledecompra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalledecompra` (
  `id` int(10) unsigned NOT NULL,
  `cantidad` int(10) unsigned DEFAULT NULL,
  `importe` float DEFAULT NULL,
  `Fecha` date DEFAULT NULL,
  `articulo_idproducto` int(11) NOT NULL,
  `Proveedor_Id` int(10) unsigned NOT NULL,
  `Usuarios_Id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Detalledecompra_articulo1_idx` (`articulo_idproducto`),
  KEY `fk_Detalledecompra_Proveedor1_idx` (`Proveedor_Id`),
  KEY `fk_Detalledecompra_Usuarios1_idx` (`Usuarios_Id`),
  CONSTRAINT `fk_Detalledecompra_Proveedor1` FOREIGN KEY (`Proveedor_Id`) REFERENCES `proveedor` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Detalledecompra_Usuarios1` FOREIGN KEY (`Usuarios_Id`) REFERENCES `funcionario` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Detalledecompra_articulo1` FOREIGN KEY (`articulo_idproducto`) REFERENCES `articulo` (`idproducto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `detalleventa`
--

DROP TABLE IF EXISTS `detalleventa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalleventa` (
  `id` int(10) unsigned NOT NULL,
  `Cantidad` int(11) DEFAULT NULL,
  `importe` float DEFAULT NULL,
  `Fecha` date DEFAULT NULL,
  `articulo_idproducto` int(11) NOT NULL,
  `Usuarios_Id` int(10) unsigned NOT NULL,
  `Cliente_cedula` int(10) unsigned NOT NULL,
  `Cliente_idCliente` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Detalleventa_articulo_idx` (`articulo_idproducto`),
  KEY `fk_Detalleventa_Usuarios1_idx` (`Usuarios_Id`),
  KEY `fk_Detalleventa_Cliente1_idx` (`Cliente_cedula`),
  CONSTRAINT `fk_Detalleventa_Cliente1` FOREIGN KEY (`Cliente_cedula`) REFERENCES `cliente` (`cedula`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Detalleventa_Usuarios1` FOREIGN KEY (`Usuarios_Id`) REFERENCES `funcionario` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Detalleventa_articulo` FOREIGN KEY (`articulo_idproducto`) REFERENCES `articulo` (`idproducto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionario` (
  `Id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `Apellido` varchar(45) DEFAULT NULL,
  `Correo` varchar(45) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  `Cargo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proveedor` (
  `Id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(45) DEFAULT NULL,
  `Direccion` varchar(45) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  `Correo Electronico` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-13  9:57:51
