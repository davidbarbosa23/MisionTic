-- -----------------------------------------------------
-- Schema Task4
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Task4`;

-- -----------------------------------------------------
-- Schema Task4
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Task4` DEFAULT CHARACTER SET utf8;
USE `Task4`;


-- -----------------------------------------------------
-- Table `Task4`.`Bodega`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Task4`.`Bodega`;
CREATE TABLE IF NOT EXISTS `Task4`.`Bodega` (
  `idBodega` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idBodega`)
);
  
INSERT INTO `bodega` (`nombre`, `direccion`) VALUES ("la amistad", "Cra 78 # 85 -45");
INSERT INTO `bodega` (`nombre`, `direccion`) VALUES ("santa isabel", "Calle 34 # 45 -85");
INSERT INTO `bodega` (`nombre`, `direccion`) VALUES ("santa cecilia", "Cra 89 # 54 - 39"); 


-- -----------------------------------------------------
-- Table `Task4`.`producto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Task4`.`producto`;
CREATE TABLE IF NOT EXISTS `Task4`.`producto` (
  `idproducto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `precio` DECIMAL(8,2) NOT NULL,
  PRIMARY KEY(`idproducto`)
);
  
INSERT INTO `producto` (`nombre`, `precio`) VALUES ("tornillo el general", 93277);
INSERT INTO `producto` (`nombre`, `precio`) VALUES ("champagne", 15728);
INSERT INTO `producto` (`nombre`, `precio`) VALUES ("mora", 63781);
INSERT INTO `producto` (`nombre`, `precio`) VALUES ("cereal", 33796);
INSERT INTO `producto` (`nombre`, `precio`) VALUES ("garbanzo", 86495);
INSERT INTO `producto` (`nombre`, `precio`) VALUES ("vino espumoso", 47392);
INSERT INTO `producto` (`nombre`, `precio`) VALUES ("arroz", 67370);
INSERT INTO `producto` (`nombre`, `precio`) VALUES ("aguardiente", 69188);
INSERT INTO `producto` (`nombre`, `precio`) VALUES ("condimentos mixtos", 3025);
INSERT INTO `producto` (`nombre`, `precio`) VALUES ("cerezas dulces", 96453);
INSERT INTO `producto` (`nombre`, `precio`) VALUES ("aguardiente", 46004);


-- -----------------------------------------------------
-- Table `Task4`.`almacena`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Task4`.`almacena`;
CREATE TABLE IF NOT EXISTS `Task4`.`almacena` (
  `idAlmacena` INT NOT NULL AUTO_INCREMENT,
  `idBodega` INT NOT NULL,
  `idproducto` INT NOT NULL, 
  `cantidad` INT NOT NULL,
  PRIMARY KEY (`idAlmacena`),
  FOREIGN KEY (`idBodega`) REFERENCES `Bodega`(`idBodega`),
  FOREIGN KEY (`idproducto`) REFERENCES `producto`(`idproducto`)
);

INSERT INTO `almacena` (`idBodega`, `idproducto`, `cantidad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "la amistad"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "tornillo el general"), 65);
INSERT INTO `almacena` (`idBodega`, `idproducto`, `cantidad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "la amistad"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "cereal"), 11);
INSERT INTO `almacena` (`idBodega`, `idproducto`, `cantidad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "la amistad"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "cerezas dulces"), 48);
INSERT INTO `almacena` (`idBodega`, `idproducto`, `cantidad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa isabel"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "champagne"), 63);
INSERT INTO `almacena` (`idBodega`, `idproducto`, `cantidad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa isabel"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "mora"), 35);
INSERT INTO `almacena` (`idBodega`, `idproducto`, `cantidad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa isabel"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "vino espumoso"), 85);
INSERT INTO `almacena` (`idBodega`, `idproducto`, `cantidad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa cecilia"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "champagne"), 11);
INSERT INTO `almacena` (`idBodega`, `idproducto`, `cantidad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa cecilia"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "mora"), 13);
INSERT INTO `almacena` (`idBodega`, `idproducto`, `cantidad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa cecilia"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "arroz"), 19);
INSERT INTO `almacena` (`idBodega`, `idproducto`, `cantidad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa cecilia"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "aguardiente" LIMIT 1), 24);


-- -----------------------------------------------------
-- Table `Task4`.`empleado`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Task4`.`empleado`;
CREATE TABLE IF NOT EXISTS `Task4`.`empleado` (
  `idBodega` INT NOT NULL,
  `idempleado` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `edad` INT NOT NULL,
  PRIMARY KEY (`idempleado`),
  FOREIGN KEY (`idBodega`) REFERENCES `Bodega`(`idBodega`)
);

INSERT INTO `empleado` (`idBodega`, `nombre`, `edad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "la amistad"), "Sylvester Leonard", 24);
INSERT INTO `empleado` (`idBodega`, `nombre`, `edad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "la amistad"), "Ferdinand Dixon", 23);
INSERT INTO `empleado` (`idBodega`, `nombre`, `edad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "la amistad"), "Stephen I. Caldwell", 18); 
INSERT INTO `empleado` (`idBodega`, `nombre`, `edad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "la amistad"), "Abraham Shepherd", 19); 
INSERT INTO `empleado` (`idBodega`, `nombre`, `edad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa cecilia"), "Taylor Z. Oliver", 37); 
INSERT INTO `empleado` (`idBodega`, `nombre`, `edad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa isabel"), "Libby J. Hendricks", 51); 
INSERT INTO `empleado` (`idBodega`, `nombre`, `edad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa cecilia"), "Nora D. Erickson", 32); 
INSERT INTO `empleado` (`idBodega`, `nombre`, `edad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa isabel"), "Sebastian C. Fleming", 50); 
INSERT INTO `empleado` (`idBodega`, `nombre`, `edad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa cecilia"), "Leila Huffman", 34); 
INSERT INTO `empleado` (`idBodega`, `nombre`, `edad`) VALUES ((SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa cecilia"), "Colby M. Stephenson", 31); 


-- -----------------------------------------------------
-- Updates
-- -----------------------------------------------------
-- SET SQL_SAFE_UPDATES=0;
-- UPDATE `producto` SET `precio` = 45000 WHERE `nombre` = "arroz";
-- UPDATE `empleado` SET `edad` = 25 WHERE `nombre` = "Abraham Shepherd";
-- DELETE FROM `almacena` WHERE `idproducto` = (SELECT `idproducto` FROM `producto` WHERE `nombre` = "champagne") AND `idBodega` = (SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa cecilia");
-- SET SQL_SAFE_UPDATES=1;