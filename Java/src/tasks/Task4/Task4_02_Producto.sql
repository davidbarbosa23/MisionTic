-- Submitted:
CREATE TABLE `producto` (
  `idproducto` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `precio` DECIMAL(8,2) NOT NULL,
  PRIMARY KEY(`idproducto`)
);
  
INSERT INTO `producto` (`idproducto`, `nombre`, `precio`) VALUES (1, "tornillo el general", 93277);
INSERT INTO `producto` (`idproducto`, `nombre`, `precio`) VALUES (2, "champagne", 15728);
INSERT INTO `producto` (`idproducto`, `nombre`, `precio`) VALUES (3, "mora", 63781);
INSERT INTO `producto` (`idproducto`, `nombre`, `precio`) VALUES (4, "cereal", 33796);
INSERT INTO `producto` (`idproducto`, `nombre`, `precio`) VALUES (5, "garbanzo", 86495);
INSERT INTO `producto` (`idproducto`, `nombre`, `precio`) VALUES (6, "vino espumoso", 47392);
INSERT INTO `producto` (`idproducto`, `nombre`, `precio`) VALUES (7, "arroz", 67370);
INSERT INTO `producto` (`idproducto`, `nombre`, `precio`) VALUES (8, "aguardiente", 69188);
INSERT INTO `producto` (`idproducto`, `nombre`, `precio`) VALUES (9, "condimentos mixtos", 3025);
INSERT INTO `producto` (`idproducto`, `nombre`, `precio`) VALUES (10, "cerezas dulces", 96453);
INSERT INTO `producto` (`idproducto`, `nombre`, `precio`) VALUES (11, "aguardiente", 46004);

-- Should be:
CREATE TABLE `producto` (
  `idproducto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `precio` DECIMAL(8,2) NOT NULL,
  PRIMARY KEY(idproducto)
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