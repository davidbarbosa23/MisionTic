-- Submitted SQLite:
CREATE TABLE `almacena` (
  `idAlmacena` INTEGER PRIMARY KEY AUTOINCREMENT,
  `idBodega` INTEGER NOT NULL,
  `idproducto` INTEGER NOT NULL,
  `cantidad` INT NOT NULL,
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

-- Should be MySQL:
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
