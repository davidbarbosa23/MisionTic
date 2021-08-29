-- Submitted SQLite:
CREATE TABLE `Bodega` (
  `idBodega` INTEGER PRIMARY KEY AUTOINCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL
);
  
INSERT INTO `bodega` (`nombre`, `direccion`) VALUES ("la amistad", "Cra 78 # 85 -45");
INSERT INTO `bodega` (`nombre`, `direccion`) VALUES ("santa isabel", "Calle 34 # 45 -85");
INSERT INTO `bodega` (`nombre`, `direccion`) VALUES ("santa cecilia", "Cra 89 # 54 - 39");

-- Should be MySQL:
CREATE TABLE `Bodega` (
  `idBodega` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idBodega`)
);
  
INSERT INTO `bodega` (`nombre`, `direccion`) VALUES ("la amistad", "Cra 78 # 85 -45");
INSERT INTO `bodega` (`nombre`, `direccion`) VALUES ("santa isabel", "Calle 34 # 45 -85");
INSERT INTO `bodega` (`nombre`, `direccion`) VALUES ("santa cecilia", "Cra 89 # 54 - 39"); 