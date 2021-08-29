-- Submitted SQLite:
CREATE TABLE `empleado` (
  `idBodega` INTEGER NOT NULL,
  `idempleado` INTEGER PRIMARY KEY AUTOINCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `edad` INT NOT NULL,
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

-- Should be MySQL:
CREATE TABLE `empleado` (
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