-- Submitted:
CREATE TABLE `almacena` (
  `idAlmacena` INT NOT NULL,
  `idBodega` INT,
  `idproducto` INT, 
  `cantidad` INT NOT NULL,
  PRIMARY KEY (`idAlmacena`),
  FOREIGN KEY (`idBodega`) REFERENCES `Bodega`(`idBodega`),
  FOREIGN KEY (`idproducto`) REFERENCES `producto`(`idproducto`)
);

INSERT INTO `almacena` (`idAlmacena`, `idBodega`, `idproducto`, `cantidad`) VALUES (1, (SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "la amistad"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "tornillo el general"), 65);
INSERT INTO `almacena` (`idAlmacena`, `idBodega`, `idproducto`, `cantidad`) VALUES (2, (SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "la amistad"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "cereal"), 11);
INSERT INTO `almacena` (`idAlmacena`, `idBodega`, `idproducto`, `cantidad`) VALUES (3, (SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "la amistad"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "cerezas dulces"), 48);
INSERT INTO `almacena` (`idAlmacena`, `idBodega`, `idproducto`, `cantidad`) VALUES (4, (SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa isabel"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "champagne"), 63);
INSERT INTO `almacena` (`idAlmacena`, `idBodega`, `idproducto`, `cantidad`) VALUES (5, (SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa isabel"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "mora"), 35);
INSERT INTO `almacena` (`idAlmacena`, `idBodega`, `idproducto`, `cantidad`) VALUES (6, (SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa isabel"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "vino espumoso"), 85);
INSERT INTO `almacena` (`idAlmacena`, `idBodega`, `idproducto`, `cantidad`) VALUES (7, (SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa cecilia"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "champagne"), 11);
INSERT INTO `almacena` (`idAlmacena`, `idBodega`, `idproducto`, `cantidad`) VALUES (8, (SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa cecilia"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "mora"), 13);
INSERT INTO `almacena` (`idAlmacena`, `idBodega`, `idproducto`, `cantidad`) VALUES (9, (SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa cecilia"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "arroz"), 19);
INSERT INTO `almacena` (`idAlmacena`, `idBodega`, `idproducto`, `cantidad`) VALUES (10, (SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa cecilia"), (SELECT `idproducto` FROM `producto` WHERE `nombre` = "aguardiente" LIMIT 1), 24);

-- Should be:
CREATE TABLE `almacena` (
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
