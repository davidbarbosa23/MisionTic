-- Submitted SQLite:
CREATE TABLE `producto` (
  `idproducto` INTEGER PRIMARY KEY AUTOINCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `precio` DECIMAL(8,2) NOT NULL
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

-- Should be MySQL:
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